package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Media_output_off: ImageVector
    get() {
        if (_Media_output_off != null) return _Media_output_off!!
        
        _Media_output_off = ImageVector.Builder(
            name = "media_output_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -51f, 19f, -94.5f)
                reflectiveQuadToRelative(51f, -75.5f)
                lineToRelative(43f, 43f)
                quadToRelative(-25f, 25f, -39f, 57f)
                reflectiveQuadToRelative(-14f, 70f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(400f, -114f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(-15f, 0f, -29f, 2f)
                reflectiveQuadToRelative(-28f, 7f)
                lineToRelative(-46f, -46f)
                quadToRelative(23f, -11f, 49f, -17f)
                reflectiveQuadToRelative(54f, -6f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(126f)
                close()
                moveTo(323f, 597f)
                quadToRelative(-19f, -5f, -31f, -21f)
                reflectiveQuadToRelative(-12f, -36f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(5f, 0f, 10f, 1f)
                reflectiveQuadToRelative(10f, 3f)
                quadToRelative(-14f, 26f, -23.5f, 54f)
                reflectiveQuadTo(323f, 597f)
                close()
                moveToRelative(155f, -233f)
                lineTo(194f, 80f)
                horizontalLineToRelative(326f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(162f)
                quadToRelative(-33f, 4f, -63.5f, 15f)
                reflectiveQuadTo(478f, 364f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-603f)
                horizontalLineToRelative(37f)
                lineToRelative(296f, 296f)
                lineToRelative(-2.5f, 2.5f)
                quadToRelative(-0.5f, 0.5f, -1.5f, 2.5f)
                quadToRelative(-15f, -9f, -32.5f, -13.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 54f, 34.5f, 92.5f)
                reflectiveQuadTo(320f, 679f)
                verticalLineToRelative(121f)
                horizontalLineTo(160f)
                close()
                moveTo(792f, 904f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Media_output_off!!
    }

private var _Media_output_off: ImageVector? = null

