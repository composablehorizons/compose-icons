package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BoxOpen: ImageVector
    get() {
        if (_BoxOpen != null) return _BoxOpen!!
        
        _BoxOpen = ImageVector.Builder(
            name = "box-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(425.7f, 256f)
                curveToRelative(-16.9f, 0f, -32.8f, -9f, -41.4f, -23.4f)
                lineTo(320f, 126f)
                lineToRelative(-64.2f, 106.6f)
                curveToRelative(-8.7f, 14.5f, -24.6f, 23.5f, -41.5f, 23.5f)
                curveToRelative(-4.5f, 0f, -9f, -0.6f, -13.3f, -1.9f)
                lineTo(64f, 215f)
                verticalLineToRelative(178f)
                curveToRelative(0f, 14.7f, 10f, 27.5f, 24.2f, 31f)
                lineToRelative(216.2f, 54.1f)
                curveToRelative(10.2f, 2.5f, 20.9f, 2.5f, 31f, 0f)
                lineTo(551.8f, 424f)
                curveToRelative(14.2f, -3.6f, 24.2f, -16.4f, 24.2f, -31f)
                verticalLineTo(215f)
                lineToRelative(-137f, 39.1f)
                curveToRelative(-4.3f, 1.3f, -8.8f, 1.9f, -13.3f, 1.9f)
                close()
                moveToRelative(212.6f, -112.2f)
                lineTo(586.8f, 41f)
                curveToRelative(-3.1f, -6.2f, -9.8f, -9.8f, -16.7f, -8.9f)
                lineTo(320f, 64f)
                lineToRelative(91.7f, 152.1f)
                curveToRelative(3.8f, 6.3f, 11.4f, 9.3f, 18.5f, 7.3f)
                lineToRelative(197.9f, -56.5f)
                curveToRelative(9.9f, -2.9f, 14.7f, -13.9f, 10.2f, -23.1f)
                close()
                moveTo(53.2f, 41f)
                lineTo(1.7f, 143.8f)
                curveToRelative(-4.6f, 9.2f, 0.3f, 20.2f, 10.1f, 23f)
                lineToRelative(197.9f, 56.5f)
                curveToRelative(7.1f, 2f, 14.7f, -1f, 18.5f, -7.3f)
                lineTo(320f, 64f)
                lineTo(69.8f, 32.1f)
                curveToRelative(-6.9f, -0.8f, -13.5f, 2.7f, -16.6f, 8.9f)
                close()
            }
        }.build()
        
        return _BoxOpen!!
    }

private var _BoxOpen: ImageVector? = null

