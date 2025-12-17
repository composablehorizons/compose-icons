package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Format_size: ImageVector
    get() {
        if (_Format_size != null) return _Format_size!!
        
        _Format_size = ImageVector.Builder(
            name = "format_size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 280f)
                horizontalLineTo(420f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(360f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(420f, 160f)
                horizontalLineToRelative(400f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 280f)
                horizontalLineTo(680f)
                verticalLineToRelative(460f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(560f, 740f)
                verticalLineToRelative(-460f)
                close()
                moveTo(200f, 480f)
                horizontalLineToRelative(-60f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 420f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 360f)
                horizontalLineToRelative(240f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(440f, 420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(380f, 480f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 740f)
                verticalLineToRelative(-260f)
                close()
            }
        }.build()
        
        return _Format_size!!
    }

private var _Format_size: ImageVector? = null

