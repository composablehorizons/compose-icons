package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.RocketTakeoff: ImageVector
    get() {
        if (_RocketTakeoff != null) return _RocketTakeoff!!
        
        _RocketTakeoff = ImageVector.Builder(
            name = "rocket-takeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.17f, 9.53f)
                curveToRelative(2.307f, -2.592f, 3.278f, -4.684f, 3.641f, -6.218f)
                curveToRelative(0.21f, -0.887f, 0.214f, -1.58f, 0.16f, -2.065f)
                arcToRelative(3.6f, 3.6f, 0f, false, false, -0.108f, -0.563f)
                arcToRelative(2f, 2f, 0f, false, false, -0.078f, -0.23f)
                verticalLineTo(0.453f)
                curveToRelative(-0.073f, -0.164f, -0.168f, -0.234f, -0.352f, -0.295f)
                arcToRelative(2f, 2f, 0f, false, false, -0.16f, -0.045f)
                arcToRelative(4f, 4f, 0f, false, false, -0.57f, -0.093f)
                curveToRelative(-0.49f, -0.044f, -1.19f, -0.03f, -2.08f, 0.188f)
                curveToRelative(-1.536f, 0.374f, -3.618f, 1.343f, -6.161f, 3.604f)
                lineToRelative(-2.4f, 0.238f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(2.55f, 2.55f, 0f, false, false, -1.524f, 0.734f)
                lineTo(0.15f, 7.17f)
                arcToRelative(0.512f, 0.512f, 0f, false, false, 0.433f, 0.868f)
                lineToRelative(1.896f, -0.271f)
                curveToRelative(0.28f, -0.04f, 0.592f, 0.013f, 0.955f, 0.132f)
                curveToRelative(0.232f, 0.076f, 0.437f, 0.16f, 0.655f, 0.248f)
                lineToRelative(0.203f, 0.083f)
                curveToRelative(0.196f, 0.816f, 0.66f, 1.58f, 1.275f, 2.195f)
                curveToRelative(0.613f, 0.614f, 1.376f, 1.08f, 2.191f, 1.277f)
                lineToRelative(0.082f, 0.202f)
                curveToRelative(0.089f, 0.218f, 0.173f, 0.424f, 0.249f, 0.657f)
                curveToRelative(0.118f, 0.363f, 0.172f, 0.676f, 0.132f, 0.956f)
                lineToRelative(-0.271f, 1.9f)
                arcToRelative(0.512f, 0.512f, 0f, false, false, 0.867f, 0.433f)
                lineToRelative(2.382f, -2.386f)
                curveToRelative(0.41f, -0.41f, 0.668f, -0.949f, 0.732f, -1.526f)
                close()
                moveToRelative(0.11f, -3.699f)
                curveToRelative(-0.797f, 0.8f, -1.93f, 0.961f, -2.528f, 0.362f)
                curveToRelative(-0.598f, -0.6f, -0.436f, -1.733f, 0.361f, -2.532f)
                curveToRelative(0.798f, -0.799f, 1.93f, -0.96f, 2.528f, -0.361f)
                reflectiveCurveToRelative(0.437f, 1.732f, -0.36f, 2.531f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.205f, 10.787f)
                arcToRelative(7.6f, 7.6f, 0f, false, false, 1.804f, 1.352f)
                curveToRelative(-1.118f, 1.007f, -4.929f, 2.028f, -5.054f, 1.903f)
                curveToRelative(-0.126f, -0.127f, 0.737f, -4.189f, 1.839f, -5.18f)
                curveToRelative(0.346f, 0.69f, 0.837f, 1.35f, 1.411f, 1.925f)
            }
        }.build()
        
        return _RocketTakeoff!!
    }

private var _RocketTakeoff: ImageVector? = null

