package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Jetpack: ImageVector
    get() {
        if (_Jetpack != null) return _Jetpack!!
        
        _Jetpack = ImageVector.Builder(
            name = "jetpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-7f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveToRelative(-4f, 8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-4f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                curveToRelative(0f, 2.623f, -0.787f, 4.59f, -2.4f, 5.8f)
                arcToRelative(1f, 1f, 0f, false, true, -1.2f, 0f)
                curveToRelative(-1.613f, -1.21f, -2.4f, -3.177f, -2.4f, -5.8f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                curveToRelative(0f, 1.532f, 0.308f, 2.684f, 0.906f, 3.498f)
                lineToRelative(0.094f, 0.119f)
                lineToRelative(0.094f, -0.12f)
                curveToRelative(0.558f, -0.759f, 0.864f, -1.813f, 0.902f, -3.196f)
                lineToRelative(0.004f, -0.301f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                curveToRelative(0f, 2.623f, -0.787f, 4.59f, -2.4f, 5.8f)
                arcToRelative(1f, 1f, 0f, false, true, -1.2f, 0f)
                curveToRelative(-1.613f, -1.21f, -2.4f, -3.177f, -2.4f, -5.8f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                curveToRelative(0f, 1.532f, 0.308f, 2.684f, 0.906f, 3.498f)
                lineToRelative(0.094f, 0.119f)
                lineToRelative(0.094f, -0.12f)
                curveToRelative(0.558f, -0.759f, 0.864f, -1.813f, 0.902f, -3.196f)
                lineToRelative(0.004f, -0.301f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Jetpack!!
    }

private var _Jetpack: ImageVector? = null

