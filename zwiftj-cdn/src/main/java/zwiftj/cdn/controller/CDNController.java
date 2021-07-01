package zwiftj.cdn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Controller
public class CDNController {

    private static final Logger logger = LoggerFactory.getLogger(CDNController.class);

    @GetMapping(value = "/gameassets/Zwift_Updates_Root/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String gameAssets() {
        InputStream fileStream = this.getClass().getResourceAsStream("/templates/Zwift_Updates_Root_listing.html");
        try {
            return new String(fileStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "";
        }
    }

    @GetMapping("/error")
    private void error(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        logger.error("Got a error {}", request.getParameterMap());
    }
}
