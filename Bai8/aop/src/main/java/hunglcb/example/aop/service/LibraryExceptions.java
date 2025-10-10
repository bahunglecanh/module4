package hunglcb.example.aop.service;

public class LibraryExceptions {
	public static class OutOfStockException extends RuntimeException {
		public OutOfStockException(String message) { super(message); }
	}

	public static class InvalidTicketException extends RuntimeException {
		public InvalidTicketException(String message) { super(message); }
	}
}


