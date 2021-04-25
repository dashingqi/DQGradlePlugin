import org.gradle.api.Plugin
import org.gradle.api.Project

public class DqPluginImpl implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task("dq-plugin"){
            doLast {
                println "this is DqPluginImpl"
            }
        }
    }
}