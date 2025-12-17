package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Dribbble: ImageVector
    get() {
        if (_Dribbble != null) return _Dribbble!!
        
        _Dribbble = ImageVector.Builder(
            name = "dribbble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveTo(3.584f, 0f, 0f, 3.584f, 0f, 8f)
                reflectiveCurveToRelative(3.584f, 8f, 8f, 8f)
                curveToRelative(4.408f, 0f, 8f, -3.584f, 8f, -8f)
                reflectiveCurveToRelative(-3.592f, -8f, -8f, -8f)
                moveToRelative(5.284f, 3.688f)
                arcToRelative(6.8f, 6.8f, 0f, false, true, 1.545f, 4.251f)
                curveToRelative(-0.226f, -0.043f, -2.482f, -0.503f, -4.755f, -0.217f)
                curveToRelative(-0.052f, -0.112f, -0.096f, -0.234f, -0.148f, -0.355f)
                curveToRelative(-0.139f, -0.33f, -0.295f, -0.668f, -0.451f, -0.99f)
                curveToRelative(2.516f, -1.023f, 3.662f, -2.498f, 3.81f, -2.69f)
                close()
                moveTo(8f, 1.18f)
                curveToRelative(1.735f, 0f, 3.323f, 0.65f, 4.53f, 1.718f)
                curveToRelative(-0.122f, 0.174f, -1.155f, 1.553f, -3.584f, 2.464f)
                curveToRelative(-1.12f, -2.056f, -2.36f, -3.74f, -2.551f, -4f)
                arcTo(7f, 7f, 0f, false, true, 8f, 1.18f)
                moveToRelative(-2.907f, 0.642f)
                arcTo(43f, 43f, 0f, false, true, 7.627f, 5.77f)
                curveToRelative(-3.193f, 0.85f, -6.013f, 0.833f, -6.317f, 0.833f)
                arcToRelative(6.87f, 6.87f, 0f, false, true, 3.783f, -4.78f)
                close()
                moveTo(1.163f, 8.01f)
                verticalLineTo(7.8f)
                curveToRelative(0.295f, 0.01f, 3.61f, 0.053f, 7.02f, -0.971f)
                curveToRelative(0.199f, 0.381f, 0.381f, 0.772f, 0.555f, 1.162f)
                lineToRelative(-0.27f, 0.078f)
                curveToRelative(-3.522f, 1.137f, -5.396f, 4.243f, -5.553f, 4.504f)
                arcToRelative(6.82f, 6.82f, 0f, false, true, -1.752f, -4.564f)
                close()
                moveTo(8f, 14.837f)
                arcToRelative(6.8f, 6.8f, 0f, false, true, -4.19f, -1.44f)
                curveToRelative(0.12f, -0.252f, 1.509f, -2.924f, 5.361f, -4.269f)
                curveToRelative(0.018f, -0.009f, 0.026f, -0.009f, 0.044f, -0.017f)
                arcToRelative(28.3f, 28.3f, 0f, false, true, 1.457f, 5.18f)
                arcTo(6.7f, 6.7f, 0f, false, true, 8f, 14.837f)
                moveToRelative(3.81f, -1.171f)
                curveToRelative(-0.07f, -0.417f, -0.435f, -2.412f, -1.328f, -4.868f)
                curveToRelative(2.143f, -0.338f, 4.017f, 0.217f, 4.251f, 0.295f)
                arcToRelative(6.77f, 6.77f, 0f, false, true, -2.924f, 4.573f)
                close()
            }
        }.build()
        
        return _Dribbble!!
    }

private var _Dribbble: ImageVector? = null

