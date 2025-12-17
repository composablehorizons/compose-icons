package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Candle: ImageVector
    get() {
        if (_Candle != null) return _Candle!!
        
        _Candle = ImageVector.Builder(
            name = "candle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                close()
                moveToRelative(240f, -480f)
                quadToRelative(-48f, 0f, -80f, -33.5f)
                reflectiveQuadTo(370f, 205f)
                quadToRelative(2f, -44f, 27f, -78.5f)
                reflectiveQuadToRelative(56f, -62.5f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(480f, 54f)
                quadToRelative(8f, 0f, 14.5f, 2.5f)
                reflectiveQuadTo(507f, 64f)
                quadToRelative(31f, 28f, 56f, 62.5f)
                reflectiveQuadToRelative(27f, 78.5f)
                quadToRelative(2f, 48f, -30f, 81.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(-40f, 360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(40f, -440f)
                quadToRelative(13f, 0f, 21.5f, -9f)
                reflectiveQuadToRelative(8.5f, -22f)
                quadToRelative(0f, -17f, -9.5f, -31f)
                reflectiveQuadTo(480f, 151f)
                quadToRelative(-11f, 13f, -20.5f, 27f)
                reflectiveQuadToRelative(-9.5f, 31f)
                quadToRelative(0f, 13f, 8.5f, 22f)
                reflectiveQuadToRelative(21.5f, 9f)
                close()
                moveToRelative(330f, 440f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(840f, 650f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(810f, 620f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(780f, 650f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(810f, 680f)
                close()
                moveTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 680f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(104f)
                quadToRelative(-2f, -8f, -3f, -15f)
                reflectiveQuadToRelative(-1f, -15f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                quadToRelative(46f, 0f, 78f, 32f)
                reflectiveQuadToRelative(32f, 78f)
                quadToRelative(0f, 38f, -22.5f, 67f)
                reflectiveQuadTo(840f, 756f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-240f, -80f)
                close()
                moveToRelative(-40f, -120f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -484f)
                close()
            }
        }.build()
        
        return _Candle!!
    }

private var _Candle: ImageVector? = null

