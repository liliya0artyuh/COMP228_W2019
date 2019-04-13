
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayTest {

	public static void main(String[] args) {
		List<Birthday> birthdays = new ArrayList<Birthday>();
		Birthday bd1 = new Birthday("Sandra", 25);
		Birthday bd2 = new Birthday("Lorna", 22);
		Birthday bd3 = new Birthday("Glen", 26);
		Birthday bd4 = new Birthday("Bob", 24);

		birthdays.add(bd1);
		birthdays.add(bd2);
		birthdays.add(bd3);
		birthdays.add(bd4);

		System.out.println("Before Sorting : ");
		display(birthdays);
		Collections.sort(birthdays, new AgeComparator());
		System.out.println("After Sorting by age : ");
		display(birthdays);
		Collections.sort(birthdays, new NameComparator());
		System.out.println("After Sorting by name : ");
		display(birthdays);

	}

	public static void display(List<Birthday> birthdays) {
		for (Birthday b : birthdays) {
			System.out.println(b);
		}
	}

}
