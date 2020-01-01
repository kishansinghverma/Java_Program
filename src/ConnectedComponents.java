import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

class Graph {
    int V;
    LinkedList<Integer>[] adjListArray;

    Graph(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for(int i = 0; i < V ; i++){
            adjListArray[i] = new LinkedList<Integer>();
        }
    }
    void addEdge( int src, int dest) {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);
    }

    int m=0;
    void  DFSUtil(int v, boolean[] visited) {
        m++;
        visited[v] = true;
        for (int x : adjListArray[v]) {
            if(!visited[x]) DFSUtil(x,visited);
        }
    }
    int result=0;
    void connectedComponents() {
        boolean[] visited = new boolean[V];
        for(int v = 0; v < V; ++v) {
            if(!visited[v]) {
                DFSUtil(v,visited);
                result += m*(m-1)/2;
                m=0;
            }
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int r=sc.nextInt();

        int[][] vtx=new int[r][2];
        Set s=new HashSet<Integer>();
        for(int i=0; i<r; i++){
            int m, n;
            m=sc.nextInt();
            n=sc.nextInt();

            vtx[i][0]=m;
            vtx[i][1]=n;

            s.add(m); s.add(n);
        }

        Integer[] arr=(Integer[]) s.toArray(new Integer[r]);
        Arrays.sort(arr);

        int[] pos=new int[arr[arr.length-1]+1];
        for(int i=0; i<arr.length; i++){
            pos[arr[i]]=i;
        }


        Graph g = new Graph(c);
        for(int x[] : vtx){
            g.addEdge(pos[x[0]], pos[x[1]]);
        }
        g.connectedComponents();
        System.out.println(g.result-r);
    }
}
