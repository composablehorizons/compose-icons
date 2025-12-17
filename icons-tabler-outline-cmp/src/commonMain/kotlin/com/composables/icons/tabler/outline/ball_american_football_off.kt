package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BallAmericanFootballOff: ImageVector
    get() {
        if (_BallAmericanFootballOff != null) return _BallAmericanFootballOff!!
        
        _BallAmericanFootballOff = ImageVector.Builder(
            name = "ball-american-football-off",
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
                moveTo(15f, 9f)
                lineToRelative(-1f, 1f)
                moveToRelative(-2f, 2f)
                lineToRelative(-3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.813f, 6.802f)
                arcToRelative(12.96f, 12.96f, 0f, false, false, -3.813f, 9.198f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                arcToRelative(12.96f, 12.96f, 0f, false, false, 9.186f, -3.801f)
                moveToRelative(1.789f, -2.227f)
                arcToRelative(12.94f, 12.94f, 0f, false, false, 2.025f, -6.972f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
                arcToRelative(12.94f, 12.94f, 0f, false, false, -6.967f, 2.022f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
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
        
        return _BallAmericanFootballOff!!
    }

private var _BallAmericanFootballOff: ImageVector? = null

