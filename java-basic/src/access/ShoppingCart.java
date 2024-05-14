package access;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (items.size() >= 10) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item i : items) {
            System.out.println("상품명:" + i.getName() + ", 합계:" + i.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getTotalPrice();
        }
        return sum;
    }
}
