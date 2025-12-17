package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LetterC: ImageVector
    get() {
        if (_LetterC != null) return _LetterC!!
        
        _LetterC = ImageVector.Builder(
            name = "letter-c",
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
                moveTo(18f, 9f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
                horizontalLineToRelative(-2f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
            }
        }.build()
        
        return _LetterC!!
    }

private var _LetterC: ImageVector? = null

