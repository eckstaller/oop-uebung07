package ueb07;

import java.util.Comparator;
import java.util.NoSuchElementException;

class Student implements Comparable{
	private int matrikel;
	private String name;

	Student(int m, String n) {
		setMatrikel(m);
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null)
			throw new IllegalArgumentException();
		name = n;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int m) {
		if (m <= 0)
			throw new IllegalArgumentException();
		matrikel = m;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Student))
			return false;

		Student s = (Student) o;

		return this.matrikel == s.matrikel && this.name.equals(s.name);
	}

	@Override
	public String toString() {
		return name + " (" + matrikel + ") [" + this.hashCode() + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o == null)
			throw new NullPointerException();
		if (!(o instanceof Student))
			throw new NoSuchElementException("Kein Student");

		Student s = (Student) o;
		return new Integer(this.matrikel).compareTo(new Integer(s.matrikel));
	}

	static Comparator aufsteigenderComparator(){
		return new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1==null || o2==null) throw new NullPointerException();
				if(!(o1 instanceof Student) || !(o2 instanceof Student))
					throw new NoSuchElementException("Kein Student!");
				return o1.toString().compareTo(o2.toString());
			}
		};
	}

	static Comparator aufsteigenderUndDannMatrikelComparator(){
		return new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1==null || o2==null) throw new NullPointerException();
				if(!(o1 instanceof Student) || !(o2 instanceof Student))
					throw new NoSuchElementException("Kein Student!");
				if(!o1.toString().equals(o2.toString()))
					return o1.toString().compareTo(o2.toString());
				else {
					Student s = (Student) o1;
					Student t = (Student) o2;
					return new Integer(s.matrikel).compareTo(new Integer(t.matrikel));
				}
			}
		};
	}
}
