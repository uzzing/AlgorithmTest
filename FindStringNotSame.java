package Level1;

import java.util.Arrays;

// 2021.08.24
class FindStringNotSame {

    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i; 
        for (i = 0; i< completion.length; i++) { 
            if (!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[i];
    }
}

/**
        ArrayList<String> list = new ArrayList<>(Arrays.asList(completion));
        Predicate<String> predicate = n -> {
            for (String people : list) {
                if (n.equals(people)) {
                    list.remove(people);
                    return false;
                }
            }
            return true;
        };
        
        
        answer = Arrays.asList(participant).stream()
            .filter(predicate).collect(Collectors.joining());
**/

