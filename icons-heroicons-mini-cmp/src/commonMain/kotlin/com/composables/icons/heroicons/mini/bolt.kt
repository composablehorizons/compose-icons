package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.983f, 1.907f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.292f, -0.657f)
                lineToRelative(-8.5f, 9.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2.75f, 12f)
                horizontalLineToRelative(6.572f)
                lineToRelative(-1.305f, 6.093f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.292f, 0.657f)
                lineToRelative(8.5f, -9.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 17.25f, 8f)
                horizontalLineToRelative(-6.572f)
                lineToRelative(1.305f, -6.093f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

