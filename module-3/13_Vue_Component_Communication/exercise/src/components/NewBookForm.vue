<template>

    <form class= 'new-book-form' v-on:submit.prevent= "addNewBook" >

        <input type="text" id="title" class= 'title-input' v-model= "newBook.title" placeholder="Title">

        <input type="text" id="author" class= 'author-input' v-model= "newBook.author" placeholder="Author">

        <input type="text" id="isbn" class= 'isbn-input' v-model= "newBook.isbn" placeholder="ISBN">

        <input type="Submit" value="Save">

    </form>

</template>

<script>

export default {

    name: "new-book-form",

    data() {

        return{
            newBook: {

                read: true
            }
        }
    },
        
   methods: {

       addNewBook(){

           this.$store.commit('ADD_NEW_BOOK', this.newBook);

           this.newBook= {};

       }
   }
}
</script>

