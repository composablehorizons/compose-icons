package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CodeBracket: ImageVector
    get() {
        if (_CodeBracket != null) return _CodeBracket!!
        
        _CodeBracket = ImageVector.Builder(
            name = "code-bracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.28f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(2.56f, 10f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(0.97f, 10.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveToRelative(7.44f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineTo(17.44f, 10f)
                lineToRelative(-3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(11.377f, 2.011f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.612f, 0.867f)
                lineToRelative(-2.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.478f, -0.255f)
                lineToRelative(2.5f, -14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.866f, -0.612f)
                close()
            }
        }.build()
        
        return _CodeBracket!!
    }

private var _CodeBracket: ImageVector? = null

