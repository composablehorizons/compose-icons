package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) return _PaperAirplane!!
        
        _PaperAirplane = ImageVector.Builder(
            name = "paper-airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.478f, 2.404f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.926f, 0.941f)
                lineToRelative(2.432f, 7.905f)
                horizontalLineTo(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(4.984f)
                lineToRelative(-2.432f, 7.905f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.926f, 0.94f)
                arcToRelative(60.519f, 60.519f, 0f, false, false, 18.445f, -8.986f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.218f)
                arcTo(60.517f, 60.517f, 0f, false, false, 3.478f, 2.404f)
                close()
            }
        }.build()
        
        return _PaperAirplane!!
    }

private var _PaperAirplane: ImageVector? = null

