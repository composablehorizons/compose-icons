package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ruler: ImageVector
    get() {
        if (_Ruler != null) return _Ruler!!
        
        _Ruler = ImageVector.Builder(
            name = "ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(635.7f, 167.2f)
                lineTo(556.1f, 31.7f)
                curveToRelative(-8.8f, -15f, -28.3f, -20.1f, -43.5f, -11.5f)
                lineToRelative(-69f, 39.1f)
                lineTo(503.3f, 161f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(416f, 75f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(27.9f, 47.4f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(333.2f, 122f)
                lineTo(278f, 153.3f)
                lineTo(337.8f, 255f)
                curveToRelative(2.2f, 3.7f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineToRelative(-59.7f, -101.7f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(27.9f, 47.4f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineToRelative(-27.9f, -47.5f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(59.7f, 101.7f)
                curveToRelative(2.2f, 3.7f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(84.9f, 262.9f)
                lineToRelative(-69f, 39.1f)
                curveTo(0.7f, 310.7f, -4.6f, 329.8f, 4.2f, 344.8f)
                lineToRelative(79.6f, 135.6f)
                curveToRelative(8.8f, 15f, 28.3f, 20.1f, 43.5f, 11.5f)
                lineTo(624.1f, 210f)
                curveToRelative(15.2f, -8.6f, 20.4f, -27.8f, 11.6f, -42.8f)
                close()
            }
        }.build()
        
        return _Ruler!!
    }

private var _Ruler: ImageVector? = null

