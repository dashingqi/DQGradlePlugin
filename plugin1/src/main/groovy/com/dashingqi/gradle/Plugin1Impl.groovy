import org.gradle.api.Plugin
import org.gradle.api.Project

public class Plugin1Impl implements Plugin<Project>{

    @Override
    void apply(Project project) {

        project.task("plugin1Test"){
            doLast {
                print "this plugin1"
            }
        }
    }
}