public class Main {
    public static void main(String[] args) {
        String[] data = {"1234", "1567", "computer science", "-2", "."};
        int count = 0;
        for (String s : data) {
            if (s.length() < 4) {
                count++;
            }
        }
        System.out.println(count);
    }
}

