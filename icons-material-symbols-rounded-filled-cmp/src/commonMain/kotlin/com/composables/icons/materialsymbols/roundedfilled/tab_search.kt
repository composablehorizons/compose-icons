package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tab_search: ImageVector
    get() {
        if (_Tab_search != null) return _Tab_search!!
        
        _Tab_search = ImageVector.Builder(
            name = "tab_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(143f)
                quadToRelative(0f, 25f, -23.5f, 34.5f)
                reflectiveQuadTo(813f, 409f)
                quadToRelative(-3f, -2f, -6f, -5f)
                reflectiveQuadToRelative(-7f, -5f)
                verticalLineToRelative(-159f)
                horizontalLineTo(520f)
                verticalLineToRelative(159f)
                quadToRelative(-54f, 35f, -87f, 93.5f)
                reflectiveQuadTo(400f, 620f)
                quadToRelative(0f, 37f, 10f, 70f)
                reflectiveQuadToRelative(27f, 62f)
                quadToRelative(10f, 16f, 1.5f, 32f)
                reflectiveQuadTo(413f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(500f, 0f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 26f, -7.5f, 50f)
                reflectiveQuadTo(812f, 716f)
                lineToRelative(80f, 80f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-80f, -80f)
                quadToRelative(-22f, 13f, -46f, 20.5f)
                reflectiveQuadToRelative(-50f, 7.5f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
            }
        }.build()
        
        return _Tab_search!!
    }

private var _Tab_search: ImageVector? = null

