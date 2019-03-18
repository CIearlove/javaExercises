/**
 * 并查集数据结构非常简单，基本操作也很简单。但是用途感觉很大。比如，求解无向图中连通分量的个数，生成迷宫……
 * 这些应用本质上就是：初始时都是一个个不连通的对象，经过一步步处理，变成连通的了。。。。。
 * 如迷宫，初始时，起点和终点不连通，随机地打开起点到终点路径上的一个方向，直至起点和终点连通了，就生成了一个迷宫。
 * 如,无向图的连通分量个数.初始时，将无向图中各个顶点视为不连通的子集合，对图中每一条边，相当于union这条边对应的两个顶点分别所在的集合，直至所有的边都处理完后，还剩下的集合的个数即为连通分量的个数。
 * 
 */
package Chapter27;

public class DisjSets {
	private int[] s;
    private int count;//记录并查集中子集合的个数(子树的个数)

       public DisjSets(int numElements) {
	       //构造函数，负责初始化并查集
		   s = new int[numElements];
	       count = numElements;
	       //初始化并查集,相当于新建了s.length 个互不相交的集合
	       for(int i = 0; i < s.length; i++)
	           s[i] = -1;//s[i]存储的是高度(秩)信息
       }

       /**
        * 
        * @param root1 并查集中以root1为代表的某个子集
        * @param root2 并查集中以root2为代表的某个子集
        * 按高度(秩)合并以root1 和 root2为代表的两个集合
        */
       public void unionByHeight(int root1, int root2){
           if(find(root1) == find(root2))
               return;//root1 与 root2已经连通了
           
           if(s[root2] < s[root1])//root2 is deeper
               s[root1] = root2;
           else{
               if(s[root1] == s[root2])//root1 and root2 is the same deeper
                   s[root1]--;//将root1的高度加1
               s[root2] = root1;//将root2的根(指向)更新为root1
           }
           
           count--;//每union一次,子树数目减1
       }
       
       /**
        * 使用了路径压缩的Find的操作
        * 上面程序代码find方法只是简单地把待查找的元素所在的根返回。
        * 路径压缩是指，在find操作进行时，使find查找路径中的顶点(的父亲)都直接指向为树根（这很明显地改变了子树的高度）
        * @param x 顶点编号
        * @return
        */
       public int find(int x){
           if(s[x] < 0)//s[x]为负数时,说明 x 为该子集合的代表(也即树根), 且s[x]的值表示树的高度
               return x;
           else 
               return s[x] = find(s[x]);//使用了路径压缩,让查找路径上的所有顶点都指向了树根(代表节点)
               //return find(s[x]); 没有使用 路径压缩
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
