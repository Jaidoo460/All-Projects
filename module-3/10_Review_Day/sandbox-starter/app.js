const player1 = {
    name: "You",
    className: "player1"
};

const player2 = {
    name: "Your Friend",
    className: "player2"
};


let currPlayer = player1;

document.addEventListener('DOMContentLoaded', attachListeners);

function attachListeners() {

    document.getElementById("gameBoard").addEventListener("click", (event) => {squareClick(event)});

}

function squareClick(event){

    const clickedSquare = event.target;

    if(
        clickedSquare.classList.contains("square") 
        && !(clickedSquare.classList.contains(player1.className))
        && !(clickedSquare.classList.contains(player2.className))
        
        ){
        
        let otherPlayer = (currPlayer === player1) ? player2 : player1;

        clickedSquare.classList.remove(otherPlayer.className);

        clickedSquare.classList.add(currPlayer.className);

        currPlayer = otherPlayer;


    }

}