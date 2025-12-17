package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.View_cozy: ImageVector
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
                moveTo(340f, 420f)
                horizontalLineTo(200f)
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
                close()
                moveToRelative(-140f, -80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                horizontalLineTo(200f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(140f, 500f)
                horizontalLineTo(200f)
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
                close()
                moveToRelative(-140f, -80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                horizontalLineTo(200f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(560f, -340f)
                horizontalLineTo(620f)
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
                close()
                moveToRelative(-140f, -80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                horizontalLineTo(620f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(140f, 500f)
                horizontalLineTo(620f)
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
                close()
                moveToRelative(-140f, -80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                horizontalLineTo(620f)
                verticalLineToRelative(140f)
                close()
                moveTo(340f, 340f)
                close()
                moveToRelative(0f, 280f)
                close()
                moveToRelative(280f, -280f)
                close()
                moveToRelative(0f, 280f)
                close()
            }
        }.build()
        
        return _View_cozy!!
    }

private var _View_cozy: ImageVector? = null

