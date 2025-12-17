package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Media_output_off: ImageVector
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
                moveTo(288f, 400f)
                close()
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
                moveToRelative(-160f, -80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(263f, -331f)
                lineToRelative(-46f, -46f)
                quadToRelative(23f, -11f, 49f, -17f)
                reflectiveQuadToRelative(54f, -6f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(126f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(-15f, 0f, -29f, 2f)
                reflectiveQuadToRelative(-28f, 7f)
                close()
                moveTo(320f, 679f)
                quadToRelative(-51f, -8f, -85.5f, -46.5f)
                reflectiveQuadTo(200f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(19f, 0f, 36.5f, 4.5f)
                reflectiveQuadTo(409f, 418f)
                quadToRelative(-14f, 15f, -26.5f, 31.5f)
                reflectiveQuadTo(360f, 484f)
                quadToRelative(-5f, -2f, -10f, -3f)
                reflectiveQuadToRelative(-10f, -1f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 540f)
                quadToRelative(0f, 20f, 12f, 36f)
                reflectiveQuadToRelative(31f, 21f)
                quadToRelative(-2f, 11f, -2.5f, 21.5f)
                reflectiveQuadTo(320f, 640f)
                verticalLineToRelative(39f)
                close()
                moveToRelative(-46f, -519f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(326f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(162f)
                quadToRelative(-21f, 2f, -41f, 7.5f)
                reflectiveQuadTo(520f, 343f)
                verticalLineToRelative(-183f)
                horizontalLineTo(274f)
                close()
                moveToRelative(137f, 102f)
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

