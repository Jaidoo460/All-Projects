package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;

    private Timesheet testTimesheet;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(99,1,1, LocalDate.now(),0.0, true,"" );
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1);
        Assert.assertNotNull("getTimeSheet returned null", timesheet);
        assertTimesheetsMatch("getTimesheet returned wrong or partial data", TIMESHEET_1, timesheet);

        timesheet = sut.getTimesheet(2);
        Assert.assertNotNull("getTimeSheet returned null", timesheet);
        assertTimesheetsMatch("getTimesheet returned wrong or partial data", TIMESHEET_2, timesheet);

        timesheet = sut.getTimesheet(3);
        Assert.assertNotNull("getTimeSheet returned null", timesheet);
        assertTimesheetsMatch("getTimesheet returned wrong or partial data", TIMESHEET_3, timesheet);

        timesheet = sut.getTimesheet(4);
        Assert.assertNotNull("getTimeSheet returned null", timesheet);
        assertTimesheetsMatch("getTimesheet returned wrong or partial data", TIMESHEET_4, timesheet);
    }


    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(99);
        Assert.assertNull("getTimeSheet failed to return null for id not in database", timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        testTimesheet = new Timesheet(99, 2, 1, LocalDate.now(), 0.0, true, "");
        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(2);

        Assert.assertEquals("getAllTimesheets failed to return all timesheets", 1, timesheets.size());
        Assert.assertEquals(1, timesheets.get(0).getProjectId());
        Assert.assertEquals("Timesheet 3",timesheets.get(0).getDescription());
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {

         List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1);
         Assert.assertEquals(3, timesheets.size());
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {

        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

       // Assert.assertNotNull("createTimesheet returned null", createdTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch("", testTimesheet, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheet = new Timesheet(5, 1, 1, LocalDate.now(), 0.0, true, "test");
        Timesheet createdTimesheet = sut.createTimesheet(timesheet);
        Assert.assertEquals(1,createdTimesheet.getEmployeeId());
        Assert.assertEquals(1,createdTimesheet.getProjectId());


    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheet = new Timesheet(1, 2, 1, LocalDate.now(), 0.0, true, "test");
        sut.updateTimesheet(timesheet);
        Timesheet ts = sut.getTimesheet(1);
        Assert.assertEquals(1,ts.getTimesheetId());
        Assert.assertEquals("test",ts.getDescription());


    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);
        Timesheet ts = sut.getTimesheet(1);
        Assert.assertNull(ts);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double billHour = sut.getBillableHours(1,1);
        Assert.assertEquals(2.5, billHour, 0.001);

    }

    private void assertTimesheetsMatch(String s, Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
