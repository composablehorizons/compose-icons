package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HandThumbsDown: ImageVector
    get() {
        if (_HandThumbsDown != null) return _HandThumbsDown!!
        
        _HandThumbsDown = ImageVector.Builder(
            name = "hand-thumbs-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.864f, 15.674f)
                curveToRelative(-0.956f, 0.24f, -1.843f, -0.484f, -1.908f, -1.42f)
                curveToRelative(-0.072f, -1.05f, -0.23f, -2.015f, -0.428f, -2.59f)
                curveToRelative(-0.125f, -0.36f, -0.479f, -1.012f, -1.04f, -1.638f)
                curveToRelative(-0.557f, -0.624f, -1.282f, -1.179f, -2.131f, -1.41f)
                curveTo(2.685f, 8.432f, 2f, 7.85f, 2f, 7f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.845f, 0.682f, -1.464f, 1.448f, -1.546f)
                curveToRelative(1.07f, -0.113f, 1.564f, -0.415f, 2.068f, -0.723f)
                lineToRelative(0.048f, -0.029f)
                curveToRelative(0.272f, -0.166f, 0.578f, -0.349f, 0.97f, -0.484f)
                curveTo(6.931f, 0.08f, 7.395f, 0f, 8f, 0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.937f, 0f, 1.599f, 0.478f, 1.934f, 1.064f)
                curveToRelative(0.164f, 0.287f, 0.254f, 0.607f, 0.254f, 0.913f)
                curveToRelative(0f, 0.152f, -0.023f, 0.312f, -0.077f, 0.464f)
                curveToRelative(0.201f, 0.262f, 0.38f, 0.577f, 0.488f, 0.9f)
                curveToRelative(0.11f, 0.33f, 0.172f, 0.762f, 0.004f, 1.15f)
                curveToRelative(0.069f, 0.13f, 0.12f, 0.268f, 0.159f, 0.403f)
                curveToRelative(0.077f, 0.27f, 0.113f, 0.567f, 0.113f, 0.856f)
                reflectiveCurveToRelative(-0.036f, 0.586f, -0.113f, 0.856f)
                curveToRelative(-0.035f, 0.12f, -0.08f, 0.244f, -0.138f, 0.363f)
                curveToRelative(0.394f, 0.571f, 0.418f, 1.2f, 0.234f, 1.733f)
                curveToRelative(-0.206f, 0.592f, -0.682f, 1.1f, -1.2f, 1.272f)
                curveToRelative(-0.847f, 0.283f, -1.803f, 0.276f, -2.516f, 0.211f)
                arcToRelative(10f, 10f, 0f, false, true, -0.443f, -0.05f)
                arcToRelative(9.36f, 9.36f, 0f, false, true, -0.062f, 4.51f)
                curveToRelative(-0.138f, 0.508f, -0.55f, 0.848f, -1.012f, 0.964f)
                close()
                moveTo(11.5f, 1f)
                horizontalLineTo(8f)
                curveToRelative(-0.51f, 0f, -0.863f, 0.068f, -1.14f, 0.163f)
                curveToRelative(-0.281f, 0.097f, -0.506f, 0.229f, -0.776f, 0.393f)
                lineToRelative(-0.04f, 0.025f)
                curveToRelative(-0.555f, 0.338f, -1.198f, 0.73f, -2.49f, 0.868f)
                curveToRelative(-0.333f, 0.035f, -0.554f, 0.29f, -0.554f, 0.55f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.255f, 0.226f, 0.543f, 0.62f, 0.65f)
                curveToRelative(1.095f, 0.3f, 1.977f, 0.997f, 2.614f, 1.709f)
                curveToRelative(0.635f, 0.71f, 1.064f, 1.475f, 1.238f, 1.977f)
                curveToRelative(0.243f, 0.7f, 0.407f, 1.768f, 0.482f, 2.85f)
                curveToRelative(0.025f, 0.362f, 0.36f, 0.595f, 0.667f, 0.518f)
                lineToRelative(0.262f, -0.065f)
                curveToRelative(0.16f, -0.04f, 0.258f, -0.144f, 0.288f, -0.255f)
                arcToRelative(8.34f, 8.34f, 0f, false, false, -0.145f, -4.726f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.595f, -0.643f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.014f, 0.004f)
                lineToRelative(0.058f, 0.013f)
                arcToRelative(9f, 9f, 0f, false, false, 1.036f, 0.157f)
                curveToRelative(0.663f, 0.06f, 1.457f, 0.054f, 2.11f, -0.163f)
                curveToRelative(0.175f, -0.059f, 0.45f, -0.301f, 0.57f, -0.651f)
                curveToRelative(0.107f, -0.308f, 0.087f, -0.67f, -0.266f, -1.021f)
                lineTo(12.793f, 7f)
                lineToRelative(0.353f, -0.354f)
                curveToRelative(0.043f, -0.042f, 0.105f, -0.14f, 0.154f, -0.315f)
                curveToRelative(0.048f, -0.167f, 0.075f, -0.37f, 0.075f, -0.581f)
                reflectiveCurveToRelative(-0.027f, -0.414f, -0.075f, -0.581f)
                curveToRelative(-0.05f, -0.174f, -0.111f, -0.273f, -0.154f, -0.315f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(0.353f, -0.354f)
                curveToRelative(0.047f, -0.047f, 0.109f, -0.176f, 0.005f, -0.488f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, -0.505f, -0.804f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(0.353f, -0.354f)
                curveToRelative(0.006f, -0.005f, 0.041f, -0.05f, 0.041f, -0.17f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.121f, -0.415f)
                curveTo(12.4f, 1.272f, 12.063f, 1f, 11.5f, 1f)
            }
        }.build()
        
        return _HandThumbsDown!!
    }

private var _HandThumbsDown: ImageVector? = null

