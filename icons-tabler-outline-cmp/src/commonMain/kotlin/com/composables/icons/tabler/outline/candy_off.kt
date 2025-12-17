package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CandyOff: ImageVector
    get() {
        if (_CandyOff != null) return _CandyOff!!
        
        _CandyOff = ImageVector.Builder(
            name = "candy-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.174f, 7.17f)
                lineToRelative(0.119f, -0.12f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 0f)
                lineToRelative(2.829f, 2.83f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                lineToRelative(-0.124f, 0.124f)
                moveToRelative(-2f, 2f)
                lineToRelative(-2.123f, 2.123f)
                arcToRelative(2f, 2f, 0f, false, true, -2.828f, 0f)
                lineToRelative(-2.829f, -2.831f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                lineToRelative(2.113f, -2.112f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.243f, 9.172f)
                lineToRelative(3.086f, -0.772f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.697f, -2.516f)
                lineToRelative(-2.216f, -2.217f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.44f, 0.47f)
                lineToRelative(-1.248f, 2.913f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.172f, 16.243f)
                lineToRelative(-0.772f, 3.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.516f, 0.697f)
                lineToRelative(-2.217f, -2.216f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.47f, -2.44f)
                lineToRelative(2.913f, -1.248f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _CandyOff!!
    }

private var _CandyOff: ImageVector? = null

