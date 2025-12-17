package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
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
                moveTo(6.827f, 6.175f)
                arcTo(2.31f, 2.31f, 0f, false, true, 5.186f, 7.23f)
                curveToRelative(-0.38f, 0.054f, -0.757f, 0.112f, -1.134f, 0.175f)
                curveTo(2.999f, 7.58f, 2.25f, 8.507f, 2.25f, 9.574f)
                verticalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(15f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21.75f, 18f)
                verticalLineTo(9.574f)
                curveToRelative(0f, -1.067f, -0.75f, -1.994f, -1.802f, -2.169f)
                arcToRelative(47.865f, 47.865f, 0f, false, false, -1.134f, -0.175f)
                arcToRelative(2.31f, 2.31f, 0f, false, true, -1.64f, -1.055f)
                lineToRelative(-0.822f, -1.316f)
                arcToRelative(2.192f, 2.192f, 0f, false, false, -1.736f, -1.039f)
                arcToRelative(48.774f, 48.774f, 0f, false, false, -5.232f, 0f)
                arcToRelative(2.192f, 2.192f, 0f, false, false, -1.736f, 1.039f)
                lineToRelative(-0.821f, 1.316f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(16.5f, 12.75f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 9f, 0f)
                close()
                moveTo(18.75f, 10.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

