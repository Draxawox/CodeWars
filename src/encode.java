public class encode {
    static String encode(String word){
        String finalOne;
        String letter;
        StringBuilder sb = new StringBuilder();
        int letterCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                letter = String.valueOf(word.charAt(i));
                if (letter.equals(String.valueOf(word.charAt(j)))) {
                    letterCounter ++;
                }

            }
            if (letterCounter > 1) {
                sb.append("(");
            } else {
                sb.append(")");
            }
            letterCounter = 0;
        }
        finalOne = String.valueOf(sb);
        return finalOne;
    }
}
