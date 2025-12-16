package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.50312f)
                curveTo(15f, 2.47681f, 13.9924f, 1.75361f, 13.0201f, 2.08197f)
                lineTo(2.02008f, 5.7966f)
                curveTo(1.41043f, 6.00248f, 1f, 6.57427f, 1f, 7.21776f)
                verticalLineTo(8.78323f)
                curveTo(1f, 9.42595f, 1.40947f, 9.99725f, 2.01813f, 10.2037f)
                lineTo(4f, 10.876f)
                verticalLineTo(12f)
                curveTo(4f, 13.6568f, 5.34315f, 15f, 7f, 15f)
                curveTo(8.35497f, 15f, 9.50014f, 14.1017f, 9.87246f, 12.8681f)
                lineTo(13.0181f, 13.9353f)
                curveTo(13.9909f, 14.2652f, 15f, 13.5419f, 15f, 12.5148f)
                verticalLineTo(3.50312f)
                close()
                moveTo(13.34f, 3.02941f)
                curveTo(13.6641f, 2.91995f, 14f, 3.16102f, 14f, 3.50312f)
                verticalLineTo(12.5148f)
                curveTo(14f, 12.8572f, 13.6636f, 13.0983f, 13.3394f, 12.9883f)
                lineTo(2.33938f, 9.25673f)
                curveTo(2.13649f, 9.1879f, 2f, 8.99747f, 2f, 8.78323f)
                verticalLineTo(7.21776f)
                curveTo(2f, 7.00326f, 2.13681f, 6.81266f, 2.34003f, 6.74404f)
                lineTo(13.34f, 3.02941f)
                close()
                moveTo(8.9244f, 12.5465f)
                curveTo(8.68661f, 13.3854f, 7.91507f, 14f, 7f, 14f)
                curveTo(5.89543f, 14f, 5f, 13.1045f, 5f, 12f)
                verticalLineTo(11.2153f)
                lineTo(8.9244f, 12.5465f)
                close()
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

