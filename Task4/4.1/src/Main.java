public class Main {
    public static void main(String[] args) {
        System.out.println(forString("спирт","ртспи"));
    }

    public static boolean forString(String word, String newWord) {
        if (word.length() == newWord.length()) {
            return (word + word).contains(newWord);
        }
        return false;
    }
}