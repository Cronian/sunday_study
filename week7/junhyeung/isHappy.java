
    public boolean isHappy(int n) {
        int tmpSum = n;

        while(tmpSum / 10 != 0)
        {
            System.out.println(" " + tmpSum);

            n = tmpSum;
            tmpSum = 0;

            while(n != 0)
            {
                tmpSum += (n % 10) * (n % 10);
                n/=10;
            }
        }

        if(tmpSum==1||tmpSum==7) return true;

        return false;
    }  
