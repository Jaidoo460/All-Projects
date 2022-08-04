<template>
  <div id="app" class="main">
      <h1>{{ product.name }}</h1>
      <p>{{ product.description}}</p>
      <router-link :to="{name: 'products' }">All Products</router-link>
      <router-link

          :to="{name; 'new-review', params: {id: product.id}}"

      >Add a New Review</router-link>


        <div class="well-display">
            
            <average-summary></average-summary>

            <star-summary rating="1"></star-summary>
            
            <review-list></review-list>
        </div>
      
  </div>
</template>

<script>

import AverageSummary from '@/components/AverageSummary.vue'
import StarSummary from '@/components/StarSummary.vue'
import ReviewList from '@/components/ReviewList.vue'

export default {
    name: 'product-detail',
    components: {
        AverageSummary,
        StarSummary,
        ReviewList
    },
    created() {
        const activeProductID = this.$route.params.id;
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductID);

        // window.alert(activeProductID);
        
    },
    computed: {
        product() {
            return this.$store.state.products.find(
                p => p.id == this.$store.state.activeProduct
            );
        }
    }

}
</script>

<style>

</style>