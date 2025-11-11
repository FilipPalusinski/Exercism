import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> dialingCodesMap = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dialingCodesMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodesMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialingCodesMap.containsKey(code) && !dialingCodesMap.containsValue(country)) {
            dialingCodesMap.put(code, country);
        } 
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialingCodesMap.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null; 
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer codeToRemove = findDialingCode(country);
        if(codeToRemove != null){
                dialingCodesMap.remove(codeToRemove);
                dialingCodesMap.put(code, country);
        }
    }
}
