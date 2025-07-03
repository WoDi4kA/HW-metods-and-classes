public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Author other) {
        if (this.getFirstName() == other.getFirstName() && this.getLastName() == other.getLastName()) {
            return true;
        } else
            return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}
