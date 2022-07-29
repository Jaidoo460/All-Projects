import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    users: [
      {
        user_id: 11,
        name: "Parent 1"
      },
      {
        user_id: 22,
        name: "Parent 2"
      },
      {
        user_id: 33,
        name: "Child 1"
      }
    ],

    taskLists: [
      {
        list_id: 91,
        user_id: 11,
        tasks: ["Go Shopping", "Order Pizza"]
      },
      {
        list_id: 92,
        user_id: 22,
        tasks: ["Vacuum", "Clean Bathroom"]
      },
      {
        list_id: 93,
        user_id: 33,
        tasks: ["Wash Dog"]
      }
    ]
  },
  mutations: {
  },
  actions: {
  },
  modules: {
  }
})
