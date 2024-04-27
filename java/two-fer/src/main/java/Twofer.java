public class Twofer {
    public String twofer(String name) {
        String word = (name == null) ? "you" : name;
        return String.format("One for %s, one for me.", word);
    }
}
