package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Set_meal: ImageVector
    get() {
        if (_Set_meal != null) return _Set_meal!!
        
        _Set_meal = ImageVector.Builder(
            name = "set_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 520f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 80f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineTo(120f)
                close()
                moveToRelative(692f, 104f)
                lineToRelative(-659f, 34f)
                quadToRelative(-13f, 1f, -22f, -7f)
                reflectiveQuadToRelative(-10f, -21f)
                quadToRelative(-1f, -13f, 7.5f, -22f)
                reflectiveQuadToRelative(21.5f, -10f)
                lineToRelative(659f, -34f)
                quadToRelative(13f, -1f, 22f, 7f)
                reflectiveQuadToRelative(10f, 21f)
                quadToRelative(1f, 13f, -7.5f, 22f)
                reflectiveQuadTo(812f, 704f)
                close()
                moveToRelative(-2f, 135f)
                horizontalLineTo(150f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 809f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(150f, 779f)
                horizontalLineToRelative(660f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(840f, 809f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(810f, 839f)
                close()
                moveTo(410f, 460f)
                quadToRelative(74f, 0f, 142.5f, -26f)
                reflectiveQuadTo(672f, 354f)
                quadToRelative(5f, 34f, 31f, 55f)
                reflectiveQuadToRelative(61f, 27f)
                quadToRelative(11f, 2f, 23.5f, 0.5f)
                reflectiveQuadTo(800f, 418f)
                verticalLineToRelative(-156f)
                quadToRelative(0f, -17f, -12.5f, -18.5f)
                reflectiveQuadToRelative(-23.5f, 0.5f)
                quadToRelative(-35f, 7f, -61f, 28f)
                reflectiveQuadToRelative(-31f, 56f)
                quadToRelative(-53f, -52f, -120.5f, -80f)
                reflectiveQuadTo(410f, 220f)
                quadToRelative(-79f, 0f, -142f, 23.5f)
                reflectiveQuadTo(152f, 327f)
                quadToRelative(-1f, 1f, -5f, 13f)
                quadToRelative(0f, 4f, 5f, 13f)
                quadToRelative(53f, 60f, 116f, 83.5f)
                reflectiveQuadTo(410f, 460f)
                close()
            }
        }.build()
        
        return _Set_meal!!
    }

private var _Set_meal: ImageVector? = null

