package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.View_array: ImageVector
    get() {
        if (_View_array != null) return _View_array!!
        
        _View_array = ImageVector.Builder(
            name = "view_array",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 700f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(180f, 200f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 260f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 760f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 700f)
                close()
                moveToRelative(220f, 60f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(280f, 700f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 200f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(680f, 260f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(620f, 760f)
                horizontalLineTo(340f)
                close()
                moveToRelative(380f, -60f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 200f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 260f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 760f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 700f)
                close()
                moveToRelative(-360f, -20f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-400f)
                horizontalLineTo(360f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(120f, -200f)
                close()
            }
        }.build()
        
        return _View_array!!
    }

private var _View_array: ImageVector? = null

