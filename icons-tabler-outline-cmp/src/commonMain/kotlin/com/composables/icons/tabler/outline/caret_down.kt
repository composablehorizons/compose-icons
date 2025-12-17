package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) return _CaretDown!!
        
        _CaretDown = ImageVector.Builder(
            name = "caret-down",
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
                moveTo(6f, 10f)
                lineToRelative(6f, 6f)
                lineToRelative(6f, -6f)
                horizontalLineToRelative(-12f)
            }
        }.build()
        
        return _CaretDown!!
    }

private var _CaretDown: ImageVector? = null

