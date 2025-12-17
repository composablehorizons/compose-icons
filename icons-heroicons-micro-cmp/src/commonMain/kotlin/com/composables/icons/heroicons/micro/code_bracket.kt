package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CodeBracket: ImageVector
    get() {
        if (_CodeBracket != null) return _CodeBracket!!
        
        _CodeBracket = ImageVector.Builder(
            name = "code-bracket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.78f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(2.81f, 8f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveTo(11.22f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineTo(13.19f, 8f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                close()
                moveTo(8.856f, 2.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.636f, 0.848f)
                lineToRelative(-1.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.484f, -0.212f)
                lineToRelative(1.5f, -10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.848f, -0.636f)
                close()
            }
        }.build()
        
        return _CodeBracket!!
    }

private var _CodeBracket: ImageVector? = null

