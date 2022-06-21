DROP TABLE IF EXISTS meetup_group;
DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS event;

CREATE TABLE meetup_group(
    group_id serial NOT NULL,
    name varchar(255) NOT NULL,
    PRIMARY KEY(group_id)
);

CREATE TABLE member(
    member_id serial NOT NULL,
	group_id serial NOT NULL,
    last_name varchar(45) NOT NULL,
    first_name varchar(45) NOT NULL,
    email varchar(255) NOT NULL,
    phone varchar(11) NULL,
    dateOfBirth varchar(10) NOT NULL,
    reminderEmail TEXT,
    PRIMARY KEY (member_id),
	FOREIGN KEY(group_id) REFERENCES meetup_group(group_id)

);

CREATE TABLE event(
	event_id serial NOT NULL,
	member_id integer NOT NULL,
	group_id integer NOT NULL,
    name varchar NOT NULL,
	description varchar(255) NOT NULL,
	duration integer,
	groupRunningEvent varchar NOT NULL,
	PRIMARY KEY(event_id),
	CONSTRAINT fk_member_member_id FOREIGN KEY(member_id) REFERENCES member(member_id),
	CONSTRAINT fk_meetup_group_group_id FOREIGN KEY(group_id) REFERENCES meetup_group(group_id) 
);


INSERT INTO meetup_group(group_id, name) values(1, 'java'); 
INSERT INTO meetup_group(group_id, name) values(2, 'javascript');
INSERT INTO meetup_group(group_id, name) values(3, 'react'); 

--
INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(1,1,'smith', 'mike','abc69@gmail.com', '6145556060', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(2,2,'aa', 'bb','aabbc12@gmail.com', '6141556060', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(3,3,'cc', 'dd','abc88@gmail.com', '6145552211', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(4,1,'ee', 'ff','eeff96@gmail.com', '6145554447', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(5,2,'gg', 'hh','gghh69@gmail.com', '6141556062', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(6,1,'hh', 'ke','hhke@gmail.com', '6145556069', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(7,3,'mith', 'ike','ike65@gmail.com', '6145556069', '12082021', 'yes');

INSERT INTO member(member_id, group_id, last_name, first_name, email, phone, dateOfBirth, reminderEmail) 
values(8,2,'hunt', 'meek','hunt@gmail.com', '6145556067', '12082021', 'yes');

--
INSERT INTO event(event_id, member_id, group_id, name, description, duration, groupRunningEvent)
values(1,2,3,'techElevator', 'coding bootcamp', 90, 'reactgroup');

INSERT INTO event(event_id, member_id, group_id, name, description, duration, groupRunningEvent)
values(2,3,1,'Elevator', 'coding', 90, 'reactgroup');

INSERT INTO event(event_id, member_id, group_id, name, description, duration, groupRunningEvent)
values(3,1,2,'techlife', 'bookcamp', 90, 'actgroup');

INSERT INTO event(event_id, member_id, group_id, name, description, duration, groupRunningEvent)
values(4,8,3,'meetup', 'coding java', 90, 'javagroup');


