package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Speaker_group: ImageVector
    get() {
        if (_Speaker_group != null) return _Speaker_group!!
        
        _Speaker_group = ImageVector.Builder(
            name = "speaker_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(400f)
                close()
                moveToRelative(180f, -460f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 240f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 180f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 300f)
                close()
                moveToRelative(0f, 340f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 500f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 500f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 560f)
                close()
                moveToRelative(20f, 360f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 240f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                close()
            }
        }.build()
        
        return _Speaker_group!!
    }

private var _Speaker_group: ImageVector? = null

