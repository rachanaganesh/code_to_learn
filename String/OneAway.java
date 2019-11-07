package String;

public class OneAway{

    public boolean OneEditAway(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
            if(Math.abs(length1-length2)>1) {
                return false;
            }

            int count = 0;
            int i = 0, j = 0;
            while(i<length1 && j<length2) {
                if(s1.charAt(i)!=s2.charAt(j)) {
                    if(count==1)
                        return false;
                    if(length1>length2)
                        i++;
                    else if(length1<length2)
                        j++;
                    else {
                        i++;
                        j++;
                    }
                    count++;
                }
                else {
                    i++;
                    j++;
                }
            }
        if (i < length1 || j < length2)
            count++;

        return count == 1;
    }



    }