package kd.models;

/**
 * The User class is responsible for creating an User object.
 * 
 * Updated on 19/09/2022
 * 
 * @author Kimberly Dijkmans
 */
public class User implements Comparable<User> {

    private String firstName, surname;
    private Integer numOfBooks;

    /**
     * This constructor creates a new User without a name or number of books
     * borrowed
     */
    public User() {
        this.firstName = "";
        this.surname = "";
        this.numOfBooks = 0;
    }

    /**
     * This constructor creates a new User with a set first name, surname, and
     * number of books borrowed
     * 
     * @param firstName  The first name of the user
     * @param surname    The surname of the user
     * @param numOfBooks The number of books borrowed
     */
    public User(String firstName, String surname, Integer numOfBooks) {
        this.firstName = firstName;
        this.surname = surname;
        this.numOfBooks = numOfBooks;
    }

    /**
     * @return the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the user's surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return the number of books borrowed by the user
     */
    public int getNumOfBooks() {
        return numOfBooks;
    }

    /**
     * This method sets the number of books currently borrowed by the user
     * 
     * @param i The number of books currently borrowed by the user
     */
    public void setNumOfBooks(int i) {
        this.numOfBooks = i;
    }

    /**
     * This method compares the user's surname after which the user's first name to
     * sort in ascending order
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(User u) {
        int snCmp = surname.compareTo(u.surname);
        if (snCmp != 0)
            return snCmp;
        int fnCmp = firstName.compareTo(u.firstName);
        if (fnCmp != 0)
            return fnCmp;
        else
            return 0;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s%s%s %s%s%d",
                "User -> ",
                "name: ", firstName, surname,
                " | number of books: ", numOfBooks);
    }

}
