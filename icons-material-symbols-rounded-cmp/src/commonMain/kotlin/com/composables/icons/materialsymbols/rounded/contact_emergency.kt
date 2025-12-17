package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Contact_emergency: ImageVector
    get() {
        if (_Contact_emergency != null) return _Contact_emergency!!
        
        _Contact_emergency = ImageVector.Builder(
            name = "contact_emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(0f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(80f, 120f)
                horizontalLineToRelative(800f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(960f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(556f, -80f)
                horizontalLineToRelative(244f)
                verticalLineToRelative(-560f)
                horizontalLineTo(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(4f)
                quadToRelative(42f, -75f, 116f, -117.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(86f, 0f, 160f, 42.5f)
                reflectiveQuadTo(636f, 760f)
                close()
                moveTo(360f, 560f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(182f, 760f)
                horizontalLineToRelative(356f)
                quadToRelative(-34f, -38f, -80.5f, -59f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(-51f, 0f, -97f, 21f)
                reflectiveQuadToRelative(-81f, 59f)
                close()
                moveToRelative(178f, -280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 480f)
                close()
                moveToRelative(120f, 0f)
                close()
                moveToRelative(210f, -68f)
                verticalLineToRelative(38f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(750f, 450f)
                verticalLineToRelative(-38f)
                lineToRelative(33f, 19f)
                quadToRelative(11f, 6f, 23f, 3f)
                reflectiveQuadToRelative(18f, -14f)
                quadToRelative(6f, -11f, 3f, -23f)
                reflectiveQuadToRelative(-14f, -18f)
                lineToRelative(-33f, -19f)
                lineToRelative(33f, -19f)
                quadToRelative(11f, -6f, 14f, -18f)
                reflectiveQuadToRelative(-3f, -23f)
                quadToRelative(-6f, -11f, -18f, -14f)
                reflectiveQuadToRelative(-23f, 3f)
                lineToRelative(-33f, 19f)
                verticalLineToRelative(-38f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(720f, 240f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(690f, 270f)
                verticalLineToRelative(38f)
                lineToRelative(-33f, -19f)
                quadToRelative(-11f, -6f, -23f, -3f)
                reflectiveQuadToRelative(-18f, 14f)
                quadToRelative(-6f, 11f, -3f, 23f)
                reflectiveQuadToRelative(14f, 18f)
                lineToRelative(33f, 19f)
                lineToRelative(-33f, 19f)
                quadToRelative(-11f, 6f, -14f, 18f)
                reflectiveQuadToRelative(3f, 23f)
                quadToRelative(6f, 11f, 18f, 14f)
                reflectiveQuadToRelative(23f, -3f)
                lineToRelative(33f, -19f)
                close()
            }
        }.build()
        
        return _Contact_emergency!!
    }

private var _Contact_emergency: ImageVector? = null

