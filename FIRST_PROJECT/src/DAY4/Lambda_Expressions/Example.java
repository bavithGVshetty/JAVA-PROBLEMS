package DAY4.Lambda_Expressions;
// 1.Lambda Expression
// Writing expression in easy or minimal way
// 2.Functional Interfaces
// Wich has only one abstract function
// Ex:
// .Runnable,Callable,Compator etc
// Method Interfaces
// Static method,Instance,Contructor


interface Add{
    int sum(int a,int b);
}
public class Example {
    public static void main(String[] args) {
        Add obj =(a,b)->a+b;
        System.out.println(obj.sum(3, 10));
    }
    
}
