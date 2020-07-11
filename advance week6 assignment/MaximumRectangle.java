class Solution {
    public int largestRectangleArea(int[] ar) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        int area=0;
        int i=0;
        int size=ar.length;
        while(i<size){
            if(stack.isEmpty() || ar[i]>=ar[stack.peek()]){
                stack.push(i);
                i++;
            }
            else{
                int top=stack.pop();
                if(stack.isEmpty())
                    area=ar[top]*i;
                else
                    area=ar[top]*(i-stack.peek()-1);
                if(area>max)
                    max=area;
            }
        }
        while(!stack.isEmpty()){
            int top=stack.pop();
                if(stack.isEmpty())
                    area=ar[top]*i;
                else
                    area=ar[top]*(i-stack.peek()-1);
                if(area>max)
                    max=area;
        }
        return max;
    }
}