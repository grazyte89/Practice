package stuffwithGeneric;

public class PlaywithGeneric <T> {
	
	private T firstName;
	private T lastName;

	public T getFirstName() {
		return firstName;
	}

	public void setFirstName(T firstName) {
		this.firstName = firstName;
	}

	public T getLastName() {
		return lastName;
	}

	public void setLastName(T lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return (" " + firstName + " " + lastName + " ");
	}
	
	public boolean equals(PlaywithGeneric<T> obj) {
		return (firstName.equals(obj.firstName) && lastName.equals(obj.lastName));
	}
}
