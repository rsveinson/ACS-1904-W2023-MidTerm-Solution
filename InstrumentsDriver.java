import java.util.ArrayList;

public class InstrumentsDriver {
    
    
    public static void main(String[] args) {
        
        Stringed guitar = new Stringed("Gibson", 4500.00,StringedInstrument.GUITAR, "Les Paul");
        Stringed bass = new Stringed("Fender", 3395.00,StringedInstrument.BASS, "Jaguar");
        Percussion bassDrum = new Percussion("Pearl", 875.95, PercussionInstrument.KICKBASS);
        Percussion snareDrum = new Percussion("Pearl", 450.50, PercussionInstrument.SNARE);
        Percussion tomTomDrum = new Percussion("Pearl", 625.00, PercussionInstrument.TOMTOM);
        Percussion cymbol = new Percussion("Zylgyn", 120.00, PercussionInstrument.CYMBOL);

        ArrayList<Instrument> list = new ArrayList<>();
        list. add(guitar);
        list.add(bass);
        list.add(bassDrum);
        list.add(snareDrum);
        list.add(tomTomDrum);
        list.add(cymbol);

        for(Instrument i : list){
            // note that we are printing the toString() method 
            // of each element of the ArrayList
            System.out.println(i);
        }// end for
        
        System.out.println("\nend of program");
    }// end main
    
    
}