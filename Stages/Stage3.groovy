def free_Space () {
    
    def disk_size = bat "fsutil volume diskfree C:/Jenkins/workspace"
    println("disk_size = ${disk_size}")

    }
return this
