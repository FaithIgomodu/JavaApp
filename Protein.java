import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class Protein extends Sequence{
    private String proteinSeq;

    //Use parent constructor
    public Protein ( String id,
                    String type,
                    String seq){
        super(type, id, seq );
        this.proteinSeq = seq;

    }

    public Protein() {

    }

    //Get sequence
    public String getSeq(){
        return this.proteinSeq;
    }

    //Set sequence
    public void setSeq(String seq){
        this.proteinSeq = seq;
    }

    @Override
    public boolean validSeq(){
        return Pattern.matches("[ACDEFGHIKLMNPQRSTVWY]+", proteinSeq);
    }


    @Test
    @DisplayName("Protein Sequence Validation Test")
    public void testValidSeq() {

        Protein protein = new Protein();

        String proteinValid = "MFASCHCVPRGRRTMKMIHFRSSSVKSLSQEMRCTIRLLDDSEISCHIQRETKGQFLIDHCNYYSLLEKDYFGIRYVDPEKQR";
        protein.setSeq(proteinValid);
        boolean isValid = protein.validSeq();

        Assertions.assertTrue(isValid, "If protein sequence is valid, it will pass ");
    }

}
