package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pageview: ImageVector
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
                moveTo(630f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(744f)
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
                horizontalLineToRelative(390f)
                lineToRelative(80f, 80f)
                close()
                moveTo(460f, 560f)
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

