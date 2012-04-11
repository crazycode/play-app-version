package controllers.appversion;

import play.AppVersion;
import play.mvc.Controller;

public class Versions extends Controller {

    public static void index() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppVersion.name).append(" ").append(AppVersion.value)
            .append("\n").append("revision:").append(AppVersion.revision)
            .append("\n").append("Build At:").append(AppVersion.buildAt)
            .append("\n").append("StartUp:").append(AppVersion.startupAt);
        renderText(sb.toString());
    }
}
