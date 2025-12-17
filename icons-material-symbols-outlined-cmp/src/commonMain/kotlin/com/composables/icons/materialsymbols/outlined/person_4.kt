package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Person_4: ImageVector
    get() {
        if (_Person_4 != null) return _Person_4!!
        
        _Person_4 = ImageVector.Builder(
            name = "person_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(15f, 0f, 28.5f, 7f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(8f, -13f, 21.5f, -20f)
                reflectiveQuadToRelative(28.5f, -7f)
                quadToRelative(15f, 0f, 28.5f, 7f)
                reflectiveQuadToRelative(21.5f, 20f)
                quadToRelative(8f, -13f, 21.5f, -20f)
                reflectiveQuadToRelative(28.5f, -7f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 220f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 360f)
                verticalLineToRelative(-100f)
                horizontalLineTo(400f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 622f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(736f, 622f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(800f, 728f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(700f, 694f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(260f, 694f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, 0f)
                close()
                moveToRelative(0f, -500f)
                close()
            }
        }.build()
        
        return _Person_4!!
    }

private var _Person_4: ImageVector? = null

