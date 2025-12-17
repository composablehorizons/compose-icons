package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowLoopLeft2: ImageVector
    get() {
        if (_ArrowLoopLeft2 != null) return _ArrowLoopLeft2!!
        
        _ArrowLoopLeft2 = ImageVector.Builder(
            name = "arrow-loop-left-2",
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
                moveTo(13f, 21f)
                verticalLineToRelative(-6f)
                moveToRelative(0f, -6f)
                verticalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, true, true, 4f, 4f)
                horizontalLineToRelative(-13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _ArrowLoopLeft2!!
    }

private var _ArrowLoopLeft2: ImageVector? = null

