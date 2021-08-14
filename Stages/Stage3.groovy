def free_Space () {
    
    def disk_size = bat(script: "fsutil volume diskfree C:/Jenkins/workspace", returnStdout: true).trim()
    println("disk_size = ${disk_size}")

    }
return this
