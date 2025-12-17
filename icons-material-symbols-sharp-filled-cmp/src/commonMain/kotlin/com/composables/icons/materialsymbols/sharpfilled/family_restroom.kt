package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Family_restroom: ImageVector
    get() {
        if (_Family_restroom != null) return _Family_restroom!!
        
        _Family_restroom = ImageVector.Builder(
            name = "family_restroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 240f)
                close()
                moveTo(680f, 880f)
                verticalLineToRelative(-442f)
                horizontalLineToRelative(-73f)
                lineToRelative(53f, -158f)
                horizontalLineToRelative(120f)
                lineToRelative(120f, 360f)
                horizontalLineTo(800f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                close()
                moveTo(500f, 460f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(500f, 340f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(500f, 460f)
                close()
                moveTo(220f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(140f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(220f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(300f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(220f, 240f)
                close()
                moveTo(140f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineTo(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(280f)
                horizontalLineTo(140f)
                close()
                moveToRelative(300f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Family_restroom!!
    }

private var _Family_restroom: ImageVector? = null

