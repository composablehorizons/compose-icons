package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pie_chart: ImageVector
    get() {
        if (_Pie_chart != null) return _Pie_chart!!
        
        _Pie_chart = ImageVector.Builder(
            name = "pie_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                verticalLineToRelative(20f)
                curveToRelative(-5.07f, -0.5f, -9f, -4.79f, -9f, -10f)
                reflectiveCurveToRelative(3.93f, -9.5f, 9f, -10f)
                close()
                moveToRelative(2.03f, 0f)
                verticalLineToRelative(8.99f)
                horizontalLineTo(22f)
                curveToRelative(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f)
                close()
                moveToRelative(0f, 11.01f)
                verticalLineTo(22f)
                curveToRelative(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f)
                horizontalLineToRelative(-8.97f)
                close()
            }
        }.build()
        
        return _Pie_chart!!
    }

private var _Pie_chart: ImageVector? = null

