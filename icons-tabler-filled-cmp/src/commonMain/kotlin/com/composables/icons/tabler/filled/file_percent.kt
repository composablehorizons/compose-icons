package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FilePercent: ImageVector
    get() {
        if (_FilePercent != null) return _FilePercent!!
        
        _FilePercent = ImageVector.Builder(
            name = "file-percent",
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
                moveToRelative(2.01f, 14f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0.697f, -3.707f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                moveToRelative(-4.697f, -0.293f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(4.989f, -9.001f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _FilePercent!!
    }

private var _FilePercent: ImageVector? = null

