package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BarChart: ImageVector
    get() {
        if (_BarChart != null) return _BarChart!!
        
        _BarChart = ImageVector.Builder(
            name = "bar-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 5f)
                curveTo(1.77614f, 5f, 2f, 5.22386f, 2f, 5.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 13.7761f, 1.77614f, 14f, 1.5f, 14f)
                curveTo(1.22386f, 14f, 1f, 13.7761f, 1f, 13.5f)
                verticalLineTo(5.5f)
                curveTo(1f, 5.22386f, 1.22386f, 5f, 1.5f, 5f)
                close()
                moveTo(3.5f, 7f)
                curveTo(3.77614f, 7f, 4f, 7.22386f, 4f, 7.5f)
                verticalLineTo(13.5f)
                curveTo(4f, 13.7761f, 3.77614f, 14f, 3.5f, 14f)
                curveTo(3.22386f, 14f, 3f, 13.7761f, 3f, 13.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 7.22386f, 3.22386f, 7f, 3.5f, 7f)
                close()
                moveTo(5.5f, 4f)
                curveTo(5.77614f, 4f, 6f, 4.22386f, 6f, 4.5f)
                verticalLineTo(13.5f)
                curveTo(6f, 13.7761f, 5.77614f, 14f, 5.5f, 14f)
                curveTo(5.22386f, 14f, 5f, 13.7761f, 5f, 13.5f)
                verticalLineTo(4.5f)
                curveTo(5f, 4.22386f, 5.22386f, 4f, 5.5f, 4f)
                close()
                moveTo(7.5f, 5f)
                curveTo(7.77614f, 5f, 8f, 5.22386f, 8f, 5.5f)
                verticalLineTo(13.5f)
                curveTo(8f, 13.7761f, 7.77614f, 14f, 7.5f, 14f)
                curveTo(7.22386f, 14f, 7f, 13.7761f, 7f, 13.5f)
                verticalLineTo(5.5f)
                curveTo(7f, 5.22386f, 7.22386f, 5f, 7.5f, 5f)
                close()
                moveTo(9.5f, 3f)
                curveTo(9.77614f, 3f, 10f, 3.22386f, 10f, 3.5f)
                verticalLineTo(13.5f)
                curveTo(10f, 13.7761f, 9.77614f, 14f, 9.5f, 14f)
                curveTo(9.22386f, 14f, 9f, 13.7761f, 9f, 13.5f)
                verticalLineTo(3.5f)
                curveTo(9f, 3.22386f, 9.22386f, 3f, 9.5f, 3f)
                close()
                moveTo(11.5f, 1f)
                curveTo(11.7761f, 1f, 12f, 1.22386f, 12f, 1.5f)
                verticalLineTo(13.5f)
                curveTo(12f, 13.7761f, 11.7761f, 14f, 11.5f, 14f)
                curveTo(11.2239f, 14f, 11f, 13.7761f, 11f, 13.5f)
                verticalLineTo(1.5f)
                curveTo(11f, 1.22386f, 11.2239f, 1f, 11.5f, 1f)
                close()
                moveTo(13.5f, 3f)
                curveTo(13.7761f, 3f, 14f, 3.22386f, 14f, 3.5f)
                verticalLineTo(13.5f)
                curveTo(14f, 13.7761f, 13.7761f, 14f, 13.5f, 14f)
                curveTo(13.2239f, 14f, 13f, 13.7761f, 13f, 13.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 3.22386f, 13.2239f, 3f, 13.5f, 3f)
                close()
            }
        }.build()
        
        return _BarChart!!
    }

private var _BarChart: ImageVector? = null

