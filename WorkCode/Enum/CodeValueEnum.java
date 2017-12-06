
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

@FunctionalInterface
public interface CodeValueEnum {
   static <T extends CodeValueEnum> Map <Integer, T> buildMapping(T[] types){
       Builder<Integer, T> builder = ImmutableMap.<Integer, T> builder();
       for(T type : types){
           builder.put(type.getCode(), type);
       }
       return builder.build();
   }
   int getCode();
}
