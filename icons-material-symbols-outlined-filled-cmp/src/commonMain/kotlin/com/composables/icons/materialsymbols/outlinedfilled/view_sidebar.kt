package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_sidebar: ImageVector
    get() {
        if (_View_sidebar != null) return _View_sidebar!!
        
        _View_sidebar = ImageVector.Builder(
            name = "view_sidebar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 320f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 260f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 160f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 220f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 320f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 500f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 400f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 460f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 560f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(620f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 740f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 640f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 700f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 800f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _View_sidebar!!
    }

private var _View_sidebar: ImageVector? = null

