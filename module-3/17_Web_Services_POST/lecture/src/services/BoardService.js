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

  getCard(cardID) {
    return boardAPI.get(`/cards/${cardID}`)
  },

  addCard(card) {
    return boardAPI.post('/cards', card);
  },

  updateCard(card) {
    return boardAPI.put(`/cards/${card.id}`, card);
  },

  deleteCard(cardID) {
    return boardAPI.delete(`/cards/${cardID}`);
  }

  //TODO: ADD A BOARD
  addBoard(board) {
    return boardAPI.post('/boards', board);
  }

  //TODO: DELETE A BOARD?

  //UPDATE EXISTING  BOARD ???

}
