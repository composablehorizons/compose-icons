package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MasksTheaterOff: ImageVector
    get() {
        if (_MasksTheaterOff != null) return _MasksTheaterOff!!
        
        _MasksTheaterOff = ImageVector.Builder(
            name = "masks-theater-off",
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
                moveTo(13f, 9f)
                curveToRelative(0.058f, 0f, 0.133f, 0f, 0.192f, 0f)
                horizontalLineToRelative(6.616f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, 2.183f)
                lineToRelative(-0.554f, 6.041f)
                moveToRelative(-1.286f, 2.718f)
                arcToRelative(3.99f, 3.99f, 0f, false, true, -2.71f, 1.058f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 16.5f)
                curveToRelative(0.657f, 0.438f, 1.313f, 0.588f, 1.97f, 0.451f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.632f, 15.982f)
                arcToRelative(4.05f, 4.05f, 0f, false, true, -0.382f, 0.018f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
                arcToRelative(2f, 2f, 0f, false, true, 0.514f, -1.531f)
                arcToRelative(1.99f, 1.99f, 0f, false, true, 1.286f, -0.652f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2.808f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveToRelative(0.764f, -0.51f, 1.528f, -0.63f, 2.291f, -0.36f)
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
        
        return _MasksTheaterOff!!
    }

private var _MasksTheaterOff: ImageVector? = null

