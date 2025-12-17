package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RubberStampOff: ImageVector
    get() {
        if (_RubberStampOff != null) return _RubberStampOff!!
        
        _RubberStampOff = ImageVector.Builder(
            name = "rubber-stamp-off",
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
                moveTo(8.273f, 8.273f)
                curveToRelative(0.805f, 2.341f, 2.857f, 5.527f, -1.484f, 5.527f)
                curveToRelative(-2.368f, 0f, -3.789f, 0f, -3.789f, 4.05f)
                horizontalLineToRelative(14.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
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
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.712f, 4.722f)
                arcToRelative(3.99f, 3.99f, 0f, false, true, 3.288f, -1.722f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                curveToRelative(0f, 0.992f, -0.806f, 2.464f, -1.223f, 3.785f)
                moveToRelative(6.198f, 6.196f)
                curveToRelative(-0.182f, -2.883f, -1.332f, -3.153f, -3.172f, -3.178f)
            }
        }.build()
        
        return _RubberStampOff!!
    }

private var _RubberStampOff: ImageVector? = null

