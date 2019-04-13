import java.util.Comparator;

public class NameComparator implements Comparator<Birthday> {
    @Override
    public int compare(Birthday bd1, Birthday bd2) {
       return bd1.getFirstName().compareToIgnoreCase(bd2.getFirstName());
    }
}