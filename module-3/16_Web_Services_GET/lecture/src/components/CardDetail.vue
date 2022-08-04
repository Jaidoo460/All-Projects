<template>
  <div>

    <div class="loading" v-if="isloading">
      <img src="@/assets/ping_pong_loader.gif" alt="Loading...">
    </div>

    <h1>{{ card.title}}</h1>
    <p>{{ card.description}}</p>

    <router-link :to="{name: 'Board'}></router-link>
    
    <comments-list v-bind:comments="card.comments"></comments-list>
  </div>
</template>

<script>

import boardService from '@services/BoardService.js';
import CommentsList from '@components/CommentsList.vue';

export default {
  name: "card-detail",
  components: {
    CommentsList
  },

  data() {
    return {
      isloading: true,
      card: {
        id: 0,
        title: '',
        description: '',
        status: '',
        comments: []
      }
    }

  },
  created() {
    .getCard(this.$route.params.boardID, this.$route.params.cardID)
    .then( response => {

      this.card = response;
      this.isloading = false;

    })

  }
};

</script>
