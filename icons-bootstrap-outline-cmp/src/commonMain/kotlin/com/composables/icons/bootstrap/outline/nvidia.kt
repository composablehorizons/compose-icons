package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Nvidia: ImageVector
    get() {
        if (_Nvidia != null) return _Nvidia!!
        
        _Nvidia = ImageVector.Builder(
            name = "nvidia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.635f, 7.146f)
                reflectiveCurveTo(3.08f, 5.012f, 5.97f, 4.791f)
                verticalLineToRelative(-0.774f)
                curveTo(2.77f, 4.273f, 0f, 6.983f, 0f, 6.983f)
                reflectiveCurveToRelative(1.57f, 4.536f, 5.97f, 4.952f)
                verticalLineToRelative(-0.824f)
                curveToRelative(-3.23f, -0.406f, -4.335f, -3.965f, -4.335f, -3.965f)
                moveTo(5.97f, 9.475f)
                verticalLineToRelative(0.753f)
                curveToRelative(-2.44f, -0.435f, -3.118f, -2.972f, -3.118f, -2.972f)
                reflectiveCurveTo(4.023f, 5.958f, 5.97f, 5.747f)
                verticalLineToRelative(0.828f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-1.021f, -0.123f, -1.82f, 0.83f, -1.82f, 0.83f)
                reflectiveCurveToRelative(0.448f, 1.607f, 1.824f, 2.07f)
                moveTo(6f, 2f)
                lineToRelative(-0.03f, 2.017f)
                arcTo(7f, 7f, 0f, false, true, 6.252f, 4f)
                curveToRelative(3.637f, -0.123f, 6.007f, 2.983f, 6.007f, 2.983f)
                reflectiveCurveToRelative(-2.722f, 3.31f, -5.557f, 3.31f)
                quadToRelative(-0.39f, -0.002f, -0.732f, -0.065f)
                verticalLineToRelative(0.883f)
                quadToRelative(0.292f, 0.039f, 0.61f, 0.04f)
                curveToRelative(2.638f, 0f, 4.546f, -1.348f, 6.394f, -2.943f)
                curveToRelative(0.307f, 0.246f, 1.561f, 0.842f, 1.819f, 1.104f)
                curveToRelative(-1.757f, 1.47f, -5.852f, 2.657f, -8.173f, 2.657f)
                arcToRelative(7f, 7f, 0f, false, true, -0.65f, -0.034f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                lineToRelative(0.03f, -12f)
                close()
                moveToRelative(-0.03f, 3.747f)
                verticalLineToRelative(-0.956f)
                arcToRelative(6f, 6f, 0f, false, true, 0.282f, -0.015f)
                curveToRelative(2.616f, -0.082f, 4.332f, 2.248f, 4.332f, 2.248f)
                reflectiveCurveTo(8.73f, 9.598f, 6.743f, 9.598f)
                curveToRelative(-0.286f, 0f, -0.542f, -0.046f, -0.773f, -0.123f)
                verticalLineToRelative(-2.9f)
                curveToRelative(1.018f, 0.123f, 1.223f, 0.572f, 1.835f, 1.593f)
                lineTo(9.167f, 7.02f)
                reflectiveCurveToRelative(-0.994f, -1.304f, -2.67f, -1.304f)
                arcToRelative(5f, 5f, 0f, false, false, -0.527f, 0.031f)
            }
        }.build()
        
        return _Nvidia!!
    }

private var _Nvidia: ImageVector? = null

