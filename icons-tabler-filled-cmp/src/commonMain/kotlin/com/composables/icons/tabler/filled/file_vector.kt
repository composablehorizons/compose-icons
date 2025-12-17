package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileVector: ImageVector
    get() {
        if (_FileVector != null) return _FileVector!!
        
        _FileVector = ImageVector.Builder(
            name = "file-vector",
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
                moveToRelative(2.5f, 9f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.292f, 1.5f)
                horizontalLineToRelative(-0.208f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -3.399f, 2.666f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -1.596f, 2.17f)
                lineToRelative(-0.005f, 0.164f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.676f, -2.206f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.324f, -0.794f)
                horizontalLineToRelative(0.208f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 2.292f, -3.5f)
                moveToRelative(-5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
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
        
        return _FileVector!!
    }

private var _FileVector: ImageVector? = null

