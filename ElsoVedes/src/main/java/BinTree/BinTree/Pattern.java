package BinTree;

public class Pattern {
        private int howManyPatterns;
        private int succesCounter;
        private char pattern[];

        public Pattern(){
        }

        // Ez legyen már ami bitmintát megkell számolni a fába
        public Pattern(char[] pattern) {
        	this.pattern = pattern;
        }

        public Pattern(String pattern) {
        	this.pattern = pattern.toCharArray();
        }

        public int getPatternLength() {
            return pattern.length;
        }

        public long getPatternsNumber() {
                return howManyPatterns;
        }

        public void checkCounter() {
                if (succesCounter == pattern.length) {
                        ++howManyPatterns;
                        succesCounter = 0;
                }
        }

        public void checkPattern(String pattern) {
        	char[] array = pattern.toCharArray();
        	this.checkPatt(array);
        }


        public void checkPatt(char[] array) {

        	for (int index = 0; index < pattern.length; ++index) {
        		if (array[index] == pattern[index]) {
        			++succesCounter;
                } else {
                    succesCounter = 0;
                }

                checkCounter();
            }
        }

}
