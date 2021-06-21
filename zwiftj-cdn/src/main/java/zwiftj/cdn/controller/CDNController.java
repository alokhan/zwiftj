package zwiftj.cdn.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Controller
public class CDNController {

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
}
