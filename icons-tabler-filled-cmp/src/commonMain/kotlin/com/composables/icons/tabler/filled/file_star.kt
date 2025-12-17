package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileStar: ImageVector
    get() {
        if (_FileStar != null) return _FileStar!!
        
        _FileStar = ImageVector.Builder(
            name = "file-star",
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
                moveToRelative(-0.2f, 9f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.351f, 0.217f)
                lineToRelative(-1.086f, 2.193f)
                lineToRelative(-2.428f, 0.352f)
                arcToRelative(0.389f, 0.389f, 0f, false, false, -0.217f, 0.665f)
                lineToRelative(1.757f, 1.707f)
                lineToRelative(-0.415f, 2.411f)
                arcToRelative(0.392f, 0.392f, 0f, false, false, 0.568f, 0.41f)
                lineToRelative(2.172f, -1.138f)
                lineToRelative(2.172f, 1.138f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, 0.567f, -0.411f)
                lineToRelative(-0.414f, -2.41f)
                lineToRelative(1.757f, -1.707f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.217f, -0.665f)
                lineToRelative(-2.428f, -0.352f)
                lineToRelative(-1.086f, -2.193f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.351f, -0.217f)
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
        
        return _FileStar!!
    }

private var _FileStar: ImageVector? = null

