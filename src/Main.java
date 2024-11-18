import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] data = {"1234", "1567", "computer science", "-2", "."};
        int count = 0;
        for (String s : data) {
            if (s.length() < 4) {
                count++;
            }
        }
        String[] goodArray = new String[count];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < goodArray.length; j++) {
                if (data[i].length() < 4 && goodArray[j] == null) {
                    goodArray[j] = data[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(goodArray));
    }
}