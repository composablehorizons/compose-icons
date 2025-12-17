package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CodeBracketSquare: ImageVector
    get() {
        if (_CodeBracketSquare != null) return _CodeBracketSquare!!
        
        _CodeBracketSquare = ImageVector.Builder(
            name = "code-bracket-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                close()
                moveToRelative(4.78f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(5.81f, 8f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveToRelative(2.44f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(0.97f, -0.97f)
                lineToRelative(-0.97f, -0.97f)
                close()
            }
        }.build()
        
        return _CodeBracketSquare!!
    }

private var _CodeBracketSquare: ImageVector? = null

