package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MortarPestle: ImageVector
    get() {
        if (_MortarPestle != null) return _MortarPestle!!
        
        _MortarPestle = ImageVector.Builder(
            name = "mortar-pestle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501.54f, 60.91f)
                curveToRelative(17.22f, -17.22f, 12.51f, -46.25f, -9.27f, -57.14f)
                arcToRelative(35.696f, 35.696f, 0f, false, false, -37.37f, 3.37f)
                lineTo(251.09f, 160f)
                horizontalLineToRelative(151.37f)
                lineToRelative(99.08f, -99.09f)
                close()
                moveTo(496f, 192f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(0f, 80.98f, 50.2f, 150.11f, 121.13f, 178.32f)
                curveToRelative(-12.76f, 16.87f, -21.72f, 36.8f, -24.95f, 58.69f)
                curveToRelative(-1.46f, 9.92f, 6.04f, 18.98f, 16.07f, 18.98f)
                horizontalLineToRelative(223.5f)
                curveToRelative(10.03f, 0f, 17.53f, -9.06f, 16.07f, -18.98f)
                curveToRelative(-3.22f, -21.89f, -12.18f, -41.82f, -24.95f, -58.69f)
                curveTo(429.8f, 406.11f, 480f, 336.98f, 480f, 256f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _MortarPestle!!
    }

private var _MortarPestle: ImageVector? = null

