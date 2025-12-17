package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterS: ImageVector
    get() {
        if (_LetterS != null) return _LetterS!!
        
        _LetterS = ImageVector.Builder(
            name = "letter-s",
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
                moveTo(17f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 8f)
                horizontalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
            }
        }.build()
        
        return _LetterS!!
    }

private var _LetterS: ImageVector? = null

