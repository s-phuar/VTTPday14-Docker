public class inclass {

    // NUS\coding\day14workshopssf\day14>javac -d classes --source-path src src/*.java
    // NUS\coding\day14workshopssf\day14>java -cp classes inclass

    public static void main(String[] args){
        int x = 3;
        int[] nums = {0, 1, 2, 3};

        System.out.printf("before: %d\n", x);
        addOne(x);
        System.out.printf("after: %d\n", x);

        System.out.println("\n\n");

        //java creates a memory location withing the method call addOne(val), location named 'val' is updated instead of x
            //val takes on value of x
            //val gets updated
            //val is discarded at end of method call
        //for objects and arrays:
            //passed by value(copy)>>> a reference to the object or array 
            //updates the elements in the object/array
        //for primatives and String:
            //passed by value(copy)>>> the variable itself
            //does not update the variable
        //be wary of method side effects


        System.out.println("BEFORE");
        dumpArray(nums);
        addOne(nums);
        System.out.println("AFTER");
        dumpArray(nums);


        String name = "fred";
        System.out.printf("BEFORE: %s\n", name);
        toUpperCase(name);
        System.out.printf("AFTER: %s\n", name);


    }

    //treated as primative
    public static void toUpperCase(String x){
        System.out.printf(">>>in toUpperCase BEFORE: %s\n", x);
        x = x.toUpperCase();
        System.out.printf(">>>in toUpperCase AFTER: %s\n", x);
    }


    public static void dumpArray(int [] vals){
        for(int i = 0; i < vals.length; i++){
            System.out.printf("%d\n", vals[i]);
        }
        System.out.println();
    }


    //has side effects  
    public static void addOne(int[] vals){
        for(int i = 0; i < vals.length; i++){
            vals[i] += 1;
        }
    }


    //no side effects
    public static void addOne(int val){
        System.out.printf("in addOne: before: %d\n", val);
        val += 1;
        System.out.printf("in addOne: after: %d\n", val);

    }


}
