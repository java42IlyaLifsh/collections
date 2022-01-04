import static org.junit.jupiter.api.Assertions.*;
//HW_24
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
class CollectionsIntroductionTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void ImmutableCollection() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		boolean flException = false;
		Collection<Integer> list1 = new ArrayList<>(list);
		list1 = Collections.unmodifiableCollection(list1);
		try {
			list1.add(10);
		} catch (UnsupportedOperationException e) {
			flException = true;
		}
		assertTrue(flException);
	}
	@Test
	void sublistTest() {
		List<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
		List<Integer> sublist = list.subList(1, 3);
		assertEquals(2, sublist.size());
		assertArrayEquals(new Integer[] {20,30}, sublist.toArray(new Integer[2]));
		sublist.add(0, -20);
		sublist = list.subList(1, 3);
		assertArrayEquals(new Integer[] {-20,20}, sublist.toArray(new Integer[2]));
		sublist.add(-30);
		sublist = list.subList(2, 4);
		assertArrayEquals(new Integer[] {20,-30}, sublist.toArray(new Integer[2]));
		
	}

}
