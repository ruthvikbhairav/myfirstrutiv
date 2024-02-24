import { Component } from '@angular/core';

interface Piece {
  id:string;
  board:Piece[][];
  color: 'white' | 'black';
  validMove(row: number,col: number): boolean;
  }
  class Cell {
    piece?: Piece;

  }


const PiecesTypes = {
    'pawn': {
      validMove: (row: number,col: number,board: String[][], player: 'white'| 'bottom')=> {


      }
    }
};


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-angular-app';
  board: Cell[][]= createBoard();

}

function createBoard(): Piece[][] {
     const board : Cell[][] = []; 
     for (let i=0;i<=8;i++){
      for(let j=0;j<=8;j++){
        boardp[i].push({});
       }
     }
     return board;
}
