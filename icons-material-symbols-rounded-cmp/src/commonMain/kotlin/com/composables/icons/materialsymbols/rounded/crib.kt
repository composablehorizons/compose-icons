package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Crib: ImageVector
    get() {
        if (_Crib != null) return _Crib!!
        
        _Crib = ImageVector.Builder(
            name = "crib",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-69f, 0f, -132.5f, -23f)
                reflectiveQuadTo(230f, 792f)
                quadToRelative(-14f, -11f, -15f, -28f)
                reflectiveQuadToRelative(11f, -29f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(285f, 733f)
                quadToRelative(8f, 7f, 17f, 13f)
                reflectiveQuadToRelative(18f, 11f)
                verticalLineToRelative(-117f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(117f)
                quadToRelative(10f, -6f, 19f, -12f)
                reflectiveQuadToRelative(18f, -13f)
                quadToRelative(13f, -11f, 29.5f, -10f)
                reflectiveQuadToRelative(27.5f, 12f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(732f, 790f)
                quadToRelative(-54f, 43f, -118.5f, 66.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(20f, 0f, 40f, -2.5f)
                reflectiveQuadToRelative(40f, -7.5f)
                verticalLineToRelative(-150f)
                horizontalLineTo(400f)
                verticalLineToRelative(150f)
                quadToRelative(20f, 5f, 40f, 7.5f)
                reflectiveQuadToRelative(40f, 2.5f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(400f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, -120f)
                close()
            }
        }.build()
        
        return _Crib!!
    }

private var _Crib: ImageVector? = null

