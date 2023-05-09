package Herencias;

public interface Comparable {

	public static int ComparableTo(Object uno, Object dos) {
		if((int)uno<(int)dos)
			return -1;
		else if (uno.equals(dos))
			return 0;
		else if((int)uno>(int)dos)
			return 1;
		return 0;
	}
}
