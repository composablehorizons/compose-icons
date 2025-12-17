package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CoinOff: ImageVector
    get() {
        if (_CoinOff != null) return _CoinOff!!
        
        _CoinOff = ImageVector.Builder(
            name = "coin-off",
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
                moveTo(14.8f, 9f)
                arcToRelative(2f, 2f, 0f, false, false, -1.8f, -1f)
                horizontalLineToRelative(-1f)
                moveToRelative(-2.82f, 1.171f)
                arcToRelative(2f, 2f, 0f, false, false, 1.82f, 2.829f)
                horizontalLineToRelative(1f)
                moveToRelative(2.824f, 2.822f)
                arcToRelative(2f, 2f, 0f, false, true, -1.824f, 1.178f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.8f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.042f, 16.045f)
                arcToRelative(9f, 9f, 0f, false, false, -12.087f, -12.087f)
                moveToRelative(-2.318f, 1.677f)
                arcToRelative(9f, 9f, 0f, true, false, 12.725f, 12.73f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 8f)
                verticalLineToRelative(2f)
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
        
        return _CoinOff!!
    }

private var _CoinOff: ImageVector? = null

