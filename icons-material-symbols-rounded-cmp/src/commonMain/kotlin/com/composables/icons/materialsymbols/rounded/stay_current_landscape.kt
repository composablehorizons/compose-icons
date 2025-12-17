package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stay_current_landscape: ImageVector
    get() {
        if (_Stay_current_landscape != null) return _Stay_current_landscape!!
        
        _Stay_current_landscape = ImageVector.Builder(
            name = "stay_current_landscape",
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
                moveToRelative(40f, -80f)
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
            }
        }.build()
        
        return _Stay_current_landscape!!
    }

private var _Stay_current_landscape: ImageVector? = null

