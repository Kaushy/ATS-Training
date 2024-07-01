package Week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEX {
    public static void main(String[] args)throws FileNotFoundException {
        File f = new File("Num.txt");
        Scanner sc = new Scanner(f);
        boolean linePresent = sc.hasNext();
        while(linePresent){
            String line = sc.next();
            int index = line.lastIndexOf(":");
            String mobile =line.substring(index+1);
            Pattern p= Pattern.compile("0?[6-9][0-9]{9}");
            Matcher m = p.matcher(mobile);
            if(m.find()){
                System.out.println(m.group()+": THis number is valid");
            }
            else
                System.out.println(mobile +": this number is not valid");
            linePresent = sc.hasNext();
        }

    }
}
