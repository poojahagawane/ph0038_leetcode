class Solution {
    public int hammingDistance(int x, int y) {
        LinkedList<Integer> x1 = convertToBinary(x);
        LinkedList<Integer> y1 = convertToBinary(y);
 //       LinkedList<Integer> temp = new LinkedList<Integer>();
        if(x1.size() != y1.size()) {
            while(x1.size() != y1.size())   {
                if(x1.size() < y1.size())   {
                    x1.addFirst(0);
                } else  {
                    y1.addFirst(0);
                }
            }
        }
        Iterator i = x1.iterator();
        Iterator j = y1.iterator();
        int count = 0;
        while(i.hasNext() && j.hasNext()) {
            if(i.next() != j.next()) {
                count++;
            }
        }
        System.out.println(x1);
        return count;
    }
    
    public LinkedList<Integer> convertToBinary(int num)    {
        LinkedList<Integer> binary = new LinkedList<Integer>();
        int mod = 0;
        while(num != 0) {
            mod = num % 2;
            if (mod == 0)   {
                binary.addFirst(0);
            } else  {
                binary.addFirst(1);
            }
            num = num / 2;
        }
        return binary;
    }
}
