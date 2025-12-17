package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MarsStrokeV: ImageVector
    get() {
        if (_MarsStrokeV != null) return _MarsStrokeV!!
        
        _MarsStrokeV = ImageVector.Builder(
            name = "mars-stroke-v",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(245.8f, 234.2f)
                curveToRelative(-19.9f, -19.9f, -44.2f, -32.8f, -69.8f, -38.6f)
                verticalLineToRelative(-25.4f)
                horizontalLineToRelative(20f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-20f)
                verticalLineTo(81.4f)
                horizontalLineToRelative(23.9f)
                curveToRelative(10.7f, 0f, 16f, -12.9f, 8.5f, -20.5f)
                lineTo(152.5f, 5.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineTo(79.6f, 61f)
                curveToRelative(-7.6f, 7.6f, -2.2f, 20.5f, 8.5f, 20.5f)
                horizontalLineTo(112f)
                verticalLineToRelative(24.7f)
                horizontalLineTo(92f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(25.4f)
                curveToRelative(-25.6f, 5.8f, -49.9f, 18.7f, -69.8f, 38.6f)
                curveToRelative(-56.2f, 56.2f, -56.2f, 147.4f, 0f, 203.6f)
                curveToRelative(56.2f, 56.2f, 147.4f, 56.2f, 203.6f, 0f)
                curveToRelative(56.3f, -56.2f, 56.3f, -147.4f, 0f, -203.6f)
                close()
                moveToRelative(-45.2f, 158.4f)
                curveToRelative(-31.2f, 31.2f, -81.9f, 31.2f, -113.1f, 0f)
                curveToRelative(-31.2f, -31.2f, -31.2f, -81.9f, 0f, -113.1f)
                curveToRelative(31.2f, -31.2f, 81.9f, -31.2f, 113.1f, 0f)
                curveToRelative(31.2f, 31.1f, 31.2f, 81.9f, 0f, 113.1f)
                close()
            }
        }.build()
        
        return _MarsStrokeV!!
    }

private var _MarsStrokeV: ImageVector? = null

