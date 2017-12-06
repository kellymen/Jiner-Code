
import java.util.Map;

public enum MessageCode implements CodeValueEnum {
    ONE(1),
    TWO(2),
    THREE(3);
    
    private static final Map<Integer, MessageCode> map = CodeValuEnum.buildMapping(MessageCode.values());
    
    private final int code;
    
    private MessageCode(int code){
        this.code = code;
    }
    
    @Override
    public int getCode(){
        return code;
    }
    
    public static MessageCode asEnum(int value) {
        return map.get(value);
    }
}
