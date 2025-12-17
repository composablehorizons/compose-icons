package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pageview: ImageVector
    get() {
        if (_Pageview != null) return _Pageview!!
        
        _Pageview = ImageVector.Builder(
            name = "pageview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 560f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(487f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 756f)
                lineTo(612f, 556f)
                quadToRelative(14f, -21f, 21f, -45f)
                reflectiveQuadToRelative(7f, -51f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(280f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(460f, 640f)
                quadToRelative(26f, 0f, 50.5f, -7f)
                reflectiveQuadToRelative(45.5f, -21f)
                lineToRelative(120f, 120f)
                quadToRelative(19f, 19f, 8.5f, 43.5f)
                reflectiveQuadTo(647f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null

