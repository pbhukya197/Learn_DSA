package zorvyn;

import java.util.*;

public class FindDuplicates {

    public static ArrayList<String> findDuplicates(List<String> list){
        if(list == null || list.size() == 0){
            return null;
        }
        Set<String> seen = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();
        for(String listitem : list){
            if(seen.contains(listitem)){
                duplicates.add(listitem);
            }else{
                seen.add(listitem);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        ArrayList<String> result = findDuplicates(list);
        System.out.println(result);
    }
}
