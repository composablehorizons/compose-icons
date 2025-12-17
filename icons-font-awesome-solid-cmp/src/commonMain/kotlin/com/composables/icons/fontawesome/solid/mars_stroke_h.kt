package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MarsStrokeH: ImageVector
    get() {
        if (_MarsStrokeH != null) return _MarsStrokeH!!
        
        _MarsStrokeH = ImageVector.Builder(
            name = "mars-stroke-h",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476.2f, 247.5f)
                lineToRelative(-55.9f, -55.9f)
                curveToRelative(-7.6f, -7.6f, -20.5f, -2.2f, -20.5f, 8.5f)
                verticalLineTo(224f)
                horizontalLineTo(376f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-27.6f)
                curveToRelative(-5.8f, -25.6f, -18.7f, -49.9f, -38.6f, -69.8f)
                curveTo(189.6f, 98f, 98.4f, 98f, 42.2f, 154.2f)
                curveToRelative(-56.2f, 56.2f, -56.2f, 147.4f, 0f, 203.6f)
                curveToRelative(56.2f, 56.2f, 147.4f, 56.2f, 203.6f, 0f)
                curveToRelative(19.9f, -19.9f, 32.8f, -44.2f, 38.6f, -69.8f)
                horizontalLineTo(312f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(23.9f)
                verticalLineToRelative(23.9f)
                curveToRelative(0f, 10.7f, 12.9f, 16f, 20.5f, 8.5f)
                lineToRelative(55.9f, -55.9f)
                curveToRelative(4.6f, -4.7f, 4.6f, -12.3f, -0.1f, -17f)
                close()
                moveToRelative(-275.6f, 65.1f)
                curveToRelative(-31.2f, 31.2f, -81.9f, 31.2f, -113.1f, 0f)
                curveToRelative(-31.2f, -31.2f, -31.2f, -81.9f, 0f, -113.1f)
                curveToRelative(31.2f, -31.2f, 81.9f, -31.2f, 113.1f, 0f)
                curveToRelative(31.2f, 31.1f, 31.2f, 81.9f, 0f, 113.1f)
                close()
            }
        }.build()
        
        return _MarsStrokeH!!
    }

private var _MarsStrokeH: ImageVector? = null

