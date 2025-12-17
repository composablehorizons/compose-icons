package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Escalator_warning: ImageVector
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
                    moveTo(18.5f, 12f)
                    horizontalLineToRelative(-2.84f)
                    curveToRelative(-0.58f, 0.01f, -1.14f, 0.32f, -1.45f, 0.86f)
                    lineToRelative(-0.92f, 1.32f)
                    lineTo(9.72f, 8f)
                    curveTo(9.35f, 7.37f, 8.69f, 7.01f, 8.01f, 7f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 7f, 3f, 7.9f, 3f, 9f)
                    verticalLineToRelative(6f)
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
                    verticalLineToRelative(-3.5f)
                    curveTo(20f, 12.68f, 19.33f, 12f, 18.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Escalator_warning!!
    }

private var _Escalator_warning: ImageVector? = null

