package org.example.Entities;

import lombok.Getter;
import org.example.Strategy.MoveMentStrategy;
@Getter
public class Player {
    String name;
    MoveMentStrategy moveMentStrategy;
    Snake snake;
    public Player(String name, MoveMentStrategy moveMentStrategy,Snake snake)
    {
        this.name=name;
        this.moveMentStrategy=moveMentStrategy;
        this.snake=snake;
    }
    public Position makeMove()
    {
        Position position = moveMentStrategy.move(snake);
        return  position;
    }

    public void addToSnake(Position pos) {
        snake.add(pos);
    }

    public void moveSnake(Position pos) {
        snake.moveSnake(pos);
    }
}
