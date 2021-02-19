package zwiftj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.ContentCachingRequestWrapper;
import zwiftj.controller.ExceptionHandlerController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;

@Component
public class LogInterceptor implements HandlerInterceptor {

    public static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final ContentCachingRequestWrapper wrapper = new ContentCachingRequestWrapper(request);
        logger.info("Request {}", wrapper.getReader().lines().collect(Collectors.joining(System.lineSeparator())));
        logger.info("Request url {}", request.getRequestURL());
        return true;
    }
}
