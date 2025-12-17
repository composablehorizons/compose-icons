package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TargetOff: ImageVector
    get() {
        if (_TargetOff != null) return _TargetOff!!
        
        _TargetOff = ImageVector.Builder(
            name = "target-off",
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
                moveTo(11.286f, 11.3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.41f, 1.419f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.44f, 8.49f)
                arcToRelative(5f, 5f, 0f, false, false, 7.098f, 7.044f)
                moveToRelative(1.377f, -2.611f)
                arcToRelative(5f, 5f, 0f, false, false, -5.846f, -5.836f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.649f, 5.623f)
                arcToRelative(9f, 9f, 0f, true, false, 12.698f, 12.758f)
                moveToRelative(1.683f, -2.313f)
                arcToRelative(9f, 9f, 0f, false, false, -12.076f, -12.11f)
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
        
        return _TargetOff!!
    }

private var _TargetOff: ImageVector? = null

