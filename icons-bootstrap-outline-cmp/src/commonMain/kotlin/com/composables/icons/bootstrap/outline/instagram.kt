package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Instagram: ImageVector
    get() {
        if (_Instagram != null) return _Instagram!!
        
        _Instagram = ImageVector.Builder(
            name = "instagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveTo(5.829f, 0f, 5.556f, 0.01f, 4.703f, 0.048f)
                curveTo(3.85f, 0.088f, 3.269f, 0.222f, 2.76f, 0.42f)
                arcToRelative(3.9f, 3.9f, 0f, false, false, -1.417f, 0.923f)
                arcTo(3.9f, 3.9f, 0f, false, false, 0.42f, 2.76f)
                curveTo(0.222f, 3.268f, 0.087f, 3.85f, 0.048f, 4.7f)
                curveTo(0.01f, 5.555f, 0f, 5.827f, 0f, 8.001f)
                curveToRelative(0f, 2.172f, 0.01f, 2.444f, 0.048f, 3.297f)
                curveToRelative(0.04f, 0.852f, 0.174f, 1.433f, 0.372f, 1.942f)
                curveToRelative(0.205f, 0.526f, 0.478f, 0.972f, 0.923f, 1.417f)
                curveToRelative(0.444f, 0.445f, 0.89f, 0.719f, 1.416f, 0.923f)
                curveToRelative(0.51f, 0.198f, 1.09f, 0.333f, 1.942f, 0.372f)
                curveTo(5.555f, 15.99f, 5.827f, 16f, 8f, 16f)
                reflectiveCurveToRelative(2.444f, -0.01f, 3.298f, -0.048f)
                curveToRelative(0.851f, -0.04f, 1.434f, -0.174f, 1.943f, -0.372f)
                arcToRelative(3.9f, 3.9f, 0f, false, false, 1.416f, -0.923f)
                curveToRelative(0.445f, -0.445f, 0.718f, -0.891f, 0.923f, -1.417f)
                curveToRelative(0.197f, -0.509f, 0.332f, -1.09f, 0.372f, -1.942f)
                curveTo(15.99f, 10.445f, 16f, 10.173f, 16f, 8f)
                reflectiveCurveToRelative(-0.01f, -2.445f, -0.048f, -3.299f)
                curveToRelative(-0.04f, -0.851f, -0.175f, -1.433f, -0.372f, -1.941f)
                arcToRelative(3.9f, 3.9f, 0f, false, false, -0.923f, -1.417f)
                arcTo(3.9f, 3.9f, 0f, false, false, 13.24f, 0.42f)
                curveToRelative(-0.51f, -0.198f, -1.092f, -0.333f, -1.943f, -0.372f)
                curveTo(10.443f, 0.01f, 10.172f, 0f, 7.998f, 0f)
                close()
                moveToRelative(-0.717f, 1.442f)
                horizontalLineToRelative(0.718f)
                curveToRelative(2.136f, 0f, 2.389f, 0.007f, 3.232f, 0.046f)
                curveToRelative(0.78f, 0.035f, 1.204f, 0.166f, 1.486f, 0.275f)
                curveToRelative(0.373f, 0.145f, 0.64f, 0.319f, 0.92f, 0.599f)
                reflectiveCurveToRelative(0.453f, 0.546f, 0.598f, 0.92f)
                curveToRelative(0.11f, 0.281f, 0.24f, 0.705f, 0.275f, 1.485f)
                curveToRelative(0.039f, 0.843f, 0.047f, 1.096f, 0.047f, 3.231f)
                reflectiveCurveToRelative(-0.008f, 2.389f, -0.047f, 3.232f)
                curveToRelative(-0.035f, 0.78f, -0.166f, 1.203f, -0.275f, 1.485f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.599f, 0.919f)
                curveToRelative(-0.28f, 0.28f, -0.546f, 0.453f, -0.92f, 0.598f)
                curveToRelative(-0.28f, 0.11f, -0.704f, 0.24f, -1.485f, 0.276f)
                curveToRelative(-0.843f, 0.038f, -1.096f, 0.047f, -3.232f, 0.047f)
                reflectiveCurveToRelative(-2.39f, -0.009f, -3.233f, -0.047f)
                curveToRelative(-0.78f, -0.036f, -1.203f, -0.166f, -1.485f, -0.276f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.92f, -0.598f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.6f, -0.92f)
                curveToRelative(-0.109f, -0.281f, -0.24f, -0.705f, -0.275f, -1.485f)
                curveToRelative(-0.038f, -0.843f, -0.046f, -1.096f, -0.046f, -3.233f)
                reflectiveCurveToRelative(0.008f, -2.388f, 0.046f, -3.231f)
                curveToRelative(0.036f, -0.78f, 0.166f, -1.204f, 0.276f, -1.486f)
                curveToRelative(0.145f, -0.373f, 0.319f, -0.64f, 0.599f, -0.92f)
                reflectiveCurveToRelative(0.546f, -0.453f, 0.92f, -0.598f)
                curveToRelative(0.282f, -0.11f, 0.705f, -0.24f, 1.485f, -0.276f)
                curveToRelative(0.738f, -0.034f, 1.024f, -0.044f, 2.515f, -0.045f)
                close()
                moveToRelative(4.988f, 1.328f)
                arcToRelative(0.96f, 0.96f, 0f, true, false, 0f, 1.92f)
                arcToRelative(0.96f, 0.96f, 0f, false, false, 0f, -1.92f)
                moveToRelative(-4.27f, 1.122f)
                arcToRelative(4.109f, 4.109f, 0f, true, false, 0f, 8.217f)
                arcToRelative(4.109f, 4.109f, 0f, false, false, 0f, -8.217f)
                moveToRelative(0f, 1.441f)
                arcToRelative(2.667f, 2.667f, 0f, true, true, 0f, 5.334f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 0f, -5.334f)
            }
        }.build()
        
        return _Instagram!!
    }

private var _Instagram: ImageVector? = null

