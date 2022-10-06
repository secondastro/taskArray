public class Main {
    public static void main(String[] args) {
        String[] arr = {"Виктор", "Алина", "Михаил", "Олег", "Вадим", "Алина", "Геннадий"};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == null) {
                    continue;
                }
                if (arr[i].equals(arr[j])) {
                    arr[j] = null;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (i < arr.length - 1) {
                s += arr[i] + ", ";
            } else {
                s += arr[i];
            }
        }
        System.out.println(s);
    }
}

