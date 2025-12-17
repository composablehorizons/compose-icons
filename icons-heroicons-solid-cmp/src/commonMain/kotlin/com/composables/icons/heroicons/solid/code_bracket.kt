package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CodeBracket: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.447f, 3.026f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.527f, 0.921f)
                lineToRelative(-4.5f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.448f, -0.394f)
                lineToRelative(4.5f, -16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.921f, -0.527f)
                close()
                moveTo(16.72f, 6.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(5.25f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-5.25f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineTo(21.44f, 12f)
                lineToRelative(-4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(-9.44f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(2.56f, 12f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(0.97f, 12.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(5.25f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _CodeBracket!!
    }

private var _CodeBracket: ImageVector? = null

