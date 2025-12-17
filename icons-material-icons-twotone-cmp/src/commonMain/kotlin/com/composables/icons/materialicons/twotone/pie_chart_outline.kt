package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pie_chart_outline: ImageVector
    get() {
        if (_Pie_chart_outline != null) return _Pie_chart_outline!!
        
        _Pie_chart_outline = ImageVector.Builder(
            name = "pie_chart_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                close()
                moveToRelative(-1f, 17.94f)
                curveToRelative(-3.93f, -0.5f, -7f, -3.88f, -7f, -7.94f)
                reflectiveCurveToRelative(3.07f, -7.44f, 7f, -7.93f)
                verticalLineToRelative(15.87f)
                close()
                moveToRelative(2f, -0.01f)
                verticalLineTo(13f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f)
                close()
                moveTo(13f, 11f)
                verticalLineTo(4.07f)
                curveToRelative(3.61f, 0.45f, 6.48f, 3.33f, 6.93f, 6.93f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Pie_chart_outline!!
    }

private var _Pie_chart_outline: ImageVector? = null

