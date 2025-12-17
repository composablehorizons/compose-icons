package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pie_chart: ImageVector
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
                moveTo(4f, 12f)
                curveToRelative(0f, 4.07f, 3.06f, 7.44f, 7f, 7.93f)
                verticalLineTo(4.07f)
                curveTo(7.06f, 4.56f, 4f, 7.93f, 4f, 12f)
                close()
                moveToRelative(9f, 7.93f)
                curveToRelative(3.61f, -0.45f, 6.48f, -3.32f, 6.93f, -6.93f)
                horizontalLineTo(13f)
                verticalLineToRelative(6.93f)
                close()
                moveToRelative(0f, -15.86f)
                verticalLineTo(11f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.45f, -3.61f, -3.32f, -6.48f, -6.93f, -6.93f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(-1f, 17.93f)
                curveToRelative(-3.94f, -0.49f, -7f, -3.86f, -7f, -7.93f)
                reflectiveCurveToRelative(3.06f, -7.44f, 7f, -7.93f)
                verticalLineToRelative(15.86f)
                close()
                moveToRelative(2f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f)
                close()
                moveTo(13f, 11f)
                verticalLineTo(4.07f)
                curveToRelative(3.61f, 0.45f, 6.48f, 3.32f, 6.93f, 6.93f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Pie_chart!!
    }

private var _Pie_chart: ImageVector? = null

