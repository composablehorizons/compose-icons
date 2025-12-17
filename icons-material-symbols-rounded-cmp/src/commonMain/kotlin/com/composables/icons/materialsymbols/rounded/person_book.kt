package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Person_book: ImageVector
    get() {
        if (_Person_book != null) return _Person_book!!
        
        _Person_book = ImageVector.Builder(
            name = "person_book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-56f, 0f, -107f, 17.5f)
                reflectiveQuadTo(280f, 790f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-10f)
                quadToRelative(-42f, -35f, -93f, -52.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(69f, 0f, 129f, 21f)
                reflectiveQuadToRelative(111f, 59f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                quadToRelative(51f, -38f, 111f, -59f)
                reflectiveQuadToRelative(129f, -21f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 420f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -140f)
                close()
            }
        }.build()
        
        return _Person_book!!
    }

private var _Person_book: ImageVector? = null

