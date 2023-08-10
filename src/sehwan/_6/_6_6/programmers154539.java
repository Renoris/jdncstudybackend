//package sehwan._06._6_6;
//
//import java.util.Stack;
//
//public class programmers154539 {
//    public static void main(String[] args) {
//        int[] numbers = {2, 3, 3, 5};
//        int[] result = Solution(numbers);
//
//        for(int i : result) System.out.println(i + " ");
//    }
//
//    private static int[] Solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
//
//        Stack<dataMap> stack = new Stack();
//
//        stack.add(new dataMap(0, numbers[0]));
//
//        for(int i = 1; i < numbers.length; i++) {
//
//            while(true) {
//                if(stack.peek().getValue() < numbers[i]) {
//                    dataMap temp = stack.pop();
//                    answer[temp.getPosition()] = numbers[i];
//                } else {
//                    stack.push(new dataMap(i, numbers[i]));
//                    break;
//                }
//
//                if(stack.isEmpty()) {
//                    stack.push(new dataMap(i, numbers[i]));
//                    break;
//                }
//            }
//        }
//
//        while(!stack.isEmpty()) {
//            dataMap temp = stack.pop();
//            answer[temp.getPosition()] = -1;
//        }
//
//        return answer;
//    }
//}
//
//class dataMap {
//    private int position;
//    private int value;
//
//    public dataMap(int position, int value) {
//        this.position = position;
//        this.value = value;
//    }
//
//    public int getPosition() {
//        return position;
//    }
//
//    public int getValue() {
//        return value;
//    }
//}
