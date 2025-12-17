package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Database_search: ImageVector
    get() {
        if (_Database_search != null) return _Database_search!!
        
        _Database_search = ImageVector.Builder(
            name = "database_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(472f, 840f)
                quadToRelative(-42f, -1f, -102.5f, -9.5f)
                reflectiveQuadToRelative(-116f, -27.5f)
                quadTo(198f, 784f, 159f, 753.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 36f, 28.5f, 63.5f)
                reflectiveQuadToRelative(71.5f, 46f)
                quadToRelative(43f, 18.5f, 94.5f, 30f)
                reflectiveQuadTo(411f, 736f)
                quadToRelative(9f, 29f, 24.5f, 55.5f)
                reflectiveQuadTo(472f, 840f)
                close()
                moveToRelative(-71f, -205f)
                quadToRelative(-45f, -5f, -94.5f, -16.5f)
                reflectiveQuadToRelative(-91f, -30.5f)
                quadTo(174f, 569f, 147f, 542.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 38f, 31.5f, 66f)
                reflectiveQuadToRelative(78f, 47.5f)
                quadToRelative(46.5f, 19.5f, 101f, 30f)
                reflectiveQuadTo(430f, 538f)
                quadToRelative(-12f, 22f, -19.5f, 46.5f)
                reflectiveQuadTo(401f, 635f)
                close()
                moveToRelative(79f, -195f)
                quadToRelative(-149f, 0f, -254.5f, -47f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -66f, 105.5f, -113f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(150f, 0f, 255f, 47f)
                reflectiveQuadToRelative(105f, 113f)
                quadToRelative(0f, 66f, -105f, 113f)
                reflectiveQuadToRelative(-255f, 47f)
                close()
                moveTo(864f, 920f)
                lineTo(756f, 812f)
                quadToRelative(-22f, 13f, -46f, 20.5f)
                reflectiveQuadToRelative(-50f, 7.5f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 26f, -7.5f, 50f)
                reflectiveQuadTo(812f, 756f)
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(660f, 760f)
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
        
        return _Database_search!!
    }

private var _Database_search: ImageVector? = null

