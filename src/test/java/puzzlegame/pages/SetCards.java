package puzzlegame.pages;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static puzzlegame.pages.PuzzleMapping.Color.GREEN;
import static puzzlegame.pages.PuzzleMapping.Color.PURPLE;
import static puzzlegame.pages.PuzzleMapping.Color.RED;
import static puzzlegame.pages.PuzzleMapping.Fill.OPEN;
import static puzzlegame.pages.PuzzleMapping.Fill.SOLID;
import static puzzlegame.pages.PuzzleMapping.Fill.STRIPED;
import static puzzlegame.pages.PuzzleMapping.Number.ONE;
import static puzzlegame.pages.PuzzleMapping.Number.THREE;
import static puzzlegame.pages.PuzzleMapping.Number.TWO;
import static puzzlegame.pages.PuzzleMapping.Symbol.DIAMOND;
import static puzzlegame.pages.PuzzleMapping.Symbol.OVAL;
import static puzzlegame.pages.PuzzleMapping.Symbol.SQUIGGLE;

public class SetCards {

    PuzzleMapping.Color c;
    PuzzleMapping.Number n;
    PuzzleMapping.Symbol s;
    PuzzleMapping.Fill f;

    int index;

    SetCards(int index, PuzzleMapping.Color c, PuzzleMapping.Number n, PuzzleMapping.Symbol s, PuzzleMapping.Fill f){
        this.index = index;
        this.c = c;
        this.n = n;
        this.s = s;
        this.f = f;

//        this.color = color;
//        this.number = number;
//        this.symbol = symbol;
//        this.fill = fill;

    }

    List<SetCards> cards = Arrays.asList(
            new SetCards(1, RED, ONE, SQUIGGLE, SOLID),
            new SetCards(2, RED, TWO, SQUIGGLE, SOLID),
            new SetCards (3, RED, THREE, SQUIGGLE, SOLID),

            new SetCards(4, PURPLE, ONE, SQUIGGLE, SOLID),
            new SetCards(5, PURPLE, TWO, SQUIGGLE, SOLID),
            new SetCards(6, PURPLE, THREE, SQUIGGLE, SOLID),

            new SetCards(7,GREEN, ONE, SQUIGGLE, SOLID),
            new SetCards(8, GREEN, TWO, SQUIGGLE, SOLID),
            new SetCards(9, GREEN, THREE, SQUIGGLE, SOLID),

            new SetCards(10, RED, ONE, DIAMOND, SOLID),
            new SetCards(11, RED, TWO, DIAMOND, SOLID),
            new SetCards(12, RED, THREE, DIAMOND, SOLID),

            new SetCards(13, PURPLE, ONE, DIAMOND, SOLID),
            new SetCards(14, PURPLE, TWO, DIAMOND, SOLID),
            new SetCards(15, PURPLE, THREE, DIAMOND, SOLID),

            new SetCards(16, GREEN, ONE, DIAMOND, SOLID),
            new SetCards(17, GREEN, TWO, DIAMOND, SOLID),
            new SetCards(18, GREEN, THREE, DIAMOND, SOLID),

            new SetCards(19, RED, ONE, OVAL, SOLID),
            new SetCards(20, RED, TWO, OVAL, SOLID),
            new SetCards(21, RED, THREE, OVAL, SOLID),

            new SetCards(22, PURPLE, ONE, OVAL, SOLID),
            new SetCards(23, PURPLE, TWO, OVAL, SOLID),
            new SetCards(24, PURPLE, THREE, OVAL, SOLID),

            new SetCards(25, GREEN, ONE, OVAL, SOLID),
            new SetCards(26, GREEN, TWO, OVAL, SOLID),
            new SetCards(27, GREEN, THREE, OVAL, SOLID),

            new SetCards(28, RED, ONE, SQUIGGLE, STRIPED),
            new SetCards(29, RED, TWO, SQUIGGLE, STRIPED),
            new SetCards(30, RED, THREE, SQUIGGLE, STRIPED),

            new SetCards(31, PURPLE, ONE, SQUIGGLE, STRIPED),
            new SetCards(32, PURPLE, TWO, SQUIGGLE, STRIPED),
            new SetCards(33, PURPLE, THREE, SQUIGGLE, STRIPED),

            new SetCards(34, GREEN, ONE, SQUIGGLE, STRIPED),
            new SetCards(35, GREEN, TWO, SQUIGGLE, STRIPED),
            new SetCards(36, GREEN, THREE, SQUIGGLE, STRIPED),

            new SetCards(37, RED, ONE, DIAMOND, STRIPED),
            new SetCards(38, RED, TWO, DIAMOND, STRIPED),
            new SetCards(39, RED, THREE, DIAMOND, STRIPED),

            new SetCards(40, PURPLE, ONE, DIAMOND, STRIPED),
            new SetCards(41, PURPLE, TWO, DIAMOND, STRIPED),
            new SetCards(42, PURPLE, THREE, DIAMOND, STRIPED),

            new SetCards(43, GREEN, ONE, DIAMOND, STRIPED),
            new SetCards(44, GREEN, TWO, DIAMOND, STRIPED),
            new SetCards(45, GREEN, THREE, DIAMOND, STRIPED),

            new SetCards(46, RED, ONE, OVAL, STRIPED),
            new SetCards(47, RED, TWO, OVAL, STRIPED),
            new SetCards(48, RED, THREE, OVAL, STRIPED),

            new SetCards(49, PURPLE, ONE, OVAL, STRIPED),
            new SetCards(50, PURPLE, TWO, OVAL, STRIPED),
            new SetCards(51, PURPLE, THREE, OVAL, STRIPED),

            new SetCards(52, GREEN, ONE, OVAL, STRIPED),
            new SetCards(53, GREEN, TWO, OVAL, STRIPED),
            new SetCards(54, GREEN, THREE, OVAL, STRIPED),

            new SetCards(55, RED, ONE, SQUIGGLE, OPEN),
            new SetCards(56, RED, TWO, SQUIGGLE, OPEN),
            new SetCards(57, RED, THREE, SQUIGGLE, OPEN),

            new SetCards(58, PURPLE, ONE, SQUIGGLE, OPEN),
            new SetCards(59, PURPLE, TWO, SQUIGGLE, OPEN),
            new SetCards(60, PURPLE, THREE, SQUIGGLE, OPEN),

            new SetCards(61, GREEN, ONE, SQUIGGLE, OPEN),
            new SetCards(62, GREEN, TWO, SQUIGGLE, OPEN),
            new SetCards(63, GREEN, THREE, SQUIGGLE, OPEN),

            new SetCards(64, RED, ONE, DIAMOND, OPEN),
            new SetCards(65, RED, TWO, DIAMOND, OPEN),
            new SetCards(66, RED, THREE, DIAMOND, OPEN),

            new SetCards(67, PURPLE, ONE, DIAMOND, OPEN),
            new SetCards(68, PURPLE, TWO, DIAMOND, OPEN),
            new SetCards(69, PURPLE, THREE, DIAMOND, OPEN),

            new SetCards(70, GREEN, ONE, DIAMOND, OPEN),
            new SetCards(71, GREEN, TWO, DIAMOND, OPEN),
            new SetCards(72, GREEN, THREE, DIAMOND, OPEN),

            new SetCards(73, RED, ONE, OVAL, OPEN),
            new SetCards(74, RED, TWO, OVAL, OPEN),
            new SetCards(75, RED, THREE, OVAL, OPEN),

            new SetCards(76, PURPLE, ONE, OVAL, OPEN),
            new SetCards(77, PURPLE, TWO, OVAL, OPEN),
            new SetCards(78, PURPLE, THREE, OVAL, OPEN),

            new SetCards(79, GREEN, ONE, OVAL, OPEN),
            new SetCards(80, GREEN, TWO, OVAL, OPEN),
            new SetCards(81, GREEN, THREE, OVAL, OPEN));



    public String toString(){
        return null;
    }
}
