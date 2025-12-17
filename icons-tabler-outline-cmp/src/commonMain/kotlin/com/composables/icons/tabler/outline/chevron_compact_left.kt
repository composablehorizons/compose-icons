package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChevronCompactLeft: ImageVector
    get() {
        if (_ChevronCompactLeft != null) return _ChevronCompactLeft!!
        
        _ChevronCompactLeft = ImageVector.Builder(
            name = "chevron-compact-left",
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
                moveTo(13f, 20f)
                lineToRelative(-3f, -8f)
                lineToRelative(3f, -8f)
            }
        }.build()
        
        return _ChevronCompactLeft!!
    }

private var _ChevronCompactLeft: ImageVector? = null

