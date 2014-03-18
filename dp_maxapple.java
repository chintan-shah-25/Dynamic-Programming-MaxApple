 public int maxsum(int x[][],int n,int m)
    {
        int sum[][]=new int[n][m];
      for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
            if(i>0 && j>0)
            {
          sum[i][j]=x[i][j] + Math.max(sum[i-1][j],sum[i][j-1]);
          continue;
            }

            if(i>0 && j==0)
            {
            sum[i][j]=x[i][j]+sum[i-1][j];
            continue;
            }

            if(j>0 && i==0)
            {
            sum[i][j]=x[i][j]+sum[i][j-1];
            continue;
            }

            if(i==0 && j==0)
            {
            sum[i][j]=x[i][j];
            continue;
            }
        }
           return sum[n-1][m-1];

    }
    
    
