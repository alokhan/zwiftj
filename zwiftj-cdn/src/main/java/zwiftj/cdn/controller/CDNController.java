package zwiftj.cdn.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CDNController {

    @GetMapping(value = "/gameassets/Zwift_Updates_Root/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String gameAssets() {
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "<title>Directory listing for /gameassets/Zwift_Updates_Root/</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Directory listing for /gameassets/Zwift_Updates_Root/</h1>\n" +
                "<hr>\n" +
                "<ul>\n" +
                "<li><a href=\"Launcher_ver_cur.xml\">Launcher_ver_cur.xml</a></li>\n" +
                "<li><a href=\"LauncherMac_ver_cur.xml\">LauncherMac_ver_cur.xml</a></li>\n" +
                "<li><a href=\"Zwift_ver_cur.xml\">Zwift_ver_cur.xml</a></li>\n" +
                "<li><a href=\"ZwiftMac_ver_cur.xml\">ZwiftMac_ver_cur.xml</a></li>\n" +
                "</ul>\n" +
                "<hr>\n" +
                "</body>\n" +
                "</html>";
    }
}
