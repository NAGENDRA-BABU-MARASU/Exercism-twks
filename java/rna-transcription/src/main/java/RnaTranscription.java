import java.util.HashMap;

class RnaTranscription {

    private HashMap<String, Character> nucleotideMappings = new HashMap<>();

    public RnaTranscription() {
        nucleotideMappings.put("adenine", 'A');
        nucleotideMappings.put("cytosine", 'C');
        nucleotideMappings.put("guanine", 'G');
        nucleotideMappings.put("thymine", 'T');
        nucleotideMappings.put("uracil", 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder rnaBuilder = new StringBuilder();

        for(Character dnaNucleotide: dnaStrand.toCharArray()){
            if(dnaNucleotide.equals(nucleotideMappings.get("cytosine"))){
                rnaBuilder.append(transcribeCytosineToGuanine());
            }
            else if(dnaNucleotide.equals(nucleotideMappings.get("guanine"))) {
                rnaBuilder.append(transcribeGuanineToCytosine());
            }
            else if(dnaNucleotide.equals(nucleotideMappings.get("thymine"))) {
                rnaBuilder.append(transcribeThymineToAdenine());
            }
            else if(dnaNucleotide.equals(nucleotideMappings.get("adenine"))) {
                rnaBuilder.append(transcribeAdenineToUracil());
            }
        }
        return rnaBuilder.toString();
    }

    private Character transcribeAdenineToUracil() {
        return nucleotideMappings.get("uracil");
    }

    private Character transcribeThymineToAdenine() {
        return nucleotideMappings.get("adenine");
    }

    private Character transcribeGuanineToCytosine() {
        return nucleotideMappings.get("cytosine");
    }

    private Character transcribeCytosineToGuanine(){
        return nucleotideMappings.get("guanine");
    }

}
