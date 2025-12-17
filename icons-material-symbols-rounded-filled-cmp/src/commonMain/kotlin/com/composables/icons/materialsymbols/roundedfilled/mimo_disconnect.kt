package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mimo_disconnect: ImageVector
    get() {
        if (_Mimo_disconnect != null) return _Mimo_disconnect!!
        
        _Mimo_disconnect = ImageVector.Builder(
            name = "mimo_disconnect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(127f, 127f)
                verticalLineToRelative(112f)
                lineToRelative(-71f, -71f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(608f, 720f)
                horizontalLineToRelative(72f)
                lineToRelative(28f, 28f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(28f, -28f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -37f, 23.5f, -55f)
                lineToRelative(23.5f, -18f)
                close()
                moveToRelative(673f, -7f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(469f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 698f)
                lineTo(302f, 188f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(331f, 120f)
                horizontalLineToRelative(469f)
                close()
            }
        }.build()
        
        return _Mimo_disconnect!!
    }

private var _Mimo_disconnect: ImageVector? = null

