package com.mera.inkrot.soapclient.command;

import com.mera.inkrot.soapclient.client.OrderClient;
import com.mera.inkrot.soapclient.wsdl.order.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.ArrayList;
import java.util.List;

@ShellComponent
public class ApplicationCommand {

    private OrderClient orderClient;

    public static String serverUrl = "http://localhost:9000/soap/order";

    @Autowired
    public ApplicationCommand(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    private String toString(OrderDto order) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nЗаказ №")
                .append(order.getId());
        sb.append("\n\t- Клиент: ")
                .append(order.getCustomer().getName())
                .append("(id: ")
                .append(order.getCustomer().getId())
                .append(")");
        sb.append("\n\t- Модель авто: ")
                .append(order.getModelName());
        sb.append("\n\t- Бренд авто: ")
                .append(order.getBrandName());
        sb.append("\n\t- Статус: ")
                .append(order.getStatus().getName());
        List<OptionDto> options = order.getOptions().getOption();
        sb.append("\n\t- Опции: ").append(options.size() > 0 ? toStringOptions(options) : "-");
        return sb.toString();
    }

    private String toStringOptions(List<OptionDto> options) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (OptionDto option : options)
            sb.append(" ").append(option.getId()).append(" - ").append(option.getName()).append(",");
        sb.deleteCharAt(sb.length() - 1).append(" ]");
        return sb.toString();
    }

    private String toStringOrders(List<OrderDto> orders) {
        StringBuilder sb = new StringBuilder();
        for (OrderDto order : orders)
            sb.append(toString(order)).append("\n");
        return sb.toString();
    }

    private OrderDto formatStringsToObject(String customerName, String modelName, String brandName, Long statusId, long[] optionsIds) {
        OrderDto order = new OrderDto();
        CustomerDto customer = new CustomerDto();
        customer.setName(customerName);
        order.setCustomer(customer);
        order.setModelName(modelName);
        order.setBrandName(brandName);
        StatusDto status = new StatusDto();
        status.setId(statusId);
        order.setStatus(status);
        OrderDto.Options options = new OrderDto.Options();
        List<OptionDto> optionsList = options.getOption();
        optionsList.addAll(formatOptionsIdsArrayToList(optionsIds));
        order.setOptions(options);
        return order;
    }

    private List<OptionDto> formatOptionsIdsArrayToList(long[] optionsIds) {
        List<OptionDto> options = new ArrayList<>();
        for (long id : optionsIds) {
            OptionDto option = new OptionDto();
            option.setId(id);
            options.add(option);
        }
        return options;
    }

    // Example: set-host http://localhost:9000
    @ShellMethod(key = "server", value = "Set server url. Default: http://localhost:9000")
    public String server(@ShellOption(defaultValue = "http://localhost:9000") String url) {
        ApplicationCommand.serverUrl = url;
        return "Server url [" + url + "] installed";
    }

    // Example: add-order --customer "Soap Customer" --model "camry" --brand "Toyota" --options 1,2
    @ShellMethod(key = "add-order", value = "Add order")
    public String addOrder(@ShellOption(value = "--customer") String customerName,
                           @ShellOption(value = "--model") String modelName,
                           @ShellOption(value = "--brand") String brandName,
                           @ShellOption(value = "--options", defaultValue = "") long[] optionsIds) {
        OrderDto responseOrder = orderClient.saveOrder(formatStringsToObject(customerName, modelName, brandName, null, optionsIds));
        return toString(responseOrder);
    }

    // Example: update-order --id 1 --customer "New"
    @ShellMethod(key = "update-order", value = "Update order by id")
    public String updateOrder(@ShellOption Long id,
                              @ShellOption(value = "--customer", defaultValue = "") String customerName,
                              @ShellOption(value = "--model", defaultValue = "") String modelName,
                              @ShellOption(value = "--brand", defaultValue = "") String brandName,
                              @ShellOption(value = "--status", defaultValue = "-1") Long statusId,
                              @ShellOption(value = "--options", defaultValue = "") long[] optionsIds) {
        if (customerName.isEmpty()) customerName = null;
        if (modelName.isEmpty()) modelName = null;
        if (brandName.isEmpty()) brandName = null;
        if (statusId == -1) statusId = null;
        OrderDto responseOrder = orderClient.updateOrder(id, formatStringsToObject(customerName, modelName, brandName, statusId, optionsIds));
        return toString(responseOrder);
    }

    // Example: delete-order 50
    @ShellMethod(key = "delete-order", value = "Delete order by id")
    public String deleteOrder(@ShellOption Long id) {
        return orderClient.deleteOrder(id);
    }

    // Example: get-all-orders
    @ShellMethod(key = "get-all-orders", value = "Get all orders")
    public String getAllOrders() {
        return toStringOrders(orderClient.getAllOrders());
    }

    // Example: get-all-orders-sc --sid 1 --cid 1 --cname "New"
    @ShellMethod(key = "get-all-orders-sc", value = "Get all orders by status and customer")
    public String getAllOrdersByStatusAndCustomer(@ShellOption(value = "--sid", defaultValue = "-1") Long statusId,
                                                  @ShellOption(value = "--scode", defaultValue = "") String statusCode,
                                                  @ShellOption(value = "--cid", defaultValue = "-1") Long customerId,
                                                  @ShellOption(value = "--cname", defaultValue = "") String customerName) {
        if (statusId == -1) statusId = null;
        if (statusCode.isEmpty()) statusCode = null;
        if (customerId == -1) customerId = null;
        if (customerName.isEmpty()) customerName = null;
        StatusDto status = new StatusDto();
        status.setId(statusId);
        status.setCode(statusCode);
        CustomerDto customer = new CustomerDto();
        customer.setId(customerId);
        customer.setName(customerName);
        return toStringOrders(orderClient.getAllOrdersByStatusAndCustomer(status, customer));
    }

    // Example: get-order 1
    @ShellMethod(key = "get-order", value = "Get order by id (test)")
    public String getOrder(@ShellOption Long id) {
        OrderDto order = orderClient.getOrder(id);
        return toString(order);
    }
}
