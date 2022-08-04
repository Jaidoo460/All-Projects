import axios from 'axios';

const boardAPI = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  getBoards() {
    return boardAPI.get('/boards');
  },

  getCards(boardID) {
    return boardAPI.get(`/boards/${boardID}`)
  },

  getCard(boardID, cardID) {
    return boardAPI.get(`/boards/${boardID}`).then((response) => {
      const cards = response.data.cards;
      return cards.find(card => card.id == cardID);
    })
  }

}
