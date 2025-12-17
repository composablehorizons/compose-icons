package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Passkey: ImageVector
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
                moveTo(120f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(184f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(20f, 0f, 40f, 1.5f)
                reflectiveQuadToRelative(40f, 4.5f)
                quadToRelative(-4f, 58f, 21f, 109.5f)
                reflectiveQuadToRelative(73f, 84.5f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveTo(760f, 920f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-186f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(600f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 45f, -25.5f, 80f)
                reflectiveQuadTo(790f, 670f)
                lineToRelative(50f, 50f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(440f, 480f)
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
            }
        }.build()
        
        return _Passkey!!
    }

private var _Passkey: ImageVector? = null

