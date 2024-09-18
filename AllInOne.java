class AllInOne {


    //Hello world Program
    public static void printHello(){
        System.out.println("Hello World!");
    }
    //sum of two numbers
    public static void sumOfTwoNumber(int num1, int num2){
        System.out.println(num1 + " + " + num2 +  "="+(num1 + num2)); 
    }
    //Odd or Even Calculations
    public static void isOddEven(int num){
        System.out.println(num%2==0?"Even":"Odd");
    }
    //fionacciSeries for particular number
    public static void fionacciSeries(int num){
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1 +"\n"+ f2);
        int i = 2;
        while(num>i){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
            i++;
        }
    }
    public static void isPolindrome(String str){
       String str1 =  str.toLowerCase();
        boolean bool = true;
        for(int i = str1.length()-1 , j = 0; i>=str1.length()/2;i--, j++){
            if(str1.charAt(i)==str1.charAt(j)){
                    continue;
            }
            else{
                bool = false;
                break;
            }
        }
        if(bool){
            System.out.println(str + " is Polindrome");
        }
        else{
            System.out.println(str + " is not Polindrome");
        }
    }
    //Find the Largest Number
    public static void largestNum(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    //Basic Calculator
    public static void basicCalculator(int num1 , int num2 , char c){
        switch (c) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(Math.abs(num1-num2));
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("enter wrong expression");
                break;
        }
    }
    //Reverse a String
    public static void reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    //vowels Counts
    public static void vowelsCount(String str){
        int count = 0;
        for( char x:str.toLowerCase().toCharArray()){
            if(x =='a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                count++;
            }
        } 
        System.out.println(count);
    }

    //Find the minimum Number
    public static void minimumNum(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    //Sum of Array Elements

    public static void sumOfNum(int[] vargs){
        int x = 0;
        for(int i:vargs){
            x += i;
        }
        System.out.println("sum of given numbers is "+x); 
    }
    //sorting array elements
    public static void sortingArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //check prime number
    public static void isPrime(int num){
        boolean bool = true;
        for(int i = 2 ; i <=num/2 ; i++){
            if(num%i==0){
                bool = false;
            }
        }
        if(bool){
            System.out.println("Its PRIME!");

        }
        else{
            System.out.println("Its Not PRIME!");
        }
    }
    // Multiplication Table
    public static void mulTable(int num){
        for(int i = 1; i <=10 ; i++){
            System.out.println( i +" * " + num + " = " + (i*num));
        }
    }
    // Sum of digits itself
    public static void sumItSelf(int num){
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num/=10;
        }
        System.out.println(sum);
    }

    //Generate random number is java
    public static void generateRandomNum(){
        System.out.println((int)Math.floor(Math.random()*10));
    }
    //Binary to decimal conversion
    public static void BinaryToDecimal(long num){
        String str = Long.toString(num);
        // System.out.print(str);
        int num1 = 0;
        for(int i = str.length()-1,j=0;i>=0 ;i--,j++){
            int n = Character.valueOf(str.charAt(i))-48;
            int m = (int)Math.pow(2,j);
            num1 += (n * m);
        }
        System.out.println(num1);

    }
    //Decimal to Binary conversion
    public static void DecimalToBinary(int num)
    {
        StringBuilder sb = new StringBuilder();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        int ans = 0;
        while(num>0){
            int rem = num%2;
            // System.out.println(rem);
            sb.append(rem);
            // list.add(rem);
            num/=2;
        }
        sb.toString();
        for(int x = sb.length()-1; x >= 0; x--){
            System.out.print(sb.charAt(x));
        }

    }
    //GCD of two numbers
    public static void gcdToNumber(int num1, int num2){
        int min = num1<num2?num1:num2;
        int gcd = 1;
        if(num1%min==0 && num2%min==0){
            gcd = min;
        }
        else{
            for(int i = 1 ;i<=min/2; i++){
                if(num1%i==0 && num2%i==0){
                    gcd = i;
                }
            }
        }
    System.out.println("GCD of two : " + gcd);
    }
    // LCM of two numbers
    public static void lcmToNumber(int num1, int num2){
        int max = num1>num2?num1:num2;
        int lcm =1;
        if(max%num1==0 && max%num2==0){
            lcm = max;
        }
        else{
            while(true){
                if(max%num1==0 && max%num2==0){
                    lcm = max;
                    break;
                }
                max++;
            }
        }
        System.out.println("LCM of two : " + lcm);
    
    
    }
public static void main(String args[]){
        //No Need To create Opjects just call those methods as their name is enough
        printHello();
    }
    
}