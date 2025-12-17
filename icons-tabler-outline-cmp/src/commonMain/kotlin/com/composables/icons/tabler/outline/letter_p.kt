package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterP: ImageVector
    get() {
        if (_LetterP != null) return _LetterP!!
        
        _LetterP = ImageVector.Builder(
            name = "letter-p",
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
                moveTo(7f, 20f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(5.5f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 9f)
                horizontalLineToRelative(-5.5f)
            }
        }.build()
        
        return _LetterP!!
    }

private var _LetterP: ImageVector? = null

