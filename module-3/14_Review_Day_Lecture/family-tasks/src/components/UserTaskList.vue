<template>
    <div id="utl_main">

        <h3 id="user-name"> {{ listUser.name }}</h3>
        <div id="tasks"> {{ getUserTaskLists[0].tasks }}</div>

    </div>
</template>

<script>
export default {
    name: "user-task-list",
    props: [
        "listUser"
    ],
    computed: {
        getUserTaskLists(){
            return this.$store.state.taskLists.filter((list)=>{
                return list.user_id == this.listUser.user_id;
            })
        },

    }

}
</script>

<style>

</style>