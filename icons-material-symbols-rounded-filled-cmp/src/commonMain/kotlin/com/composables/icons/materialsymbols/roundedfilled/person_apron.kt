package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_apron: ImageVector
    get() {
        if (_Person_apron != null) return _Person_apron!!
        
        _Person_apron = ImageVector.Builder(
            name = "person_apron",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(160f, 320f)
                verticalLineToRelative(-256f)
                quadToRelative(25f, 8f, 49f, 17f)
                reflectiveQuadToRelative(47f, 21f)
                quadToRelative(30f, 15f, 47f, 43.5f)
                reflectiveQuadToRelative(17f, 62.5f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(400f, 660f)
                verticalLineToRelative(-134f)
                quadToRelative(20f, -3f, 40f, -4.5f)
                reflectiveQuadToRelative(40f, -1.5f)
                quadToRelative(20f, 0f, 40f, 1.5f)
                reflectiveQuadToRelative(40f, 4.5f)
                verticalLineToRelative(134f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-240f, 60f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17f, -62.5f)
                reflectiveQuadToRelative(47f, -43.5f)
                quadToRelative(23f, -12f, 47f, -21f)
                reflectiveQuadToRelative(49f, -17f)
                verticalLineToRelative(256f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                close()
            }
        }.build()
        
        return _Person_apron!!
    }

private var _Person_apron: ImageVector? = null

