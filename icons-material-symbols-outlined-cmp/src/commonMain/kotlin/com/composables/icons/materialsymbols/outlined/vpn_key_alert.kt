package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vpn_key_alert: ImageVector
    get() {
        if (_Vpn_key_alert != null) return _Vpn_key_alert!!
        
        _Vpn_key_alert = ImageVector.Builder(
            name = "vpn_key_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineTo(488f)
                quadToRelative(-32f, 54f, -87f, 87f)
                reflectiveQuadToRelative(-121f, 33f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(66f, 0f, 121f, 33f)
                reflectiveQuadToRelative(87f, 87f)
                horizontalLineToRelative(272f)
                verticalLineToRelative(80f)
                horizontalLineTo(434f)
                quadToRelative(-8f, -39f, -48f, -79.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 106f, -40.5f)
                reflectiveQuadToRelative(48f, -79.5f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveTo(280f, 560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(600f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Vpn_key_alert!!
    }

private var _Vpn_key_alert: ImageVector? = null

