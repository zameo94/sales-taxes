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

#### Linux Ubuntu

* Tested on Ubuntu 20.04
* Openjdk 11.0.9

For execute this software you must install the JDK

Open Terminal and type

```
sudo apt update
sudo apt install default-jdk
```

Type

```
sudo nano /etc/environment
```

and add this line at the bottom of file

```
JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin/java"
```

Now you can try

```
java -version
```

for see if install of openJDK was successful.

For example, my output is:

```
openjdk 11.0.9 2020-10-20
OpenJDK Runtime Environment (build 11.0.9+11-Ubuntu-0ubuntu1.20.04)
OpenJDK 64-Bit Server VM (build 11.0.9+11-Ubuntu-0ubuntu1.20.04, mixed mode, sharing)
```

Once installed JDK, in a new tab of the Terminal, positioned in the directory
project_root/src (sales-taxes/src) and type

```
javac -classpath . basket/Checkout.java
 ```

for compiling the java classes and finally

```
java basket.Checkout 
```

for execute the software

#### Windows 10

* Tested on Windows 10
* Openjdk  11.0.2 (build 11.0.2+9)

For execute this software you must install the JDK

Go to the link http://jdk.java.net/archive/ and download the zip 11.0.2 (build 11.0.2+9) for Windows

Make new directory like "C:\openJDK", copy the openJDK.zip just downloaded and extract

Go in Control PanelSystem -> Advanced System Settings

Click Advanced and then Environment Variables

Create new Environment Variables like that 

```
Name: JAVA_HOME 
Value: C:\openJDK\jdk-11.0.2\bin\
```

Update Path variable and add 
```
%JAVA_HOME%; 
```
at the bottom of line

Open another terminal and type java -version for see if the install of openJDK was successful.
                                             
For example, my output is:

```
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode) 
```

For another information with Windows installation please follow:

https://docs.plm.automation.siemens.com/content/polarion/20/help/en_US/polarion_windows_installation/before_installation/install_openjdk_11.html

Once installed JDK, in a new tab of the Terminal, positioned in the directory
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