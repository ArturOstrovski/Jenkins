def free_Space () {
    
    def free_disk_size = bat(script: "fsutil volume diskfree C:/Jenkins/workspace", returnStdout: true)
    println "This is...necessery..."
    println free_disk_size
    
}
return this
