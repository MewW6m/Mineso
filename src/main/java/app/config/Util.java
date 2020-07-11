package app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/**
 * Util<br>
 * 共通処理
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Component
public class Util {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * mapping<br>
     * マップからエンティティにマッピングする
     *  @param entity マッピング先のエンティティ
     *  @param map マッピング元のマップ
     * @return Settings 設定情報返す
     */
    public void mapping(Object entity, Map<String, Object> map /*, String[] ignoreFields*/) throws Exception {
        Boolean errFlg = false;
        for(Map.Entry<String, Object> en : map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());

            String key = en.getKey().substring(0, 1).toUpperCase() + en.getKey().substring(1);
            //if(!Arrays.asList(ignoreFields).contains(key)) {
            try {
                Method getMethod = entity.getClass().getMethod("get" + key);
                Method setMethod = entity.getClass().getMethod("set" + key, getMethod.getReturnType());
                setMethod.invoke(entity, en.getValue());
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                logger.error(e.toString());
            }
            //}
        }
    }
}
