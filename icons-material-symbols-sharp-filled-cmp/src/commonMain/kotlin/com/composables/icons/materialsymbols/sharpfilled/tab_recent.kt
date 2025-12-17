package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tab_recent: ImageVector
    get() {
        if (_Tab_recent != null) return _Tab_recent!!
        
        _Tab_recent = ImageVector.Builder(
            name = "tab_recent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(786f, 814f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                close()
                moveTo(520f, 400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(331f)
                quadToRelative(-35f, -25f, -76.5f, -38f)
                reflectiveQuadTo(719f, 440f)
                quadToRelative(-116f, 0f, -197.5f, 82f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 21f, 3f, 41f)
                reflectiveQuadToRelative(9f, 39f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Tab_recent!!
    }

private var _Tab_recent: ImageVector? = null

