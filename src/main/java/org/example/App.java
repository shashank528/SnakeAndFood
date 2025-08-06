package org.example;

import org.example.Controller.BoardGame;
import org.example.Controller.SnakeAndFoodGame;
import org.example.Entities.*;
import org.example.Strategy.HumanPlayerStrategy;
import org.example.Strategy.MoveMentStrategy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MoveMentStrategy moveMentStrategy = new HumanPlayerStrategy();
        Snake snake = new Snake();
        Player player = new Player("shashank ",moveMentStrategy,snake);
        Board board = Board.getInstance(3);
        Food food = Food.getInstance(3);
        food.populate(new Position(0,1),1);
        food.populate(new Position(1,1),1);
        food.populate(new Position(1,2),1);
        food.populate(new Position(2,2),1);
        BoardGame game  = new SnakeAndFoodGame(player,board,food);
        game.play();

    }
}
