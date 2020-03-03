package practicemyself;

public class StrinImmutable {
    public static void main(String[] args) {
       /* In java, string objects are immutable. Immutable means unmodifiable or unchangeable.
                Once string object is created its data or state can't be changed but a new string object is created.  */

        String x = "ABC";
        String y = "TECH";
        x.concat(y);
        System.out.println(x);


    }
}
/* to veruify if the srtings are really immutable I would begin by creating my first String call x
with ABC as the data annd then I will create my second String y with TECH as the data.And now I would like to
 combine them and I would like concat them on i would say x.dot.concat on y after I want to print result,
 so I would be having this statement  System.out.println(x);, the output will be ABC, which goes to show even
  if you try to change ABC output will not be change, becasue output has been ABC */