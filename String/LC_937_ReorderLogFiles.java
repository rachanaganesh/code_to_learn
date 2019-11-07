package String;

import java.util.Arrays;
import java.util.Comparator;

public class LC_937_ReorderLogFiles {

    public static String[] reorderFiles(String[] logs){
        Arrays.sort(logs, (logs1,logs2)->{
            String[] split1 = logs1.split(" ",2);
            String[] split2 = logs2.split(" ",2);

            for(int i=0;i<split1.length;i++){
                System.out.println("split1: " +split1[i]);
            }
            for(int j=0;j<split2.length;j++){
                System.out.println("split2: "+split2[j]);
            }
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            return isDigit1? 0:1;
        });
return logs;
    }

    public static void main(String[] args){
        String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        LC_937_ReorderLogFiles.reorderFiles(logs);
    }
}
