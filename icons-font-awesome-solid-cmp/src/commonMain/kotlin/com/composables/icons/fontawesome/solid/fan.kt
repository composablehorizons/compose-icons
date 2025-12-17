package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Fan: ImageVector
    get() {
        if (_Fan != null) return _Fan!!
        
        _Fan = ImageVector.Builder(
            name = "fan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352.57f, 128f)
                curveToRelative(-28.09f, 0f, -54.09f, 4.52f, -77.06f, 12.86f)
                lineToRelative(12.41f, -123.11f)
                curveTo(289f, 7.31f, 279.81f, -1.18f, 269.33f, 0.13f)
                curveTo(189.63f, 10.13f, 128f, 77.64f, 128f, 159.43f)
                curveToRelative(0f, 28.09f, 4.52f, 54.09f, 12.86f, 77.06f)
                lineTo(17.75f, 224.08f)
                curveTo(7.31f, 223f, -1.18f, 232.19f, 0.13f, 242.67f)
                curveToRelative(10f, 79.7f, 77.51f, 141.33f, 159.3f, 141.33f)
                curveToRelative(28.09f, 0f, 54.09f, -4.52f, 77.06f, -12.86f)
                lineToRelative(-12.41f, 123.11f)
                curveToRelative(-1.05f, 10.43f, 8.11f, 18.93f, 18.59f, 17.62f)
                curveToRelative(79.7f, -10f, 141.33f, -77.51f, 141.33f, -159.3f)
                curveToRelative(0f, -28.09f, -4.52f, -54.09f, -12.86f, -77.06f)
                lineToRelative(123.11f, 12.41f)
                curveToRelative(10.44f, 1.05f, 18.93f, -8.11f, 17.62f, -18.59f)
                curveToRelative(-10f, -79.7f, -77.51f, -141.33f, -159.3f, -141.33f)
                close()
                moveTo(256f, 288f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
            }
        }.build()
        
        return _Fan!!
    }

private var _Fan: ImageVector? = null

