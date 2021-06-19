package imageTest

import net.coobird.thumbnailator.Thumbnails
import net.coobird.thumbnailator.name.Rename
import java.io.File


fun main(args: Array<String>) {
    val name: String = args[0]

    convertToJPEG(name)
}

private fun convertToJPEG(fileName: String) {
    val outDir = "outImage"

    Thumbnails.of(File(fileName))
        .size(640, 480)
        .outputFormat("jpeg")
        .toFiles(File(".\\$outDir\\"), Rename.PREFIX_DOT_THUMBNAIL)
}
