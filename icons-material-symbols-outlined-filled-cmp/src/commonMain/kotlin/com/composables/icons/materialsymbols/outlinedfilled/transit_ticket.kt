package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Transit_ticket: ImageVector
    get() {
        if (_Transit_ticket != null) return _Transit_ticket!!
        
        _Transit_ticket = ImageVector.Builder(
            name = "transit_ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 680f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                lineToRelative(-40f, -20f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 540f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -43f, -37f, -61.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -121.5f, 19f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 620f)
                lineToRelative(-40f, 20f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(50f, -100f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(380f, 550f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(410f, 520f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(440f, 550f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(410f, 580f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(520f, 550f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(550f, 520f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(580f, 550f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(550f, 580f)
                close()
                moveTo(380f, 480f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(380f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -11f, 7f, -19f)
                reflectiveQuadToRelative(18f, -10f)
                quadToRelative(24f, -8f, 39.5f, -29f)
                reflectiveQuadToRelative(15.5f, -47f)
                quadToRelative(0f, -26f, -15.5f, -47f)
                reflectiveQuadTo(105f, 404f)
                quadToRelative(-11f, -2f, -18f, -10f)
                reflectiveQuadToRelative(-7f, -19f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(135f)
                quadToRelative(0f, 11f, -7f, 19f)
                reflectiveQuadToRelative(-18f, 10f)
                quadToRelative(-24f, 8f, -39.5f, 29f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 26f, 15.5f, 47f)
                reflectiveQuadToRelative(39.5f, 29f)
                quadToRelative(11f, 2f, 18f, 10f)
                reflectiveQuadToRelative(7f, 19f)
                verticalLineToRelative(135f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Transit_ticket!!
    }

private var _Transit_ticket: ImageVector? = null

