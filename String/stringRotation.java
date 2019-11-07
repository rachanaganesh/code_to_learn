package String;

public class stringRotation {
    public boolean rotate(String A, String B) {
      if(A.length()!=B.length()) {
          return false;
      }
      System.out.println(A);
      System.out.println(B);

      String con = A + A ;


        if(con.indexOf(B)!=-1) {
            System.out.println(con.indexOf(B));
            return true;
        }

      return false;
    }
}
