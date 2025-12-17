package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MeatOff: ImageVector
    get() {
        if (_MeatOff != null) return _MeatOff!!
        
        _MeatOff = ImageVector.Builder(
            name = "meat-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.62f, 8.382f)
                lineToRelative(1.966f, -1.967f)
                arcToRelative(2f, 2f, 0f, true, true, 3.414f, -1.415f)
                arcToRelative(2f, 2f, 0f, true, true, -1.413f, 3.414f)
                lineToRelative(-1.82f, 1.821f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.904f, 18.596f)
                curveToRelative(2.733f, 2.734f, 5.9f, 4f, 7.07f, 2.829f)
                curveToRelative(1.172f, -1.172f, -0.094f, -4.338f, -2.828f, -7.071f)
                curveToRelative(-2.733f, -2.734f, -5.9f, -4f, -7.07f, -2.829f)
                curveToRelative(-1.172f, 1.172f, 0.094f, 4.338f, 2.828f, 7.071f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 16f)
                lineToRelative(1f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.975f, 21.425f)
                curveToRelative(1.582f, -1.582f, 2.679f, -3.407f, 3.242f, -5.2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.6f, 12.6f)
                curveToRelative(-0.16f, -1.238f, -0.653f, -2.345f, -1.504f, -3.195f)
                curveToRelative(-0.85f, -0.85f, -1.955f, -1.344f, -3.192f, -1.503f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.274f, 8.284f)
                curveToRelative(-1.792f, 0.563f, -3.616f, 1.66f, -5.198f, 3.242f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _MeatOff!!
    }

private var _MeatOff: ImageVector? = null

