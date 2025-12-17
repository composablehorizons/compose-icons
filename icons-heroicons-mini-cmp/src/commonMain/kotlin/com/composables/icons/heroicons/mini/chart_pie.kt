package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.552f, 0.45f, -1.007f, 0.997f, -0.93f)
                arcToRelative(7.004f, 7.004f, 0f, false, true, 5.933f, 5.933f)
                curveToRelative(0.078f, 0.547f, -0.378f, 0.997f, -0.93f, 0.997f)
                horizontalLineToRelative(-5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.003f, 4.07f)
                curveTo(8.55f, 3.994f, 9f, 4.449f, 9f, 5f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.552f, 0f, 1.008f, 0.45f, 0.93f, 0.997f)
                arcTo(7.001f, 7.001f, 0f, false, true, 2f, 11f)
                arcToRelative(7.002f, 7.002f, 0f, false, true, 6.003f, -6.93f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

