package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Escalator_warning: ImageVector
    get() {
        if (_Escalator_warning != null) return _Escalator_warning!!
        
        _Escalator_warning = ImageVector.Builder(
            name = "escalator_warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6.5f, 2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveTo(5.4f, 2f, 6.5f, 2f)
                    close()
                    moveTo(15.5f, 9.5f)
                    curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                    reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveTo(17.83f, 8f, 17f, 8f)
                    reflectiveCurveTo(15.5f, 8.67f, 15.5f, 9.5f)
                    close()
                    moveTo(14.21f, 12.86f)
                    lineToRelative(-0.92f, 1.32f)
                    lineTo(9.72f, 8f)
                    curveTo(9.37f, 7.38f, 8.71f, 7f, 7.99f, 7f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(11.61f)
                    lineTo(12.03f, 16f)
                    horizontalLineToRelative(2.2f)
                    lineTo(15f, 14.9f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(-4.15f)
                    curveTo(15.19f, 12f, 14.58f, 12.32f, 14.21f, 12.86f)
                    close()
                }
            }
        }.build()
        
        return _Escalator_warning!!
    }

private var _Escalator_warning: ImageVector? = null

