package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 544f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(527.79f, 288f)
                horizontalLineTo(290.5f)
                lineToRelative(158.03f, 158.03f)
                curveToRelative(6.04f, 6.04f, 15.98f, 6.53f, 22.19f, 0.68f)
                curveToRelative(38.7f, -36.46f, 65.32f, -85.61f, 73.13f, -140.86f)
                curveToRelative(1.34f, -9.46f, -6.51f, -17.85f, -16.06f, -17.85f)
                close()
                moveToRelative(-15.83f, -64.8f)
                curveTo(503.72f, 103.74f, 408.26f, 8.28f, 288.8f, 0.04f)
                curveTo(279.68f, -0.59f, 272f, 7.1f, 272f, 16.24f)
                verticalLineTo(240f)
                horizontalLineToRelative(223.77f)
                curveToRelative(9.14f, 0f, 16.82f, -7.68f, 16.19f, -16.8f)
                close()
                moveTo(224f, 288f)
                verticalLineTo(50.71f)
                curveToRelative(0f, -9.55f, -8.39f, -17.4f, -17.84f, -16.06f)
                curveTo(86.99f, 51.49f, -4.1f, 155.6f, 0.14f, 280.37f)
                curveTo(4.5f, 408.51f, 114.83f, 513.59f, 243.03f, 511.98f)
                curveToRelative(50.4f, -0.63f, 96.97f, -16.87f, 135.26f, -44.03f)
                curveToRelative(7.9f, -5.6f, 8.42f, -17.23f, 1.57f, -24.08f)
                lineTo(224f, 288f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

