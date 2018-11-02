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

        RED_ONE_SQUIGGLE_SOLID(1),
        RED_TWO_SQUIGGLE_SOLID(2),
        RED_THREE_SQUIGGLE_SOLID(3),

        PURPLE_ONE_SQUIGGLE_SOLID(4),
        PURPLE_TWO_SQUIGGLE_SOLID(5),
        PURPLE_THREE_SQUIGGLE_SOLID(6),

        GREEN_ONE_SQUIGGLE_SOLID(7),
        GREEN_TWO_SQUIGGLE_SOLID(8),
        GREEN_THREE_SQUIGGLE_SOLID(9),

        RED_ONE_DIAMOND_SOLID(10),
        RED_TWO_DIAMOND_SOLID(11),
        RED_THREE_DIAMOND_SOLID(12),

        PURPLE_ONE_DIAMOND_SOLID(13),
        PURPLE_TWO_DIAMOND_SOLID(14),
        PURPLE_THREE_DIAMOND_SOLID(15),

        GREEN_ONE_DIAMOND_SOLID(16),
        GREEN_TWO_DIAMOND_SOLID(17),
        GREEN_THREE_DIAMOND_SOLID(18),

        RED_ONE_OVAL_SOLID(19),
        RED_TWO_OVAL_SOLID(20),
        RED_THREE_OVAL_SOLID(21),

        PURPLE_ONE_OVAL_SOLID(22),
        PURPLE_TWO_OVAL_SOLID(23),
        PURPLE_THREE_OVAL_SOLID(24),

        GREEN_ONE_OVAL_SOLID(25),
        GREEN_TWO_OVAL_SOLID(26),
        GREEN_THREE_OVAL_SOLID(27),

        RED_ONE_SQUIGGLE_STRIPED(28),
        RED_TWO_SQUIGGLE_STRIPED(29),
        RED_THREE_SQUIGGLE_STRIPED(30),

        PURPLE_ONE_SQUIGGLE_STRIPED(31),
        PURPLE_TWO_SQUIGGLE_STRIPED(32),
        PURPLE_THREE_SQUIGGLE_STRIPED(33),

        GREEN_ONE_SQUIGGLE_STRIPED(34),
        GREEN_TWO_SQUIGGLE_STRIPED(35),
        GREEN_THREE_SQUIGGLE_STRIPED(36),

        GREEN_ONE_DIAMOND_STRIPED(43),
        GREEN_TWO_DIAMOND_STRIPED(44),
        GREEN_THREE_DIAMOND_STRIPED(45),

        RED_ONE_OVAL_STRIPED(46),
        RED_TWO_OVAL_STRIPED(47),
        RED_THREE_OVAL_STRIPED(48),

        PURPLE_ONE_OVAL_STRIPED(49),
        PURPLE_TWO_OVAL_STRIPED(50),
        PURPLE_THREE_OVAL_STRIPED(51),

        GREEN_ONE_OVAL_STRIPPED(52),
        GREEN_TWO_OVAL_STRIPPED(53),
        GREEN_THREE_OVAL_STRIPPED(54),

        RED_ONE_SQUIGGLE_OPEN(55),
        RED_TWO_SQUIGGLE_OPEN(56),
        RED_THREE_SQUIGGLE_OPEN(57),

        PURPLE_ONE_SQUIGGLE_OPEN(58),
        PURPLE_TWO_SQUIGGLE_OPEN(59),
        PURPLE_THREE_SQUIGGLE_OPEN(60),

        GREEN_ONE_SQUIGGLE_OPEN(61),
        GREEN_TWO_SQUIGGLE_OPEN(62),
        GREEN_THREE_SQUIGGLE_OPEN(63),

        RED_ONE_DIAMOND_OPEN(64),
        RED_TWO_DIAMOND_OPEN(65),
        RED_THREE_DIAMOND_OPEN(66),

        PURPLE_ONE_DIAMOND_OPEN(67),
        PURPLE_TWO_DIAMOND_OPEN(68),
        PURPLE_THREE_DIAMOND_OPEN(69),

        GREEN_ONE_DIAMOND_OPEN(70),
        GREEN_TWO_DIAMOND_OPEN(71),
        GREEN_THREE_DIAMOND_OPEN(72),

        RED_ONE_OVAL_OPEN(73),
        RED_TWO_OVAL_OPEN(74),
        RED_THREE_OVAL_OPEN(75),

        PURPLE_ONE_OVAL_OPEN(76),
        PURPLE_TWO_OVAL_OPEN(77),
        PURPLE_THREE_OVAL_OPEN(78),

        GREEN_ONE_OVAL_OPEN(79),
        GREEN_TWO_OVAL_OPEN(80),
        GREEN_THREE_OVAL_OPEN(81);

        Cards(int v) {
            val = v;
        }
        public final int val;
    }

}
