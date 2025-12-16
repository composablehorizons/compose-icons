package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
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
                moveTo(15f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(6f, -6f)
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

