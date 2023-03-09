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
    public void khaibao() throws FileNotFoundException {
        Define df = new Define();

        Map<String, List<String>> gg = new HashMap<>();
        String line = null;
        df.setSlang(gg);


    }
    public static void main(String[] args) throws IOException {
//        File f = new File("dictionary.txt"); //lấy dữ liệu từ file
//        FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        String line = null;
//        try {
//            while (true) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                } else {
//                    System.out.println(line);
//                    String[] words = line.split("`");
//                    List<String> dictionaries = List.of(line.split("\\|"));
//
//                    for (int i = 0; i < words.length; i++) {
//                        words[i] = words[i].trim();
////                        System.out.println(words[i]);
//                    }
//
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }
}
