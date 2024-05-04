import java.util.HashMap;

class RnaTranscription {

    private final HashMap<String, Character> nucleotideMappings = new HashMap<>();

    public RnaTranscription() {
        nucleotideMappings.put("adenine", 'A');
        nucleotideMappings.put("cytosine", 'C');
        nucleotideMappings.put("guanine", 'G');
        nucleotideMappings.put("thymine", 'T');
        nucleotideMappings.put("uracil", 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder rnaBuilder = new StringBuilder();

        for (Character dnaNucleotide : dnaStrand.toCharArray()) {
            switch (dnaNucleotide) {
                case 'C':
                    rnaBuilder.append(nucleotideMappings.get("guanine"));
                    break;
                case 'G':
                    rnaBuilder.append(nucleotideMappings.get("cytosine"));
                    break;
                case 'T':
                    rnaBuilder.append(nucleotideMappings.get("adenine"));
                    break;
                case 'A':
                    rnaBuilder.append(nucleotideMappings.get("uracil"));
                    break;
            }
        }
        return rnaBuilder.toString();
    }

}
