package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tab_search: ImageVector
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
                verticalLineToRelative(160f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-360f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(480f)
                close()
                moveTo(864f, 880f)
                lineTo(756f, 772f)
                quadToRelative(-22f, 13f, -46f, 20.5f)
                reflectiveQuadToRelative(-50f, 7.5f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 26f, -7.5f, 50f)
                reflectiveQuadTo(812f, 716f)
                lineToRelative(108f, 108f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(660f, 720f)
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

