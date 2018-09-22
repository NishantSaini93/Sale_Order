# Sale_Order
This application gives  easy access to sales data.

It displays data in various forms:

-Display Customer Table

-Display Product Table

-Display Sales Table

-Total Sales for Customer

-Total Count for Product


Input:

Text files:

1:cust.txt: This is the data for the customer table.

Format:custID|name|address|phoneNumber

1|John Smith|123 Here Street|456-4567

2|Sue Jones|43 Rose Court Street|345-7867

3|Fan Yuhong|165 Happy Lane|345-4533

2:prod.txt: This is the data for the product table.

Format:prodID|itemDescription|unitCost

1|shoes|14.96

2|milk|1.98

3|jam|2.99

4|gum|1.25

5|eggs|2.98

6|jacket|42.99

3:sales.txt: This is the data for the main sales table.

Format:salesID|custIDprodID|itemCount

1|1|1|3

2|2|2|3

3|2|1|1

4|3|3|4

How to run:

-Save everything in one folder

-Open cmd and locate folder

-Run command:java -cp clojure-1.8.0.jar clojure.main sales.clj
