package org.example.Entities;

import lombok.Getter;
import org.example.Observer.IObserver;
import org.example.Subject.Subject;
@Getter
public class Board extends Subject {

    int[][] grid;
    private static Board board;
    public static Board getInstance(int n)
    {
        if(board==null)
        {
            board = new Board(n);
        }
        return board;
    }
    public void changeState(Position start,Position end)
    {
        notifyObserver();
    }
    private Board(int n)
    {
        grid = new int[n][n];
    }
    @Override
    public void notifyObserver() {
        for(IObserver observer:set)
        {
            observer.update();
        }
    }
}
