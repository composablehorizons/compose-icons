package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_pin: ImageVector
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
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(600f)
                lineTo(480f, 920f)
                close()
                moveTo(200f, 674f)
                quadToRelative(54f, -53f, 125.5f, -83.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(83f, 0f, 154.5f, 30.5f)
                reflectiveQuadTo(760f, 674f)
                verticalLineToRelative(-514f)
                horizontalLineTo(200f)
                verticalLineToRelative(514f)
                close()
                moveToRelative(280f, -194f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(280f, 720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-10f)
                quadToRelative(-42f, -35f, -93f, -52.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-56f, 0f, -107f, 17.5f)
                reflectiveQuadTo(280f, 710f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(200f, -320f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 340f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 340f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 17f)
                close()
            }
        }.build()
        
        return _Person_pin!!
    }

private var _Person_pin: ImageVector? = null

