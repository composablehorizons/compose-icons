package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mic_off: ImageVector
    get() {
        if (_Mic_off != null) return _Mic_off!!
        
        _Mic_off = ImageVector.Builder(
            name = "mic_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(710f, 598f)
                lineToRelative(-58f, -58f)
                quadToRelative(14f, -23f, 21f, -48f)
                reflectiveQuadToRelative(7f, -52f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 44f, -13f, 83.5f)
                reflectiveQuadTo(710f, 598f)
                close()
                moveTo(480f, 366f)
                close()
                moveToRelative(112f, 112f)
                lineToRelative(-72f, -72f)
                verticalLineToRelative(-206f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(126f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 11f, -2.5f, 20f)
                reflectiveQuadToRelative(-5.5f, 18f)
                close()
                moveTo(440f, 840f)
                verticalLineToRelative(-123f)
                quadToRelative(-104f, -14f, -172f, -93f)
                reflectiveQuadToRelative(-68f, -184f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 57.5f, 141.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(34f, 0f, 64.5f, -10.5f)
                reflectiveQuadTo(600f, 600f)
                lineToRelative(57f, 57f)
                quadToRelative(-29f, 23f, -63.5f, 39f)
                reflectiveQuadTo(520f, 717f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(352f, 64f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Mic_off!!
    }

private var _Mic_off: ImageVector? = null

