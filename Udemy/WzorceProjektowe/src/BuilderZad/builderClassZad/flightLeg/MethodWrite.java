package BuilderZad.builderClassZad.flightLeg;

import java.io.FileWriter;
import java.io.IOException;

public class MethodWrite {

    String fileName ="ListPassengers" ;
    FileWriter fileWriter = null;

    public void write(String passenger) throws IOException
    {
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(passenger);
        } catch (IOException ex) {
            System.out.println();
        }finally {
            if (fileWriter == null){
                System.out.println("Problem");
                fileWriter.close();
            }else
                fileWriter.close();
        }
    }
}

