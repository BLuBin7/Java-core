package slangword;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Binh
 * Date : 3/5/2023 - 12:20 AM
 * Description :
 */


public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws FileNotFoundException the file not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        Fileread fr = new Fileread();
//        fr.sa();
        fr.tratu("&");
        System.out.println(fr.tratu("&"));

    }
}
