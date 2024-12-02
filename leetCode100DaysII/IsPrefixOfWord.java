package leetCode100DaysII;

import java.util.Arrays;

public class IsPrefixOfWord {
    public static void main(String[] args) {
        String str = "corona dream";
        String search = "d";
        System.out.println(isPrefixOfWord(str, search));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] strArr = sentence.split(" ");
        int count = 1;
        for (String item: strArr){
            if(item.length() >= searchWord.length()){
                int i = 0;
                int j = searchWord.length() - 1;

                while (i <= j){
                    if(item.charAt(i) == searchWord.charAt(i) && item.charAt(j) == searchWord.charAt(j)) {
                        i++;
                        j--;
                    }else{
                        break;
                    }
                    if(i >= j ) return count;

                }
            }
            count++;
        }
        return -1;
//        String[] strArr = sentence.split(" ");
////        System.out.println(Arrays.toString(strArr));
//        int count = 1;
//        for (String item: strArr){
//
//            if(item.length() >= searchWord.length()){
//                if(item.charAt(0) == searchWord.charAt(0) &&
//                        item.charAt(searchWord.length() - 1) == searchWord.charAt(searchWord.length() - 1)) {
//                    return count;
//                }
//            }
//            count++;
//        }
//        return -1;
    }
}
