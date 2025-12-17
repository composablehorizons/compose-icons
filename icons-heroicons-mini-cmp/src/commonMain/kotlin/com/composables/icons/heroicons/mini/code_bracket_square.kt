package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CodeBracketSquare: ImageVector
    get() {
        if (_CodeBracketSquare != null) return _CodeBracketSquare!!
        
        _CodeBracketSquare = ImageVector.Builder(
            name = "code-bracket-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2f, 4.25f)
                verticalLineToRelative(11.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.25f, 18f)
                horizontalLineToRelative(11.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 15.75f)
                verticalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 2f)
                horizontalLineTo(4.25f)
                close()
                moveToRelative(4.03f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(4.97f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineTo(6.56f, 10f)
                lineToRelative(1.72f, -1.72f)
                close()
                moveToRelative(4.5f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(13.44f, 10f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-2.25f, -2.25f)
                close()
            }
        }.build()
        
        return _CodeBracketSquare!!
    }

private var _CodeBracketSquare: ImageVector? = null

