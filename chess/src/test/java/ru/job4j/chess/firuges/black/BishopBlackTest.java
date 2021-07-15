package ru.job4j.chess.firuges.black;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack obj = new BishopBlack(Cell.A1);
        Assert.assertEquals(Cell.A1, obj.position());
    }

    @Test
    public void copy() {
        BishopBlack obj = new BishopBlack(Cell.A1);
        Assert.assertEquals(obj.position(), obj.copy(obj.position()).position());
    }

    @Test
    public void wayС1G5() {
        BishopBlack obj = new BishopBlack(Cell.C1);
        assertThat(obj.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

//    @Test
//    public void wayA1H7() {
//        BishopBlack obj = new BishopBlack(Cell.A1);
//        assertThat(obj.way(Cell.H8), is(new Cell[]{Cell.B2, Cell.C3, Cell.D4, Cell.E5,
//        Cell.F6, Cell.G7, Cell.H8}));
//    }

}