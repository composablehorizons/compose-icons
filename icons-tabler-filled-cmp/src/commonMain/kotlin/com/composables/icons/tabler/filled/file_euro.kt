package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileEuro: ImageVector
    get() {
        if (_FileEuro != null) return _FileEuro!!
        
        _FileEuro = ImageVector.Builder(
            name = "file-euro",
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
                moveToRelative(2.334f, 9.23f)
                arcToRelative(4f, 4f, 0f, false, false, -5.208f, 2.77f)
                horizontalLineToRelative(-0.126f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.126f)
                arcToRelative(4f, 4f, 0f, false, false, 5.208f, 2.77f)
                arcToRelative(1f, 1f, 0f, false, false, -0.668f, -1.885f)
                lineToRelative(-0.156f, 0.049f)
                arcToRelative(2f, 2f, 0f, false, true, -2.243f, -0.934f)
                horizontalLineToRelative(0.733f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-0.733f)
                quadToRelative(0.056f, -0.097f, 0.124f, -0.19f)
                arcToRelative(2f, 2f, 0f, false, true, 2.275f, -0.695f)
                lineToRelative(0.112f, 0.032f)
                arcToRelative(1f, 1f, 0f, false, false, 0.556f, -1.918f)
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
        
        return _FileEuro!!
    }

private var _FileEuro: ImageVector? = null

