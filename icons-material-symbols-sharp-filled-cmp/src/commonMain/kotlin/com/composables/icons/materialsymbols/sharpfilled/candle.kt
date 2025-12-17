package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Candle: ImageVector
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
                moveTo(480f, 320f)
                quadToRelative(-48f, 0f, -80f, -33.5f)
                reflectiveQuadTo(370f, 205f)
                quadToRelative(2f, -52f, 36.5f, -91.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(39f, 34f, 73.5f, 73.5f)
                reflectiveQuadTo(590f, 205f)
                quadToRelative(2f, 48f, -30f, 81.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(330f, 360f)
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
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(320f)
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
            }
        }.build()
        
        return _Candle!!
    }

private var _Candle: ImageVector? = null

