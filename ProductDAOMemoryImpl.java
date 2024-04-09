import java.util.ArrayList;
import java.util.List;

public class ProductDAOMemoryImpl implements ProductDAO {
    private List<Product> products = new ArrayList<>();

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public Product getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
    }
}
