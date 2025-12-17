package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mode_heat_cool: ImageVector
    get() {
        if (_Mode_heat_cool != null) return _Mode_heat_cool!!
        
        _Mode_heat_cool = ImageVector.Builder(
            name = "mode_heat_cool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(277f, 675f)
                quadToRelative(-69f, -26f, -113f, -86.5f)
                reflectiveQuadTo(120f, 450f)
                quadToRelative(0f, -79f, 37.5f, -140.5f)
                reflectiveQuadTo(240f, 206f)
                quadToRelative(45f, -42f, 82.5f, -64f)
                lineToRelative(37.5f, -22f)
                verticalLineToRelative(99f)
                quadToRelative(0f, 25f, 18f, 42.5f)
                reflectiveQuadToRelative(43f, 17.5f)
                quadToRelative(14f, 0f, 26f, -6f)
                reflectiveQuadToRelative(20f, -17f)
                lineToRelative(13f, -16f)
                quadToRelative(38f, 22f, 65f, 54f)
                reflectiveQuadToRelative(41f, 72f)
                lineToRelative(-67f, 67f)
                quadToRelative(-2f, -24f, -11.5f, -47f)
                reflectiveQuadTo(482f, 344f)
                quadToRelative(-14f, 8f, -29.5f, 11.5f)
                reflectiveQuadTo(421f, 359f)
                quadToRelative(-44f, 0f, -79.5f, -24.5f)
                reflectiveQuadTo(290f, 269f)
                quadToRelative(-38f, 37f, -64f, 82.5f)
                reflectiveQuadTo(200f, 450f)
                quadToRelative(0f, 31f, 11f, 58.5f)
                reflectiveQuadToRelative(30f, 48.5f)
                quadToRelative(2f, -20f, 11.5f, -37.5f)
                reflectiveQuadTo(276f, 488f)
                lineToRelative(84f, -84f)
                lineToRelative(86f, 84f)
                quadToRelative(2f, 2f, 4f, 5f)
                reflectiveQuadToRelative(4f, 5f)
                lineToRelative(-57f, 57f)
                quadToRelative(-2f, -3f, -3.5f, -5f)
                reflectiveQuadToRelative(-3.5f, -4f)
                lineToRelative(-30f, -29f)
                lineToRelative(-28f, 28f)
                quadToRelative(-5f, 5f, -8.5f, 11.5f)
                reflectiveQuadTo(320f, 571f)
                quadToRelative(0f, 12f, 7f, 21.5f)
                reflectiveQuadToRelative(18f, 14.5f)
                lineToRelative(-68f, 68f)
                close()
                moveToRelative(83f, -271f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(296f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(544f, -544f)
                lineToRelative(56f, 56f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(80f)
                horizontalLineTo(616f)
                lineToRelative(-20f, 20f)
                lineToRelative(60f, 60f)
                horizontalLineToRelative(184f)
                verticalLineToRelative(80f)
                horizontalLineTo(736f)
                lineToRelative(84f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -84f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-184f)
                lineToRelative(-60f, -60f)
                lineToRelative(-20f, 20f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(296f, 880f)
                close()
            }
        }.build()
        
        return _Mode_heat_cool!!
    }

private var _Mode_heat_cool: ImageVector? = null

