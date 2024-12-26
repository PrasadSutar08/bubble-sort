import java.util.Scanner;
public class Main {

    public static void arrayElements(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int size = scanner.nextInt();

        int array[] = new int[size];

        if(array.length ==0){
            System.out.println("Array is empty");
            return;
        }
        else{
        System.out.println("Enter " + size + " elements");

        for(int p = 0; p<size;p++){
            System.out.println("Element" + (p+1) + " :"); 
            array[p]=scanner.nextInt();
        } 
    }

       
        System.out.println("The array you have entered is: ");    

        for(int p=0;p<size;p++){
            System.out.println(array[p] +" ");
        }

        scanner.close();

        index(array);

    }

    public static void index(int array[]){

        System.out.println("The ascending sorted array is: ");

        
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int temp=0;

                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }

        System.out.println("The decending sorted array is:");{
            
            for(int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    int temp=0;
    
                    if(array[i]<array[j]){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
                System.out.println(array[i]);
            }

        }
    }

    public static void main(String[] args) {

        arrayElements();
    }
}


