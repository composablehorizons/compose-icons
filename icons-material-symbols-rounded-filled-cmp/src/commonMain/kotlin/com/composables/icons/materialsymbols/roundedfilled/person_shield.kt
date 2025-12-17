package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_shield: ImageVector
    get() {
        if (_Person_shield != null) return _Person_shield!!
        
        _Person_shield = ImageVector.Builder(
            name = "person_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 877f)
                quadToRelative(-7f, 0f, -13.5f, -1.5f)
                reflectiveQuadTo(694f, 872f)
                quadToRelative(-62f, -25f, -98f, -83f)
                reflectiveQuadToRelative(-36f, -127f)
                verticalLineToRelative(-77f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadToRelative(16.5f, -15f)
                lineToRelative(120f, -60f)
                quadToRelative(8f, -5f, 18f, -5f)
                reflectiveQuadToRelative(18f, 5f)
                lineToRelative(120f, 60f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(77f)
                quadToRelative(0f, 69f, -36f, 127f)
                reflectiveQuadToRelative(-98f, 83f)
                quadToRelative(-6f, 2f, -12.5f, 3.5f)
                reflectiveQuadTo(720f, 877f)
                close()
                moveToRelative(-480f, -77f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(50f, -25f, 103f, -40f)
                reflectiveQuadToRelative(108f, -20f)
                quadToRelative(19f, -2f, 32f, 11f)
                reflectiveQuadToRelative(13f, 32f)
                verticalLineToRelative(97f)
                quadToRelative(0f, 22f, 3f, 43.5f)
                reflectiveQuadToRelative(9f, 42.5f)
                quadToRelative(5f, 20f, -6f, 36f)
                reflectiveQuadToRelative(-30f, 16f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Person_shield!!
    }

private var _Person_shield: ImageVector? = null

