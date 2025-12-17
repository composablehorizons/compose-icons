package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HistoryOff: ImageVector
    get() {
        if (_HistoryOff != null) return _HistoryOff!!
        
        _HistoryOff = ImageVector.Builder(
            name = "history-off",
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
                moveTo(3.05f, 11f)
                arcToRelative(8.975f, 8.975f, 0f, false, true, 2.54f, -5.403f)
                moveToRelative(2.314f, -1.697f)
                arcToRelative(9f, 9f, 0f, false, true, 12.113f, 12.112f)
                moveToRelative(-1.695f, 2.312f)
                arcToRelative(9f, 9f, 0f, false, true, -14.772f, -3.324f)
                moveToRelative(-0.5f, 5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
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
        
        return _HistoryOff!!
    }

private var _HistoryOff: ImageVector? = null

