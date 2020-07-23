package app.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Util<br>
 * 共通処理
 * @author MewW6m　(https://github.com/MewW6m)
 */

@Component
public class Util {

    @Autowired
    private MessageSource messageSource;

    private final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * getMessage<br>
     * message.propertiesからメッセージを取得する
     * @param messageId メッセージID
     * @return メッセージ
     */
    public String getMessage(String messageId){
        return messageSource.getMessage(messageId, null , Locale.JAPAN);
    }

    /**
     * getMessage<br>
     * message.propertiesからメッセージを取得する
     * @param messageId メッセージID
     * @param args メッセージに挿入する値
     * @return メッセージ
     */
    public String getMessage(String messageId, String[] args){
        return messageSource.getMessage(messageId, args, Locale.JAPAN);
    }

    /**
     * copyNonNullProperties<br>
     * Beanをコピーする
     * @param src 上書きするBean要素
     * @param target 上書きされるBean要素
     */
    public void copyNonNullProperties(Object src, Object target) {
        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
    }

    /**
     * getNullPropertyNames<br>
     * nullのプロパティリストを返す
     * @param source Bean要素
     * @return プロパティリスト
     */
    public String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
