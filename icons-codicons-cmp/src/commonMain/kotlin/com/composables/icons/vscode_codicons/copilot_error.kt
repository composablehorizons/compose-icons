package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CopilotError: ImageVector
    get() {
        if (_CopilotError != null) return _CopilotError!!
        
        _CopilotError = ImageVector.Builder(
            name = "copilot-error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.199f, 12.684f)
                curveTo(3.715f, 12.479f, 3.329f, 12.274f, 3.065f, 12.123f)
                lineTo(3f, 12.085f)
                verticalLineTo(7.824f)
                lineTo(3.023f, 7.709f)
                curveTo(3.513f, 7.919f, 4.098f, 8f, 4.75f, 8f)
                curveTo(5.896f, 8f, 6.81f, 7.672f, 7.46f, 7.009f)
                curveTo(7.679f, 6.785f, 7.857f, 6.535f, 8f, 6.266f)
                curveTo(8.047f, 6.354f, 8.104f, 6.436f, 8.158f, 6.52f)
                curveTo(8.577f, 6.238f, 9.036f, 6.013f, 9.52f, 5.843f)
                curveTo(9.258f, 5.52f, 9.075f, 5.057f, 8.994f, 4.407f)
                curveTo(8.877f, 3.471f, 9.032f, 3.011f, 9.236f, 2.793f)
                curveTo(9.429f, 2.586f, 9.873f, 2.379f, 10.917f, 2.495f)
                curveTo(11.937f, 2.608f, 12.396f, 2.899f, 12.63f, 3.195f)
                curveTo(12.877f, 3.508f, 13f, 3.984f, 13f, 4.75f)
                curveTo(13f, 5.158f, 12.965f, 5.453f, 12.907f, 5.674f)
                curveTo(13.396f, 5.792f, 13.863f, 5.967f, 14.298f, 6.197f)
                curveTo(14.441f, 5.741f, 14.5f, 5.248f, 14.5f, 4.75f)
                curveTo(14.5f, 3.879f, 14.372f, 2.981f, 13.807f, 2.265f)
                curveTo(13.228f, 1.532f, 12.313f, 1.141f, 11.083f, 1.004f)
                curveTo(9.877f, 0.870002f, 8.821f, 1.038f, 8.139f, 1.769f)
                curveTo(8.09f, 1.822f, 8.043f, 1.877f, 8f, 1.933f)
                curveTo(7.957f, 1.877f, 7.91f, 1.822f, 7.861f, 1.769f)
                curveTo(7.179f, 1.038f, 6.123f, 0.870002f, 4.917f, 1.004f)
                curveTo(3.687f, 1.141f, 2.772f, 1.532f, 2.193f, 2.265f)
                curveTo(1.628f, 2.981f, 1.5f, 3.879f, 1.5f, 4.75f)
                curveTo(1.5f, 5.322f, 1.553f, 5.897f, 1.754f, 6.405f)
                lineTo(1.586f, 7.243f)
                lineTo(1.52f, 7.276f)
                curveTo(0.588f, 7.742f, 0f, 8.694f, 0f, 9.736f)
                verticalLineTo(11f)
                curveTo(0f, 11.24f, 0.086f, 11.438f, 0.156f, 11.567f)
                curveTo(0.231f, 11.704f, 0.325f, 11.828f, 0.415f, 11.933f)
                curveTo(0.595f, 12.143f, 0.819f, 12.346f, 1.02f, 12.513f)
                curveTo(1.225f, 12.684f, 1.427f, 12.836f, 1.577f, 12.943f)
                curveTo(1.816f, 13.116f, 2.062f, 13.275f, 2.318f, 13.423f)
                curveTo(2.625f, 13.6f, 3.066f, 13.832f, 3.614f, 14.065f)
                curveTo(4.391f, 14.395f, 5.404f, 14.722f, 6.553f, 14.887f)
                curveTo(6.203f, 14.377f, 5.931f, 13.809f, 5.751f, 13.202f)
                curveTo(5.173f, 13.055f, 4.645f, 12.873f, 4.201f, 12.684f)
                horizontalLineTo(4.199f)
                close()
                moveTo(3.37f, 3.195f)
                curveTo(3.604f, 2.899f, 4.063f, 2.609f, 5.083f, 2.495f)
                curveTo(6.127f, 2.379f, 6.571f, 2.586f, 6.764f, 2.793f)
                curveTo(6.968f, 3.011f, 7.123f, 3.471f, 7.006f, 4.407f)
                curveTo(6.915f, 5.133f, 6.704f, 5.637f, 6.388f, 5.959f)
                curveTo(6.089f, 6.264f, 5.604f, 6.5f, 4.75f, 6.5f)
                curveTo(3.828f, 6.5f, 3.47f, 6.301f, 3.308f, 6.12f)
                curveTo(3.129f, 5.92f, 3f, 5.542f, 3f, 4.75f)
                curveTo(3f, 3.984f, 3.123f, 3.508f, 3.37f, 3.195f)
                close()
                moveTo(11.5f, 7f)
                curveTo(9.015f, 7f, 7f, 9.015f, 7f, 11.5f)
                curveTo(7f, 13.985f, 9.015f, 16f, 11.5f, 16f)
                curveTo(13.985f, 16f, 16f, 13.985f, 16f, 11.5f)
                curveTo(16f, 9.015f, 13.985f, 7f, 11.5f, 7f)
                close()
                moveTo(13.502f, 12.794f)
                curveTo(13.697f, 12.989f, 13.697f, 13.306f, 13.502f, 13.501f)
                curveTo(13.307f, 13.696f, 12.99f, 13.696f, 12.795f, 13.501f)
                lineTo(11.501f, 12.207f)
                lineTo(10.207f, 13.501f)
                curveTo(10.012f, 13.696f, 9.695f, 13.696f, 9.5f, 13.501f)
                curveTo(9.305f, 13.306f, 9.305f, 12.989f, 9.5f, 12.794f)
                lineTo(10.794f, 11.5f)
                lineTo(9.5f, 10.206f)
                curveTo(9.305f, 10.011f, 9.305f, 9.694f, 9.5f, 9.499f)
                curveTo(9.695f, 9.304f, 10.012f, 9.304f, 10.207f, 9.499f)
                lineTo(11.501f, 10.793f)
                lineTo(12.795f, 9.499f)
                curveTo(12.99f, 9.304f, 13.307f, 9.304f, 13.502f, 9.499f)
                curveTo(13.697f, 9.694f, 13.697f, 10.011f, 13.502f, 10.206f)
                lineTo(12.208f, 11.5f)
                lineTo(13.502f, 12.794f)
                close()
            }
        }.build()
        
        return _CopilotError!!
    }

private var _CopilotError: ImageVector? = null

