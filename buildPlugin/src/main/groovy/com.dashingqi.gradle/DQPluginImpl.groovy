import org.gradle.api.Plugin
import org.gradle.api.Project

public class DQPluginImpl implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("testTask") {
            doLast {
                print "this is a plugin"
            }
        }
    }
}