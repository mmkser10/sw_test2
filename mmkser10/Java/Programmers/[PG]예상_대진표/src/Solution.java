class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        double tmp_a = a;
        double tmp_b = b;
        while(true){
            answer++;
            tmp_a = Math.ceil(tmp_a/2);
            tmp_b = Math.ceil(tmp_b/2);
            if(Math.abs(tmp_a - tmp_b) == 0){
                break;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}