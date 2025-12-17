package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HistoryToggle: ImageVector
    get() {
        if (_HistoryToggle != null) return _HistoryToggle!!
        
        _HistoryToggle = ImageVector.Builder(
            name = "history-toggle",
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
                moveTo(10f, 20.777f)
                arcToRelative(8.942f, 8.942f, 0f, false, true, -2.48f, -0.969f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 3.223f)
                arcToRelative(9.003f, 9.003f, 0f, false, true, 0f, 17.554f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.579f, 17.093f)
                arcToRelative(8.961f, 8.961f, 0f, false, true, -1.227f, -2.592f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.124f, 10.5f)
                curveToRelative(0.16f, -0.95f, 0.468f, -1.85f, 0.9f, -2.675f)
                lineToRelative(0.169f, -0.305f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.907f, 4.579f)
                arcToRelative(8.954f, 8.954f, 0f, false, true, 3.093f, -1.356f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineToRelative(4f)
                lineToRelative(3f, 3f)
            }
        }.build()
        
        return _HistoryToggle!!
    }

private var _HistoryToggle: ImageVector? = null

