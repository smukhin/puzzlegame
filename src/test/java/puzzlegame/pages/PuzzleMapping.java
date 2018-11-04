package puzzlegame.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static puzzlegame.pages.PuzzleMapping.Color.RED;
import static puzzlegame.pages.PuzzleMapping.Fill.SOLID;
import static puzzlegame.pages.PuzzleMapping.Number.ONE;
import static puzzlegame.pages.PuzzleMapping.Symbol.SQUIGGLE;

public class PuzzleMapping {

    enum Color {

        GREEN(0), PURPLE(1), RED(2);

        private Color(int v) {
            val = v;
        }
        public final int val;

        private Color cardColor;
        public Color getColor(){
            return cardColor;
        }
    }

    enum Number {

        ONE(0), TWO(1), THREE(2);

        private Number(int v) {
            val = v;
        }
        public final int val;

        private Number cardNumber;
        public Number getNumber(){
            return cardNumber;
        }
    }

    enum Symbol {

        OVAL(0), DIAMOND(1), SQUIGGLE(2);

        private Symbol(int v) {
            val = v;
        }
        public final int val;
        private Symbol cardSymbol;
        public Symbol getSymbol(){
            return cardSymbol;
        }

    }

    enum Fill {

        OPEN(0), STRIPED(1), SOLID(2);

        private Fill(int v) {
            val = v;
        }
        public final int val;
        private Fill cardFill;
        public Fill getFill(){
            return cardFill;
        }
    }

    public PuzzleMapping card(){
        List<Enum> card = new ArrayList<>();
       // card.add(RED,ONE,SQ)
        return null;
    }

    public List<String> cards(){

        return null;
    }

}
