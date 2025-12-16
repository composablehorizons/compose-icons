package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Mic: ImageVector
    get() {
        if (_Mic != null) return _Mic!!
        
        _Mic = ImageVector.Builder(
            name = "mic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 10.9995f)
                curveTo(9.654f, 10.9995f, 11f, 9.65351f, 11f, 7.99951f)
                verticalLineTo(3.99951f)
                curveTo(11f, 2.34551f, 9.654f, 0.999512f, 8f, 0.999512f)
                curveTo(6.346f, 0.999512f, 5f, 2.34551f, 5f, 3.99951f)
                verticalLineTo(7.99951f)
                curveTo(5f, 9.65351f, 6.346f, 10.9995f, 8f, 10.9995f)
                close()
                moveTo(6f, 3.99951f)
                curveTo(6f, 2.89651f, 6.897f, 1.99951f, 8f, 1.99951f)
                curveTo(9.103f, 1.99951f, 10f, 2.89651f, 10f, 3.99951f)
                verticalLineTo(7.99951f)
                curveTo(10f, 9.10251f, 9.103f, 9.99951f, 8f, 9.99951f)
                curveTo(6.897f, 9.99951f, 6f, 9.10251f, 6f, 7.99951f)
                verticalLineTo(3.99951f)
                close()
                moveTo(13f, 7.49951f)
                verticalLineTo(7.99951f)
                curveTo(13f, 10.5855f, 11.02f, 12.6935f, 8.5f, 12.9485f)
                verticalLineTo(14.4995f)
                curveTo(8.5f, 14.7755f, 8.276f, 14.9995f, 8f, 14.9995f)
                curveTo(7.724f, 14.9995f, 7.5f, 14.7755f, 7.5f, 14.4995f)
                verticalLineTo(12.9485f)
                curveTo(4.98f, 12.6935f, 3f, 10.5845f, 3f, 7.99951f)
                verticalLineTo(7.49951f)
                curveTo(3f, 7.22351f, 3.224f, 6.99951f, 3.5f, 6.99951f)
                curveTo(3.776f, 6.99951f, 4f, 7.22351f, 4f, 7.49951f)
                verticalLineTo(7.99951f)
                curveTo(4f, 10.2055f, 5.794f, 11.9995f, 8f, 11.9995f)
                curveTo(10.206f, 11.9995f, 12f, 10.2055f, 12f, 7.99951f)
                verticalLineTo(7.49951f)
                curveTo(12f, 7.22351f, 12.224f, 6.99951f, 12.5f, 6.99951f)
                curveTo(12.776f, 6.99951f, 13f, 7.22351f, 13f, 7.49951f)
                close()
            }
        }.build()
        
        return _Mic!!
    }

private var _Mic: ImageVector? = null

