# OOP2026
### Homework1
```Java
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 이미지에 지정된 4개의 변수 입력받기
        int arrayCount = sc.nextInt();  // 100
        int maxValue = sc.nextInt();    // 100
        int binSize = sc.nextInt();     // 10
        int displayScale = sc.nextInt(); // 1

        // 2. 난수 생성 및 구간별 빈도수 계산 (동시에 처리)
        int[] counts = new int[maxValue / binSize];
        for (int i = 0; i < arrayCount; i++) {
            int num = (int) (Math.random() * (maxValue + 1));
            int idx = num / binSize;
            counts[idx >= counts.length ? counts.length - 1 : idx]++;
        }

        // 3. 결과 출력
        System.out.printf("\nint data[%d] 0~%d\n", arrayCount, maxValue);
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d~%d\t", i * binSize, (i + 1) * binSize - 1);
            
            // 빈도수만큼 # 출력
            for (int j = 0; j < counts[i] / displayScale; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

```
![Alt homework5](./images/2026-09-08-151956.png)

### Homework5
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
![Alt homework5](./images/2026-09-08-151956.png)
