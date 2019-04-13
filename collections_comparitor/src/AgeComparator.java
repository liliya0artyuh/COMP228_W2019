import java.util.Comparator;

public class AgeComparator implements Comparator<Birthday> {
  
    @Override
    public int compare(Birthday bd1, Birthday bd2) {
       return (bd1.getAge() - bd2.getAge());
    }
}