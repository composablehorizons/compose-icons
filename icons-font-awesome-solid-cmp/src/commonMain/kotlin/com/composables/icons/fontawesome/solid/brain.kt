package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Brain: ImageVector
    get() {
        if (_Brain != null) return _Brain!!
        
        _Brain = ImageVector.Builder(
            name = "brain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 0f)
                curveToRelative(-29.9f, 0f, -54.7f, 20.5f, -61.8f, 48.2f)
                curveToRelative(-0.8f, 0f, -1.4f, -0.2f, -2.2f, -0.2f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                curveToRelative(0f, 4.8f, 0.6f, 9.5f, 1.7f, 14f)
                curveTo(52.5f, 138f, 32f, 166.6f, 32f, 200f)
                curveToRelative(0f, 12.6f, 3.2f, 24.3f, 8.3f, 34.9f)
                curveTo(16.3f, 248.7f, 0f, 274.3f, 0f, 304f)
                curveToRelative(0f, 33.3f, 20.4f, 61.9f, 49.4f, 73.9f)
                curveToRelative(-0.9f, 4.6f, -1.4f, 9.3f, -1.4f, 14.1f)
                curveToRelative(0f, 39.8f, 32.2f, 72f, 72f, 72f)
                curveToRelative(4.1f, 0f, 8.1f, -0.5f, 12f, -1.2f)
                curveToRelative(9.6f, 28.5f, 36.2f, 49.2f, 68f, 49.2f)
                curveToRelative(39.8f, 0f, 72f, -32.2f, 72f, -72f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
                moveToRelative(368f, 304f)
                curveToRelative(0f, -29.7f, -16.3f, -55.3f, -40.3f, -69.1f)
                curveToRelative(5.2f, -10.6f, 8.3f, -22.3f, 8.3f, -34.9f)
                curveToRelative(0f, -33.4f, -20.5f, -62f, -49.7f, -74f)
                curveToRelative(1f, -4.5f, 1.7f, -9.2f, 1.7f, -14f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                curveToRelative(-0.8f, 0f, -1.5f, 0.2f, -2.2f, 0.2f)
                curveTo(422.7f, 20.5f, 397.9f, 0f, 368f, 0f)
                curveToRelative(-35.3f, 0f, -64f, 28.6f, -64f, 64f)
                verticalLineToRelative(376f)
                curveToRelative(0f, 39.8f, 32.2f, 72f, 72f, 72f)
                curveToRelative(31.8f, 0f, 58.4f, -20.7f, 68f, -49.2f)
                curveToRelative(3.9f, 0.7f, 7.9f, 1.2f, 12f, 1.2f)
                curveToRelative(39.8f, 0f, 72f, -32.2f, 72f, -72f)
                curveToRelative(0f, -4.8f, -0.5f, -9.5f, -1.4f, -14.1f)
                curveToRelative(29f, -12f, 49.4f, -40.6f, 49.4f, -73.9f)
                close()
            }
        }.build()
        
        return _Brain!!
    }

private var _Brain: ImageVector? = null

