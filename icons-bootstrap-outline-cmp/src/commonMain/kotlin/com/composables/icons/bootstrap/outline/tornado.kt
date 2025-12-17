package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tornado: ImageVector
    get() {
        if (_Tornado != null) return _Tornado!!
        
        _Tornado = ImageVector.Builder(
            name = "tornado",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.125f, 2.45f)
                arcTo(0.9f, 0.9f, 0f, false, true, 1f, 2f)
                curveToRelative(0f, -0.26f, 0.116f, -0.474f, 0.258f, -0.634f)
                arcToRelative(1.9f, 1.9f, 0f, false, true, 0.513f, -0.389f)
                curveToRelative(0.387f, -0.21f, 0.913f, -0.385f, 1.52f, -0.525f)
                curveTo(4.514f, 0.17f, 6.18f, 0f, 8f, 0f)
                curveToRelative(1.821f, 0f, 3.486f, 0.17f, 4.709f, 0.452f)
                curveToRelative(0.607f, 0.14f, 1.133f, 0.314f, 1.52f, 0.525f)
                curveToRelative(0.193f, 0.106f, 0.374f, 0.233f, 0.513f, 0.389f)
                curveToRelative(0.141f, 0.16f, 0.258f, 0.374f, 0.258f, 0.634f)
                curveToRelative(0f, 1.011f, -0.35f, 1.612f, -0.634f, 2.102f)
                lineToRelative(-0.116f, 0.203f)
                arcToRelative(2.6f, 2.6f, 0f, false, false, -0.313f, 0.809f)
                arcToRelative(3f, 3f, 0f, false, false, -0.011f, 0.891f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.428f, 0.849f)
                quadToRelative(-0.091f, 0.09f, -0.215f, 0.195f)
                curveToRelative(0.204f, 1.116f, 0.088f, 1.99f, -0.3f, 2.711f)
                curveToRelative(-0.453f, 0.84f, -1.231f, 1.383f, -2.02f, 1.856f)
                quadToRelative(-0.307f, 0.183f, -0.62f, 0.364f)
                curveToRelative(-1.444f, 0.832f, -2.928f, 1.689f, -3.735f, 3.706f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.748f, 0.226f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(-0.004f, -0.003f)
                lineToRelative(-0.01f, -0.008f)
                arcToRelative(2f, 2f, 0f, false, true, -0.147f, -0.115f)
                arcToRelative(4.1f, 4.1f, 0f, false, true, -1.179f, -1.656f)
                arcToRelative(3.8f, 3.8f, 0f, false, true, -0.247f, -1.296f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 12.5f)
                verticalLineToRelative(-0.018f)
                lineToRelative(0.008f, -0.079f)
                arcToRelative(0.73f, 0.73f, 0f, false, true, 0.188f, -0.386f)
                curveToRelative(0.09f, -0.489f, 0.272f, -1.014f, 0.573f, -1.574f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.073f, -0.918f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, 0.617f, -0.144f)
                lineToRelative(0.15f, -0.193f)
                curveToRelative(0.285f, -0.356f, 0.404f, -0.639f, 0.437f, -0.861f)
                arcToRelative(0.95f, 0.95f, 0f, false, false, -0.122f, -0.619f)
                curveToRelative(-0.249f, -0.455f, -0.815f, -0.903f, -1.613f, -1.43f)
                quadToRelative(-0.291f, -0.19f, -0.609f, -0.394f)
                lineToRelative(-0.119f, -0.076f)
                arcToRelative(12f, 12f, 0f, false, true, -1.241f, -0.334f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.285f, -0.707f)
                lineToRelative(-0.23f, -0.18f)
                curveTo(2.117f, 4.01f, 1.463f, 3.32f, 1.125f, 2.45f)
                moveToRelative(1.973f, 1.051f)
                quadToRelative(0.17f, 0.156f, 0.358f, 0.308f)
                curveToRelative(0.472f, 0.381f, 0.99f, 0.722f, 1.515f, 1.06f)
                curveToRelative(1.54f, 0.317f, 3.632f, 0.5f, 5.43f, 0.14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.197f, 0.981f)
                curveToRelative(-1.216f, 0.244f, -2.537f, 0.26f, -3.759f, 0.157f)
                curveToRelative(0.399f, 0.326f, 0.744f, 0.682f, 0.963f, 1.081f)
                curveToRelative(0.203f, 0.373f, 0.302f, 0.79f, 0.233f, 1.247f)
                quadToRelative(-0.077f, 0.494f, -0.39f, 0.985f)
                lineToRelative(0.22f, 0.053f)
                lineToRelative(0.006f, 0.002f)
                curveToRelative(0.481f, 0.12f, 0.863f, 0.213f, 1.47f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.317f, 0.95f)
                curveToRelative(-0.888f, 0.295f, -1.505f, 0.141f, -2.023f, 0.012f)
                lineToRelative(-0.006f, -0.002f)
                arcToRelative(4f, 4f, 0f, false, false, -0.644f, -0.123f)
                curveToRelative(-0.37f, 0.55f, -0.598f, 1.05f, -0.726f, 1.497f)
                quadToRelative(0.212f, 0.068f, 0.465f, 0.194f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.448f, 0.894f)
                arcToRelative(3f, 3f, 0f, false, false, -0.148f, -0.07f)
                curveToRelative(0.012f, 0.345f, 0.084f, 0.643f, 0.18f, 0.895f)
                curveToRelative(0.14f, 0.369f, 0.342f, 0.666f, 0.528f, 0.886f)
                curveToRelative(0.992f, -1.903f, 2.583f, -2.814f, 3.885f, -3.56f)
                quadToRelative(0.305f, -0.173f, 0.584f, -0.34f)
                curveToRelative(0.775f, -0.464f, 1.34f, -0.89f, 1.653f, -1.472f)
                curveToRelative(0.212f, -0.393f, 0.33f, -0.9f, 0.26f, -1.617f)
                arcTo(6.74f, 6.74f, 0f, false, true, 10f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                arcToRelative(5.76f, 5.76f, 0f, false, false, 3.017f, -0.872f)
                lineToRelative(-0.007f, -0.03f)
                curveToRelative(-0.135f, -0.673f, -0.14f, -1.207f, -0.056f, -1.665f)
                curveToRelative(0.084f, -0.46f, 0.253f, -0.81f, 0.421f, -1.113f)
                lineToRelative(0.131f, -0.23f)
                quadToRelative(0.098f, -0.167f, 0.182f, -0.327f)
                curveToRelative(-0.29f, 0.107f, -0.62f, 0.202f, -0.98f, 0.285f)
                curveTo(11.487f, 3.83f, 9.822f, 4f, 8f, 4f)
                curveToRelative(-1.821f, 0f, -3.486f, -0.17f, -4.709f, -0.452f)
                quadToRelative(-0.098f, -0.022f, -0.193f, -0.047f)
                moveTo(13.964f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.214f, -0.145f)
                curveToRelative(-0.272f, -0.148f, -0.697f, -0.297f, -1.266f, -0.428f)
                curveTo(11.354f, 1.166f, 9.769f, 1f, 8f, 1f)
                reflectiveCurveToRelative(-3.354f, 0.166f, -4.484f, 0.427f)
                curveToRelative(-0.569f, 0.13f, -0.994f, 0.28f, -1.266f, 0.428f)
                arcTo(1f, 1f, 0f, false, false, 2.036f, 2f)
                quadToRelative(0.058f, 0.058f, 0.214f, 0.145f)
                curveToRelative(0.272f, 0.148f, 0.697f, 0.297f, 1.266f, 0.428f)
                curveTo(4.646f, 2.834f, 6.231f, 3f, 8f, 3f)
                reflectiveCurveToRelative(3.354f, -0.166f, 4.484f, -0.427f)
                curveToRelative(0.569f, -0.13f, 0.994f, -0.28f, 1.266f, -0.428f)
                arcTo(1f, 1f, 0f, false, false, 13.964f, 2f)
            }
        }.build()
        
        return _Tornado!!
    }

private var _Tornado: ImageVector? = null

