import java.util.*;
public class IndianCoin{
    public static void main(String[] args){
        Integer coin[] = {1,5,10,20,50,100,500};

        Arrays.sort(coin, Comparator.reverseOrder());

        int count = 0;
        int amount = 121;
        ArrayList<Integer> ans = new ArrayList<>();
        

        for(int i = 0 ; i < coin.length;i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                count++;
                amount -= coin[i];
                ans.add(coin[i]);
            }
            }
        }

        System.out.println(count);
        System.out.println(ans);
    }
}