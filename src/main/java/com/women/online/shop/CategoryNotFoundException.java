package taskLesson;

public class CategoryNotFoundException extends RuntimeException {
	public CategoryNotFoundException(String textException) {
		super(textException);
	}
}
