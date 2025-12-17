package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pie_chart: ImageVector
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
                moveTo(11f, 3.18f)
                verticalLineToRelative(17.64f)
                curveToRelative(0f, 0.64f, -0.59f, 1.12f, -1.21f, 0.98f)
                curveTo(5.32f, 20.8f, 2f, 16.79f, 2f, 12f)
                reflectiveCurveToRelative(3.32f, -8.8f, 7.79f, -9.8f)
                curveToRelative(0.62f, -0.14f, 1.21f, 0.34f, 1.21f, 0.98f)
                close()
                moveToRelative(2.03f, 0f)
                verticalLineToRelative(6.81f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.64f, 0f, 1.12f, -0.59f, 0.98f, -1.22f)
                curveToRelative(-0.85f, -3.76f, -3.8f, -6.72f, -7.55f, -7.57f)
                curveToRelative(-0.63f, -0.14f, -1.22f, 0.34f, -1.22f, 0.98f)
                close()
                moveToRelative(0f, 10.83f)
                verticalLineToRelative(6.81f)
                curveToRelative(0f, 0.64f, 0.59f, 1.12f, 1.22f, 0.98f)
                curveToRelative(3.76f, -0.85f, 6.71f, -3.82f, 7.56f, -7.58f)
                curveToRelative(0.14f, -0.62f, -0.35f, -1.22f, -0.98f, -1.22f)
                horizontalLineToRelative(-6.79f)
                curveToRelative(-0.56f, 0.01f, -1.01f, 0.46f, -1.01f, 1.01f)
                close()
            }
        }.build()
        
        return _Pie_chart!!
    }

private var _Pie_chart: ImageVector? = null

