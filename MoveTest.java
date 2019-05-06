package jwtc.chess;

import org.junit.Test;

import static org.junit.Assert.*;


    public class MoveTest {

        @Test
        public void makeMove() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMove(input1,input2);
            int expected1 = 64;
            assertEquals(expected1, output1);

        }

        @Test
        public void makeMoveFirstPawn() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMoveFirstPawn(input1,input2);
            int expected1 = 131136;
            assertEquals(expected1, output1);
        }

        @Test
        public void makeMoveHit() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMoveHit(input1,input2);
            int expected1 = 65600;
            assertEquals(expected1, output1);
        }

        @Test
        public void makeMoveEP() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMoveEP(input1,input2);
            int expected1 = 73792;
            assertEquals(expected1, output1);
        }

        @Test
        public void makeMoveOO() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMoveOO(input1,input2);
            int expected1 = 16448;
            assertEquals(expected1, output1);
        }

        @Test
        public void makeMoveOOO() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int output1 = fromStringTest.makeMoveOOO(input1,input2);
            int expected1 = 32832;
            assertEquals(expected1, output1);
        }

        @Test
        public void makeMovePromotion() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            int input3 = 0;
            int output1 = fromStringTest.makeMovePromotion(input1,input2,input3,false);
            int expected1 = 524352;
            assertEquals(expected1, output1);
        }

        @Test
        public void setCheck() {
            Move fromStringTest = new Move();
            int input1 = 262144;
            int output1 = fromStringTest.setCheck(input1);
            int expected1 = 262144;
            assertEquals(expected1, output1);
        }

        @Test
        public void equalPositions() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            boolean output1 = fromStringTest.equalPositions(input1,input2);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void equalTos() {
            Move fromStringTest = new Move();
            int input1 = 64;
            int input2 = 1;
            boolean output1 = fromStringTest.equalTos(input1,input2);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void getFrom() {
            Move fromStringTest = new Move();
            int input1 = 0;
            int output1 = fromStringTest.getFrom(input1);
            int expected1 = 0;
            assertEquals(expected1, output1);
        }


        @Test
        public void getTo() {
            Move fromStringTest = new Move();
            int input1 = 0;
            int output1 = fromStringTest.getTo(input1);
            int expected1 = 0;
            assertEquals(expected1, output1);
        }

        @Test
        public void isEP() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isEP(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isOO() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isOO(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isOOO() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isOOO(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isHIT() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isHIT(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isCheck() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isCheck(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isFirstPawnMove() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isFirstPawnMove(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void isPromotionMove() {
            Move fromStringTest = new Move();
            int input1 = 0;
            boolean output1 = fromStringTest.isPromotionMove(input1);
            boolean expected1 = false;
            assertEquals(expected1, output1);
        }

        @Test
        public void getPromotionPiece() {
            Move fromStringTest = new Move();
            int input1 = 1;
            int output1 = fromStringTest.getPromotionPiece(input1);
            int expected1 = 0;
            assertEquals(expected1, output1);
        }

        @Test
        public void toDbgString() {
            assertTrue(true);
        }
    }
