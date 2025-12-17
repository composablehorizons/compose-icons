package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pageview: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-24f)
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
                lineToRelative(188f, 188f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Pageview!!
    }

private var _Pageview: ImageVector? = null

