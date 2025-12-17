package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HandThumbsUp: ImageVector
    get() {
        if (_HandThumbsUp != null) return _HandThumbsUp!!
        
        _HandThumbsUp = ImageVector.Builder(
            name = "hand-thumbs-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.864f, 0.046f)
                curveTo(7.908f, -0.193f, 7.02f, 0.53f, 6.956f, 1.466f)
                curveToRelative(-0.072f, 1.051f, -0.23f, 2.016f, -0.428f, 2.59f)
                curveToRelative(-0.125f, 0.36f, -0.479f, 1.013f, -1.04f, 1.639f)
                curveToRelative(-0.557f, 0.623f, -1.282f, 1.178f, -2.131f, 1.41f)
                curveTo(2.685f, 7.288f, 2f, 7.87f, 2f, 8.72f)
                verticalLineToRelative(4.001f)
                curveToRelative(0f, 0.845f, 0.682f, 1.464f, 1.448f, 1.545f)
                curveToRelative(1.07f, 0.114f, 1.564f, 0.415f, 2.068f, 0.723f)
                lineToRelative(0.048f, 0.03f)
                curveToRelative(0.272f, 0.165f, 0.578f, 0.348f, 0.97f, 0.484f)
                curveToRelative(0.397f, 0.136f, 0.861f, 0.217f, 1.466f, 0.217f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.937f, 0f, 1.599f, -0.477f, 1.934f, -1.064f)
                arcToRelative(1.86f, 1.86f, 0f, false, false, 0.254f, -0.912f)
                curveToRelative(0f, -0.152f, -0.023f, -0.312f, -0.077f, -0.464f)
                curveToRelative(0.201f, -0.263f, 0.38f, -0.578f, 0.488f, -0.901f)
                curveToRelative(0.11f, -0.33f, 0.172f, -0.762f, 0.004f, -1.149f)
                curveToRelative(0.069f, -0.13f, 0.12f, -0.269f, 0.159f, -0.403f)
                curveToRelative(0.077f, -0.27f, 0.113f, -0.568f, 0.113f, -0.857f)
                curveToRelative(0f, -0.288f, -0.036f, -0.585f, -0.113f, -0.856f)
                arcToRelative(2f, 2f, 0f, false, false, -0.138f, -0.362f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, 0.234f, -1.734f)
                curveToRelative(-0.206f, -0.592f, -0.682f, -1.1f, -1.2f, -1.272f)
                curveToRelative(-0.847f, -0.282f, -1.803f, -0.276f, -2.516f, -0.211f)
                arcToRelative(10f, 10f, 0f, false, false, -0.443f, 0.05f)
                arcToRelative(9.4f, 9.4f, 0f, false, false, -0.062f, -4.509f)
                arcTo(1.38f, 1.38f, 0f, false, false, 9.125f, 0.111f)
                close()
                moveTo(11.5f, 14.721f)
                horizontalLineTo(8f)
                curveToRelative(-0.51f, 0f, -0.863f, -0.069f, -1.14f, -0.164f)
                curveToRelative(-0.281f, -0.097f, -0.506f, -0.228f, -0.776f, -0.393f)
                lineToRelative(-0.04f, -0.024f)
                curveToRelative(-0.555f, -0.339f, -1.198f, -0.731f, -2.49f, -0.868f)
                curveToRelative(-0.333f, -0.036f, -0.554f, -0.29f, -0.554f, -0.55f)
                verticalLineTo(8.72f)
                curveToRelative(0f, -0.254f, 0.226f, -0.543f, 0.62f, -0.65f)
                curveToRelative(1.095f, -0.3f, 1.977f, -0.996f, 2.614f, -1.708f)
                curveToRelative(0.635f, -0.71f, 1.064f, -1.475f, 1.238f, -1.978f)
                curveToRelative(0.243f, -0.7f, 0.407f, -1.768f, 0.482f, -2.85f)
                curveToRelative(0.025f, -0.362f, 0.36f, -0.594f, 0.667f, -0.518f)
                lineToRelative(0.262f, 0.066f)
                curveToRelative(0.16f, 0.04f, 0.258f, 0.143f, 0.288f, 0.255f)
                arcToRelative(8.34f, 8.34f, 0f, false, true, -0.145f, 4.725f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.595f, 0.644f)
                lineToRelative(0.003f, -0.001f)
                lineToRelative(0.014f, -0.003f)
                lineToRelative(0.058f, -0.014f)
                arcToRelative(9f, 9f, 0f, false, true, 1.036f, -0.157f)
                curveToRelative(0.663f, -0.06f, 1.457f, -0.054f, 2.11f, 0.164f)
                curveToRelative(0.175f, 0.058f, 0.45f, 0.3f, 0.57f, 0.65f)
                curveToRelative(0.107f, 0.308f, 0.087f, 0.67f, -0.266f, 1.022f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(0.353f, 0.354f)
                curveToRelative(0.043f, 0.043f, 0.105f, 0.141f, 0.154f, 0.315f)
                curveToRelative(0.048f, 0.167f, 0.075f, 0.37f, 0.075f, 0.581f)
                curveToRelative(0f, 0.212f, -0.027f, 0.414f, -0.075f, 0.582f)
                curveToRelative(-0.05f, 0.174f, -0.111f, 0.272f, -0.154f, 0.315f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(0.353f, 0.354f)
                curveToRelative(0.047f, 0.047f, 0.109f, 0.177f, 0.005f, 0.488f)
                arcToRelative(2.2f, 2.2f, 0f, false, true, -0.505f, 0.805f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(0.353f, 0.354f)
                curveToRelative(0.006f, 0.005f, 0.041f, 0.05f, 0.041f, 0.17f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.121f, 0.416f)
                curveToRelative(-0.165f, 0.288f, -0.503f, 0.56f, -1.066f, 0.56f)
                close()
            }
        }.build()
        
        return _HandThumbsUp!!
    }

private var _HandThumbsUp: ImageVector? = null

