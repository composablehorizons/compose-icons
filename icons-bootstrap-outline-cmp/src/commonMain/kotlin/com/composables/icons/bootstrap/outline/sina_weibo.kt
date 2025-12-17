package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SinaWeibo: ImageVector
    get() {
        if (_SinaWeibo != null) return _SinaWeibo!!
        
        _SinaWeibo = ImageVector.Builder(
            name = "sina-weibo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.878f, 1.093f)
                arcToRelative(4.23f, 4.23f, 0f, false, true, 4.031f, 1.305f)
                arcToRelative(4.22f, 4.22f, 0f, false, true, 0.886f, 4.14f)
                verticalLineToRelative(0.001f)
                arcToRelative(0.612f, 0.612f, 0f, false, true, -1.166f, -0.377f)
                arcToRelative(3.01f, 3.01f, 0f, false, false, -3.495f, -3.873f)
                arcToRelative(0.611f, 0.611f, 0f, true, true, -0.256f, -1.196f)
                moveTo(3.753f, 9.465f)
                curveToRelative(0.548f, -1.11f, 1.972f, -1.74f, 3.233f, -1.411f)
                curveToRelative(1.304f, 0.338f, 1.971f, 1.568f, 1.437f, 2.764f)
                curveToRelative(-0.541f, 1.221f, -2.095f, 1.875f, -3.416f, 1.449f)
                curveToRelative(-1.271f, -0.411f, -1.812f, -1.67f, -1.254f, -2.802f)
                moveToRelative(2.658f, 0.567f)
                curveToRelative(0.16f, 0.066f, 0.365f, -0.009f, 0.458f, -0.168f)
                curveToRelative(0.088f, -0.16f, 0.03f, -0.34f, -0.129f, -0.397f)
                curveToRelative(-0.156f, -0.062f, -0.353f, 0.013f, -0.446f, 0.168f)
                curveToRelative(-0.09f, 0.154f, -0.041f, 0.333f, 0.117f, 0.397f)
                moveToRelative(-1.607f, 1.314f)
                curveToRelative(0.413f, 0.188f, 0.963f, 0.009f, 1.219f, -0.4f)
                curveToRelative(0.252f, -0.413f, 0.12f, -0.883f, -0.296f, -1.062f)
                curveToRelative(-0.41f, -0.172f, -0.94f, 0.005f, -1.194f, 0.402f)
                curveToRelative(-0.256f, 0.4f, -0.135f, 0.874f, 0.271f, 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.014f, 7.238f)
                lineToRelative(0.005f, 0.001f)
                curveToRelative(0.919f, 0.285f, 1.941f, 0.974f, 1.939f, 2.188f)
                curveToRelative(0f, 2.007f, -2.895f, 4.535f, -7.246f, 4.535f)
                curveTo(3.393f, 13.962f, 0f, 12.352f, 0f, 9.708f)
                curveToRelative(0f, -1.385f, 0.876f, -2.985f, 2.384f, -4.493f)
                curveTo(4.4f, 3.199f, 6.751f, 2.28f, 7.634f, 3.165f)
                curveToRelative(0.39f, 0.392f, 0.427f, 1.065f, 0.177f, 1.87f)
                curveToRelative(-0.132f, 0.405f, 0.38f, 0.182f, 0.38f, 0.182f)
                curveToRelative(1.63f, -0.682f, 3.051f, -0.722f, 3.57f, 0.02f)
                curveToRelative(0.278f, 0.397f, 0.252f, 0.951f, -0.004f, 1.594f)
                curveToRelative(-0.116f, 0.293f, 0.035f, 0.34f, 0.257f, 0.407f)
                moveToRelative(-10.4f, 3.101f)
                curveToRelative(0.172f, 1.738f, 2.46f, 2.936f, 5.109f, 2.674f)
                curveToRelative(2.647f, -0.26f, 4.656f, -1.883f, 4.482f, -3.623f)
                curveToRelative(-0.17f, -1.738f, -2.458f, -2.937f, -5.107f, -2.674f)
                curveToRelative(-2.647f, 0.263f, -4.656f, 1.883f, -4.484f, 3.623f)
                moveToRelative(11.681f, -6.484f)
                arcToRelative(2.06f, 2.06f, 0f, false, false, -1.962f, -0.634f)
                arcToRelative(0.526f, 0.526f, 0f, true, false, 0.219f, 1.031f)
                arcToRelative(1.008f, 1.008f, 0f, false, true, 1.17f, 1.296f)
                arcToRelative(0.528f, 0.528f, 0f, false, false, 1.005f, 0.325f)
                arcToRelative(2.06f, 2.06f, 0f, false, false, -0.432f, -2.018f)
            }
        }.build()
        
        return _SinaWeibo!!
    }

private var _SinaWeibo: ImageVector? = null

