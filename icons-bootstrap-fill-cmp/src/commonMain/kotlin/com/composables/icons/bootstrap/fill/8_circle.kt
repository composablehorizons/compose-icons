package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`8Circle`: ImageVector
    get() {
        if (_8Circle != null) return _8Circle!!
        
        _8Circle = ImageVector.Builder(
            name = "8-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-5.03f, 1.803f)
                curveToRelative(0f, -1.248f, -0.943f, -1.84f, -1.646f, -1.992f)
                verticalLineToRelative(-0.065f)
                curveToRelative(0.598f, -0.187f, 1.336f, -0.72f, 1.336f, -1.781f)
                curveToRelative(0f, -1.225f, -1.084f, -2.121f, -2.654f, -2.121f)
                reflectiveCurveToRelative(-2.66f, 0.896f, -2.66f, 2.12f)
                curveToRelative(0f, 1.044f, 0.709f, 1.589f, 1.33f, 1.782f)
                verticalLineToRelative(0.065f)
                curveToRelative(-0.697f, 0.152f, -1.647f, 0.732f, -1.647f, 2.003f)
                curveToRelative(0f, 1.39f, 1.19f, 2.344f, 2.953f, 2.344f)
                curveToRelative(1.77f, 0f, 2.989f, -0.96f, 2.989f, -2.355f)
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
        }.build()
        
        return _8Circle!!
    }

private var _8Circle: ImageVector? = null

