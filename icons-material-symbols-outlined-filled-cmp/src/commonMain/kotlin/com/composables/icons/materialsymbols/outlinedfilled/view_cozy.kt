package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_cozy: ImageVector
    get() {
        if (_View_cozy != null) return _View_cozy!!
        
        _View_cozy = ImageVector.Builder(
            name = "view_cozy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 340f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(420f, 200f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(340f, 420f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 540f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(420f, 620f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(340f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(420f, -420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(540f, 340f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(620f, 120f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 420f)
                horizontalLineTo(620f)
                close()
                moveToRelative(0f, 420f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(540f, 760f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(620f, 540f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 620f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(620f)
                close()
            }
        }.build()
        
        return _View_cozy!!
    }

private var _View_cozy: ImageVector? = null

