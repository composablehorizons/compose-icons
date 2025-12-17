package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChevronCompactUp: ImageVector
    get() {
        if (_ChevronCompactUp != null) return _ChevronCompactUp!!
        
        _ChevronCompactUp = ImageVector.Builder(
            name = "chevron-compact-up",
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
                moveTo(4f, 13f)
                lineToRelative(8f, -3f)
                lineToRelative(8f, 3f)
            }
        }.build()
        
        return _ChevronCompactUp!!
    }

private var _ChevronCompactUp: ImageVector? = null

