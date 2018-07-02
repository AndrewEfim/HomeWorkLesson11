package by.itacademy.homework;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {

    private static Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("logApp");
            LOGGER.addHandler(fileHandler);
        }catch (IOException e){
            LOGGER.log(Level.WARNING,"Warning level log");
            LOGGER.log(Level.INFO,"Write Log with info level");
        }

        String stringinput = "helowooorlddddddd";
        Compressor compressor = new Compressor( );
        DeCompressor deCompressor = new DeCompressor( );
        compressor.compressor(stringinput);
        deCompressor.deCompressor(compressor.compressor(stringinput));
        System.out.println("Строка на входе" + " " + stringinput);
        System.out.println(compressor.compressor(stringinput));
        System.out.println(deCompressor.deCompressor(compressor.compressor(stringinput)));
    }
}
