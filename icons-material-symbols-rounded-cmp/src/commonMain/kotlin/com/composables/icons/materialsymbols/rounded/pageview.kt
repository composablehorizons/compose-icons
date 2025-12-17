package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pageview: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineToRelative(-6f)
                quadToRelative(-26f, 0f, -47f, -9f)
                reflectiveQuadToRelative(-38f, -26f)
                lineTo(556f, 612f)
                quadToRelative(-21f, 14f, -45.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(280f, 460f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(0f, 27f, -7f, 51f)
                reflectiveQuadToRelative(-21f, 45f)
                lineToRelative(164f, 164f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(373f)
                quadToRelative(20f, 0f, 30f, 12.5f)
                reflectiveQuadToRelative(10f, 27.5f)
                quadToRelative(0f, 15f, -10f, 27.5f)
                reflectiveQuadTo(533f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(300f, -240f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null

