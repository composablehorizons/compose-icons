package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shelf_position: ImageVector
    get() {
        if (_Shelf_position != null) return _Shelf_position!!
        
        _Shelf_position = ImageVector.Builder(
            name = "shelf_position",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(460f, -280f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(360f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-540f, 0f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(380f)
                close()
            }
        }.build()
        
        return _Shelf_position!!
    }

private var _Shelf_position: ImageVector? = null

