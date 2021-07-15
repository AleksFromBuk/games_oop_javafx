package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void moveOneCase() {

        Logic logic = new Logic();
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (FigureNotFoundException e) {
            e.printStackTrace();
        } catch (OccupiedCellException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void moveSecondCase() {

        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new KingBlack(Cell.G5));
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (FigureNotFoundException e) {
            e.printStackTrace();
        } catch (OccupiedCellException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void moveThridCase() {

        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.E2);
        } catch (FigureNotFoundException e) {
            e.printStackTrace();
        } catch (OccupiedCellException e) {
            e.printStackTrace();
        } catch (ImpossibleMoveException e) {
            e.printStackTrace();
        }
    }
}