package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.3f, -0.714f)
                arcToRelative(6f, 6f, 0f, false, true, 8.213f, -0.176f)
                lineToRelative(0.351f, 0.328f)
                arcToRelative(4f, 4f, 0f, false, false, 5.272f, 0f)
                lineToRelative(0.249f, -0.227f)
                curveToRelative(0.61f, -0.483f, 1.527f, -0.097f, 1.61f, 0.676f)
                lineToRelative(0.005f, 0.113f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.3f, 0.714f)
                arcToRelative(6f, 6f, 0f, false, true, -8.213f, 0.176f)
                lineToRelative(-0.351f, -0.328f)
                arcToRelative(4f, 4f, 0f, false, false, -5.136f, -0.114f)
                verticalLineToRelative(6.552f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-16f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

