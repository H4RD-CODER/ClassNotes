## Programs in [Java Development Kit](https://en.wikipedia.org/wiki/Java_Development_Kit)
### [javac](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html) 
The java compiler, converts source code into [java bytecode](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html)  

### [javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html) 
the documentation generator, which automatically generates documentation from comments.

### [appletviewer](https://docs.oracle.com/javase/9/tools/appletviewer.htm#JSWOR612) 
the Java Interpreter to execute Java applets

### [jdb](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jdb.html) 
The Java Debugger

### [javap](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javap.html)
The Java Dissembler

### [javah](https://docs.oracle.com/javase/9/tools/javah.htm)
Use to create an interface between Java and C routines


## Standard Packages in Java
##### `java.lang`
Provides classes like Object, Thread, Exception, System, Choice, Menu, etc.
#### `java.io` 
Provides classes related to file input/output
#### `java.awt` 
Provides Abstract Windowing Toolkit for creating GUI elements like Button, checkbox, etc
#### `java.applet`
For applet Programming
#### `java.net`
Provides classes for Network programming
#### `java.util`
Provides classes related to Data Structures like Vector, Stack, List, Date, Dictionary, Hash, etc
#### `java.swing`
For designing graphical user interface
#### `java.sql`
for Database connectivity (JDBC)


## Built-in Data types
1. **Boolean**: 1 bit
2. **byte**: 8 bits
3. **char**: 16 bits
4. **short**: 16 bits
5. **int**: 32 bits
6. **long**: 64 bits
7. **float**: 32 bits
8. **double**: 64 bits


## Variables
**Declaration**: 
```
//<type> <variableName>;
int x;
```

**Initialization**: 
```
//<variableName> = new <type>(<value>);
x = new int(10):
```

**Declaration and Allocation**: 
```
int x = new int(10);
```

## Arrays
#### Declaration:
```
//<type> <arrayName>[];
int x[];
int x[][];
```

#### Memory Allocation: 
```
//<arrayName> = new <type>[<size>];
x = new int[100]:
x = new int[10][10]:
```

#### Declaration and Allocation: 
```
int x[] = new int[100];
int x[][] = new int[10][10];
```

#### Initialization: 
```
int x[] = {12, 3, 9, 15};
```

#### Multidimensional: 
```
int x[][] = {{1, 2, 3}, {4, 5, 6}};
int x[3][3] = {1, 2, 3, 4, 5, 6};
```
