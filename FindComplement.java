class Solution {
    public int findComplement(int num) {
        LinkedList<Integer> x1 = convertToBinary(num);
        LinkedList<Integer> binary = new LinkedList<Integer>();
        ListIterator<Integer> i = x1.listIterator();
        while(i.hasNext())  {
            if(i.next() == 0)   {
                binary.add(1);
            } else{
                binary.add(0);
            }
        }
       // System.out.println(binary);
        return convertToNumber(binary);
    }
    
    public int convertToNumber(LinkedList<Integer> binary)  {
        int num = 0;
        int index = binary.size()-1;
        ListIterator<Integer> i = binary.listIterator();
        while(i.hasNext())  {
            if(i.next() == 1)   {
                num += Math.pow(2, index);
            }
            index--;
        }
        return num;
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
