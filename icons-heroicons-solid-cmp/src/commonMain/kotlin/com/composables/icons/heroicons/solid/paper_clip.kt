package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PaperClip: ImageVector
    get() {
        if (_PaperClip != null) return _PaperClip!!
        
        _PaperClip = ImageVector.Builder(
            name = "paper-clip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.97f, 3.659f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -3.182f, 0f)
                lineToRelative(-10.94f, 10.94f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 5.304f, 5.303f)
                lineToRelative(7.693f, -7.693f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 1.06f)
                lineToRelative(-7.693f, 7.693f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, -7.424f, -7.424f)
                lineToRelative(10.939f, -10.94f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 5.303f, 5.304f)
                lineTo(9.097f, 18.835f)
                lineToRelative(-0.008f, 0.008f)
                lineToRelative(-0.007f, 0.007f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.003f, 0.002f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.91f, 15.66f)
                lineToRelative(7.81f, -7.81f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 1.06f)
                lineToRelative(-7.81f, 7.81f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.054f, 1.068f)
                lineTo(18.97f, 6.84f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, -3.182f)
                close()
            }
        }.build()
        
        return _PaperClip!!
    }

private var _PaperClip: ImageVector? = null

