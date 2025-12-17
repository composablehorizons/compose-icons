package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TestPipeOff: ImageVector
    get() {
        if (_TestPipeOff != null) return _TestPipeOff!!
        
        _TestPipeOff = ImageVector.Builder(
            name = "test-pipe-off",
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
                moveTo(20f, 8.04f)
                arcToRelative(803.533f, 803.533f, 0f, false, false, -4f, 3.96f)
                moveToRelative(-2f, 2f)
                curveToRelative(-1.085f, 1.085f, -3.125f, 3.14f, -6.122f, 6.164f)
                arcToRelative(2.857f, 2.857f, 0f, false, true, -4.041f, -4.04f)
                curveToRelative(3.018f, -3f, 5.073f, -5.037f, 6.163f, -6.124f)
                moveToRelative(2f, -2f)
                curveToRelative(0.872f, -0.872f, 2.191f, -2.205f, 3.959f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 15f)
                lineToRelative(1.5f, 1.6f)
                moveToRelative(-0.74f, 3.173f)
                arcToRelative(2f, 2f, 0f, false, true, -2.612f, -2.608f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                lineToRelative(6f, 6f)
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
        
        return _TestPipeOff!!
    }

private var _TestPipeOff: ImageVector? = null

