class ResistorColor {
    private final String[] colorsCodes = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };

    int colorCode(String color) {
        for(int index = 0; index < colorsCodes.length; index++){
            String currentColor = colorsCodes[index];
            if(currentColor.equals(color)){
                return index;
            }
        }
        return -1;
    }

    String[] colors() {
        return this.colorsCodes;
    }
}
