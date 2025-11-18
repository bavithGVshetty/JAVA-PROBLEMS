package DAY4.Exception_handling;
// Unchecked Exception

// 1.Arithmatic exception
// 2.ArrayIndexOutOfBounds Exception
// 3.NullPointerException

public class Unchecked {
    public static void main(String[] args) {
        int arr[]={1,2,3};
try{
        System.out.println(arr[2]);
    }
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid Array Index");
}
finally{
    System.out.println("Finally Block Exe");
}

}
}
