import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProteinTest {

    @Test
    @DisplayName("Protein Sequence Validation Test")
    public void testValidSeq() {

        String id ="A0JNW5";
        String type = "Protein";
        String seq = "MAGIIKKQILKHLSRFTKNLSPDKINLSTLKGEGELKNLELDEEVLQNMLDLPTWLAINK";

        Protein protein = new Protein( id, type, seq);

        String proteinSeq = protein.getSeq();
        boolean isValid = protein.validSeq();

        Assertions.assertTrue(isValid, "If protein sequence is valid, it will pass ");
        System.out.println("Protein sequence:"+ "\n" +proteinSeq+ "\n" +"passed validation test.");
        System.out.println("Author: Faith Igomodu");
    }

}
