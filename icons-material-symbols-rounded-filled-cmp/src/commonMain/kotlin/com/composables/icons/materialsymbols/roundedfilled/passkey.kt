package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Passkey: ImageVector
    get() {
        if (_Passkey != null) return _Passkey!!
        
        _Passkey = ImageVector.Builder(
            name = "passkey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(184f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(14f, 0f, 28f, 0.5f)
                reflectiveQuadToRelative(28f, 2.5f)
                quadToRelative(11f, 1f, 17.5f, 8.5f)
                reflectiveQuadTo(520f, 550f)
                quadToRelative(2f, 47f, 23f, 88.5f)
                reflectiveQuadToRelative(56f, 70.5f)
                quadToRelative(7f, 5f, 11f, 12.5f)
                reflectiveQuadToRelative(4f, 16.5f)
                verticalLineToRelative(22f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(574f, 800f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(300f, 80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(780f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(740f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(700f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(740f, 560f)
                close()
                moveToRelative(6f, 346f)
                lineToRelative(-40f, -40f)
                quadToRelative(-2f, -2f, -6f, -14f)
                verticalLineToRelative(-178f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(600f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 45f, -25.5f, 80f)
                reflectiveQuadTo(790f, 670f)
                lineToRelative(36f, 36f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-32f, 32f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(32f, 32f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-52f, 52f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                close()
            }
        }.build()
        
        return _Passkey!!
    }

private var _Passkey: ImageVector? = null

