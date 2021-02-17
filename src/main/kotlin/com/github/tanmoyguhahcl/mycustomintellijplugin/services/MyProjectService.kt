package com.github.tanmoyguhahcl.mycustomintellijplugin.services

import com.github.tanmoyguhahcl.mycustomintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
