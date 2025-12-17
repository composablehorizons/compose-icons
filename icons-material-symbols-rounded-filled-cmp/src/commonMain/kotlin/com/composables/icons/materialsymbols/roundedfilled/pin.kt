package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(123f, -200f)
                quadToRelative(10f, 0f, 16.5f, -6.5f)
                reflectiveQuadTo(306f, 577f)
                verticalLineToRelative(-191f)
                quadToRelative(0f, -11f, -7.5f, -18.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(-5f, 0f, -9.5f, 1.5f)
                reflectiveQuadTo(262f, 366f)
                lineToRelative(-45f, 32f)
                quadToRelative(-7f, 5f, -8.5f, 13f)
                reflectiveQuadToRelative(3.5f, 16f)
                quadToRelative(5f, 8f, 13.5f, 9.5f)
                reflectiveQuadTo(242f, 433f)
                lineToRelative(18f, -13f)
                verticalLineToRelative(157f)
                quadToRelative(0f, 10f, 6.5f, 16.5f)
                reflectiveQuadTo(283f, 600f)
                close()
                moveToRelative(121f, 0f)
                horizontalLineToRelative(116f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-74f)
                lineToRelative(-2f, -2f)
                quadToRelative(21f, -20f, 34.5f, -34f)
                reflectiveQuadToRelative(21.5f, -22f)
                quadToRelative(18f, -18f, 27f, -36f)
                reflectiveQuadToRelative(9f, -38f)
                quadToRelative(0f, -29f, -22f, -48.5f)
                reflectiveQuadTo(458f, 360f)
                quadToRelative(-20f, 0f, -38f, 9.5f)
                reflectiveQuadTo(391f, 396f)
                quadToRelative(-5f, 7f, -1f, 15f)
                reflectiveQuadToRelative(12f, 11f)
                quadToRelative(8f, 3f, 16f, 0f)
                reflectiveQuadToRelative(14f, -9f)
                quadToRelative(5f, -5f, 11.5f, -8f)
                reflectiveQuadToRelative(14.5f, -3f)
                quadToRelative(15f, 0f, 24.5f, 8f)
                reflectiveQuadToRelative(9.5f, 20f)
                quadToRelative(0f, 11f, -4f, 20.5f)
                reflectiveQuadTo(470f, 474f)
                lineToRelative(-13f, 13f)
                lineToRelative(-19f, 19f)
                lineToRelative(-48f, 48f)
                quadToRelative(-2f, 2f, -6f, 14f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(276f, 0f)
                quadToRelative(36f, 0f, 58f, -20f)
                reflectiveQuadToRelative(22f, -52f)
                quadToRelative(0f, -18f, -10f, -32f)
                reflectiveQuadToRelative(-28f, -22f)
                verticalLineToRelative(-2f)
                quadToRelative(14f, -8f, 22f, -20.5f)
                reflectiveQuadToRelative(8f, -29.5f)
                quadToRelative(0f, -27f, -21f, -44.5f)
                reflectiveQuadTo(678f, 360f)
                quadToRelative(-20f, 0f, -37f, 9.5f)
                reflectiveQuadTo(613f, 393f)
                quadToRelative(-5f, 7f, -1f, 14f)
                reflectiveQuadToRelative(12f, 11f)
                quadToRelative(8f, 3f, 16f, 0.5f)
                reflectiveQuadToRelative(14f, -8.5f)
                quadToRelative(5f, -5f, 11f, -7.5f)
                reflectiveQuadToRelative(13f, -2.5f)
                quadToRelative(13f, 0f, 21.5f, 7.5f)
                reflectiveQuadTo(708f, 426f)
                quadToRelative(0f, 14f, -10f, 22f)
                reflectiveQuadToRelative(-26f, 8f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(20f, 0f, 32f, 8f)
                reflectiveQuadToRelative(12f, 22f)
                quadToRelative(0f, 13f, -11f, 22.5f)
                reflectiveQuadToRelative(-25f, 9.5f)
                quadToRelative(-12f, 0f, -20f, -4f)
                reflectiveQuadToRelative(-14f, -13f)
                quadToRelative(-5f, -7f, -12.5f, -9.5f)
                reflectiveQuadToRelative(-15.5f, 0.5f)
                quadToRelative(-9f, 4f, -13f, 11.5f)
                reflectiveQuadToRelative(0f, 15.5f)
                quadToRelative(11f, 20f, 30f, 30.5f)
                reflectiveQuadToRelative(45f, 10.5f)
                close()
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

