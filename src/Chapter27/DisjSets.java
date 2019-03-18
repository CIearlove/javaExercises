/**
 * ���鼯���ݽṹ�ǳ��򵥣���������Ҳ�ܼ򵥡�������;�о��ܴ󡣱��磬�������ͼ����ͨ�����ĸ����������Թ�����
 * ��ЩӦ�ñ����Ͼ��ǣ���ʼʱ����һ��������ͨ�Ķ��󣬾���һ�������������ͨ���ˡ���������
 * ���Թ�����ʼʱ�������յ㲻��ͨ������ش���㵽�յ�·���ϵ�һ������ֱ�������յ���ͨ�ˣ���������һ���Թ���
 * ��,����ͼ����ͨ��������.��ʼʱ��������ͼ�и���������Ϊ����ͨ���Ӽ��ϣ���ͼ��ÿһ���ߣ��൱��union�����߶�Ӧ����������ֱ����ڵļ��ϣ�ֱ�����еı߶�������󣬻�ʣ�µļ��ϵĸ�����Ϊ��ͨ�����ĸ�����
 * 
 */
package Chapter27;

public class DisjSets {
	private int[] s;
    private int count;//��¼���鼯���Ӽ��ϵĸ���(�����ĸ���)

       public DisjSets(int numElements) {
	       //���캯���������ʼ�����鼯
		   s = new int[numElements];
	       count = numElements;
	       //��ʼ�����鼯,�൱���½���s.length �������ཻ�ļ���
	       for(int i = 0; i < s.length; i++)
	           s[i] = -1;//s[i]�洢���Ǹ߶�(��)��Ϣ
       }

       /**
        * 
        * @param root1 ���鼯����root1Ϊ�����ĳ���Ӽ�
        * @param root2 ���鼯����root2Ϊ�����ĳ���Ӽ�
        * ���߶�(��)�ϲ���root1 �� root2Ϊ�������������
        */
       public void unionByHeight(int root1, int root2){
           if(find(root1) == find(root2))
               return;//root1 �� root2�Ѿ���ͨ��
           
           if(s[root2] < s[root1])//root2 is deeper
               s[root1] = root2;
           else{
               if(s[root1] == s[root2])//root1 and root2 is the same deeper
                   s[root1]--;//��root1�ĸ߶ȼ�1
               s[root2] = root1;//��root2�ĸ�(ָ��)����Ϊroot1
           }
           
           count--;//ÿunionһ��,������Ŀ��1
       }
       
       /**
        * ʹ����·��ѹ����Find�Ĳ���
        * ����������find����ֻ�Ǽ򵥵ذѴ����ҵ�Ԫ�����ڵĸ����ء�
        * ·��ѹ����ָ����find��������ʱ��ʹfind����·���еĶ���(�ĸ���)��ֱ��ָ��Ϊ������������Եظı��������ĸ߶ȣ�
        * @param x ������
        * @return
        */
       public int find(int x){
           if(s[x] < 0)//s[x]Ϊ����ʱ,˵�� x Ϊ���Ӽ��ϵĴ���(Ҳ������), ��s[x]��ֵ��ʾ���ĸ߶�
               return x;
           else 
               return s[x] = find(s[x]);//ʹ����·��ѹ��,�ò���·���ϵ����ж��㶼ָ��������(����ڵ�)
               //return find(s[x]); û��ʹ�� ·��ѹ��
       }
       
       public int size(){
           return count;
       }
       
     //for test purpose
       public static void main(String[] args) {
           DisjSets dSet = new DisjSets(6);
           dSet.unionByHeight(1, 2);
           
           for(int i : dSet.s)
               System.out.print(i + " ");
           
           dSet.unionByHeight(3, 4);
           
           System.out.println();
           for(int i : dSet.s)
               System.out.print(i + " ");
           
           System.out.println();
           dSet.unionByHeight(1, 3);
           for(int i : dSet.s)
               System.out.print(i + " ");
           
           System.out.println();
           dSet.unionByHeight(1, 0);
           for(int i : dSet.s)
               System.out.print(i + " ");
           
           System.out.println();
           int x = dSet.find(4);
           System.out.println(x);
           
           for(int i : dSet.s)
               System.out.print(i + " ");
           
           System.out.println("\nsize:" + dSet.size());
       }
}
