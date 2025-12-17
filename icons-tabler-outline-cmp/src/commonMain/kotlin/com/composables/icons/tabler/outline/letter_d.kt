package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterD: ImageVector
    get() {
        if (_LetterD != null) return _LetterD!!
        
        _LetterD = ImageVector.Builder(
            name = "letter-d",
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
                moveTo(7f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-16f)
            }
        }.build()
        
        return _LetterD!!
    }

private var _LetterD: ImageVector? = null

