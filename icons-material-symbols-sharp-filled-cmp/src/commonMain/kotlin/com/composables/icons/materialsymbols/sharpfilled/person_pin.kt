package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_pin: ImageVector
    get() {
        if (_Person_pin != null) return _Person_pin!!
        
        _Person_pin = ImageVector.Builder(
            name = "person_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(360f, 800f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(600f)
                lineTo(480f, 920f)
                close()
                moveToRelative(0f, -440f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(200f, 720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-46f)
                quadToRelative(-54f, -53f, -125.5f, -83.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-83f, 0f, -154.5f, 30.5f)
                reflectiveQuadTo(200f, 674f)
                verticalLineToRelative(46f)
                close()
            }
        }.build()
        
        return _Person_pin!!
    }

private var _Person_pin: ImageVector? = null

