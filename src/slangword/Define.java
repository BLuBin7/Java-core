package slangword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Binh
 * Date : 3/9/2023 - 7:17 PM
 * Description :
 */
public class Define {
    File f = new File("dictionary.txt"); //lấy dữ liệu từ file
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    private Map<String, List<String>> slang = new HashMap<>();
    private HashMap<String, List<String>> define = new HashMap<>();

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public Map<String, List<String>> getSlang() {
        return slang;
    }

    public void setSlang(Map<String, List<String>> slang) {
        this.slang = slang;
    }

    public HashMap<String, List<String>> getDefine() {
        return define;
    }

    public void setDefine(HashMap<String, List<String>> define) {
        this.define = define;
    }

    public Define() throws FileNotFoundException {
    }
}
