package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterMSmall: ImageVector
    get() {
        if (_LetterMSmall != null) return _LetterMSmall!!
        
        _LetterMSmall = ImageVector.Builder(
            name = "letter-m-small",
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
                moveTo(9f, 16f)
                verticalLineToRelative(-8f)
                lineToRelative(3f, 5f)
                lineToRelative(3f, -5f)
                verticalLineToRelative(8f)
            }
        }.build()
        
        return _LetterMSmall!!
    }

private var _LetterMSmall: ImageVector? = null

