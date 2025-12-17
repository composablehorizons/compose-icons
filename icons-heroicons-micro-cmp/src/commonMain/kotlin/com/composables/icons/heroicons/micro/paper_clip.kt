package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PaperClip: ImageVector
    get() {
        if (_PaperClip != null) return _PaperClip!!
        
        _PaperClip = ImageVector.Builder(
            name = "paper-clip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.914f, 4.086f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 0f)
                lineToRelative(-5f, 5f)
                arcToRelative(2f, 2f, 0f, true, false, 2.828f, 2.828f)
                lineToRelative(0.556f, -0.555f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineToRelative(-0.555f, 0.556f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.95f, -4.95f)
                lineToRelative(5f, -5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.95f, 4.95f)
                lineToRelative(-1.972f, 1.972f)
                arcToRelative(2.125f, 2.125f, 0f, false, true, -3.006f, -3.005f)
                lineTo(9.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineTo(9.058f, 8.003f)
                arcToRelative(0.625f, 0.625f, 0f, false, false, 0.884f, 0.883f)
                lineToRelative(1.972f, -1.972f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.828f)
                close()
            }
        }.build()
        
        return _PaperClip!!
    }

private var _PaperClip: ImageVector? = null

