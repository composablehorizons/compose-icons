package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_hospital: ImageVector
    get() {
        if (_Local_hospital != null) return _Local_hospital!!
        
        _Local_hospital = ImageVector.Builder(
            name = "local_hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 540f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 620f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 420f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 340f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 540f)
                horizontalLineToRelative(80f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Local_hospital!!
    }

private var _Local_hospital: ImageVector? = null

