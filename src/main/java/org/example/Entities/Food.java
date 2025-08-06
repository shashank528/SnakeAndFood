package org.example.Entities;

import lombok.Getter;

@Getter
public class Food {
    private static Food food;
    private int[][]grid;
    public static Food getInstance(int n)
    {
        if(food==null)
        {
            food = new Food(n);
        }
        return food;
    }
    private Food(int n)
    {
        grid=new int[n][n];
    }
    public void populate(Position pos,int points)
    {
        grid[pos.getRow()][pos.getCol()]=points;
    }
}
