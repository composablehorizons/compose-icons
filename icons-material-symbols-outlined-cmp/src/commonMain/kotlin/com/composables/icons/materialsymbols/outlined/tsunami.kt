package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tsunami: ImageVector
    get() {
        if (_Tsunami != null) return _Tsunami!!
        
        _Tsunami = ImageVector.Builder(
            name = "tsunami",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 68f, -14.5f)
                reflectiveQuadToRelative(65f, -40.5f)
                quadToRelative(30f, 25f, 65.5f, 39.5f)
                reflectiveQuadTo(347f, 759f)
                quadToRelative(33f, 0f, 69f, -14f)
                reflectiveQuadToRelative(65f, -40f)
                quadToRelative(32f, 28f, 66f, 41f)
                reflectiveQuadToRelative(68f, 13f)
                quadToRelative(33f, 0f, 64.5f, -13f)
                reflectiveQuadToRelative(69.5f, -41f)
                quadToRelative(39f, 30f, 69f, 42.5f)
                reflectiveQuadToRelative(62f, 12.5f)
                verticalLineToRelative(80f)
                quadToRelative(-35f, 0f, -67.5f, -9.5f)
                reflectiveQuadTo(749f, 803f)
                quadToRelative(-32f, 20f, -66.5f, 28.5f)
                reflectiveQuadTo(615f, 840f)
                quadToRelative(-33f, 0f, -67.5f, -8.5f)
                reflectiveQuadTo(481f, 803f)
                quadToRelative(-29f, 19f, -64f, 28f)
                reflectiveQuadToRelative(-70f, 9f)
                quadToRelative(-34f, 0f, -68f, -9f)
                reflectiveQuadToRelative(-66f, -28f)
                quadToRelative(-31f, 18f, -64.5f, 27.5f)
                reflectiveQuadTo(80f, 840f)
                close()
                moveToRelative(0f, -180f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -97f, 37.5f, -181f)
                reflectiveQuadTo(220f, 253f)
                quadToRelative(65f, -62f, 152.5f, -97.5f)
                reflectiveQuadTo(560f, 120f)
                quadToRelative(33f, 0f, 65.5f, 3.5f)
                reflectiveQuadTo(684f, 133f)
                quadToRelative(-21f, 32f, -32.5f, 67.5f)
                reflectiveQuadTo(640f, 267f)
                quadToRelative(0f, 55f, 39f, 94f)
                reflectiveQuadToRelative(94f, 39f)
                horizontalLineToRelative(107f)
                verticalLineToRelative(80f)
                horizontalLineTo(773f)
                quadToRelative(-89f, 0f, -151f, -62f)
                reflectiveQuadToRelative(-62f, -151f)
                quadToRelative(0f, -14f, 2f, -29.5f)
                reflectiveQuadToRelative(6f, -30.5f)
                quadToRelative(-74f, 18f, -121f, 76.5f)
                reflectiveQuadTo(400f, 420f)
                quadToRelative(0f, 36f, 11.5f, 68.5f)
                reflectiveQuadTo(444f, 550f)
                quadToRelative(8f, -5f, 17f, -11.5f)
                reflectiveQuadToRelative(19f, -13.5f)
                quadToRelative(29f, 26f, 67f, 40f)
                reflectiveQuadToRelative(68f, 14f)
                quadToRelative(30f, 0f, 67f, -14.5f)
                reflectiveQuadToRelative(67f, -39.5f)
                quadToRelative(32f, 24f, 63.5f, 39.5f)
                reflectiveQuadTo(880f, 580f)
                verticalLineToRelative(80f)
                quadToRelative(-35f, 0f, -67.5f, -9.5f)
                reflectiveQuadTo(749f, 623f)
                quadToRelative(-32f, 20f, -65f, 28.5f)
                reflectiveQuadToRelative(-69f, 8.5f)
                quadToRelative(-36f, 0f, -72f, -10f)
                reflectiveQuadToRelative(-62f, -27f)
                quadToRelative(-31f, 19f, -65f, 27.5f)
                reflectiveQuadToRelative(-69f, 9.5f)
                quadToRelative(-35f, 1f, -69f, -9f)
                reflectiveQuadToRelative(-65f, -28f)
                quadToRelative(-31f, 18f, -64.5f, 27.5f)
                reflectiveQuadTo(80f, 660f)
                close()
                moveToRelative(265f, -81f)
                horizontalLineToRelative(10f)
                quadToRelative(5f, 0f, 10f, -1f)
                quadToRelative(-22f, -35f, -33.5f, -75f)
                reflectiveQuadTo(320f, 420f)
                quadToRelative(0f, -81f, 37f, -146.5f)
                reflectiveQuadTo(460f, 166f)
                verticalLineToRelative(44f)
                quadToRelative(-62f, 16f, -114.5f, 48.5f)
                reflectiveQuadToRelative(-92f, 78.5f)
                quadTo(214f, 383f, 190f, 439.5f)
                reflectiveQuadTo(161f, 560f)
                quadToRelative(15f, -9f, 26f, -16f)
                reflectiveQuadToRelative(26f, -19f)
                quadToRelative(37f, 27f, 67f, 40.5f)
                reflectiveQuadToRelative(65f, 13.5f)
                close()
                moveToRelative(-75f, -168f)
                close()
            }
        }.build()
        
        return _Tsunami!!
    }

private var _Tsunami: ImageVector? = null

