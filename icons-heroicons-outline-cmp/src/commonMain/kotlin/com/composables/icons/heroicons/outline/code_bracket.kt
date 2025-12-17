package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CodeBracket: ImageVector
    get() {
        if (_CodeBracket != null) return _CodeBracket!!
        
        _CodeBracket = ImageVector.Builder(
            name = "code-bracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(17.25f, 6.75f)
                lineTo(22.5f, 12f)
                lineToRelative(-5.25f, 5.25f)
                moveToRelative(-10.5f, 0f)
                lineTo(1.5f, 12f)
                lineToRelative(5.25f, -5.25f)
                moveToRelative(7.5f, -3f)
                lineToRelative(-4.5f, 16.5f)
            }
        }.build()
        
        return _CodeBracket!!
    }

private var _CodeBracket: ImageVector? = null

