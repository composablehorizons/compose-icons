package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_shield: ImageVector
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
                moveTo(485f, 720f)
                close()
                moveToRelative(26f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(260f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(245f)
                quadToRelative(4f, 21f, 10.5f, 41f)
                reflectiveQuadToRelative(15.5f, 39f)
                close()
                moveToRelative(209f, 80f)
                quadToRelative(-73f, -18f, -116.5f, -80f)
                reflectiveQuadTo(560f, 662f)
                verticalLineToRelative(-102f)
                lineToRelative(160f, -80f)
                lineToRelative(160f, 80f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 76f, -43.5f, 138f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(38f, -18f, 59f, -55f)
                reflectiveQuadToRelative(21f, -79f)
                verticalLineToRelative(-52f)
                lineToRelative(-80f, -40f)
                lineToRelative(-80f, 40f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 42f, 21f, 79f)
                reflectiveQuadToRelative(59f, 55f)
                close()
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
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(240f, 363f)
                close()
            }
        }.build()
        
        return _Person_shield!!
    }

private var _Person_shield: ImageVector? = null

