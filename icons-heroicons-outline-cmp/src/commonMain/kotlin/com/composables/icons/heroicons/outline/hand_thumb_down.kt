package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.HandThumbDown: ImageVector
    get() {
        if (_HandThumbDown != null) return _HandThumbDown!!
        
        _HandThumbDown = ImageVector.Builder(
            name = "hand-thumb-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(7.498f, 15.25f)
                horizontalLineTo(4.372f)
                curveToRelative(-1.026f, 0f, -1.945f, -0.694f, -2.054f, -1.715f)
                arcToRelative(12.137f, 12.137f, 0f, false, true, -0.068f, -1.285f)
                curveToRelative(0f, -2.848f, 0.992f, -5.464f, 2.649f, -7.521f)
                curveTo(5.287f, 4.247f, 5.886f, 4f, 6.504f, 4f)
                horizontalLineToRelative(4.016f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.423f, 0.23f)
                lineToRelative(3.114f, 1.04f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 1.423f, 0.23f)
                horizontalLineToRelative(1.294f)
                moveTo(7.498f, 15.25f)
                curveToRelative(0.618f, 0f, 0.991f, 0.724f, 0.725f, 1.282f)
                arcTo(7.471f, 7.471f, 0f, false, false, 7.5f, 19.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.75f, 22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.633f)
                curveToRelative(0f, -0.573f, 0.11f, -1.14f, 0.322f, -1.672f)
                curveToRelative(0.304f, -0.76f, 0.93f, -1.33f, 1.653f, -1.715f)
                arcToRelative(9.04f, 9.04f, 0f, false, false, 2.86f, -2.4f)
                curveToRelative(0.498f, -0.634f, 1.226f, -1.08f, 2.032f, -1.08f)
                horizontalLineToRelative(0.384f)
                moveToRelative(-10.253f, 1.5f)
                horizontalLineTo(9.7f)
                moveToRelative(8.075f, -9.75f)
                curveToRelative(0.01f, 0.05f, 0.027f, 0.1f, 0.05f, 0.148f)
                curveToRelative(0.593f, 1.2f, 0.925f, 2.55f, 0.925f, 3.977f)
                curveToRelative(0f, 1.487f, -0.36f, 2.89f, -0.999f, 4.125f)
                moveToRelative(0.023f, -8.25f)
                curveToRelative(-0.076f, -0.365f, 0.183f, -0.75f, 0.575f, -0.75f)
                horizontalLineToRelative(0.908f)
                curveToRelative(0.889f, 0f, 1.713f, 0.518f, 1.972f, 1.368f)
                curveToRelative(0.339f, 1.11f, 0.521f, 2.287f, 0.521f, 3.507f)
                curveToRelative(0f, 1.553f, -0.295f, 3.036f, -0.831f, 4.398f)
                curveToRelative(-0.306f, 0.774f, -1.086f, 1.227f, -1.918f, 1.227f)
                horizontalLineToRelative(-1.053f)
                curveToRelative(-0.472f, 0f, -0.745f, -0.556f, -0.5f, -0.96f)
                arcToRelative(8.95f, 8.95f, 0f, false, false, 0.303f, -0.54f)
            }
        }.build()
        
        return _HandThumbDown!!
    }

private var _HandThumbDown: ImageVector? = null

