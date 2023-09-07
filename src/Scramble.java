import java.util.List;

public class Scramble {

    public static String scrambleWord(String word) {
            StringBuilder sb = new StringBuilder(word);
            int i = 0;
            while (i < sb.length() - 1) {
                if (sb.charAt(i) == 'A' && sb.charAt(i + 1) != 'A') {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i + 1));
                    sb.setCharAt(i + 1, temp);
                    i += 2;
                } else {
                    i++;
                }
            }
            return sb.toString();
        }

        public static void scrambleOrRemove(List<String> wordList) {
            int i = 0;
            while (i < wordList.size()) {
                String word = wordList.get(i);
                String scrambledWord = scrambleWord(word);
                if (scrambledWord.equals(word)) {
                    wordList.remove(i);
                } else {
                    wordList.set(i, scrambledWord);
                    i++;
                }
            }
        }


    }


