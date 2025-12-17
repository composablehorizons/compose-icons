package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Italic: ImageVector
    get() {
        if (_Italic != null) return _Italic!!
        
        _Italic = ImageVector.Builder(
            name = "italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.497f, 3.744f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.275f)
                lineToRelative(-5.357f, 15.002f)
                horizontalLineToRelative(2.632f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                horizontalLineToRelative(3.275f)
                lineToRelative(5.357f, -15.002f)
                horizontalLineToRelative(-2.632f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Italic!!
    }

private var _Italic: ImageVector? = null

