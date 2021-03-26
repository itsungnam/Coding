package kr.green.exam0216;

/*
문제 5] 넥슨 입사문제 중에서
어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.

예를 들어
d(91) = 9 + 1 + 91 = 101
이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 
그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 
이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 
예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
*/
public class Ex05 {
	public static void main(String[] args) {
		example();
	}
	public static void example() {
		int limit=5000;
        boolean [] temp=new boolean[limit];
        for(int i=1;i<limit;i++) {
            if(self_number(i)<=limit) {
                temp[self_number(i)-1]=true;
            }
        }
        int result = 0; 
        for(int j=0;j<limit;j++) {
            if(!temp[j]) {
                System.out.println(j+1);
                result += j+1;
            }
        }
        System.out.println("답 : " + result);
	}
	
	public static int self_number(int n) {
        int sum=n;
        while(n>0) {
        	sum += n%10;
            n/=10;
        }          
        return sum;
    }      

}
