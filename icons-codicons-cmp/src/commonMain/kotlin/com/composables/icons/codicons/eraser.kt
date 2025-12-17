package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Eraser: ImageVector
    get() {
        if (_Eraser != null) return _Eraser!!
        
        _Eraser = ImageVector.Builder(
            name = "eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 6f)
                curveTo(14.5f, 5.6f, 14.344f, 5.223f, 14.061f, 4.939f)
                lineTo(11.062f, 1.939f)
                curveTo(10.496f, 1.372f, 9.504f, 1.372f, 8.94f, 1.939f)
                lineTo(1.439f, 9.439f)
                curveTo(1.156f, 9.722f, 1f, 10.099f, 1f, 10.5f)
                curveTo(1f, 10.901f, 1.156f, 11.277f, 1.439f, 11.561f)
                lineTo(3.439f, 13.561f)
                curveTo(3.722f, 13.844f, 4.099f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 14f, 12f, 13.776f, 12f, 13.5f)
                curveTo(12f, 13.224f, 11.776f, 13f, 11.5f, 13f)
                horizontalLineTo(8.121f)
                lineTo(14.06f, 7.061f)
                curveTo(14.343f, 6.778f, 14.499f, 6.401f, 14.499f, 6f)
                horizontalLineTo(14.5f)
                close()
                moveTo(4.146f, 12.854f)
                lineTo(2.146f, 10.854f)
                curveTo(2.051f, 10.759f, 2f, 10.634f, 2f, 10.5f)
                curveTo(2f, 10.366f, 2.052f, 10.241f, 2.146f, 10.146f)
                lineTo(4.293f, 8f)
                lineTo(8f, 11.707f)
                lineTo(6.707f, 13f)
                horizontalLineTo(4.5f)
                curveTo(4.366f, 13f, 4.241f, 12.948f, 4.146f, 12.854f)
                close()
                moveTo(13.354f, 6.354f)
                lineTo(8.708f, 11f)
                lineTo(5.001f, 7.293f)
                lineTo(9.648f, 2.646f)
                curveTo(9.742f, 2.552f, 9.867f, 2.5f, 10.001f, 2.5f)
                curveTo(10.135f, 2.5f, 10.26f, 2.552f, 10.355f, 2.646f)
                lineTo(13.355f, 5.646f)
                curveTo(13.45f, 5.741f, 13.501f, 5.866f, 13.501f, 6f)
                curveTo(13.501f, 6.134f, 13.448f, 6.259f, 13.354f, 6.354f)
                close()
            }
        }.build()
        
        return _Eraser!!
    }

private var _Eraser: ImageVector? = null

