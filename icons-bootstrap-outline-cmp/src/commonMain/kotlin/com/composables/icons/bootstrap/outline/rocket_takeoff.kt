package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.RocketTakeoff: ImageVector
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
                moveTo(9.752f, 6.193f)
                curveToRelative(0.599f, 0.6f, 1.73f, 0.437f, 2.528f, -0.362f)
                reflectiveCurveToRelative(0.96f, -1.932f, 0.362f, -2.531f)
                curveToRelative(-0.599f, -0.6f, -1.73f, -0.438f, -2.528f, 0.361f)
                curveToRelative(-0.798f, 0.8f, -0.96f, 1.933f, -0.362f, 2.532f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.811f, 3.312f)
                curveToRelative(-0.363f, 1.534f, -1.334f, 3.626f, -3.64f, 6.218f)
                lineToRelative(-0.24f, 2.408f)
                arcToRelative(2.56f, 2.56f, 0f, false, true, -0.732f, 1.526f)
                lineTo(8.817f, 15.85f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, -0.867f, -0.434f)
                lineToRelative(0.27f, -1.899f)
                curveToRelative(0.04f, -0.28f, -0.013f, -0.593f, -0.131f, -0.956f)
                arcToRelative(9f, 9f, 0f, false, false, -0.249f, -0.657f)
                lineToRelative(-0.082f, -0.202f)
                curveToRelative(-0.815f, -0.197f, -1.578f, -0.662f, -2.191f, -1.277f)
                curveToRelative(-0.614f, -0.615f, -1.079f, -1.379f, -1.275f, -2.195f)
                lineToRelative(-0.203f, -0.083f)
                arcToRelative(10f, 10f, 0f, false, false, -0.655f, -0.248f)
                curveToRelative(-0.363f, -0.119f, -0.675f, -0.172f, -0.955f, -0.132f)
                lineToRelative(-1.896f, 0.27f)
                arcTo(0.51f, 0.51f, 0f, false, true, 0.15f, 7.17f)
                lineToRelative(2.382f, -2.386f)
                curveToRelative(0.41f, -0.41f, 0.947f, -0.67f, 1.524f, -0.734f)
                horizontalLineToRelative(0.006f)
                lineToRelative(2.4f, -0.238f)
                curveTo(9.005f, 1.55f, 11.087f, 0.582f, 12.623f, 0.208f)
                curveToRelative(0.89f, -0.217f, 1.59f, -0.232f, 2.08f, -0.188f)
                curveToRelative(0.244f, 0.023f, 0.435f, 0.06f, 0.57f, 0.093f)
                quadToRelative(0.1f, 0.026f, 0.16f, 0.045f)
                curveToRelative(0.184f, 0.06f, 0.279f, 0.13f, 0.351f, 0.295f)
                lineToRelative(0.029f, 0.073f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0.157f, 0.721f)
                curveToRelative(0.055f, 0.485f, 0.051f, 1.178f, -0.159f, 2.065f)
                moveToRelative(-4.828f, 7.475f)
                lineToRelative(0.04f, -0.04f)
                lineToRelative(-0.107f, 1.081f)
                arcToRelative(1.54f, 1.54f, 0f, false, true, -0.44f, 0.913f)
                lineToRelative(-1.298f, 1.3f)
                lineToRelative(0.054f, -0.38f)
                curveToRelative(0.072f, -0.506f, -0.034f, -0.993f, -0.172f, -1.418f)
                arcToRelative(9f, 9f, 0f, false, false, -0.164f, -0.45f)
                curveToRelative(0.738f, -0.065f, 1.462f, -0.38f, 2.087f, -1.006f)
                moveTo(5.205f, 5f)
                curveToRelative(-0.625f, 0.626f, -0.94f, 1.351f, -1.004f, 2.09f)
                arcToRelative(9f, 9f, 0f, false, false, -0.45f, -0.164f)
                curveToRelative(-0.424f, -0.138f, -0.91f, -0.244f, -1.416f, -0.172f)
                lineToRelative(-0.38f, 0.054f)
                lineToRelative(1.3f, -1.3f)
                curveToRelative(0.245f, -0.246f, 0.566f, -0.401f, 0.91f, -0.44f)
                lineToRelative(1.08f, -0.107f)
                close()
                moveToRelative(9.406f, -3.961f)
                curveToRelative(-0.38f, -0.034f, -0.967f, -0.027f, -1.746f, 0.163f)
                curveToRelative(-1.558f, 0.38f, -3.917f, 1.496f, -6.937f, 4.521f)
                curveToRelative(-0.62f, 0.62f, -0.799f, 1.34f, -0.687f, 2.051f)
                curveToRelative(0.107f, 0.676f, 0.483f, 1.362f, 1.048f, 1.928f)
                curveToRelative(0.564f, 0.565f, 1.25f, 0.941f, 1.924f, 1.049f)
                curveToRelative(0.71f, 0.112f, 1.429f, -0.067f, 2.048f, -0.688f)
                curveToRelative(3.079f, -3.083f, 4.192f, -5.444f, 4.556f, -6.987f)
                curveToRelative(0.183f, -0.771f, 0.18f, -1.345f, 0.138f, -1.713f)
                arcToRelative(3f, 3f, 0f, false, false, -0.045f, -0.283f)
                arcToRelative(3f, 3f, 0f, false, false, -0.3f, -0.041f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.009f, 12.139f)
                arcToRelative(7.6f, 7.6f, 0f, false, true, -1.804f, -1.352f)
                arcTo(7.6f, 7.6f, 0f, false, true, 3.794f, 8.86f)
                curveToRelative(-1.102f, 0.992f, -1.965f, 5.054f, -1.839f, 5.18f)
                curveToRelative(0.125f, 0.126f, 3.936f, -0.896f, 5.054f, -1.902f)
                close()
            }
        }.build()
        
        return _RocketTakeoff!!
    }

private var _RocketTakeoff: ImageVector? = null

