package leetCode100DaysII;

public class AddingSpacesToAString {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();

        int index = 0;
        int i = 0;

        while (index < spaces.length) {
            if (spaces[index] == 0) {
                result.append(" ");
                i = spaces[index];
                index++;
            } else {
                result.append(s, i, spaces[index]);
                result.append(" ");
                i = spaces[index];
                index++;
            }

            if (index == spaces.length) {
                result.append(s.substring(i));
            }
        }

        return result.toString();
//        String result = "";
//
//        int index = 0;
//        int i = 0;
//        while (index < spaces.length){
//            if (spaces[index] == 0){
//                result+=" ";
//                i=spaces[index];
//                index++;
//            }else {
//                result += s.substring(i, spaces[index]);
//                result += " ";
//                i = spaces[index];
//                index++;
//            }
//
//        }
//        if(index == spaces.length){
//            result+=s.substring(i,s.length());
//        }
//        return result;
    }
}
