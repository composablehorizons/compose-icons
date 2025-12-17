package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tsunami: ImageVector
    get() {
        if (_Tsunami != null) return _Tsunami!!
        
        _Tsunami = ImageVector.Builder(
            name = "tsunami",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.036f, 12.314f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.65f, -0.278f)
                lineToRelative(1.757f, 0.703f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.014f, -0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 1.857f, 0f)
                lineToRelative(1.015f, 0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.014f, -0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 1.857f, 0f)
                lineToRelative(1.015f, 0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.757f, -0.703f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.372f, 0.928f)
                lineToRelative(-1.758f, 0.703f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.014f, -0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.114f, 0f)
                lineToRelative(-1.015f, 0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.014f, -0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.114f, 0f)
                lineToRelative(-1.015f, 0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.757f, -0.703f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.278f, -0.65f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.65f, -0.278f)
                lineToRelative(1.757f, 0.703f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.014f, -0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 1.857f, 0f)
                lineToRelative(1.015f, 0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.014f, -0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 1.857f, 0f)
                lineToRelative(1.015f, 0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.114f, 0f)
                lineToRelative(1.757f, -0.703f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.372f, 0.928f)
                lineToRelative(-1.758f, 0.703f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.014f, -0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.114f, 0f)
                lineToRelative(-1.015f, 0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.014f, -0.406f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.114f, 0f)
                lineToRelative(-1.015f, 0.406f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.857f, 0f)
                lineToRelative(-1.757f, -0.703f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.278f, -0.65f)
                moveTo(2.662f, 8.08f)
                curveToRelative(-0.456f, 1.063f, -0.994f, 2.098f, -1.842f, 2.804f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.64f, -0.768f)
                curveToRelative(0.652f, -0.544f, 1.114f, -1.384f, 1.564f, -2.43f)
                curveToRelative(0.14f, -0.328f, 0.281f, -0.68f, 0.427f, -1.044f)
                curveToRelative(0.302f, -0.754f, 0.624f, -1.559f, 1.01f, -2.308f)
                curveTo(3.763f, 3.2f, 4.528f, 2.105f, 5.7f, 1.299f)
                curveTo(6.877f, 0.49f, 8.418f, 0f, 10.5f, 0f)
                curveToRelative(1.463f, 0f, 2.511f, 0.4f, 3.179f, 1.058f)
                curveToRelative(0.67f, 0.66f, 0.893f, 1.518f, 0.819f, 2.302f)
                curveToRelative(-0.074f, 0.771f, -0.441f, 1.516f, -1.02f, 1.965f)
                arcToRelative(1.88f, 1.88f, 0f, false, true, -1.904f, 0.27f)
                curveToRelative(-0.65f, 0.642f, -0.907f, 1.679f, -0.71f, 2.614f)
                curveTo(11.076f, 9.215f, 11.784f, 10f, 13f, 10f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(13f)
                curveToRelative(-1.784f, 0f, -2.826f, -1.215f, -3.114f, -2.585f)
                curveToRelative(-0.232f, -1.1f, 0.005f, -2.373f, 0.758f, -3.284f)
                lineTo(10.5f, 5.06f)
                lineToRelative(-0.777f, 0.388f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.447f, 0f)
                lineToRelative(-1f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.447f, -0.894f)
                lineToRelative(0.777f, 0.388f)
                lineToRelative(0.776f, -0.388f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.447f, 0f)
                lineToRelative(1f, 0.5f)
                lineToRelative(0.034f, 0.018f)
                curveToRelative(0.44f, 0.264f, 0.81f, 0.195f, 1.108f, -0.036f)
                curveToRelative(0.328f, -0.255f, 0.586f, -0.729f, 0.637f, -1.27f)
                curveToRelative(0.05f, -0.529f, -0.1f, -1.076f, -0.525f, -1.495f)
                reflectiveCurveToRelative(-1.19f, -0.77f, -2.477f, -0.77f)
                curveToRelative(-1.918f, 0f, -3.252f, 0.448f, -4.232f, 1.123f)
                curveTo(5.283f, 2.8f, 4.61f, 3.738f, 4.07f, 4.79f)
                curveToRelative(-0.365f, 0.71f, -0.655f, 1.433f, -0.945f, 2.16f)
                curveToRelative(-0.15f, 0.376f, -0.301f, 0.753f, -0.463f, 1.13f)
            }
        }.build()
        
        return _Tsunami!!
    }

private var _Tsunami: ImageVector? = null

