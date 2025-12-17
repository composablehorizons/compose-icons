package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterW: ImageVector
    get() {
        if (_LetterW != null) return _LetterW!!
        
        _LetterW = ImageVector.Builder(
            name = "letter-w",
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
                moveTo(4f, 4f)
                lineToRelative(4f, 16f)
                lineToRelative(4f, -14f)
                lineToRelative(4f, 14f)
                lineToRelative(4f, -16f)
            }
        }.build()
        
        return _LetterW!!
    }

private var _LetterW: ImageVector? = null

