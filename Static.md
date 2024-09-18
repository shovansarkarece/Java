# Static Keyword

1. **To create static variables**:
   a. `static int a = 50;`
2. **To create static methods**:
   a. `public static void test() { }`
3. **To create static blocks**:
   a. `static { }`



# Static Execution Flow

1. **Class Loading**:
2. **Static Variable Initialization**:
     1. **Default values**
     2. **Explicit initialization**
     3. **Static Block Execution (this is where they fit in)**
3. **Static Method (MAIN) Execution**:

## Points
1. Static blocks are only executed once, when the class is first loaded.
2. They cannot access instance variables or instance methods, as those only exist within objects.
3. They can access other static variables and methods of the class.
## Graphical Overview of Static Execution Flow
![image](https://github.com/user-attachments/assets/474a0df4-ae26-471e-8b48-8f8cdd0c187d)


