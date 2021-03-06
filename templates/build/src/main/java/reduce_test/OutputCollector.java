package reduce_test;

import java.util.ArrayList;

public class OutputCollector<T1, T2> {
    ArrayList<T1> keyList;
    ArrayList<T2> valueList;


    public OutputCollector() {
        keyList = new ArrayList<T1>();
        valueList = new ArrayList<T2>();
    }

    public void collect(T1 key, T2 value){
        keyList.add(key);
        valueList.add(value);
    }

    public ArrayList<T1> getKeyList() {
        return keyList;
    }
    public ArrayList<T2> getValueList() {
        return valueList;
    }

    public boolean equals(Object o){
        if(o instanceof OutputCollector){
            OutputCollector other =(OutputCollector) o;

            if (valueList.size() != other.valueList.size()){
                return false;
            }
            if (valueList.size() == 0) return true;

            for(int i = 0; i < valueList.size(); i++){

                if (valueList.get(i) != null && other.valueList.get(i) == null){
                    return false;
                } else if (valueList.get(i) == null && other.valueList.get(i) != null) {
                    return false;
                } else if (valueList.get(i) != null && other.valueList.get(i)!= null
                        && !valueList.get(i).equals(other.valueList.get(i)))
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }


}
