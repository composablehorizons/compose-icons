package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CodeBracketSquare: ImageVector
    get() {
        if (_CodeBracketSquare != null) return _CodeBracketSquare!!
        
        _CodeBracketSquare = ImageVector.Builder(
            name = "code-bracket-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(14.25f, 9.75f)
                lineTo(16.5f, 12f)
                lineToRelative(-2.25f, 2.25f)
                moveToRelative(-4.5f, 0f)
                lineTo(7.5f, 12f)
                lineToRelative(2.25f, -2.25f)
                moveTo(6f, 20.25f)
                horizontalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, false, false, 20.25f, 18f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 3.75f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.75f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6f, 20.25f)
                close()
            }
        }.build()
        
        return _CodeBracketSquare!!
    }

private var _CodeBracketSquare: ImageVector? = null

