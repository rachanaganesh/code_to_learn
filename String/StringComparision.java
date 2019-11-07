package String;

public class StringComparision {
    public String Compressed(String str) {

        int comCount =1;
        char comChar = str.charAt(0);
        StringBuilder  builder = new StringBuilder(str.length());
        for(int i=1 ; i<str.length(); i++) {
            char strNext = str.charAt(i);
            if(comChar==strNext){
                comCount++;
            } else {
                builder.append(comChar).append(comCount);
                comCount = 1;
                comChar = strNext;
            }
        }
        builder.append(comChar).append(comCount);

        return builder.length() < str.length() ? builder.toString(): str;
    }
}
