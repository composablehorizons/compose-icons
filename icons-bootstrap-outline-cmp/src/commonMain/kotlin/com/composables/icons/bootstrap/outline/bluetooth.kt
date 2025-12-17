package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) return _Bluetooth!!
        
        _Bluetooth = ImageVector.Builder(
            name = "bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.543f, 3.948f)
                lineToRelative(1.316f, 1.316f)
                lineTo(8.543f, 6.58f)
                close()
                moveToRelative(0f, 8.104f)
                lineToRelative(1.316f, -1.316f)
                lineTo(8.543f, 9.42f)
                close()
                moveToRelative(-1.41f, -4.043f)
                lineTo(4.275f, 5.133f)
                lineToRelative(0.827f, -0.827f)
                lineTo(7.377f, 6.58f)
                verticalLineTo(1.128f)
                lineToRelative(4.137f, 4.136f)
                lineTo(8.787f, 8.01f)
                lineToRelative(2.745f, 2.745f)
                lineToRelative(-4.136f, 4.137f)
                verticalLineTo(9.42f)
                lineToRelative(-2.294f, 2.274f)
                lineToRelative(-0.827f, -0.827f)
                close()
                moveTo(7.903f, 16f)
                curveToRelative(3.498f, 0f, 5.904f, -1.655f, 5.904f, -8.01f)
                curveToRelative(0f, -6.335f, -2.406f, -7.99f, -5.903f, -7.99f)
                reflectiveCurveTo(2f, 1.655f, 2f, 8.01f)
                curveTo(2f, 14.344f, 4.407f, 16f, 7.904f, 16f)
                close()
            }
        }.build()
        
        return _Bluetooth!!
    }

private var _Bluetooth: ImageVector? = null

