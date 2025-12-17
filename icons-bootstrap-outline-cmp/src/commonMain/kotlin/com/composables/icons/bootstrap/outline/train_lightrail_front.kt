package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TrainLightrailFront: ImageVector
    get() {
        if (_TrainLightrailFront != null) return _TrainLightrailFront!!
        
        _TrainLightrailFront = ImageVector.Builder(
            name = "train-lightrail-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.011f)
                curveToRelative(-1.525f, 0.064f, -3.346f, 0.394f, -4.588f, 0.655f)
                curveTo(1.775f, 2.904f, 1f, 3.915f, 1f, 5.055f)
                verticalLineTo(13.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineTo(5.055f)
                curveToRelative(0f, -1.14f, -0.775f, -2.15f, -1.912f, -2.39f)
                curveToRelative(-1.242f, -0.26f, -3.063f, -0.59f, -4.588f, -0.654f)
                verticalLineTo(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(8f, 3f)
                curveToRelative(1.497f, 0f, 3.505f, 0.356f, 4.883f, 0.644f)
                curveToRelative(0.653f, 0.137f, 1.117f, 0.722f, 1.117f, 1.411f)
                verticalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.072f, 1.438f)
                arcToRelative(76f, 76f, 0f, false, true, -0.1f, -0.792f)
                curveToRelative(-0.092f, -0.761f, -0.2f, -1.752f, -0.266f, -2.682f)
                arcTo(21f, 21f, 0f, false, true, 12.5f, 10f)
                curveToRelative(0f, -1.051f, 0.143f, -2.404f, 0.278f, -3.435f)
                lineToRelative(0.07f, -0.522f)
                curveToRelative(0.112f, -0.798f, -0.42f, -1.571f, -1.244f, -1.697f)
                curveTo(10.644f, 4.199f, 9.136f, 4f, 8f, 4f)
                reflectiveCurveToRelative(-2.645f, 0.2f, -3.604f, 0.346f)
                curveToRelative(-0.825f, 0.126f, -1.356f, 0.9f, -1.244f, 1.697f)
                quadToRelative(0.034f, 0.24f, 0.07f, 0.522f)
                curveTo(3.357f, 7.596f, 3.5f, 8.949f, 3.5f, 10f)
                curveToRelative(0f, 0.428f, -0.024f, 0.933f, -0.062f, 1.464f)
                arcToRelative(57f, 57f, 0f, false, true, -0.266f, 2.682f)
                curveToRelative(-0.038f, 0.31f, -0.072f, 0.58f, -0.1f, 0.792f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(5.055f)
                curveToRelative(0f, -0.69f, 0.464f, -1.274f, 1.117f, -1.41f)
                curveTo(4.495f, 3.354f, 6.503f, 3f, 8f, 3f)
                moveToRelative(3.835f, 11.266f)
                curveToRelative(0.034f, 0.28f, 0.066f, 0.53f, 0.093f, 0.734f)
                horizontalLineTo(4.072f)
                arcToRelative(63f, 63f, 0f, false, false, 0.328f, -3f)
                horizontalLineToRelative(2.246f)
                curveToRelative(0.36f, 0f, 0.704f, -0.143f, 0.958f, -0.396f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, 0.25f, -0.104f)
                horizontalLineToRelative(0.292f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, 0.25f, 0.104f)
                curveToRelative(0.254f, 0.253f, 0.599f, 0.396f, 0.958f, 0.396f)
                horizontalLineTo(11.6f)
                curveToRelative(0.068f, 0.808f, 0.158f, 1.621f, 0.236f, 2.266f)
                close()
                moveTo(6f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                moveToRelative(3.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.5f, 0.5f)
                moveToRelative(-5.03f, -3f)
                curveToRelative(0.019f, -0.353f, 0.03f, -0.692f, 0.03f, -1f)
                curveToRelative(0f, -0.927f, -0.104f, -2.051f, -0.216f, -3f)
                horizontalLineToRelative(7.432f)
                curveToRelative(-0.112f, 0.949f, -0.216f, 2.073f, -0.216f, 3f)
                curveToRelative(0f, 0.308f, 0.011f, 0.647f, 0.03f, 1f)
                horizontalLineTo(9.354f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, -0.25f, -0.104f)
                arcToRelative(1.35f, 1.35f, 0f, false, false, -0.958f, -0.396f)
                horizontalLineToRelative(-0.292f)
                curveToRelative(-0.36f, 0f, -0.704f, 0.143f, -0.958f, 0.396f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, -0.25f, 0.104f)
                close()
                moveToRelative(-0.315f, -5f)
                lineToRelative(-0.013f, -0.096f)
                arcToRelative(0.497f, 0.497f, 0f, false, true, 0.405f, -0.57f)
                curveTo(5.505f, 5.188f, 6.947f, 5f, 8f, 5f)
                reflectiveCurveToRelative(2.495f, 0.188f, 3.453f, 0.334f)
                arcToRelative(0.497f, 0.497f, 0f, false, true, 0.405f, 0.57f)
                lineTo(11.845f, 6f)
                close()
            }
        }.build()
        
        return _TrainLightrailFront!!
    }

private var _TrainLightrailFront: ImageVector? = null

