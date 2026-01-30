package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import enums.Status;

public class Order {
    private Long id;
    private Client client;
    private Set<Product> products = new HashSet<>();
    private LocalDate orderDate;
    private Status status;
    
    public Order() {
    }

    public Order(Long id, Client client, LocalDate orderDate, Status status) {
        this.id = id;
        this.client = client;
        this.orderDate = orderDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", client=" + client + ", orderDate=" + orderDate + ", status=" + status + "]";
    }

}
