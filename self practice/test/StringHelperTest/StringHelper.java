package test.StringHelperTest;

public class StringHelper {
    public String truncateAfromstart(String s){
        if(s.length()<=2){
            s.replaceAll("A", "");
            return s;
    }
    String first= s.substring(0, 2);
    String two= s.substring(2);
    return first.replaceAll("A", "")+two;

    }
}
