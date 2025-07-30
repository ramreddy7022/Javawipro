package encapsulation;

public class Main {

		    public static void main(String[] args) {
		        // Create Author object
		        Author author = new Author("John Doe", "john@example.com", 'M');

		        // Create Book object using the Author object
		        Book book = new Book("Java Programming", author, 499.99, 10);

		        // Print details using getters
		        System.out.println("Book Name: " + book.getName());
		        System.out.println("Price: " + book.getPrice());
		        System.out.println("Quantity in Stock: " + book.getQtyInStock());
		        
		        // Accessing Author details through Book
		        System.out.println("Author Name: " + book.getAuthor().getName());
		        System.out.println("Author Email: " + book.getAuthor().getEmail());
		        System.out.println("Author Gender: " + book.getAuthor().getGender());
		    }
// TODO Auto-generated method stub

	}

