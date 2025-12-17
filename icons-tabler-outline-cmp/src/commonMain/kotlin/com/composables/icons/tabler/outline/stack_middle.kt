package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.StackMiddle: ImageVector
    get() {
        if (_StackMiddle != null) return _StackMiddle!!
        
        _StackMiddle = ImageVector.Builder(
            name = "stack-middle",
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
                moveTo(16f, 10f)
                lineToRelative(4f, -2f)
                lineToRelative(-8f, -4f)
                lineToRelative(-8f, 4f)
                lineToRelative(4f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(-4f, -2f)
                lineToRelative(-4f, 2f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-4f, -2f)
                lineToRelative(-4f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                lineToRelative(-4f, 2f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-4f, -2f)
            }
        }.build()
        
        return _StackMiddle!!
    }

private var _StackMiddle: ImageVector? = null

