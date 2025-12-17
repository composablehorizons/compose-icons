package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ambient_screen: ImageVector
    get() {
        if (_Ambient_screen != null) return _Ambient_screen!!
        
        _Ambient_screen = ImageVector.Builder(
            name = "ambient_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 736f)
                lineToRelative(50f, -110f)
                lineToRelative(110f, -50f)
                lineToRelative(-110f, -50f)
                lineToRelative(-50f, -110f)
                lineToRelative(-50f, 110f)
                lineToRelative(-110f, 50f)
                lineToRelative(110f, 50f)
                lineToRelative(50f, 110f)
                close()
                moveToRelative(300f, 200f)
                lineToRelative(-44f, -96f)
                lineToRelative(-96f, -44f)
                lineToRelative(96f, -44f)
                lineToRelative(44f, -96f)
                lineToRelative(44f, 96f)
                lineToRelative(96f, 44f)
                lineToRelative(-96f, 44f)
                lineToRelative(-44f, 96f)
                close()
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(367f)
                quadToRelative(-23f, -14f, -48.5f, -20.5f)
                reflectiveQuadTo(780f, 596f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(580f, 796f)
                quadToRelative(0f, 26f, 6.5f, 51.5f)
                reflectiveQuadTo(607f, 896f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Ambient_screen!!
    }

private var _Ambient_screen: ImageVector? = null

