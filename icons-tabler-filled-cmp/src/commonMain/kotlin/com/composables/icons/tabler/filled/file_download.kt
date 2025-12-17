package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileDownload: ImageVector
    get() {
        if (_FileDownload != null) return _FileDownload!!
        
        _FileDownload = ImageVector.Builder(
            name = "file-download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveToRelative(0f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3.585f)
                lineToRelative(-0.793f, -0.792f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, -0.083f)
                lineToRelative(-0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(0.044f, 0.042f)
                lineToRelative(0.068f, 0.055f)
                lineToRelative(0.11f, 0.071f)
                lineToRelative(0.114f, 0.054f)
                lineToRelative(0.105f, 0.035f)
                lineToRelative(0.15f, 0.03f)
                lineToRelative(0.116f, 0.006f)
                lineToRelative(0.117f, -0.007f)
                lineToRelative(0.117f, -0.02f)
                lineToRelative(0.108f, -0.033f)
                lineToRelative(0.081f, -0.034f)
                lineToRelative(0.098f, -0.052f)
                lineToRelative(0.092f, -0.064f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 0.083f)
                lineToRelative(-0.793f, 0.791f)
                verticalLineToRelative(-3.584f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                close()
                moveToRelative(2.999f, -7.001f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _FileDownload!!
    }

private var _FileDownload: ImageVector? = null

