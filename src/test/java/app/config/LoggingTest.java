package app.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


/**
 * Logging<br>
 * ログ出力
 * @author MewW6m　(https://github.com/MewW6m)
 */
@SpringBootTest
public class LoggingTest {

}
