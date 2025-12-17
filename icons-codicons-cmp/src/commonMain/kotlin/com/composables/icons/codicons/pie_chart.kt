package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PieChart: ImageVector
    get() {
        if (_PieChart != null) return _PieChart!!
        
        _PieChart = ImageVector.Builder(
            name = "pie-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 1f)
                curveTo(8.22386f, 1f, 8f, 1.22386f, 8f, 1.5f)
                verticalLineTo(7.5f)
                curveTo(8f, 7.77614f, 8.22386f, 8f, 8.5f, 8f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 8f, 15f, 7.77614f, 15f, 7.5f)
                curveTo(15f, 3.91015f, 12.0899f, 1f, 8.5f, 1f)
                close()
                moveTo(9f, 7f)
                verticalLineTo(2.02242f)
                curveTo(11.6386f, 2.2602f, 13.7398f, 4.36143f, 13.9776f, 7f)
                horizontalLineTo(9f)
                close()
                moveTo(7f, 3.52246f)
                curveTo(7f, 3.38205f, 6.94096f, 3.24811f, 6.83731f, 3.15338f)
                curveTo(6.73367f, 3.05866f, 6.59497f, 3.01188f, 6.45512f, 3.02448f)
                curveTo(3.3965f, 3.30011f, 1f, 5.86992f, 1f, 9.00004f)
                curveTo(1f, 12.3137f, 3.68629f, 15f, 7f, 15f)
                curveTo(10.1301f, 15f, 12.6999f, 12.6035f, 12.9756f, 9.54492f)
                curveTo(12.9882f, 9.40507f, 12.9414f, 9.26637f, 12.8467f, 9.16273f)
                curveTo(12.7519f, 9.05908f, 12.618f, 9.00004f, 12.4776f, 9.00004f)
                horizontalLineTo(7f)
                verticalLineTo(3.52246f)
                close()
                moveTo(2f, 9.00004f)
                curveTo(2f, 6.58117f, 3.71795f, 4.56306f, 6f, 4.09998f)
                verticalLineTo(9.50004f)
                curveTo(6f, 9.77618f, 6.22386f, 10f, 6.5f, 10f)
                horizontalLineTo(11.9001f)
                curveTo(11.437f, 12.2821f, 9.41887f, 14f, 7f, 14f)
                curveTo(4.23858f, 14f, 2f, 11.7615f, 2f, 9.00004f)
                close()
            }
        }.build()
        
        return _PieChart!!
    }

private var _PieChart: ImageVector? = null

