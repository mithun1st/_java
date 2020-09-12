
package serial.port;


import java.io.PrintWriter;
import com.fazecast.jSerialComm.SerialPort; //need to import lib

public class mainMethod {
    

    public static void main(String[] args) {
        SerialPort p;

        p=SerialPort.getCommPort("COM6");
        
        if(p.openPort()) {
            PrintWriter output = new PrintWriter(p.getOutputStream());
            output.print("string");
            output.flush();
        }
        else{
            p.closePort();
        }
        
        
        
                    
    }

}
