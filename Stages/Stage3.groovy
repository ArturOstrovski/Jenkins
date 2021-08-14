def free_Space () {
    
    free_disk_size = bat(script: "fsutil volume diskfree C:/Jenkins/workspace", returnStdout: true).trim()

    }
return this
