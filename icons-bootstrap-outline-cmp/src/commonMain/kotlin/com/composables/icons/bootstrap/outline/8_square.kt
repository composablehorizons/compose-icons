package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`8Square`: ImageVector
    get() {
        if (_8Square != null) return _8Square!!
        
        _8Square = ImageVector.Builder(
            name = "8-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.97f, 9.803f)
                curveToRelative(0f, 1.394f, -1.218f, 2.355f, -2.988f, 2.355f)
                curveToRelative(-1.763f, 0f, -2.953f, -0.955f, -2.953f, -2.344f)
                curveToRelative(0f, -1.271f, 0.95f, -1.851f, 1.647f, -2.003f)
                verticalLineToRelative(-0.065f)
                curveToRelative(-0.621f, -0.193f, -1.33f, -0.738f, -1.33f, -1.781f)
                curveToRelative(0f, -1.225f, 1.09f, -2.121f, 2.66f, -2.121f)
                reflectiveCurveToRelative(2.654f, 0.896f, 2.654f, 2.12f)
                curveToRelative(0f, 1.061f, -0.738f, 1.595f, -1.336f, 1.782f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.703f, 0.152f, 1.647f, 0.744f, 1.647f, 1.992f)
                close()
                moveToRelative(-4.347f, -3.71f)
                curveToRelative(0f, 0.739f, 0.586f, 1.255f, 1.383f, 1.255f)
                reflectiveCurveToRelative(1.377f, -0.516f, 1.377f, -1.254f)
                curveToRelative(0f, -0.733f, -0.58f, -1.23f, -1.377f, -1.23f)
                reflectiveCurveToRelative(-1.383f, 0.497f, -1.383f, 1.23f)
                close()
                moveToRelative(-0.281f, 3.645f)
                curveToRelative(0f, 0.838f, 0.72f, 1.412f, 1.664f, 1.412f)
                curveToRelative(0.943f, 0f, 1.658f, -0.574f, 1.658f, -1.412f)
                curveToRelative(0f, -0.843f, -0.715f, -1.424f, -1.658f, -1.424f)
                curveToRelative(-0.944f, 0f, -1.664f, 0.58f, -1.664f, 1.424f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
        }.build()
        
        return _8Square!!
    }

private var _8Square: ImageVector? = null

