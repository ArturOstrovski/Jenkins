def free_Space () {
    
    bat(script: "fsutil volume diskfree C:/Jenkins/workspace", returnStdout: true).trim()

    }
return this
