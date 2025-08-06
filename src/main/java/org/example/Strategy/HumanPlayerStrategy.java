package org.example.Strategy;

import org.example.Entities.Board;
import org.example.Entities.Position;
import org.example.Entities.Snake;

import java.util.Scanner;

public class HumanPlayerStrategy implements MoveMentStrategy{
    @Override
    public Position move(Snake snake) {
        Scanner sc = new Scanner(System.in);
        Position pos = snake.getHeadPosition();
        System.out.println("current position "+pos);
        System.out.println("enter direction to move ");
        String direction = sc.nextLine();
        switch(direction)
        {
            case "U":
                return new Position(pos.getRow()-1,pos.getCol());

            case "D":
                return new Position(pos.getRow()+1,pos.getCol());

            case "L":
                return new Position(pos.getRow(), pos.getCol()-1);

            case "R":
                return new Position(pos.getRow(), pos.getCol()+1);

        }
        return null;

    }

}
