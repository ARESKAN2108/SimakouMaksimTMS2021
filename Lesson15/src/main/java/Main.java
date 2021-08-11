
import com.tms.homework.exceptions.ProductAlreadyExistsException;
import com.tms.homework.model.Product;
import com.tms.homework.model.Shop;
import com.tms.homework.service.ShopService;
import com.tms.homework.service.ShopServiceImpl;
import com.tms.homework.service.UserService;
import com.tms.homework.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopService shopService = new ShopServiceImpl(shop);
        UserService userService = new UserServiceImpl(shopService);

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product(1, "Болгарка BOSCH", 250));
        listOfProducts.add(new Product(2, "Перфоратор MAKITA", 349));
        listOfProducts.add(new Product(3, "Дрель-шуруповерт WATT", 109));

        for (Product product : listOfProducts) {
            try {
                shopService.addProduct(product);
            } catch (ProductAlreadyExistsException e) {
                System.out.println(e.getMessage());
            }
        }

        while (shopService.startShop()) {
            userService.showMenu();
            do {
                if (shopService.startShop()) {
                    userService.showContinueMenu();
                }
            } while (shopService.startShop());
        }
        System.out.println("Будем рады видеть вас снова!");
    }
}
