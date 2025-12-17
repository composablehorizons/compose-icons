package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Photo_prints: ImageVector
    get() {
        if (_Photo_prints != null) return _Photo_prints!!
        
        _Photo_prints = ImageVector.Builder(
            name = "photo_prints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581f, 440f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(621f, 400f)
                verticalLineToRelative(-10f)
                lineToRelative(10f, 4f)
                quadToRelative(15f, 6f, 30.5f, 3f)
                reflectiveQuadToRelative(23.5f, -17f)
                quadToRelative(9f, -15f, 6f, -32f)
                reflectiveQuadToRelative(-20f, -24f)
                lineToRelative(-10f, -4f)
                lineToRelative(10f, -4f)
                quadToRelative(17f, -7f, 19.5f, -24.5f)
                reflectiveQuadTo(685f, 260f)
                quadToRelative(-9f, -15f, -24f, -17.5f)
                reflectiveQuadToRelative(-30f, 3.5f)
                lineToRelative(-10f, 4f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(581f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(541f, 240f)
                verticalLineToRelative(10f)
                lineToRelative(-10f, -4f)
                quadToRelative(-15f, -6f, -30f, -3.5f)
                reflectiveQuadTo(477f, 260f)
                quadToRelative(-8f, 14f, -5.5f, 31.5f)
                reflectiveQuadTo(491f, 316f)
                lineToRelative(10f, 4f)
                lineToRelative(-10f, 4f)
                quadToRelative(-17f, 7f, -20f, 24f)
                reflectiveQuadToRelative(6f, 32f)
                quadToRelative(8f, 14f, 23.5f, 17f)
                reflectiveQuadToRelative(30.5f, -3f)
                lineToRelative(10f, -4f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(581f, 440f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(541f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(581f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(621f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(581f, 360f)
                close()
                moveTo(361f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(281f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(361f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(881f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(801f, 680f)
                horizontalLineTo(361f)
                close()
                moveTo(229f, 875f)
                quadToRelative(-33f, 5f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -54f)
                lineTo(86f, 368f)
                quadToRelative(-4f, -33f, 16.5f, -59f)
                reflectiveQuadToRelative(53.5f, -30f)
                lineToRelative(45f, -5f)
                verticalLineToRelative(366f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(411f)
                quadToRelative(-6f, 24f, -24f, 41.5f)
                reflectiveQuadTo(664f, 822f)
                lineTo(229f, 875f)
                close()
                moveToRelative(352f, -315f)
                quadToRelative(34f, 0f, 63f, -12.5f)
                reflectiveQuadToRelative(52f, -34.5f)
                quadToRelative(18f, -17f, 31f, -39.5f)
                reflectiveQuadToRelative(18f, -48.5f)
                quadToRelative(2f, -10f, -4.5f, -17.5f)
                reflectiveQuadTo(724f, 402f)
                quadToRelative(-26f, 4f, -49.5f, 16f)
                reflectiveQuadTo(633f, 447f)
                quadToRelative(-23f, 22f, -36.5f, 51f)
                reflectiveQuadTo(581f, 560f)
                close()
                moveToRelative(0f, 0f)
                quadToRelative(-2f, -33f, -15.5f, -62f)
                reflectiveQuadTo(529f, 447f)
                quadToRelative(-18f, -17f, -41.5f, -29f)
                reflectiveQuadTo(438f, 402f)
                quadToRelative(-10f, -2f, -16.5f, 5.5f)
                reflectiveQuadTo(417f, 425f)
                quadToRelative(5f, 26f, 18f, 48.5f)
                reflectiveQuadToRelative(31f, 39.5f)
                quadToRelative(23f, 22f, 52f, 34.5f)
                reflectiveQuadToRelative(63f, 12.5f)
                close()
            }
        }.build()
        
        return _Photo_prints!!
    }

private var _Photo_prints: ImageVector? = null

