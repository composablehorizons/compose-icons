package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hourglass_top: ImageVector
    get() {
        if (_Hourglass_top != null) return _Hourglass_top!!
        
        _Hourglass_top = ImageVector.Builder(
            name = "hourglass_top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(120f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -61f, 28.5f, -114.5f)
                reflectiveQuadTo(348f, 480f)
                quadToRelative(-51f, -32f, -79.5f, -85.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 61f, -28.5f, 114.5f)
                reflectiveQuadTo(612f, 480f)
                quadToRelative(51f, 32f, 79.5f, 85.5f)
                reflectiveQuadTo(720f, 680f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Hourglass_top!!
    }

private var _Hourglass_top: ImageVector? = null

