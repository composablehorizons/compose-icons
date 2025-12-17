package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PowerOff: ImageVector
    get() {
        if (_PowerOff != null) return _PowerOff!!
        
        _PowerOff = ImageVector.Builder(
            name = "power-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 54.1f)
                curveToRelative(63f, 45f, 104f, 118.6f, 104f, 201.9f)
                curveToRelative(0f, 136.8f, -110.8f, 247.7f, -247.5f, 248f)
                curveTo(120f, 504.3f, 8.2f, 393f, 8f, 256.4f)
                curveTo(7.9f, 173.1f, 48.9f, 99.3f, 111.8f, 54.2f)
                curveToRelative(11.7f, -8.3f, 28f, -4.8f, 35f, 7.7f)
                lineTo(162.6f, 90f)
                curveToRelative(5.9f, 10.5f, 3.1f, 23.8f, -6.6f, 31f)
                curveToRelative(-41.5f, 30.8f, -68f, 79.6f, -68f, 134.9f)
                curveToRelative(-0.1f, 92.3f, 74.5f, 168.1f, 168f, 168.1f)
                curveToRelative(91.6f, 0f, 168.6f, -74.2f, 168f, -169.1f)
                curveToRelative(-0.3f, -51.8f, -24.7f, -101.8f, -68.1f, -134f)
                curveToRelative(-9.7f, -7.2f, -12.4f, -20.5f, -6.5f, -30.9f)
                lineToRelative(15.8f, -28.1f)
                curveToRelative(7f, -12.4f, 23.2f, -16.1f, 34.8f, -7.8f)
                close()
                moveTo(296f, 264f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-32f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                close()
            }
        }.build()
        
        return _PowerOff!!
    }

private var _PowerOff: ImageVector? = null

