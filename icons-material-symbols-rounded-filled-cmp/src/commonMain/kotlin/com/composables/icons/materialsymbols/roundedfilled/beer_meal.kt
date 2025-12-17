package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Beer_meal: ImageVector
    get() {
        if (_Beer_meal != null) return _Beer_meal!!
        
        _Beer_meal = ImageVector.Builder(
            name = "beer_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 640f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, -41f)
                verticalLineToRelative(-199f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 560f)
                horizontalLineTo(320f)
                verticalLineToRelative(-66f)
                quadToRelative(-53f, -14f, -86.5f, -56f)
                reflectiveQuadTo(200f, 339f)
                quadToRelative(0f, -51f, 30f, -92.5f)
                reflectiveQuadToRelative(79f, -58.5f)
                quadToRelative(23f, -50f, 69f, -79f)
                reflectiveQuadToRelative(102f, -29f)
                quadToRelative(33f, 0f, 63.5f, 11.5f)
                reflectiveQuadTo(600f, 125f)
                quadToRelative(10f, -2f, 19.5f, -3.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(66f, 0f, 113f, 46.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(0f, 21f, -6f, 41.5f)
                reflectiveQuadTo(777f, 360f)
                lineToRelative(62f, -1f)
                quadToRelative(34f, -1f, 57.5f, 22.5f)
                reflectiveQuadTo(920f, 439f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 759f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 839f)
                horizontalLineTo(560f)
                close()
                moveTo(360f, 420f)
                quadToRelative(23f, 0f, 41.5f, -13.5f)
                reflectiveQuadTo(437f, 376f)
                lineToRelative(56f, -57f)
                quadToRelative(21f, -21f, 49f, -30f)
                reflectiveQuadToRelative(58f, -9f)
                horizontalLineToRelative(119f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(639f, 200f)
                quadToRelative(-12f, 0f, -24f, 1.5f)
                reflectiveQuadToRelative(-23f, 6.5f)
                lineToRelative(-12f, 4f)
                lineToRelative(-31f, -26f)
                quadToRelative(-14f, -12f, -32f, -19f)
                reflectiveQuadToRelative(-37f, -7f)
                quadToRelative(-32f, 0f, -58.5f, 17f)
                reflectiveQuadTo(381f, 223f)
                lineToRelative(-15f, 31f)
                lineToRelative(-32f, 10f)
                quadToRelative(-24f, 9f, -39f, 29.5f)
                reflectiveQuadTo(280f, 340f)
                quadToRelative(0f, 33f, 23f, 56.5f)
                reflectiveQuadToRelative(57f, 23.5f)
                close()
                moveToRelative(400f, 259f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Beer_meal!!
    }

private var _Beer_meal: ImageVector? = null

