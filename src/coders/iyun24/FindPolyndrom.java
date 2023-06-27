package coders.iyun24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPolyndrom {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("SOS", "Tavat", "asd");
        int last = stringList.size()-1;
        for (int i = 0;i<stringList.size();i++){
            stringList.stream()
                    .filter(n-> n.charAt(i) == n.charAt(last));
        }

    }
}
