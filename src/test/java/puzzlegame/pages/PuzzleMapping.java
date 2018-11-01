package puzzlegame.pages;

public class PuzzleMapping {

    public enum Color {

        GREEN(0), PURPLE(1), RED(2);

        private Color(int v) {
            val = v;
        }
        public final int val;
    }

    enum Number {

        ONE(0), TWO(1), THREE(2);

        private Number(int v) {
            val = v;
        }
        public final int val;
    }

    enum Symbol {

        OVAL(0), DIAMOND(1), SQUIGGLE(2);

        private Symbol(int v) {
            val = v;
        }
        public final int val;
    }

    enum Fill {

        OPEN(0), STRIPED(1), SOLID(2);

        private Fill(int v) {
            val = v;
        }
        public final int val;
    }

    enum Cards{


    }

}
