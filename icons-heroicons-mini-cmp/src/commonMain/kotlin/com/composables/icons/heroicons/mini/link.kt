package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.232f, 4.232f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.536f, 3.536f)
                lineToRelative(-1.225f, 1.224f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.061f, 1.06f)
                lineToRelative(1.224f, -1.224f)
                arcToRelative(4f, 4f, 0f, false, false, -5.656f, -5.656f)
                lineToRelative(-3f, 3f)
                arcToRelative(4f, 4f, 0f, false, false, 0.225f, 5.865f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.977f, -1.138f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.142f, -3.667f)
                lineToRelative(3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.603f, 7.963f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.977f, 1.138f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.142f, 3.667f)
                lineToRelative(-3f, 3f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.536f, -3.536f)
                lineToRelative(1.225f, -1.224f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, -1.06f)
                lineToRelative(-1.224f, 1.224f)
                arcToRelative(4f, 4f, 0f, true, false, 5.656f, 5.656f)
                lineToRelative(3f, -3f)
                arcToRelative(4f, 4f, 0f, false, false, -0.225f, -5.865f)
                close()
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

