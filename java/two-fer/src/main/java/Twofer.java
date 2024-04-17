public class Twofer {
    public String twofer(String name) {
        boolean isNameNotGiven = name == null;
        if(isNameNotGiven) {
            return "One for you, one for me.";
        }
        else {
            return "One for " + name + ", one for me.";
        }

    }
}
