package chapter20.Library2.service;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.repository.BookRepository;
import chapter20.Library2.repository.UserRepository;

public class LibraryService {
	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	
	public void addBook(Book book) {
		bookRepository.addBook(book);		
	}

	public void registerUser(User user) {
		userRepository.addUser(user);
	}

	public void borrowBook(String userId, String bookTitle) {
		User user = userRepository.findUserById(userId);
		Book book = bookRepository.findBookByTitle(bookTitle);
		
		if (user != null && book != null && !book.isBorrowed()) {
			// 책을 대여할 수 있는 상태
			book.setBorrowed(true);
			System.out.println(user.getName() + "님이" + book.getTitle() + "을(를) 대여하였습니다.");
		}
	}

	public void returnBook(String title) {
		// TODO Auto-generated method stub
		
	}

	public void listAllBooks() {
		// TODO Auto-generated method stub
		
	}

}
