package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PaperClip: ImageVector
    get() {
        if (_PaperClip != null) return _PaperClip!!
        
        _PaperClip = ImageVector.Builder(
            name = "paper-clip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.621f, 4.379f)
                arcToRelative(3f, 3f, 0f, false, false, -4.242f, 0f)
                lineToRelative(-7f, 7f)
                arcToRelative(3f, 3f, 0f, false, false, 4.241f, 4.243f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.497f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.064f, 1.057f)
                lineToRelative(-0.498f, 0.501f)
                lineToRelative(-0.002f, 0.002f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -6.364f, -6.364f)
                lineToRelative(7f, -7f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 6.368f, 6.36f)
                lineToRelative(-3.455f, 3.553f)
                arcTo(2.625f, 2.625f, 0f, true, true, 9.52f, 9.52f)
                lineToRelative(3.45f, -3.451f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.061f, 1.06f)
                lineToRelative(-3.45f, 3.451f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 1.587f, 1.595f)
                lineToRelative(3.454f, -3.553f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -4.242f)
                close()
            }
        }.build()
        
        return _PaperClip!!
    }

private var _PaperClip: ImageVector? = null

