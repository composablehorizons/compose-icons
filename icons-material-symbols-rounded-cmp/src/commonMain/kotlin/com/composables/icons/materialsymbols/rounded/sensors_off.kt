package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sensors_off: ImageVector
    get() {
        if (_Sensors_off != null) return _Sensors_off!!
        
        _Sensors_off = ImageVector.Builder(
            name = "sensors_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(325f, 439f)
                quadToRelative(-2f, 10f, -3.5f, 20f)
                reflectiveQuadToRelative(-1.5f, 21f)
                quadToRelative(0f, 23f, 6f, 43.5f)
                reflectiveQuadToRelative(17f, 38.5f)
                quadToRelative(9f, 14f, 8.5f, 31f)
                reflectiveQuadTo(339f, 622f)
                quadToRelative(-12f, 12f, -29f, 11.5f)
                reflectiveQuadTo(284f, 619f)
                quadToRelative(-21f, -29f, -32.5f, -65f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -28f, 6f, -54f)
                reflectiveQuadToRelative(17f, -49f)
                lineToRelative(-59f, -59f)
                quadToRelative(-21f, 36f, -32.5f, 76.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 56f, 17f, 105.5f)
                reflectiveQuadToRelative(49f, 89.5f)
                quadToRelative(11f, 14f, 11f, 30.5f)
                reflectiveQuadTo(225f, 734f)
                quadToRelative(-12f, 12f, -29f, 11.5f)
                reflectiveQuadTo(168f, 731f)
                quadToRelative(-42f, -52f, -65f, -115.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17.5f, -117f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(27f, -214f)
                quadToRelative(-14f, -8f, -18.5f, -24f)
                reflectiveQuadToRelative(2.5f, -31f)
                quadToRelative(13f, -29f, 19.5f, -61f)
                reflectiveQuadToRelative(6.5f, -66f)
                quadToRelative(0f, -56f, -17f, -105.5f)
                reflectiveQuadTo(734f, 285f)
                quadToRelative(-11f, -14f, -11.5f, -30.5f)
                reflectiveQuadTo(734f, 226f)
                quadToRelative(12f, -12f, 29.5f, -11.5f)
                reflectiveQuadTo(792f, 229f)
                quadToRelative(42f, 51f, 65f, 115f)
                reflectiveQuadToRelative(23f, 136f)
                quadToRelative(0f, 45f, -9.5f, 87.5f)
                reflectiveQuadTo(843f, 648f)
                quadToRelative(-7f, 14f, -23f, 18f)
                reflectiveQuadToRelative(-30f, -4f)
                close()
                moveToRelative(-125f, -93f)
                quadToRelative(-17f, -4f, -25.5f, -17.5f)
                reflectiveQuadTo(635f, 521f)
                quadToRelative(2f, -10f, 3.5f, -20f)
                reflectiveQuadToRelative(1.5f, -21f)
                quadToRelative(0f, -23f, -6f, -43.5f)
                reflectiveQuadTo(617f, 398f)
                quadToRelative(-9f, -14f, -8f, -31f)
                reflectiveQuadToRelative(13f, -29f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(26f, 14.5f)
                quadToRelative(21f, 29f, 32.5f, 64.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 15f, -1.5f, 30f)
                reflectiveQuadToRelative(-5.5f, 29f)
                quadToRelative(-4f, 16f, -17.5f, 25f)
                reflectiveQuadToRelative(-30.5f, 5f)
                close()
            }
        }.build()
        
        return _Sensors_off!!
    }

private var _Sensors_off: ImageVector? = null

