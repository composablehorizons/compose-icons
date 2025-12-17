package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileUpload: ImageVector
    get() {
        if (_FileUpload != null) return _FileUpload!!
        
        _FileUpload = ImageVector.Builder(
            name = "file-upload",
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
                moveToRelative(0f, 9f)
                lineToRelative(-0.09f, 0.004f)
                lineToRelative(-0.058f, 0.007f)
                lineToRelative(-0.118f, 0.025f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.113f, 0.054f)
                lineToRelative(-0.111f, 0.071f)
                arcToRelative(1f, 1f, 0f, false, false, -0.112f, 0.097f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(0.793f, -0.793f)
                verticalLineToRelative(3.586f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-3.585f)
                lineToRelative(0.793f, 0.792f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-0.082f, -0.073f)
                lineToRelative(-0.104f, -0.074f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.11f, -0.044f)
                lineToRelative(-0.112f, -0.03f)
                lineToRelative(-0.126f, -0.017f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.001f, -4.001f)
                close()
            }
        }.build()
        
        return _FileUpload!!
    }

private var _FileUpload: ImageVector? = null

