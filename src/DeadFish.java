public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        int oCounter = 0;
        int anotherCounter = 0;
        for (int i = 0; i < data.toCharArray().length; i++) {
            if (String.valueOf(data.charAt(i)).equals("o")) {
                oCounter++;
            }
        }
        int[] tab = new int[oCounter];
        for (int i = 0; i < data.length(); i++) {
            String thisOne = String.valueOf(data.charAt(i));
            if (thisOne.equals("i")) {
                value++;
            } else if (thisOne.equals("d")) {
                value--;
            } else if (thisOne.equals("s")) {
                value *= value;
            } else if (thisOne.equals("o")) {
                tab[anotherCounter] = value;
                anotherCounter++;
            } else {
                continue;
            }
        }
        return tab;
    }
}
