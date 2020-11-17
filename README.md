# SALES TAXES

This software simulate 3 online shopping cart in checkout fase with own products preselected.

The goal is to calculate the tax and, in addition to printing the contents of the cart, it prints the output 
with the price of each product correct (correct quantity and tax added to the price),
the total sales tax and cost.

### Example

```
1th Checkout:

INPUT:

2 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

OUTPUT:

2 book: 24.98
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.5
Total: 42.32
```

## Installation and Configuration

* Tested on Ubuntu 20.04
* Openjdk 11.0.9

For execute this software you must install the JDK

#### Linux Ubuntu



```
sudo apt update
sudo apt install default-jdk
```

Now you can try

```
java -version
```

for see if the install of JDK was successful.

For example, my output is:

```
openjdk 11.0.9 2020-10-20
OpenJDK Runtime Environment (build 11.0.9+11-Ubuntu-0ubuntu1.20.04)
OpenJDK 64-Bit Server VM (build 11.0.9+11-Ubuntu-0ubuntu1.20.04, mixed mode, sharing)
```




Once installed JDK, always in the Terminal, positioned in the directory
 project_root/src (sales-taxes/src) and type

```
javac -classpath . basket/Checkout.java
 ```

for compiling the java classes and finally

```
java basket.Checkout 
```

for execute the software

Enjoy :-)