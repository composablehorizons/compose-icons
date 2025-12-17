package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Tool: ImageVector
    get() {
        if (_Tool != null) return _Tool!!
        
        _Tool = ImageVector.Builder(
            name = "tool",
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
                moveTo(7f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(6f, 6f, 0f, false, true, 8f, 8f)
                lineToRelative(6f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, 3f)
                lineToRelative(-6f, -6f)
                arcToRelative(6f, 6f, 0f, false, true, -8f, -8f)
                lineToRelative(3.5f, 3.5f)
            }
        }.build()
        
        return _Tool!!
    }

private var _Tool: ImageVector? = null

