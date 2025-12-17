package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Smart_screen: ImageVector
    get() {
        if (_Smart_screen != null) return _Smart_screen!!
        
        _Smart_screen = ImageVector.Builder(
            name = "smart_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(290f, -170f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(500f, 480f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(530f, 450f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(530f, 510f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(300f, 480f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(330f, 450f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(330f, 510f)
                close()
                moveToRelative(300f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(630f, 450f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(630f, 510f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(430f, 450f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(460f, 480f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(430f, 510f)
                close()
            }
        }.build()
        
        return _Smart_screen!!
    }

private var _Smart_screen: ImageVector? = null

