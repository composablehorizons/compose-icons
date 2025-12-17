package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Smart_screen: ImageVector
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
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(560f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                close()
                moveTo(160f, 280f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(530f, 510f)
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

