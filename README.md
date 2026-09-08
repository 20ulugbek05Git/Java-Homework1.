# OOP2026
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
