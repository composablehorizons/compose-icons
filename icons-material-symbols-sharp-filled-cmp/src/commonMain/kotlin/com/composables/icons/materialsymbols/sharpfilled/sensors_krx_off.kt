package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sensors_krx_off: ImageVector
    get() {
        if (_Sensors_krx_off != null) return _Sensors_krx_off!!
        
        _Sensors_krx_off = ImageVector.Builder(
            name = "sensors_krx_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(148f, 703f)
                quadToRelative(-32f, -48f, -50f, -104.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -63f, 18f, -119f)
                reflectiveQuadToRelative(50f, -104f)
                lineToRelative(67f, 44f)
                quadToRelative(-26f, 38f, -40.5f, 83.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 50f, 14.5f, 95f)
                reflectiveQuadToRelative(40.5f, 83f)
                lineToRelative(-67f, 45f)
                close()
                moveToRelative(549f, -122f)
                lineTo(379f, 263f)
                quadToRelative(23f, -11f, 48.5f, -17f)
                reflectiveQuadToRelative(52.5f, -6f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 27f, -6f, 52.5f)
                reflectiveQuadTo(697f, 581f)
                close()
                moveToRelative(117f, 117f)
                lineToRelative(-58f, -58f)
                quadToRelative(21f, -35f, 32.5f, -75f)
                reflectiveQuadToRelative(11.5f, -85f)
                quadToRelative(0f, -50f, -14.5f, -95.5f)
                reflectiveQuadTo(745f, 301f)
                lineToRelative(66f, -44f)
                quadToRelative(32f, 48f, 50.5f, 104f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 60f, -17.5f, 115f)
                reflectiveQuadTo(814f, 698f)
                close()
                moveTo(791f, 904f)
                lineTo(584f, 696f)
                quadToRelative(-23f, 11f, -49.5f, 17.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -28f, 6.5f, -54.5f)
                reflectiveQuadTo(264f, 376f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Sensors_krx_off!!
    }

private var _Sensors_krx_off: ImageVector? = null

