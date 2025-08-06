package org.example.Strategy;

import org.example.Entities.Board;
import org.example.Entities.Position;
import org.example.Entities.Snake;

public interface MoveMentStrategy {
    public Position move(Snake snake);
}
