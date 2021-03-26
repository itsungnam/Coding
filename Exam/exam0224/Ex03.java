package kr.green.exam0224;

/*
문제 3]Two Printers
출처 : http://www.codeabbey.com/index/task_view/two-printers
John과 Mary는 "J&M 출판사"를 설립하고 낡은 프린터 2대를 구입하였다.
그들이 첫번째로 성사시킨 거래는 N개의 페이지로 구성된 문서를 출력하는 일이었다.
그들이 구입한 두 대의 프린터는 각기 다른 속도록 문서를 출력하고 있다고 한다. 
하나는 한 페이지를 출력하는 데 X초가 걸리고 다른 하나는 Y초가 소요된다고 한다.
John과 Mary는 두 대의 프린터를 이용하여 전체 문서를 출력하는 데 드는 최소한의 시간이 알고 싶어졌다.

입력과 출력
입력데이터의 첫번 째 라인은 테스트케이스의 갯수를 뜻하고 그 갯수만큼의 라인이 추가로 입력된다. 
추가되는 각 라인은 세 개의 정수값 X Y N 으로 구성된다. 
X는 첫번째 프린터가 한 페이지를 출력하는 데 드는 소요시간, 
Y는 두번째 프린터가 한 페이지를 출력하는 데 드는 소요시간을 뜻하고 
N은 출력할 문서의 총 페이지 수를 의미한다. 
(단, 출력할 문서의 총 페이지 수는 1,000,000,000개를 초과하지 않는다.)
출력은 프린팅에 드는 최소한의 시간을 테스트케이스의 갯수만큼 공백으로 구분하여 출력하도록 한다.

입출력의 예는 다음과 같다:
input data:
2
1 1 5
3 5 4
answer:
3 9
*/
public class Ex03 {
	public static void main(String[] args) {
		example(new int[][] { { 1, 1, 5 }, { 3, 5, 4 }, { 3, 5, 5 }, { 2, 3, 2 } });
	}

	public static void example(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(calc(ar[i]) + " ");
		}
		System.out.println();
	}

	private static int calc(int ar[]) {
		/*
		 가장 효율적으로 출력하는 경우는
		 한 장에 X시간 걸리는 프린터는 전체의 출력 양 중 Y/(X+Y) * 100 %를, 
		 한 장에 Y시간 걸리는 프린터는 전체의 출력 양 중 X/(X+Y) * 100 %를 출력하는 경우입니다.
		 그런데 마지막 장은 두 프린터가 동시에 출력할 수 없으니 양쪽 프린터 중 어떤 프린터가 마지막 장을 
		 출력할 시 더 빠른지 두 가지 경우를 모두 계산합니다.
		 그리고 빠른 프린터가 마지막 장을 출력한 경우, 느린 프린터가 마지막 장을 출력한 경우 중 더 빨랐던 
		 값을 반환합니다. 
		 마지막 장을 출력하지 않은 프린터의 소요시간은 마지막 장을 출력한 프린터의 소요시간보다 
		 적기 때문에 계산에 고려하지 않습니다. 
		 */
		double d1 = (double) ar[1] / (ar[0] + ar[1]);
		double d2 = (double) ar[0] / (ar[0] + ar[1]);
		return (int) Math.min(Math.ceil(ar[2] * d1) * ar[0], Math.ceil(ar[2] * d2) * ar[1]);
	}
}
