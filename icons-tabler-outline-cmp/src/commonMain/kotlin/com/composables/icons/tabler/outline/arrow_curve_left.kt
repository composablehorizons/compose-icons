package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowCurveLeft: ImageVector
    get() {
        if (_ArrowCurveLeft != null) return _ArrowCurveLeft!!
        
        _ArrowCurveLeft = ImageVector.Builder(
            name = "arrow-curve-left",
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
                moveTo(14f, 7f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 3f)
                verticalLineToRelative(4.394f)
                arcToRelative(6.737f, 6.737f, 0f, false, false, 3f, 5.606f)
                arcToRelative(6.737f, 6.737f, 0f, false, true, 3f, 5.606f)
                verticalLineToRelative(2.394f)
            }
        }.build()
        
        return _ArrowCurveLeft!!
    }

private var _ArrowCurveLeft: ImageVector? = null

