package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.883f, 2.207f)
                arcToRelative(1.9f, 1.9f, 0f, false, true, 2.087f, 1.522f)
                lineToRelative(0.025f, 0.167f)
                lineToRelative(0.005f, 0.104f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(6.8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.026f, 0.226f)
                arcToRelative(10f, 10f, 0f, true, true, -12.27f, -11.933f)
                lineToRelative(0.27f, -0.067f)
                lineToRelative(0.11f, -0.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.5f)
                verticalLineToRelative(5.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.943f, -1.332f)
                arcToRelative(10f, 10f, 0f, false, false, -6.11f, -6.111f)
                arcToRelative(1f, 1f, 0f, false, false, -1.333f, 0.943f)
                close()
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

