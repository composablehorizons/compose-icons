package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tab_recent: ImageVector
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
                moveToRelative(66f, -106f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                close()
                moveTo(520f, 400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(52f)
                quadToRelative(22f, 7f, 42f, 16.5f)
                reflectiveQuadToRelative(38f, 22.5f)
                verticalLineToRelative(-251f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 160f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(80f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(292f)
                quadToRelative(-6f, -19f, -9f, -39f)
                reflectiveQuadToRelative(-3f, -41f)
                horizontalLineTo(160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(160f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Tab_recent!!
    }

private var _Tab_recent: ImageVector? = null

