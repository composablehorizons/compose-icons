package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Contact_mail: ImageVector
    get() {
        if (_Contact_mail != null) return _Contact_mail!!
        
        _Contact_mail = ImageVector.Builder(
            name = "contact_mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-200f)
                horizontalLineTo(560f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(140f, -50f)
                lineToRelative(-100f, -70f)
                verticalLineToRelative(-40f)
                lineToRelative(100f, 70f)
                lineToRelative(100f, -70f)
                verticalLineToRelative(40f)
                lineToRelative(-100f, 70f)
                close()
                moveTo(0f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(960f)
                verticalLineToRelative(720f)
                horizontalLineTo(0f)
                close()
                moveToRelative(636f, -80f)
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
            }
        }.build()
        
        return _Contact_mail!!
    }

private var _Contact_mail: ImageVector? = null

