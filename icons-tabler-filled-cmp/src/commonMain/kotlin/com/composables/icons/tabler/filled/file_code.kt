package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileCode: ImageVector
    get() {
        if (_FileCode != null) return _FileCode!!
        
        _FileCode = ImageVector.Builder(
            name = "file-code",
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
                moveToRelative(-1.553f, 11.106f)
                arcToRelative(1f, 1f, 0f, false, false, -1.341f, 0.447f)
                lineToRelative(-1f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 0.894f)
                lineToRelative(1f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 1.341f, 0.447f)
                lineToRelative(0.102f, -0.058f)
                arcToRelative(1f, 1f, 0f, false, false, 0.345f, -1.283f)
                lineToRelative(-0.776f, -1.553f)
                lineToRelative(0.776f, -1.553f)
                arcToRelative(1f, 1f, 0f, false, false, -0.447f, -1.341f)
                moveToRelative(4.447f, 0.447f)
                arcToRelative(1f, 1f, 0f, false, false, -1.341f, -0.447f)
                lineToRelative(-0.102f, 0.058f)
                arcToRelative(1f, 1f, 0f, false, false, -0.345f, 1.283f)
                lineToRelative(0.774f, 1.553f)
                lineToRelative(-0.775f, 1.553f)
                arcToRelative(1f, 1f, 0f, false, false, 1.788f, 0.894f)
                lineToRelative(1f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -0.894f)
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
        
        return _FileCode!!
    }

private var _FileCode: ImageVector? = null

