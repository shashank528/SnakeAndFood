package org.example.Controller;

import org.example.Entities.*;

public class SnakeAndFoodGame implements BoardGame{
    Player player;
    Board board;
    Food food;
    int points=0;

    public SnakeAndFoodGame(Player player, Board board, Food food) {
        this.player = player;
        this.board = board;
        this.food = food;
    }

    @Override
    public void play() {
        while(true)
        {
            Position pos = player.makeMove();
            if(null==pos)
            {
                System.out.println("enter valid input and try again");
                continue;
            }
            System.out.println("new position "+pos);
            if(gameOver(pos,board,player.getSnake()))
            {
                System.out.println("game over points "+points);
                break;
            }
            else if(checkIfFoodAtPos(pos,food))
            {
                System.out.println("food is at position "+pos);
                points++;
                player.addToSnake(pos);
                board.notifyObserver();
            }
            else
            {
                player.moveSnake(pos);
            }

        }
        System.out.println("points "+points+" scored by "+player.getName());
    }

    private boolean gameOver(Position pos, Board board, Snake snake) {
        System.out.println("check if game is over");
        if(pos.getRow()<0 || pos.getRow()<0 || pos.getCol()>=board.getGrid().length || pos.getRow()>=board.getGrid().length)
            return true;
        if(snake.getSnakePositions().contains(pos))
        {
            System.out.println("colide with itself");
            return true;
        }

        return false;
    }

    private boolean checkIfFoodAtPos(Position pos, Food food) {
        if(food.getGrid()[pos.getRow()][pos.getCol()]!=0)
            return true;
        return false;
    }
}
