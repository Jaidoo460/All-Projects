<template>
<div id="ulv-main">
    <h3 id="ulv-title">Current User Lists</h3>
    <user-task-list 
        v-for="user in users"
        v-bind:key="user.user_id"
        v-bind:listUser="user"
    
    ></user-task-list>
</div>
</template>

<script>

import UserTaskList from './UserTaskList.vue';

export default {
    name: "user-list-view",
    components: {
        UserTaskList
    },
    props: [
        "users"
    ]

}
</script>

<style scoped>
#ulv-main {
    background-color: lightgrey
}

#ulv-title {
    color: darkgreen;
}

</style>