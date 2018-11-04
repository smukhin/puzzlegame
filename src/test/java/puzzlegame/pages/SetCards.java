package puzzlegame.pages;

import java.util.ArrayList;
import java.util.List;

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

public class SetCards implements Comparable<SetCards>{
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
    }

    public SetCards() {

    }

    public SetCards[] mappedCards() {

        int k = 0;
        SetCards[] cards = new SetCards[82];

        cards[1]  = new SetCards(1, RED, ONE, SQUIGGLE, SOLID);
        cards[2] =  new SetCards(2, RED, TWO, SQUIGGLE, SOLID);
        cards[3] = new SetCards (3, RED, THREE, SQUIGGLE, SOLID);

        cards[4] = new SetCards(4, PURPLE, ONE, SQUIGGLE, SOLID);
        cards[5] = new SetCards(5, PURPLE, TWO, SQUIGGLE, SOLID);
        cards[6] = new SetCards(6, PURPLE, THREE, SQUIGGLE, SOLID);

        cards[7] = new SetCards(7,GREEN, ONE, SQUIGGLE, SOLID);
        cards[8] = new SetCards(8, GREEN, TWO, SQUIGGLE, SOLID);
        cards[9] = new SetCards(9, GREEN, THREE, SQUIGGLE, SOLID);

        cards[10] = new SetCards(10, RED, ONE, DIAMOND, SOLID);
        cards[11] = new SetCards(11, RED, TWO, DIAMOND, SOLID);
        cards[12] = new SetCards(12, RED, THREE, DIAMOND, SOLID);

        cards[13] = new SetCards(13, PURPLE, ONE, DIAMOND, SOLID);
        cards[14] = new SetCards(14, PURPLE, TWO, DIAMOND, SOLID);
        cards[15] = new SetCards(15, PURPLE, THREE, DIAMOND, SOLID);

        cards[16] = new SetCards(16, GREEN, ONE, DIAMOND, SOLID);
        cards[17] = new SetCards(17, GREEN, TWO, DIAMOND, SOLID);
        cards[18] = new SetCards(18, GREEN, THREE, DIAMOND, SOLID);

        cards[19] = new SetCards(19, RED, ONE, OVAL, SOLID);
        cards[20] = new SetCards(20, RED, TWO, OVAL, SOLID);
        cards[21] = new SetCards(21, RED, THREE, OVAL, SOLID);

        cards[22] = new SetCards(22, PURPLE, ONE, OVAL, SOLID);
        cards[23] = new SetCards(23, PURPLE, TWO, OVAL, SOLID);
        cards[24] = new SetCards(24, PURPLE, THREE, OVAL, SOLID);

        cards[25] = new SetCards(25, GREEN, ONE, OVAL, SOLID);
        cards[26] = new SetCards(26, GREEN, TWO, OVAL, SOLID);
        cards[27] = new SetCards(27, GREEN, THREE, OVAL, SOLID);

        cards[28] = new SetCards(28, RED, ONE, SQUIGGLE, STRIPED);
        cards[29] = new SetCards(29, RED, TWO, SQUIGGLE, STRIPED);
        cards[30] = new SetCards(30, RED, THREE, SQUIGGLE, STRIPED);

        cards[31] = new SetCards(31, PURPLE, ONE, SQUIGGLE, STRIPED);
        cards[32] = new SetCards(32, PURPLE, TWO, SQUIGGLE, STRIPED);
        cards[33] = new SetCards(33, PURPLE, THREE, SQUIGGLE, STRIPED);

        cards[34] = new SetCards(34, GREEN, ONE, SQUIGGLE, STRIPED);
        cards[35] = new SetCards(35, GREEN, TWO, SQUIGGLE, STRIPED);
        cards[36] = new SetCards(36, GREEN, THREE, SQUIGGLE, STRIPED);

        cards[37] = new SetCards(37, RED, ONE, DIAMOND, STRIPED);
        cards[38] = new SetCards(38, RED, TWO, DIAMOND, STRIPED);
        cards[39] = new SetCards(39, RED, THREE, DIAMOND, STRIPED);

        cards[40] = new SetCards(40, PURPLE, ONE, DIAMOND, STRIPED);
        cards[41] = new SetCards(41, PURPLE, TWO, DIAMOND, STRIPED);
        cards[42] = new SetCards(42, PURPLE, THREE, DIAMOND, STRIPED);

        cards[43] = new SetCards(43, GREEN, ONE, DIAMOND, STRIPED);
        cards[44] = new SetCards(44, GREEN, TWO, DIAMOND, STRIPED);
        cards[45] = new SetCards(45, GREEN, THREE, DIAMOND, STRIPED);

        cards[46] = new SetCards(46, RED, ONE, OVAL, STRIPED);
        cards[47] = new SetCards(47, RED, TWO, OVAL, STRIPED);
        cards[48] = new SetCards(48, RED, THREE, OVAL, STRIPED);

        cards[49] = new SetCards(49, PURPLE, ONE, OVAL, STRIPED);
        cards[50] = new SetCards(50, PURPLE, TWO, OVAL, STRIPED);
        cards[51] = new SetCards(51, PURPLE, THREE, OVAL, STRIPED);

        cards[52] = new SetCards(52, GREEN, ONE, OVAL, STRIPED);
        cards[53] = new SetCards(53, GREEN, TWO, OVAL, STRIPED);
        cards[54] = new SetCards(54, GREEN, THREE, OVAL, STRIPED);

        cards[55] = new SetCards(55, RED, ONE, SQUIGGLE, OPEN);
        cards[56] = new SetCards(56, RED, TWO, SQUIGGLE, OPEN);
        cards[57] = new SetCards(57, RED, THREE, SQUIGGLE, OPEN);

        cards[58] = new SetCards(58, PURPLE, ONE, SQUIGGLE, OPEN);
        cards[59] = new SetCards(59, PURPLE, TWO, SQUIGGLE, OPEN);
        cards[60] = new SetCards(60, PURPLE, THREE, SQUIGGLE, OPEN);

        cards[61] = new SetCards(61, GREEN, ONE, SQUIGGLE, OPEN);
        cards[62] = new SetCards(62, GREEN, TWO, SQUIGGLE, OPEN);
        cards[63] = new SetCards(63, GREEN, THREE, SQUIGGLE, OPEN);

        cards[64] = new SetCards(64, RED, ONE, DIAMOND, OPEN);
        cards[65] = new SetCards(65, RED, TWO, DIAMOND, OPEN);
        cards[66] = new SetCards(66, RED, THREE, DIAMOND, OPEN);

        cards[67] = new SetCards(67, PURPLE, ONE, DIAMOND, OPEN);
        cards[68] = new SetCards(68, PURPLE, TWO, DIAMOND, OPEN);
        cards[69] = new SetCards(69, PURPLE, THREE, DIAMOND, OPEN);

        cards[70] = new SetCards(70, GREEN, ONE, DIAMOND, OPEN);
        cards[71] = new SetCards(71, GREEN, TWO, DIAMOND, OPEN);
        cards[72] = new SetCards(72, GREEN, THREE, DIAMOND, OPEN);

        cards[73] = new SetCards(73, RED, ONE, OVAL, OPEN);
        cards[74] = new SetCards(74, RED, TWO, OVAL, OPEN);
        cards[75] = new SetCards(75, RED, THREE, OVAL, OPEN);

        cards[76] = new SetCards(76, PURPLE, ONE, OVAL, OPEN);
        cards[77] = new SetCards(77, PURPLE, TWO, OVAL, OPEN);
        cards[78] = new SetCards(78, PURPLE, THREE, OVAL, OPEN);

        cards[79] = new SetCards(79, GREEN, ONE, OVAL, OPEN);
        cards[80] = new SetCards(80, GREEN, TWO, OVAL, OPEN);
        cards[81] = new SetCards(81, GREEN, THREE, OVAL, OPEN);


        return cards;

    }

    public List<Cards> getCard() throws Exception {

        return null;
    }

    @Override
    public String toString(){
        return String.format("[Card: %s, %s, %s, %s]", c, n, s, f);
    }

    @Override
    public int compareTo(SetCards o) {
        return (c.val - o.c.val) * 10 + (n.val - o.n.val);
    }

    private static boolean validSet(SetCards c1, SetCards c2, SetCards c3) {
        int tot = 0;
        tot += (c1.c.val + c2.c.val + c3.c.val) % 3;
        tot += (c1.n.val + c2.n.val + c3.n.val) % 3;
        tot += (c1.s.val + c2.s.val + c3.s.val) % 3;
        tot += (c1.f.val + c2.f.val + c3.f.val) % 3;
        return tot == 0;
    }


}
