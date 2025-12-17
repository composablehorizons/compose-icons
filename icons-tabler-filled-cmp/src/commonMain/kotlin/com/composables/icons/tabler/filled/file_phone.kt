package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FilePhone: ImageVector
    get() {
        if (_FilePhone != null) return _FilePhone!!
        
        _FilePhone = ImageVector.Builder(
            name = "file-phone",
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
                moveToRelative(-2.5f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.128f, 0.697f)
                lineToRelative(-0.042f, 0.074f)
                lineToRelative(-0.022f, -0.007f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, -2.435f, -2.435f)
                lineToRelative(-0.008f, -0.023f)
                lineToRelative(0.075f, -0.041f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.704f, -1.272f)
                verticalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                moveToRelative(5.499f, -6.501f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _FilePhone!!
    }

private var _FilePhone: ImageVector? = null

