package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Schedule_send: ImageVector
    get() {
        if (_Schedule_send != null) return _Schedule_send!!
        
        _Schedule_send = ImageVector.Builder(
            name = "schedule_send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-240f)
                lineToRelative(320f, -80f)
                lineToRelative(-320f, -80f)
                verticalLineToRelative(-240f)
                lineToRelative(572f, 240f)
                horizontalLineToRelative(-12f)
                quadToRelative(-117f, 0f, -198.5f, 82.5f)
                reflectiveQuadTo(400f, 682f)
                lineTo(120f, 800f)
                close()
                moveToRelative(560f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(66f, -106f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                close()
            }
        }.build()
        
        return _Schedule_send!!
    }

private var _Schedule_send: ImageVector? = null

