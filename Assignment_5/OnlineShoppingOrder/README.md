# Java Assignment 5 — Problem 1: Online Shopping Order Management

**Concept:** Simple (single) inheritance — `DeliveryOrder extends Order`.  
**Language:** Java  
**Input:** `Scanner`, values entered by the user.

## Objective

Create a parent `Order` class and a child `DeliveryOrder` class. Reuse the parent constructor and `displayOrder()` method, then calculate and display the total payable amount (`orderAmount + deliveryCharges`).

## Actual project structure (files provided)

```text
Assignment_5/
└── OnlineShoppingOrder/
    ├── Order.java
    ├── DeliveryOrder.java
    ├── OrderMain.java
    ├── README.md
    └── diagrams/
        ├── class-diagram.png
        ├── execution-flow.png
        └── object-memory.png
```

## Class responsibilities

| File | Responsibility |
|---|---|
| `Order.java` | Parent: order ID, order date, order amount; constructor and `displayOrder()` |
| `DeliveryOrder.java` | Child: delivery address, charges, days; `calculateTotal()` and `displayDeliveryOrder()` |
| `OrderMain.java` | Reads user input, creates one `DeliveryOrder`, displays details |

## Class diagram

![Class diagram showing Order and DeliveryOrder inheritance](diagrams/class-diagram.png)

## Execution flow

![Step-by-step program execution, constructor and method calls](diagrams/execution-flow.png)

## Object/memory diagram

![One DeliveryOrder object contains inherited Order fields and its own fields](diagrams/object-memory.png)

## Understanding the important lines

- `extends Order`: `DeliveryOrder` inherits accessible instance fields and methods from `Order`.
- `super(orderId, orderDate, orderAmount)`: invokes the parent class constructor, initializing the parent portion of the new `DeliveryOrder` object.
- `this.deliveryCharges = deliveryCharges`: assigns the constructor parameter to the child's instance variable.
- `displayOrder()`: child method reuses the inherited parent display method rather than duplicating its statements.
- `return orderAmount + deliveryCharges`: calculates total payable using an inherited field and a child field.
- `DeliveryOrder d = new DeliveryOrder(...)`: creates **one child object**. `super()` does not create a separate parent object.

## Sample input and expected result

```text
Enter Order ID: 101
Enter Order Date: 2026-10-26
Enter Order Amount: 1500
Enter Delivery Address: Electronic City, Bengaluru
Enter Delivery Charges: 100
Enter Expected Delivery Days: 3

--- Order and Delivery Details ---
Order ID: 101
Order Date: 2026-10-26
Order Amount: 1500.0
Delivery Address: Electronic City, Bengaluru
Delivery Charges: 100.0
Expected Delivery Days: 3
Total Payable Amount: 1600.0
```

**Dry run:** `1500 + 100 = 1600`.

## Compile and run

Open a terminal in the `Assignment_5` folder (the directory containing `OnlineShoppingOrder`).

```bash
javac OnlineShoppingOrder/*.java
java OnlineShoppingOrder.OrderMain
```

The package declaration in all three Java source files is `package OnlineShoppingOrder;`, matching the folder name.

## Faculty viva — short answers

1. **What is single inheritance?** One child class extends one parent class.
2. **What does `extends Order` mean?** DeliveryOrder inherits accessible members of Order.
3. **Why use `super(...)`?** It calls the Order constructor to initialize order fields.
4. **Where is code reusability shown?** `displayDeliveryOrder()` calls inherited `displayOrder()` and uses `orderAmount`.
5. **Does `super(...)` create another Order object?** No; it initializes the parent part of the same DeliveryOrder object.
6. **How is the total calculated?** `orderAmount + deliveryCharges`.

## Python connection

Java's `extends Order` is similar to Python's `class DeliveryOrder(Order):` and Java's `super(...)` corresponds to `super().__init__(...)` in Python.
