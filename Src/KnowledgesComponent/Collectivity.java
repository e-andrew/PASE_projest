package KnowledgesComponent;

import java.util.HashMap;

public class Collectivity {
    private final HashMap<String, Educator> educators = new HashMap<>();

    public void addEducator(Educator educator){
        educators.put(educator.getEducatorID(), educator);
    }

    public Educator getEducator(String EducatorID){
        Educator targetEducator = null;
        if(educators.containsKey(EducatorID)){
            targetEducator = educators.get(EducatorID);
        }
        return targetEducator;
    }
}
