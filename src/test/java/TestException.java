import com.women.online.shop.entities.Category;
import com.women.online.shop.exceptions.CategoryNotFoundException;
import org.junit.Test;

public class TestException {
    @Test(expected = CategoryNotFoundException.class)
    public void ExceptionGetByNumber(){
        Category.getByNumber(8);
    }
    @Test(expected = CategoryNotFoundException.class)
    public void ExceptionGetByShortName() {
        Category.getByName("PHONE");
    }
}
