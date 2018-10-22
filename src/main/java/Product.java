
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

    public class Product {

        private static int id;
        private String name;
        private BigDecimal price;
        private Country country;


        private List<Category> categories = new ArrayList<>( );


        public Product(String name, BigDecimal price, Country country, List<Category> categories) {
            setId(getId() + 1);
            this.setName(name);
            this.setPrice(price);
            this.setCountry(country);
            this.categories.addAll(categories);
        }

        public void removeCategories(Category category) {
            if (categories.size() > 1) {
                categories.remove(category);
            }
        }


        public static int getId() {
            return id;
        }

        public static void setId(int id) {
            Product.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }
    }


