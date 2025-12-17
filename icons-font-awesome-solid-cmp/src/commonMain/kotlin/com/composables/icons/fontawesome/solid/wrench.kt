package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(507.73f, 109.1f)
                curveToRelative(-2.24f, -9.03f, -13.54f, -12.09f, -20.12f, -5.51f)
                lineToRelative(-74.36f, 74.36f)
                lineToRelative(-67.88f, -11.31f)
                lineToRelative(-11.31f, -67.88f)
                lineToRelative(74.36f, -74.36f)
                curveToRelative(6.62f, -6.62f, 3.43f, -17.9f, -5.66f, -20.16f)
                curveToRelative(-47.38f, -11.74f, -99.55f, 0.91f, -136.58f, 37.93f)
                curveToRelative(-39.64f, 39.64f, -50.55f, 97.1f, -34.05f, 147.2f)
                lineTo(18.74f, 402.76f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.51f, 0f, 90.5f)
                curveToRelative(24.99f, 24.99f, 65.51f, 24.99f, 90.5f, 0f)
                lineToRelative(213.21f, -213.21f)
                curveToRelative(50.12f, 16.71f, 107.47f, 5.68f, 147.37f, -34.22f)
                curveToRelative(37.07f, -37.07f, 49.7f, -89.32f, 37.91f, -136.73f)
                close()
                moveTo(64f, 472f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

