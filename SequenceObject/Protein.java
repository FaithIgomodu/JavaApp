
import java.util.regex.Pattern;

/* Implement inheritance by using extends keyword to
 create a protein object with  same properties as
Sequence superclass.*/
class Protein extends Sequence{


    //Use super keyword to obtain the properties of the superclass
    public Protein ( String id,
                    String type,
                    String seq){
        super(type, id, seq );

    }



    // Implement polymorphism by overriding method
    @Override
    public boolean validSeq(){
        String sequence = getSeq();
        return Pattern.matches("[ACDEFGHIKLMNPQRSTVWY]+", sequence);
    }


}
