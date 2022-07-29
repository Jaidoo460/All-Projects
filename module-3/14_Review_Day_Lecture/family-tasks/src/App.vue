<template>
  <div id="app">
    <img class="hero-img" alt="Family Tasks Logo" src="./assets/fam.png">
    <h2> Family Task Tracker</h2>
    <span
      id="user-name"
      v-for="user in familyUsers"
      v-bind:key="user.user_id"
    > {{user.name}} </span>
    
    <div id="main-frame">
      <user-list-view v-bind:users="familyUsers"></user-list-view>
    </div>
  </div>
</template>

<script>

import UserListView from './components/UserListView.vue';

export default {
  name: 'App',
  components: {
    UserListView
  },
  computed: {
    familyUsers(){
      return this.$store.state.users;
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.hero-img {
  height: 120px;
  width: 120px;
}

#main-frame {
  border: 3px solid darkgreen;
  padding: 10px;
  margin-top: 10px;
}

#user-name {
  border: 3px solid darkgreen;
  margin: 10px;
  padding: 2px;
}
</style>
