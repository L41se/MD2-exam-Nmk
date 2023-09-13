package Services;


import Models.Products;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Products> PRODUCTS = new ArrayList<>();
    public static void menu(){
        System.out.println("----------------CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM-------------------");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem List");
        System.out.println("2. Add new");
        System.out.println("3. update");
        System.out.println("4. delete");
        System.out.println("5. arranging");
        System.out.println("6. Find max value product");
        System.out.println("7. Read from file");
        System.out.println("8. Write in file");
        System.out.println("9. Thoát");
    }
    public static void main(String[] args) {
        int function = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            menu();
            try{
                System.out.print("Chọn chức năng: ");
                function = scanner.nextInt();
                switch (function){
                    case 1:
                        ProductService.display();
                        break;
                    case 2:
                        ProductService.insert();
                        break;
                    case 3:
                        ProductService.update();
                        break;
                    case 4:
                        ProductService.remove();
                        break;

                }

            } catch (InputMismatchException err) {
                System.out.println("Nhập sai lựa chọn, vui lòng nhập lại");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        } while (function != 9);

    }
}