package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UndoAlt: ImageVector
    get() {
        if (_UndoAlt != null) return _UndoAlt!!
        
        _UndoAlt = ImageVector.Builder(
            name = "undo-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(255.545f, 8f)
                curveToRelative(-66.269f, 0.119f, -126.438f, 26.233f, -170.86f, 68.685f)
                lineTo(48.971f, 40.971f)
                curveTo(33.851f, 25.851f, 8f, 36.559f, 8f, 57.941f)
                verticalLineTo(192f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(134.059f)
                curveToRelative(21.382f, 0f, 32.09f, -25.851f, 16.971f, -40.971f)
                lineToRelative(-41.75f, -41.75f)
                curveToRelative(30.864f, -28.899f, 70.801f, -44.907f, 113.23f, -45.273f)
                curveToRelative(92.398f, -0.798f, 170.283f, 73.977f, 169.484f, 169.442f)
                curveTo(423.236f, 348.009f, 349.816f, 424f, 256f, 424f)
                curveToRelative(-41.127f, 0f, -79.997f, -14.678f, -110.63f, -41.556f)
                curveToRelative(-4.743f, -4.161f, -11.906f, -3.908f, -16.368f, 0.553f)
                lineTo(89.34f, 422.659f)
                curveToRelative(-4.872f, 4.872f, -4.631f, 12.815f, 0.482f, 17.433f)
                curveTo(133.798f, 479.813f, 192.074f, 504f, 256f, 504f)
                curveToRelative(136.966f, 0f, 247.999f, -111.033f, 248f, -247.998f)
                curveTo(504.001f, 119.193f, 392.354f, 7.755f, 255.545f, 8f)
                close()
            }
        }.build()
        
        return _UndoAlt!!
    }

private var _UndoAlt: ImageVector? = null

