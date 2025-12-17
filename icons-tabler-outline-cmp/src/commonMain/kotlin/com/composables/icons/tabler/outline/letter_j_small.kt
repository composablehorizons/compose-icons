package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterJSmall: ImageVector
    get() {
        if (_LetterJSmall != null) return _LetterJSmall!!
        
        _LetterJSmall = ImageVector.Builder(
            name = "letter-j-small",
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
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
            }
        }.build()
        
        return _LetterJSmall!!
    }

private var _LetterJSmall: ImageVector? = null

