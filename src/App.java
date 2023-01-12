public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = { "Morango", "Uva", "Caju", "Acerola", "Manga" };
        String[] array2 = { "Pêra", "Caju", "Morango", "Kiwi" };

        for (int i = 0; i < array1.length; i++) {
            String elem = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == elem) {
                    System.out.println(array2[j]);
                    break;
                }
            }
        }
    }
}
