package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Amazon: ImageVector
    get() {
        if (_Amazon != null) return _Amazon!!
        
        _Amazon = ImageVector.Builder(
            name = "amazon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.813f, 11.968f)
                curveToRelative(0.157f, 0.083f, 0.36f, 0.074f, 0.5f, -0.05f)
                lineToRelative(0.005f, 0.005f)
                arcToRelative(90f, 90f, 0f, false, true, 1.623f, -1.405f)
                curveToRelative(0.173f, -0.143f, 0.143f, -0.372f, 0.006f, -0.563f)
                lineToRelative(-0.125f, -0.17f)
                curveToRelative(-0.345f, -0.465f, -0.673f, -0.906f, -0.673f, -1.791f)
                verticalLineToRelative(-3.3f)
                lineToRelative(0.001f, -0.335f)
                curveToRelative(0.008f, -1.265f, 0.014f, -2.421f, -0.933f, -3.305f)
                curveTo(10.404f, 0.274f, 9.06f, 0f, 8.03f, 0f)
                curveTo(6.017f, 0f, 3.77f, 0.75f, 3.296f, 3.24f)
                curveToRelative(-0.047f, 0.264f, 0.143f, 0.404f, 0.316f, 0.443f)
                lineToRelative(2.054f, 0.22f)
                curveToRelative(0.19f, -0.009f, 0.33f, -0.196f, 0.366f, -0.387f)
                curveToRelative(0.176f, -0.857f, 0.896f, -1.271f, 1.703f, -1.271f)
                curveToRelative(0.435f, 0f, 0.929f, 0.16f, 1.188f, 0.55f)
                curveToRelative(0.264f, 0.39f, 0.26f, 0.91f, 0.257f, 1.376f)
                verticalLineToRelative(0.432f)
                quadToRelative(-0.3f, 0.033f, -0.621f, 0.065f)
                curveToRelative(-1.113f, 0.114f, -2.397f, 0.246f, -3.36f, 0.67f)
                curveTo(3.873f, 5.91f, 2.94f, 7.08f, 2.94f, 8.798f)
                curveToRelative(0f, 2.2f, 1.387f, 3.298f, 3.168f, 3.298f)
                curveToRelative(1.506f, 0f, 2.328f, -0.354f, 3.489f, -1.54f)
                lineToRelative(0.167f, 0.246f)
                curveToRelative(0.274f, 0.405f, 0.456f, 0.675f, 1.047f, 1.166f)
                close()
                moveTo(6.03f, 8.431f)
                curveTo(6.03f, 6.627f, 7.647f, 6.3f, 9.177f, 6.3f)
                verticalLineToRelative(0.57f)
                curveToRelative(0.001f, 0.776f, 0.002f, 1.434f, -0.396f, 2.133f)
                curveToRelative(-0.336f, 0.595f, -0.87f, 0.961f, -1.465f, 0.961f)
                curveToRelative(-0.812f, 0f, -1.286f, -0.619f, -1.286f, -1.533f)
                moveTo(0.435f, 12.174f)
                curveToRelative(2.629f, 1.603f, 6.698f, 4.084f, 13.183f, 0.997f)
                curveToRelative(0.28f, -0.116f, 0.475f, 0.078f, 0.199f, 0.431f)
                curveTo(13.538f, 13.96f, 11.312f, 16f, 7.57f, 16f)
                curveTo(3.832f, 16f, 0.968f, 13.446f, 0.094f, 12.386f)
                curveToRelative(-0.24f, -0.275f, 0.036f, -0.4f, 0.199f, -0.299f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.828f, 11.943f)
                curveToRelative(0.567f, -0.07f, 1.468f, -0.027f, 1.645f, 0.204f)
                curveToRelative(0.135f, 0.176f, -0.004f, 0.966f, -0.233f, 1.533f)
                curveToRelative(-0.23f, 0.563f, -0.572f, 0.961f, -0.762f, 1.115f)
                reflectiveCurveToRelative(-0.333f, 0.094f, -0.23f, -0.137f)
                curveToRelative(0.105f, -0.23f, 0.684f, -1.663f, 0.455f, -1.963f)
                curveToRelative(-0.213f, -0.278f, -1.177f, -0.177f, -1.625f, -0.13f)
                lineToRelative(-0.09f, 0.009f)
                quadToRelative(-0.142f, 0.013f, -0.233f, 0.024f)
                curveToRelative(-0.193f, 0.021f, -0.245f, 0.027f, -0.274f, -0.032f)
                curveToRelative(-0.074f, -0.209f, 0.779f, -0.556f, 1.347f, -0.623f)
            }
        }.build()
        
        return _Amazon!!
    }

private var _Amazon: ImageVector? = null

