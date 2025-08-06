package org.example.Entities;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
@Getter
@ToString
public class Snake {
    Deque<Position> deque;
    Set<Position> snakePositions;
    public Snake()
    {
        deque = new ArrayDeque<>();
        deque.add(new Position(0,0));
        snakePositions = new HashSet<>();
        snakePositions.add(new Position(0,0));
    }

    public Position getHeadPosition() {
        Position head = deque.getFirst();
        return head;
    }

    public void add(Position pos) {
        deque.addFirst(pos);
        snakePositions.add(pos);
    }

    public void moveSnake(Position pos) {
        Position last = deque.removeLast();
        snakePositions.remove(last);
        this.add(pos);
    }
}
