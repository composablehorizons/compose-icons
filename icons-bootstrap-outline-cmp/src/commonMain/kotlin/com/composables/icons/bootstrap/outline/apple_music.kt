package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AppleMusic: ImageVector
    get() {
        if (_AppleMusic != null) return _AppleMusic!!
        
        _AppleMusic = ImageVector.Builder(
            name = "apple-music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.995f, 0f)
                lineToRelative(0.573f, 0.001f)
                quadToRelative(0.241f, 0f, 0.483f, 0.007f)
                curveToRelative(0.35f, 0.01f, 0.705f, 0.03f, 1.051f, 0.093f)
                curveToRelative(0.352f, 0.063f, 0.68f, 0.166f, 0.999f, 0.329f)
                arcToRelative(3.36f, 3.36f, 0f, false, true, 1.47f, 1.468f)
                curveToRelative(0.162f, 0.32f, 0.265f, 0.648f, 0.328f, 1f)
                curveToRelative(0.063f, 0.347f, 0.084f, 0.7f, 0.093f, 1.051f)
                quadToRelative(0.007f, 0.241f, 0.007f, 0.483f)
                lineToRelative(0.001f, 0.573f)
                verticalLineToRelative(5.99f)
                lineToRelative(-0.001f, 0.573f)
                quadToRelative(0f, 0.241f, -0.008f, 0.483f)
                curveToRelative(-0.01f, 0.35f, -0.03f, 0.704f, -0.092f, 1.05f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -0.33f, 1f)
                arcToRelative(3.36f, 3.36f, 0f, false, true, -1.468f, 1.468f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -1f, 0.33f)
                arcToRelative(7f, 7f, 0f, false, true, -1.05f, 0.092f)
                quadToRelative(-0.241f, 0.007f, -0.483f, 0.008f)
                lineToRelative(-0.573f, 0.001f)
                horizontalLineToRelative(-5.99f)
                lineToRelative(-0.573f, -0.001f)
                quadToRelative(-0.241f, 0f, -0.483f, -0.008f)
                arcToRelative(7f, 7f, 0f, false, true, -1.052f, -0.092f)
                arcToRelative(3.6f, 3.6f, 0f, false, true, -0.998f, -0.33f)
                arcToRelative(3.36f, 3.36f, 0f, false, true, -1.47f, -1.468f)
                arcToRelative(3.6f, 3.6f, 0f, false, true, -0.328f, -1f)
                arcToRelative(7f, 7f, 0f, false, true, -0.093f, -1.05f)
                quadTo(0.002f, 11.81f, 0f, 11.568f)
                verticalLineTo(5.005f)
                lineToRelative(0.001f, -0.573f)
                quadToRelative(0f, -0.241f, 0.007f, -0.483f)
                curveToRelative(0.01f, -0.35f, 0.03f, -0.704f, 0.093f, -1.05f)
                arcToRelative(3.6f, 3.6f, 0f, false, true, 0.329f, -1f)
                arcTo(3.36f, 3.36f, 0f, false, true, 1.9f, 0.431f)
                arcTo(3.5f, 3.5f, 0f, false, true, 2.896f, 0.1f)
                arcTo(7f, 7f, 0f, false, true, 3.95f, 0.008f)
                quadTo(4.19f, 0.002f, 4.432f, 0f)
                horizontalLineToRelative(0.573f)
                close()
                moveToRelative(-0.107f, 2.518f)
                lineToRelative(-4.756f, 0.959f)
                horizontalLineTo(6.13f)
                arcToRelative(0.66f, 0.66f, 0f, false, false, -0.296f, 0.133f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.16f, 0.31f)
                curveToRelative(-0.004f, 0.027f, -0.01f, 0.08f, -0.01f, 0.16f)
                verticalLineToRelative(5.952f)
                curveToRelative(0f, 0.14f, -0.012f, 0.275f, -0.106f, 0.39f)
                curveToRelative(-0.095f, 0.115f, -0.21f, 0.15f, -0.347f, 0.177f)
                lineToRelative(-0.31f, 0.063f)
                curveToRelative(-0.393f, 0.08f, -0.65f, 0.133f, -0.881f, 0.223f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.519f, 0.333f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -0.332f, 0.995f)
                curveToRelative(0.031f, 0.297f, 0.166f, 0.582f, 0.395f, 0.792f)
                curveToRelative(0.156f, 0.142f, 0.35f, 0.25f, 0.578f, 0.296f)
                curveToRelative(0.236f, 0.047f, 0.49f, 0.031f, 0.858f, -0.043f)
                curveToRelative(0.196f, -0.04f, 0.38f, -0.102f, 0.555f, -0.205f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.438f, -0.405f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.233f, -0.55f)
                curveToRelative(0.042f, -0.202f, 0.052f, -0.386f, 0.052f, -0.588f)
                verticalLineTo(6.347f)
                curveToRelative(0f, -0.276f, 0.08f, -0.35f, 0.302f, -0.404f)
                curveToRelative(0.024f, -0.005f, 3.954f, -0.797f, 4.138f, -0.833f)
                curveToRelative(0.257f, -0.049f, 0.378f, 0.025f, 0.378f, 0.294f)
                verticalLineToRelative(3.524f)
                curveToRelative(0f, 0.14f, -0.001f, 0.28f, -0.096f, 0.396f)
                curveToRelative(-0.094f, 0.115f, -0.211f, 0.15f, -0.348f, 0.178f)
                lineToRelative(-0.31f, 0.062f)
                curveToRelative(-0.393f, 0.08f, -0.649f, 0.133f, -0.88f, 0.223f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.52f, 0.334f)
                arcToRelative(1.26f, 1.26f, 0f, false, false, -0.34f, 0.994f)
                curveToRelative(0.03f, 0.297f, 0.174f, 0.582f, 0.404f, 0.792f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0.577f, 0.294f)
                curveToRelative(0.237f, 0.048f, 0.49f, 0.03f, 0.858f, -0.044f)
                curveToRelative(0.197f, -0.04f, 0.381f, -0.098f, 0.556f, -0.202f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, 0.438f, -0.405f)
                quadToRelative(0.173f, -0.252f, 0.233f, -0.549f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, 0.044f, -0.589f)
                verticalLineTo(2.865f)
                curveToRelative(0f, -0.273f, -0.143f, -0.443f, -0.4f, -0.42f)
                curveToRelative(-0.04f, 0.003f, -0.383f, 0.064f, -0.424f, 0.073f)
            }
        }.build()
        
        return _AppleMusic!!
    }

private var _AppleMusic: ImageVector? = null

