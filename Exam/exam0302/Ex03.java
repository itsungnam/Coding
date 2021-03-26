package kr.green.exam0302;

/*
문제 3] 주식투자
초기 투자액과 투자 기간, 그리고 투자 기간 중 날짜별 가치 변동율이 주어질 때 순이익과 이익 여부를 구합니다.

입력
첫째 줄에 투자액이 정수로 주어집니다. 
두번째 줄에 투자기간이 정수로 주어집니다. 
세번째 줄에 투자기간 중 일별 전일 대비 가치 변동이 각각 퍼센트 단위의 정수로 주어집니다.

투자액은 100 이상 10000 이하의 정수입니다.
투자 기간은 1 이상 10 이하의 정수입니다.
일별 변동폭은 -100 이상 100 이하의 정수로 주어집니다.

출력
첫째 줄에 순이익을 소수점 첫째자리에서 반올림한 값으로 나타냅니다. 
두번째 줄에 이익인지 손해인지 여부를 good, same, bad로 나타냅니다. 
이익이면 good, 손해이면 bad, 첫째줄에서 출력한 순이익이 0이면 same울 출력합니다.

입력 예시
10000
4
10 -10 5 -5

출력 예시
-125
bad
*/

public class Ex03 {
	public static void main(String[] args) {
		example(10000, 4, new int[] {10,-10,5,-5});
	}
	public static  void example(int money, int days, int[] percent) {
		double changed = money; // 순이익 = 원금
        for(int i=0; i<days; i++){ // 일별 수익률 합계
            changed = changed + (changed * percent[i] * 0.01);
        }
        double result = (int) Math.round((changed - money)); // 반올림

        System.out.println(result);
        System.out.println(result>0 ? "Good" : result<0 ? "Bad" : "Same");
	}
}
