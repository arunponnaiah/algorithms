package com.algorithms.mock;

public class Person {
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/*
	 * 	1) Create a int result and assign a non-zero value.

		2) For every field tested in the equals-Method, calculate a hash code c by:
		
		If the field f is a boolean: calculate (f ? 0 : 1);
		If the field f is a byte, char, short or int: calculate (int)f;
		If the field f is a long: calculate (int)(f ^ (f >>> 32));
		If the field f is a float: calculate Float.floatToIntBits(f);
		If the field f is a double: calculate Double.doubleToLongBits(f) and handle the return value like every long value;
		If the field f is an object: Use the result of the hashCode() method or 0 if f == null;
		If the field f is an array: See every field as separate element and calculate the hash value in a recursive fashion and combine the values as described next.
		
		3) Combine the hash value c with result with:
		
			result = 37 * result + c
		
		4) Return result
	 */
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}
}
