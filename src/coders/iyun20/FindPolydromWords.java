package coders.iyun20;

public class FindPolydromWords {
    public static void main(String[] args) {
        String setences = "laral find sos fppppoeqweqabfhabdhfbshdf";
        String[] words = setences.split(" ");

        for (String word : words){
            if (isPolindrom(word))
            System.out.println(word);
        }
    }

    public static boolean isPolindrom(String word){
       String newWord = word.toLowerCase();
       int i = 0;
       int j = word.length()-1;
        while (i<j){

            if (word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
