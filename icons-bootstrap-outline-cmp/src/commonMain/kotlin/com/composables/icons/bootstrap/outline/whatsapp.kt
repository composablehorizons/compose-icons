package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Whatsapp: ImageVector
    get() {
        if (_Whatsapp != null) return _Whatsapp!!
        
        _Whatsapp = ImageVector.Builder(
            name = "whatsapp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.601f, 2.326f)
                arcTo(7.85f, 7.85f, 0f, false, false, 7.994f, 0f)
                curveTo(3.627f, 0f, 0.068f, 3.558f, 0.064f, 7.926f)
                curveToRelative(0f, 1.399f, 0.366f, 2.76f, 1.057f, 3.965f)
                lineTo(0f, 16f)
                lineToRelative(4.204f, -1.102f)
                arcToRelative(7.9f, 7.9f, 0f, false, false, 3.79f, 0.965f)
                horizontalLineToRelative(0.004f)
                curveToRelative(4.368f, 0f, 7.926f, -3.558f, 7.93f, -7.93f)
                arcTo(7.9f, 7.9f, 0f, false, false, 13.6f, 2.326f)
                close()
                moveTo(7.994f, 14.521f)
                arcToRelative(6.6f, 6.6f, 0f, false, true, -3.356f, -0.92f)
                lineToRelative(-0.24f, -0.144f)
                lineToRelative(-2.494f, 0.654f)
                lineToRelative(0.666f, -2.433f)
                lineToRelative(-0.156f, -0.251f)
                arcToRelative(6.56f, 6.56f, 0f, false, true, -1.007f, -3.505f)
                curveToRelative(0f, -3.626f, 2.957f, -6.584f, 6.591f, -6.584f)
                arcToRelative(6.56f, 6.56f, 0f, false, true, 4.66f, 1.931f)
                arcToRelative(6.56f, 6.56f, 0f, false, true, 1.928f, 4.66f)
                curveToRelative(-0.004f, 3.639f, -2.961f, 6.592f, -6.592f, 6.592f)
                moveToRelative(3.615f, -4.934f)
                curveToRelative(-0.197f, -0.099f, -1.17f, -0.578f, -1.353f, -0.646f)
                curveToRelative(-0.182f, -0.065f, -0.315f, -0.099f, -0.445f, 0.099f)
                curveToRelative(-0.133f, 0.197f, -0.513f, 0.646f, -0.627f, 0.775f)
                curveToRelative(-0.114f, 0.133f, -0.232f, 0.148f, -0.43f, 0.05f)
                curveToRelative(-0.197f, -0.1f, -0.836f, -0.308f, -1.592f, -0.985f)
                curveToRelative(-0.59f, -0.525f, -0.985f, -1.175f, -1.103f, -1.372f)
                curveToRelative(-0.114f, -0.198f, -0.011f, -0.304f, 0.088f, -0.403f)
                curveToRelative(0.087f, -0.088f, 0.197f, -0.232f, 0.296f, -0.346f)
                curveToRelative(0.1f, -0.114f, 0.133f, -0.198f, 0.198f, -0.33f)
                curveToRelative(0.065f, -0.134f, 0.034f, -0.248f, -0.015f, -0.347f)
                curveToRelative(-0.05f, -0.099f, -0.445f, -1.076f, -0.612f, -1.47f)
                curveToRelative(-0.16f, -0.389f, -0.323f, -0.335f, -0.445f, -0.34f)
                curveToRelative(-0.114f, -0.007f, -0.247f, -0.007f, -0.38f, -0.007f)
                arcToRelative(0.73f, 0.73f, 0f, false, false, -0.529f, 0.247f)
                curveToRelative(-0.182f, 0.198f, -0.691f, 0.677f, -0.691f, 1.654f)
                reflectiveCurveToRelative(0.71f, 1.916f, 0.81f, 2.049f)
                curveToRelative(0.098f, 0.133f, 1.394f, 2.132f, 3.383f, 2.992f)
                curveToRelative(0.47f, 0.205f, 0.84f, 0.326f, 1.129f, 0.418f)
                curveToRelative(0.475f, 0.152f, 0.904f, 0.129f, 1.246f, 0.08f)
                curveToRelative(0.38f, -0.058f, 1.171f, -0.48f, 1.338f, -0.943f)
                curveToRelative(0.164f, -0.464f, 0.164f, -0.86f, 0.114f, -0.943f)
                curveToRelative(-0.049f, -0.084f, -0.182f, -0.133f, -0.38f, -0.232f)
            }
        }.build()
        
        return _Whatsapp!!
    }

private var _Whatsapp: ImageVector? = null

