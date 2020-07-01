package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * ErrorInfo<br>
 *　エラー情報
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorInfo {
    private int errorCode;
    private String errorMessage;
}
