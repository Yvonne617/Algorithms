public class QuickFindUF()
{
    private int[] id;

    public QuickFindUF(int N)
    {
        id = new int[N];
       for (int I = 0; i < N; i++)
            id[ i ] = I;
    }

     public boolean connected( int p, int q)
     { 
         return (id[p] == id[q]);         // do not need to declare a boolean variable
     }

    public void union( int  p, int q)
    {
          int pid = id[ p ];
          int qid = id[ q ];
          for(int I = 0; i < id.length; i++ )
          {
             if(id[ i ] == pid )
                 id[ i ] = qid;
          }
    }
}