package kd.models;

/**
 * The Book class is responsible for creating an Book object.
 * 
 * Updated on 19/09/2022
 * 
 * @author Kimberly Dijkmans
 */
public class Book implements Comparable<Book> {

    private String title, authorFirstName, authorSurname;
    private boolean onLoan;
    private User borrower;

    /**
     * This constructor creates a new Book without a title, author, loan status or
     * borrower
     */
    public Book() {
        this.title = "";
        this.authorFirstName = "";
        this.authorSurname = "";
        this.onLoan = false;
        this.borrower = null;
    }

    /**
     * This constructor creates a new Book with a set title, author, loan status and
     * borrower
     */
    public Book(String title, String authorFirstName, String authorSurname, boolean onLoan, User borrower) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
        this.onLoan = onLoan;
        this.borrower = borrower;
    }

    /**
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return first name of the author of the book
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * @return surname of the author of the book
     */
    public String getAuthorSurname() {
        return authorSurname;
    }

    /**
     * @return <code>true</code> if book is on loan
     *         <code>false</code> if book is not on loan
     */
    public boolean isOnLoan() {
        return onLoan;
    }

    /**
     * @return current borrower of the book
     */
    public User getBorrower() {
        return borrower;
    }

    /**
     * This method sets the loan status of the book
     * 
     * @param b <code>true</code> if book is on loan
     *          <code>false</code> if book is not on loan
     */
    public void setOnLoan(boolean b) {
        this.onLoan = b;
    }

    /**
     * This method sets the current borrower of the book
     * 
     * @param u The user who is currently borrowing the book
     */
    public void setBorrower(User u) {
        this.borrower = u;
    }

    /**
     * This method compares the author's surname to sort in ascending order
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Book b) {
        int snCmp = authorSurname.compareTo(b.authorSurname);
        if (snCmp != 0)
            return snCmp;
        else
            return 0;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s%s%s%s%s %s%s%s%s",
                "Book -> ",
                "title: ", title,
                " | author: ", authorFirstName, authorSurname,
                " | on loan: ", (onLoan ? "yes" : "no"),
                (borrower != null ? " | borrower: " + borrower.getFirstName() + " " + borrower.getSurname() : ""));
    }

}
