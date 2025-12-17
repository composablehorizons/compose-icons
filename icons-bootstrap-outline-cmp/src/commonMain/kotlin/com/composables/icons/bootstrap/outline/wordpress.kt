package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Wordpress: ImageVector
    get() {
        if (_Wordpress != null) return _Wordpress!!
        
        _Wordpress = ImageVector.Builder(
            name = "wordpress",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.633f, 7.653f)
                curveToRelative(0f, -0.848f, -0.305f, -1.435f, -0.566f, -1.892f)
                lineToRelative(-0.08f, -0.13f)
                curveToRelative(-0.317f, -0.51f, -0.594f, -0.958f, -0.594f, -1.48f)
                curveToRelative(0f, -0.63f, 0.478f, -1.218f, 1.152f, -1.218f)
                quadToRelative(0.03f, 0f, 0.058f, 0.003f)
                lineToRelative(0.031f, 0.003f)
                arcTo(6.84f, 6.84f, 0f, false, false, 8f, 1.137f)
                arcTo(6.86f, 6.86f, 0f, false, false, 2.266f, 4.23f)
                curveToRelative(0.16f, 0.005f, 0.313f, 0.009f, 0.442f, 0.009f)
                curveToRelative(0.717f, 0f, 1.828f, -0.087f, 1.828f, -0.087f)
                curveToRelative(0.37f, -0.022f, 0.414f, 0.521f, 0.044f, 0.565f)
                curveToRelative(0f, 0f, -0.371f, 0.044f, -0.785f, 0.065f)
                lineToRelative(2.5f, 7.434f)
                lineToRelative(1.5f, -4.506f)
                lineToRelative(-1.07f, -2.929f)
                curveToRelative(-0.369f, -0.022f, -0.719f, -0.065f, -0.719f, -0.065f)
                curveToRelative(-0.37f, -0.022f, -0.326f, -0.588f, 0.043f, -0.566f)
                curveToRelative(0f, 0f, 1.134f, 0.087f, 1.808f, 0.087f)
                curveToRelative(0.718f, 0f, 1.83f, -0.087f, 1.83f, -0.087f)
                curveToRelative(0.37f, -0.022f, 0.413f, 0.522f, 0.043f, 0.566f)
                curveToRelative(0f, 0f, -0.372f, 0.043f, -0.785f, 0.065f)
                lineToRelative(2.48f, 7.377f)
                lineToRelative(0.684f, -2.287f)
                lineToRelative(0.054f, -0.173f)
                curveToRelative(0.27f, -0.86f, 0.469f, -1.495f, 0.469f, -2.046f)
                close()
                moveTo(1.137f, 8f)
                arcToRelative(6.86f, 6.86f, 0f, false, false, 3.868f, 6.176f)
                lineTo(1.73f, 5.206f)
                arcTo(6.8f, 6.8f, 0f, false, false, 1.137f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.061f, 14.583f)
                lineTo(8.121f, 8.6f)
                lineToRelative(2.109f, 5.78f)
                quadToRelative(0.02f, 0.05f, 0.049f, 0.094f)
                arcToRelative(6.85f, 6.85f, 0f, false, true, -4.218f, 0.109f)
                moveToRelative(7.96f, -9.876f)
                quadToRelative(0.046f, 0.328f, 0.047f, 0.706f)
                curveToRelative(0f, 0.696f, -0.13f, 1.479f, -0.522f, 2.458f)
                lineToRelative(-2.096f, 6.06f)
                arcToRelative(6.86f, 6.86f, 0f, false, false, 2.572f, -9.224f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                curveToRelative(0f, -4.411f, 3.589f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.589f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.589f, -8f, -8f)
                moveToRelative(0.367f, 0f)
                curveToRelative(0f, 4.209f, 3.424f, 7.633f, 7.633f, 7.633f)
                reflectiveCurveTo(15.632f, 12.209f, 15.632f, 8f)
                curveTo(15.632f, 3.79f, 12.208f, 0.367f, 8f, 0.367f)
                curveTo(3.79f, 0.367f, 0.367f, 3.79f, 0.367f, 8f)
            }
        }.build()
        
        return _Wordpress!!
    }

private var _Wordpress: ImageVector? = null

