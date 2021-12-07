package Practice_Problems2;
class Author{
	String firstName,lastName;
	public Author(String first,String last)
	{
		this.firstName=first;
		this.lastName=last;
	}
	public void setFirstName(String first) {
		this.firstName=first;
	}
	public void setLastName(String last) {
		this.lastName=last;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void toStr() {
		System.out.println(this.firstName+this.lastName);
	}
}
class Book{
	String title;
	Author author;
	double price;
	public Book(String t,Author a,double p) {
		this.title=t;this.author=a;this.price=p;
	}
	public void setTitle(String t) {
		this.title=t;
	}
	public void setAuthor(Author a) {
		this.author=a;
	}
	public void setPrice(double p) {
		this.price=p;
	}
	public String getTitle() {
		return this.title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void toStri() {
		System.out.print("BOOK  :");System.out.print(this.title);System.out.println("\n");
		System.out.print("AUTHOR:");System.out.print(this.author);System.out.println("\n");
		System.out.print("PRICE :");System.out.print(this.price);System.out.println("\n");
	}
}
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ob1=new Author("Russel","Winderand");
		 Book ob2 = new Book("Developing Java Software" ,ob1, 79.95);	
		ob2.toStri();
	}

}
