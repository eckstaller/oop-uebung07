package ueb07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
	@Test
	void testStudent() {
		Student s = new Student(123, "Hans");
		System.out.println(s);

		assertThrows(IllegalArgumentException.class, () -> s.setName(null));
		assertThrows(IllegalArgumentException.class, () -> s.setMatrikel(-3));
	}
	@Test
	void testStudentComparable(){
		Student s = new Student(123, "Peter");
		Student t = new Student(124, "Jürgen");
		Student r = new Student(125, "Karl");
		Student u = new Student(126, "Uwe");
		Student[] array = new Student[]{u,r,t,s};
		System.out.println(Arrays.toString(array));
		Sortieren.BubbleSort(array);
		System.out.println(Arrays.toString(array));
		Assertions.assertArrayEquals(new Student[]{s,t,r,u}, array);
	}
	@Test
	void testStudentAufsteigendComparator(){
		Student s = new Student(123, "Peter");
		Student t = new Student(124, "Jürgen");
		Student r = new Student(125, "Karl");
		Student u = new Student(126, "Uwe");
		Student[] array = new Student[]{u,r,t,s};
		System.out.println(Arrays.toString(array));
		Sortieren.BubbleSort(array,Student.aufsteigenderComparator());
		System.out.println(Arrays.toString(array));
		Assertions.assertArrayEquals(new Student[]{t,r,s,u}, array);
	}
	@Test
	void testStudentAufsteigendUndDannMatrikelComparator(){
		Student s = new Student(123, "Peter");
		Student t = new Student(124, "Peter");
		Student r = new Student(125, "Karl");
		Student u = new Student(126, "Uwe");
		Student[] array = new Student[]{u,r,t,s};
		System.out.println(Arrays.toString(array));
		Sortieren.BubbleSort(array,Student.aufsteigenderUndDannMatrikelComparator());
		System.out.println(Arrays.toString(array));
		Assertions.assertArrayEquals(new Student[]{r,s,t,u}, array);
	}
}