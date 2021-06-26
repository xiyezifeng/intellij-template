package com.github.xiyezifeng.intellijtemplate.services

import com.github.xiyezifeng.intellijtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
