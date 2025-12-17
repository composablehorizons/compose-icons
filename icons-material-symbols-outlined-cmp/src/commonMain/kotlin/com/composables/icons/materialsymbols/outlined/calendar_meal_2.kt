package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Calendar_meal_2: ImageVector
    get() {
        if (_Calendar_meal_2 != null) return _Calendar_meal_2!!
        
        _Calendar_meal_2 = ImageVector.Builder(
            name = "calendar_meal_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(414f, 600f)
                quadToRelative(-35f, 0f, -55.5f, -22f)
                reflectiveQuadTo(330f, 520f)
                horizontalLineToRelative(300f)
                quadToRelative(-8f, 36f, -28.5f, 58f)
                reflectiveQuadTo(546f, 600f)
                horizontalLineTo(414f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, -80f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(-560f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(163f, -320f)
                quadToRelative(7f, -18f, 22f, -29f)
                reflectiveQuadToRelative(35f, -11f)
                horizontalLineToRelative(53f)
                quadToRelative(27f, -27f, 37.5f, -33.5f)
                reflectiveQuadTo(540f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(600f, 420f)
                verticalLineToRelative(20f)
                horizontalLineTo(363f)
                close()
                moveToRelative(51f, 240f)
                horizontalLineToRelative(132f)
                quadToRelative(91f, 0f, 131.5f, -68.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-29f, 0f, -54.5f, 10.5f)
                reflectiveQuadTo(440f, 320f)
                horizontalLineToRelative(-20f)
                quadToRelative(-52f, 0f, -91f, 34.5f)
                reflectiveQuadTo(282f, 440f)
                horizontalLineToRelative(-42f)
                quadToRelative(2f, 103f, 42.5f, 171.5f)
                reflectiveQuadTo(414f, 680f)
                close()
            }
        }.build()
        
        return _Calendar_meal_2!!
    }

private var _Calendar_meal_2: ImageVector? = null

