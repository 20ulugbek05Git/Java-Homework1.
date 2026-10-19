# OOP2026
### Homework1
```Java
public class Homework1{
  public static void main(String []args){
    int i, j;
    for(i=0; i<10; i++) {
      for(j=0; j<10; j++) {
        System.out.print("#");
      }
      System.out.println("");
    }
  }
}
```
![Alt homework5](./images/2026-09-21-143847.png)

### Homework2
```Java
public class Homework1{
  public static void main(String []args){
    int i, j;
    for(i=0; i<10; i++) {
      for(j=0; j<10; j++) {
        System.out.print("#");
      }
      System.out.println(""); ggg
    }
  }
}
```
![Alt homework5](./images/2026-09-21-143847.png)


### Homework３
```Java
public class HelloWorld {
    public static void main(String[] args) {
    	
    	long prev = 1;
        long curr = 1;
        
        for(int i = 2; i <= 20; i++) {
            long next = prev + curr;
            double ratio = (double) next / curr;
            System.out.printf("%d/%d=%.3f  ", next, curr, ratio);
            if((i - 1) % 4 == 0) {
                System.out.println();
            }
            prev = curr;
            curr = next;
        }
        System.out.println("\n");
    }
}
```

<img width="656" height="196" alt="image" src="https://github.com/user-attachments/assets/18a09a0a-6e93-406d-8921-429c9945e91b" />


### Homework4
```Java
public class HelloWorld {
    public static void main(String[] args) {
    	for(int j = 1; j <= 9; j++) {
            for(int i = 1; i <= 9; i++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}

```
<img width="640" height="246" alt="image" src="https://github.com/user-attachments/assets/80613800-b88c-4141-be89-750923e3d7a4" />




### Homework5
```Java
public class HelloWorld {
    public static void main(String[] args) {
      
        int i;
     double j=0;
        int h=0;
  
        double a=0;
      
        for(i=1; i<1000;i++) {
        
        	if(i%2==1){
                
                j=4.0/(h*2+1);
                h++;
               a+=j;
               
                    
            }
            
        	if(i%2==0){
                
              j=4.0/(h*2+1);
                h++;
              a-=j;
                
                    
            }
            
        }
        
            System.out.printf("%.4f",a);
            
             
        	
    }
}
```
<img width="552" height="257" alt="image" src="https://github.com/user-attachments/assets/1f46af6d-4efe-4731-ab77-add1f4343513" />

### Homework5-2
```Java
public class HelloWorld {
    public static void main(String[] args) {
      
        int i;
     double j=0;
        int h=0;
        double k=0;
        double a=0;
      
        for(i=0; i<1000;i++) {
        
        	if(i%2==0){
             k = Math.pow(3, i); 
                j=(1.0* Math.sqrt(12))/(k*(h*2+1));
                h++;
               a+=j;
               
                    
            }
            
        	if(i%2==1){
                 k = Math.pow(3, i); 
              j=(1.0* Math.sqrt(12))/(k*(h*2+1));
                h++;
              a-=j;
                
                    
            }
            
        }
        
            System.out.printf("%.4f",a);
            
             
        	
    }
}


```

<img width="225" height="174" alt="image" src="https://github.com/user-attachments/assets/557aca71-1492-4f3c-8a6d-9a118fc4c3ef" />

### Homework6
```Java
var n = 10;
var binomial = [];

for (var i = 0; i < n; i++) {
    binomial[i] = [];
    for (var j = 0; j <= i; j++) {
        if (j === 0 || j === i) {
            binomial[i][j] = 1;
        } else {
            binomial[i][j] = binomial[i - 1][j - 1] + binomial[i - 1][j];
        }
    }
}

var result = "";
for (var i = 0; i < n; i++) {
    for (var j = 0; j <= i; j++) {
        result += binomial[i][j] + " ";
    }
    result += "<br>";
}

```
<img width="308" height="221" alt="image" src="https://github.com/user-attachments/assets/a90f233d-8598-4de5-9cce-06e5bf5e2b64" />

### Homework７
```Java
public class Helloworld {
    public static void main(String[] args) {

        int[] data = new int[20];

       
        for (int i = 0; i < 20; i++) {
            data[i] = (int)(Math.random() * 100);
        }

      
        for (int a = 0; a < data.length - 1; a++) {

            
            int min = a;

          
            for (int b = a + 1; b < data.length; b++) {
                if (data[b] < data[min]) {
                    min = b;
                }
            }

          
            int temp = data[a];
            data[a] = data[min];
            data[min] = temp;
        }

    
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
```

<img width="194" height="516" alt="image" src="https://github.com/user-attachments/assets/ad94afe6-ed12-4f98-8b62-887ee32c7f4a" />

### Homework８
```Java
public class helloworld {
    public static void main(String[] args) {

        int score[][] = new int[30][5];

       
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 4; j++) {
                score[i][j] = (int)(Math.random() * 101);
            }
        }

     
        for (int i = 0; i < 30; i++) {
            score[i][4] = score[i][0]
                        + score[i][1]
                        + score[i][2]
                        + score[i][3];
        }

     
        System.out.println("번호\t국어\t영어\t수학\t과학\t총점");

        for (int i = 0; i < 30; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%d%n",
                    i + 1,
                    score[i][0],
                    score[i][1],
                    score[i][2],
                    score[i][3],
                    score[i][4]);
        }
    }
}
```
<img width="236" height="668" alt="image" src="https://github.com/user-attachments/assets/f83da7f4-ba07-41e4-9777-f9ef6a8a33c6" />

### Homework１０
```Java
public class Helloworld {
    public static void main(String[] args) {
        int arrayCount = 1000;
        int maxValue = 100;
        int binSize = 10;
        int displayScale = 5;
        if (args.length >= 4) {
            arrayCount = Integer.parseInt(args[0]);
            maxValue = Integer.parseInt(args[1]);
            binSize = Integer.parseInt(args[2]);
            displayScale = Integer.parseInt(args[3]);
        }

        int[] data = new int[arrayCount];

        for (int i = 0; i < arrayCount; i++) {
            data[i] = (int) (Math.random() * maxValue);
        }

        int binCount = (maxValue + binSize - 1) / binSize;
        int[] histogram = new int[binCount];

        for (int i = 0; i < arrayCount; i++) {
            int bin = data[i] / binSize;
            histogram[bin]++;
        }

        for (int i = 0; i < binCount; i++) {
            int start = i * binSize;
            int end = Math.min(start + binSize - 1, maxValue - 1);

            System.out.printf("%2d~%-2d\t", start, end);

            int count = histogram[i] / displayScale;

            for (int j = 0; j < count; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
```
<img width="346" height="336" alt="image" src="https://github.com/user-attachments/assets/6996a769-8bec-4007-95c5-9009b6e9f8e8" />

### Homework１１
```Java
public class Calculator {
public static void main(String[] args) {    
		int array_count;
		if(args.length !=1)
			return;
		array_count = Integer.parseInt(args[0]);
		int[] arr = new int[array_count];
		for (int i=0; i<array_count; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		for (int i=0; i<array_count; i++) {
			System.out.print(arr[i] + " ");  
		}
		System.out.println();
		double sum = 0;
		for (int i=0; i<array_count; i++) {
			sum+=arr[i];
		}
		System.out.printf("arithematic mean : = %f\n", sum/array_count);
		double prod = 1;
		for (int i=0; i<array_count; i++) {
			prod*=arr[i];
		}
		System.out.printf("geometric mean : = %f\n", Math.pow(prod, 1.0/array_count));
    double six =1;
    for (int i=0; i<array_count; i++){
        six+=1.0/arr[i];
        
    }  System.out.printf("hamonoic mean : = %f\n", array_count/six );
    int[] sortedArr = arr.clone();
        java.util.Arrays.sort(sortedArr);
        double median;
        if (array_count % 2 == 0) {
            median = (sortedArr[array_count / 2 - 1] + sortedArr[array_count / 2]) / 2.0;
        } else {
            median = sortedArr[array_count / 2];
        }
        System.out.printf("median           : = %f\n", median);
		
	}
}
```
<img width="835" height="206" alt="image" src="https://github.com/user-attachments/assets/420060e4-a998-44c6-8838-0824b8254f9a" />

### Homework１３
```Java
import java.util.Scanner;

public class miniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String inputString = scanner.nextLine();
            
            // Program exit condition
            if (inputString.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.println(inputString);
            String[] arr = inputString.split(" ");
            int result = 0;
            
            // Case 1: 2 operands and 1 operator (e.g., 2 + 3)
            if (arr.length == 3) {
                result = calculate(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
            } 
            // Case 2: 3 operands and 2 operators (e.g., 2 + 4 # 7)
            else if (arr.length == 5) {
                int num1 = Integer.parseInt(arr[0]);
                String op1 = arr[1];
                int num2 = Integer.parseInt(arr[2]);
                String op2 = arr[3];
                int num3 = Integer.parseInt(arr[4]);
                
                // Operator Precedence: if op2 is (# or /) and op1 is (+ or -), calculate op2 first!
                if ((op2.equals("#") || op2.equals("/")) && (op1.equals("+") || op1.equals("-"))) {
                    int temp = calculate(num2, op2, num3);
                    result = calculate(num1, op1, temp);
                } else {
                    // Otherwise, calculate from left to right
                    int temp = calculate(num1, op1, num2);
                    result = calculate(temp, op2, num3);
                }
            }
            
            System.out.println(result);
        }
        scanner.close();
    }

    // Helper method to perform arithmetic operations
    private static int calculate(int a, String op, int b) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("#")) return a * b; // '#' acts as multiplication
        if (op.equals("/")) return a / b; // '/' acts as division
        return 0;
    }
}
<img width="754" height="436" alt="image" src="https://github.com/user-attachments/assets/c7712908-d0e6-4b9e-8143-2ce3b1dc680b" />

```

### Homework１4
```Java
import java.util.Arrays;

class Numbers {
    int num[];
    Numbers(int num[]) { this.num = num; }

    double getArithmaticMean() { 
        return Arrays.stream(num).average().orElse(0); 
    }
    double getHarmonicMean() { 
        return num.length / Arrays.stream(num).mapToDouble(x -> 1.0 / x).sum(); 
    }
    double getGeometricMean() { 
        return Math.exp(Arrays.stream(num).mapToDouble(Math::log).sum() / num.length); 
    }
    int getMedian() { 
        Arrays.sort(num); 
        return num[num.length / 2]; 
    }

    void drawHistogram(int start, int end, int binCount, int scale) {
        int binSize = (end - start) / binCount;
        int[] bins = new int[binCount];
        for (int n : num) if (n >= start && n < end) bins[(n - start) / binSize]++;

        for (int i = 0; i < binCount; i++) {
            System.out.printf("%3d ~ %3d : ", start + i * binSize, start + (i + 1) * binSize);
            for (int j = 0; j < bins[i] / scale; j++) System.out.print("*");
            System.out.println(" (" + bins[i] + ")");
        }
    }
}

public class NumbersTest {
    public static void main(String[] args) {
        int data[] = new int[100];
        for (int i = 0; i < 100; i++) data[i] = (int) (Math.random() * 100) + 1;

        Numbers obj = new Numbers(data);
        System.out.printf("Arithmetic Mean : %5.2f\n", obj.getArithmaticMean());
        System.out.printf("Geometric Mean  : %5.2f\n", obj.getGeometricMean());
        System.out.printf("Harmonic Mean   : %5.2f\n", obj.getHarmonicMean());
        System.out.printf("Median Value    : %d\n", obj.getMedian());
        obj.drawHistogram(0, 100, 10, 1);
    }
}
<img width="789" height="362" alt="image" src="https://github.com/user-attachments/assets/5776c223-e6f2-4073-b4d9-ae5a97ddff25" />


```
