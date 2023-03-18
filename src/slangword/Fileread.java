package slangword;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Binh
 * Date : 3/18/2023 - 12:10 PM
 * Description :
 */
public class Fileread {
    String[] words;
    private Map<String, List<String>> slang = new HashMap<>();



    public void sa() throws FileNotFoundException{

        File f = new File("dictionary.txt"); //lấy dữ liệu từ file
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        try {
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
//                    System.out.println(line);
                    words = line.split("`");
                    List<String> dictionaries = List.of(line.split("\\|"));

//                  System.out.println(words[0]);

//                    System.out.println(dictionaries);
                    for (int i = 1; i < words.length; i++) {
                        words[i] = words[i].trim();
                        System.out.println(words[i]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> tratu(String tukhoa){
        tukhoa = words[0];
//      hàm get giúp lấy ra value tương ứng
        List<String> Ynghia ;
        Ynghia = this.slang.get(tukhoa);
        return Ynghia;
    }

}
