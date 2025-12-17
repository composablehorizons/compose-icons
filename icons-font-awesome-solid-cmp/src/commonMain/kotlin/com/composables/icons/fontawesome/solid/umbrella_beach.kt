package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UmbrellaBeach: ImageVector
    get() {
        if (_UmbrellaBeach != null) return _UmbrellaBeach!!
        
        _UmbrellaBeach = ImageVector.Builder(
            name = "umbrella-beach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(115.38f, 136.9f)
                lineToRelative(102.11f, 37.18f)
                curveToRelative(35.19f, -81.54f, 86.21f, -144.29f, 139f, -173.7f)
                curveToRelative(-95.88f, -4.89f, -188.78f, 36.96f, -248.53f, 111.8f)
                curveToRelative(-6.69f, 8.4f, -2.66f, 21.05f, 7.42f, 24.72f)
                close()
                moveToRelative(132.25f, 48.16f)
                lineToRelative(238.48f, 86.83f)
                curveToRelative(35.76f, -121.38f, 18.7f, -231.66f, -42.63f, -253.98f)
                curveToRelative(-7.4f, -2.7f, -15.13f, -4f, -23.09f, -4f)
                curveToRelative(-58.02f, 0.01f, -128.27f, 69.17f, -172.76f, 171.15f)
                close()
                moveTo(521.48f, 60.5f)
                curveToRelative(6.22f, 16.3f, 10.83f, 34.6f, 13.2f, 55.19f)
                curveToRelative(5.74f, 49.89f, -1.42f, 108.23f, -18.95f, 166.98f)
                lineToRelative(102.62f, 37.36f)
                curveToRelative(10.09f, 3.67f, 21.31f, -3.43f, 21.57f, -14.17f)
                curveToRelative(2.32f, -95.69f, -41.91f, -187.44f, -118.44f, -245.36f)
                close()
                moveTo(560f, 447.98f)
                horizontalLineTo(321.06f)
                lineTo(386f, 269.5f)
                lineToRelative(-60.14f, -21.9f)
                lineToRelative(-72.9f, 200.37f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16.01f)
                verticalLineToRelative(32.01f)
                curveTo(0f, 504.83f, 7.16f, 512f, 16f, 512f)
                horizontalLineToRelative(544f)
                curveToRelative(8.84f, 0f, 16f, -7.17f, 16f, -16.01f)
                verticalLineToRelative(-32.01f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _UmbrellaBeach!!
    }

private var _UmbrellaBeach: ImageVector? = null

