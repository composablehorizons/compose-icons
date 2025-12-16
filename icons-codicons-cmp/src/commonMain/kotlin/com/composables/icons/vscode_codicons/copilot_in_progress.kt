package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CopilotInProgress: ImageVector
    get() {
        if (_CopilotInProgress != null) return _CopilotInProgress!!
        
        _CopilotInProgress = ImageVector.Builder(
            name = "copilot-in-progress",
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
                curveTo(0f, 11.24f, 0.0859982f, 11.438f, 0.155998f, 11.567f)
                curveTo(0.230998f, 11.704f, 0.325001f, 11.828f, 0.415001f, 11.933f)
                curveTo(0.595001f, 12.143f, 0.819f, 12.346f, 1.02f, 12.513f)
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
                moveTo(13.621f, 13.371f)
                curveTo(13.336f, 13.656f, 12.997f, 13.88f, 12.623f, 14.031f)
                curveTo(12.25f, 14.182f, 11.85f, 14.256f, 11.447f, 14.249f)
                curveTo(11.044f, 14.242f, 10.647f, 14.154f, 10.279f, 13.99f)
                curveTo(10.183f, 13.947f, 10.09f, 13.9f, 9.999f, 13.847f)
                verticalLineTo(13.999f)
                curveTo(9.999f, 14.275f, 9.775f, 14.499f, 9.499f, 14.499f)
                curveTo(9.223f, 14.499f, 8.999f, 14.275f, 8.999f, 13.999f)
                verticalLineTo(12.499f)
                curveTo(8.999f, 12.223f, 9.223f, 11.999f, 9.499f, 11.999f)
                horizontalLineTo(10.999f)
                curveTo(11.275f, 11.999f, 11.499f, 12.223f, 11.499f, 12.499f)
                curveTo(11.499f, 12.775f, 11.275f, 12.999f, 10.999f, 12.999f)
                horizontalLineTo(10.531f)
                curveTo(10.581f, 13.027f, 10.633f, 13.053f, 10.686f, 13.076f)
                curveTo(10.931f, 13.185f, 11.196f, 13.244f, 11.465f, 13.249f)
                curveTo(11.733f, 13.254f, 12f, 13.204f, 12.249f, 13.104f)
                curveTo(12.498f, 13.004f, 12.724f, 12.854f, 12.914f, 12.664f)
                curveTo(13.109f, 12.469f, 13.426f, 12.469f, 13.621f, 12.664f)
                curveTo(13.816f, 12.859f, 13.816f, 13.176f, 13.621f, 13.371f)
                close()
                moveTo(14f, 10.5f)
                curveTo(14f, 10.776f, 13.776f, 11f, 13.5f, 11f)
                horizontalLineTo(12f)
                curveTo(11.724f, 11f, 11.5f, 10.776f, 11.5f, 10.5f)
                curveTo(11.5f, 10.224f, 11.724f, 10f, 12f, 10f)
                horizontalLineTo(12.468f)
                curveTo(12.418f, 9.972f, 12.366f, 9.946f, 12.313f, 9.923f)
                curveTo(12.068f, 9.814f, 11.803f, 9.755f, 11.534f, 9.75f)
                curveTo(11.266f, 9.745f, 10.999f, 9.795f, 10.75f, 9.895f)
                curveTo(10.501f, 9.995f, 10.275f, 10.145f, 10.085f, 10.335f)
                curveTo(9.89f, 10.53f, 9.573f, 10.53f, 9.378f, 10.335f)
                curveTo(9.183f, 10.14f, 9.183f, 9.823f, 9.378f, 9.628f)
                curveTo(9.663f, 9.343f, 10.002f, 9.119f, 10.376f, 8.968f)
                curveTo(10.749f, 8.817f, 11.149f, 8.743f, 11.552f, 8.75f)
                curveTo(11.955f, 8.757f, 12.352f, 8.845f, 12.72f, 9.009f)
                curveTo(12.816f, 9.052f, 12.909f, 9.099f, 13f, 9.152f)
                verticalLineTo(9f)
                curveTo(13f, 8.724f, 13.224f, 8.5f, 13.5f, 8.5f)
                curveTo(13.776f, 8.5f, 14f, 8.724f, 14f, 9f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _CopilotInProgress!!
    }

private var _CopilotInProgress: ImageVector? = null

