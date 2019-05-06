package jwtc.chess;

import org.junit.Test;

import static org.junit.Assert.*;

public class PosTest {

    @Test
    public void fromString() {
        Pos fromStringTest = new Pos();
        String input1 = "a8";
        long output1 = (long)fromStringTest.fromString(input1);
        long expected1 = 0;
        assertEquals(expected1, output1);
        //==================================================================//
        String input2 = "h8";
        long output2 = (long)fromStringTest.fromString(input2);
        long expected2  = 7;
        assertEquals(expected2, output2);
    }

    @Test
    public void fromColAndRow() {
        Pos fromStringTest = new Pos();
        int col1 = 2;
        int row1 = 0;
        long output1 = (long)fromStringTest.fromColAndRow(col1,row1);
        long expected1 = 2;
        assertEquals(expected1, output1);
        //==================================================================//
        int col2 = 3;
        int row2 = 1;
        long output2 = (long)fromStringTest.fromColAndRow(col2,row2);
        long expected2 = 11;
        assertEquals(expected2, output2);
    }

    @Test
    public void row() {
        Pos fromStringTest = new Pos();
        int input1 = 20;
        long output1 = (long)fromStringTest.row(input1);
        long expected1 = 2;
        assertEquals(expected1, output1);
        //==================================================================//
        int input2 = 60;
        long output2 = (long)fromStringTest.row(input2);
        long expected2 = 7;
        assertEquals(expected2, output2);

    }

    @Test
    public void col() {
        Pos fromStringTest = new Pos();
        int input1 = 11;
        long output1 = (long)fromStringTest.col(input1);
        long expected1 = 3;
        assertEquals(expected1, output1);
        //==================================================================//
        int input2 = 64;
        long output2 = (long)fromStringTest.col(input2);
        long expected2 = 0;
        assertEquals(expected2, output2);

    }

    @Test
    public void toStringTest() {
        Pos fromStringTest = new Pos();
        int input1 = 0;
        String output1 = fromStringTest.toString(input1);
        String expected1 = "a8";
        assertEquals(expected1, output1);
        //==================================================================//
        int input2 = 36;
        String output2 = fromStringTest.toString(input2);
        String expected2 = "e4";
        assertEquals(expected2, output2);
    }

    @Test
    public void rowToString() {
        Pos fromStringTest = new Pos();
        int input1 = 0;
        String output1 = fromStringTest.rowToString(input1);
        String expected1 = "8";
        assertEquals(expected1, output1);
        //==================================================================//
        int input2 = 1;
        String output2 = fromStringTest.rowToString(input2);
        String expected2 = "8";
        assertEquals(expected2, output2);
    }

    @Test
    public void colToString() {
        Pos fromStringTest = new Pos();
        int input1 = 1;
        String output1 = fromStringTest.colToString(input1);
        String expected1 = "b";
        assertEquals(expected1, output1);
        //==================================================================//
        int input2 = 0;
        String output2 = fromStringTest.colToString(input2);
        String expected2 = "a";
        assertEquals(expected2, output2);
    }
}