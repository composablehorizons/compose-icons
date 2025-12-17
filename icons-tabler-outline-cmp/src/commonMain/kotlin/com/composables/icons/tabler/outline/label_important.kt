package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LabelImportant: ImageVector
    get() {
        if (_LabelImportant != null) return _LabelImportant!!
        
        _LabelImportant = ImageVector.Builder(
            name = "label-important",
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
                moveTo(16.52f, 7f)
                horizontalLineToRelative(-12.52f)
                lineToRelative(4f, 5f)
                lineToRelative(-4f, 5f)
                horizontalLineToRelative(12.52f)
                arcToRelative(1f, 1f, 0f, false, false, 0.78f, -0.375f)
                lineToRelative(3.7f, -4.625f)
                lineToRelative(-3.7f, -4.625f)
                arcToRelative(1f, 1f, 0f, false, false, -0.78f, -0.375f)
            }
        }.build()
        
        return _LabelImportant!!
    }

private var _LabelImportant: ImageVector? = null

