package org.example.creation.singleton;
public class OrderManagementService {

    private static OrderManagementService orderManagementService;

    private OrderManagementService(){}

    public static OrderManagementService getInstance() {

        if(orderManagementService == null) {
            orderManagementService = new OrderManagementService();
        }
        return orderManagementService;
    }

    public void displayOrder() {
        System.out.println("Order Management Service");
    }

}
