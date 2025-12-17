package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Yoshoku: ImageVector
    get() {
        if (_Yoshoku != null) return _Yoshoku!!
        
        _Yoshoku = ImageVector.Builder(
            name = "yoshoku",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                quadToRelative(-91f, 0f, -171.5f, -34.5f)
                reflectiveQuadToRelative(-140f, -94f)
                quadToRelative(-59.5f, -59.5f, -94f, -140f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -91f, 34.5f, -171f)
                reflectiveQuadToRelative(94f, -140f)
                quadToRelative(59.5f, -60f, 140f, -94.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(42f, 0f, 81f, 7.5f)
                reflectiveQuadToRelative(76f, 21.5f)
                quadToRelative(57f, -20f, 120f, -24f)
                reflectiveQuadToRelative(123f, -4f)
                quadToRelative(0f, 52f, -2.5f, 109f)
                reflectiveQuadTo(861f, 261f)
                quadToRelative(28f, 48f, 43.5f, 103.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 91f, -34.5f, 171.5f)
                reflectiveQuadToRelative(-94.5f, 140f)
                quadToRelative(-60f, 59.5f, -140f, 94f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(367f, 702f)
                horizontalLineToRelative(65f)
                lineToRelative(100f, -140f)
                quadToRelative(13f, -19f, 19.5f, -39.5f)
                reflectiveQuadTo(558f, 480f)
                quadToRelative(0f, -22f, -6.5f, -42.5f)
                reflectiveQuadTo(532f, 399f)
                lineTo(432f, 258f)
                horizontalLineToRelative(-65f)
                lineTo(267f, 399f)
                quadToRelative(-13f, 18f, -19.5f, 39f)
                reflectiveQuadToRelative(-6.5f, 42f)
                quadToRelative(0f, 22f, 6.5f, 42.5f)
                reflectiveQuadTo(267f, 562f)
                lineToRelative(100f, 140f)
                close()
                moveToRelative(213f, 18f)
                quadToRelative(75f, 0f, 127.5f, -52f)
                reflectiveQuadTo(760f, 541f)
                quadToRelative(0f, -29f, -9f, -55.5f)
                reflectiveQuadTo(726f, 436f)
                quadToRelative(-20f, 11f, -42.5f, 18f)
                reflectiveQuadTo(638f, 466f)
                quadToRelative(1f, 4f, 1f, 7.5f)
                verticalLineToRelative(6.5f)
                quadToRelative(0f, 34f, -10.5f, 66.5f)
                reflectiveQuadTo(598f, 608f)
                lineToRelative(-74f, 104f)
                quadToRelative(13f, 4f, 27f, 6f)
                reflectiveQuadToRelative(29f, 2f)
                close()
                moveToRelative(39f, -331f)
                quadToRelative(46f, -11f, 77.5f, -29.5f)
                reflectiveQuadTo(749f, 314f)
                quadToRelative(32f, -42f, 41.5f, -93.5f)
                reflectiveQuadTo(805f, 118f)
                quadToRelative(-43f, 1f, -86.5f, 9.5f)
                reflectiveQuadTo(637f, 157f)
                quadToRelative(-38f, 20f, -59.5f, 48f)
                reflectiveQuadTo(542f, 275f)
                quadToRelative(14f, 19f, 39f, 52.5f)
                reflectiveQuadToRelative(38f, 61.5f)
                close()
                moveTo(380f, 597f)
                lineToRelative(-42f, -43f)
                lineToRelative(48f, -48f)
                lineToRelative(-60f, -49f)
                lineToRelative(94f, -95f)
                lineToRelative(42f, 43f)
                lineToRelative(-48f, 48f)
                lineToRelative(60f, 49f)
                lineToRelative(-94f, 95f)
                close()
            }
        }.build()
        
        return _Yoshoku!!
    }

private var _Yoshoku: ImageVector? = null

