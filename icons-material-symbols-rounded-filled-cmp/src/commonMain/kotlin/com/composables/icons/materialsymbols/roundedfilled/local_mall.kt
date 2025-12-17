package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_mall: ImageVector
    get() {
        if (_Local_mall != null) return _Local_mall!!
        
        _Local_mall = ImageVector.Builder(
            name = "local_mall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 240f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -640f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                close()
                moveToRelative(119f, 320f)
                quadToRelative(74f, 0f, 134f, -49f)
                reflectiveQuadToRelative(59f, -110f)
                quadToRelative(0f, -17f, -11f, -29f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-14f, 0f, -25f, 9f)
                reflectiveQuadToRelative(-16f, 27f)
                quadToRelative(-11f, 38f, -43f, 61f)
                reflectiveQuadToRelative(-70f, 23f)
                quadToRelative(-38f, 0f, -70.5f, -23f)
                reflectiveQuadTo(366f, 396f)
                quadToRelative(-5f, -19f, -15f, -27.5f)
                reflectiveQuadToRelative(-24f, -8.5f)
                quadToRelative(-17f, 0f, -28.5f, 12f)
                reflectiveQuadTo(287f, 401f)
                quadToRelative(0f, 61f, 59f, 110f)
                reflectiveQuadToRelative(133f, 49f)
                close()
            }
        }.build()
        
        return _Local_mall!!
    }

private var _Local_mall: ImageVector? = null

