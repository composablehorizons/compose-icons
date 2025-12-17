package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shutter_speed: ImageVector
    get() {
        if (_Shutter_speed != null) return _Shutter_speed!!
        
        _Shutter_speed = ImageVector.Builder(
            name = "shutter_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 120f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, 760f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadTo(225f, 774f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(63f, 0f, 120f, 21f)
                reflectiveQuadToRelative(104f, 59f)
                lineToRelative(30f, -30f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(790f, 210f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(791f, 266f)
                lineToRelative(-29f, 30f)
                quadToRelative(36f, 47f, 57f, 104f)
                reflectiveQuadToRelative(21f, 120f)
                quadToRelative(0f, 74f, -28f, 139.5f)
                reflectiveQuadTo(735f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(35f, -360f)
                horizontalLineToRelative(162f)
                quadToRelative(11f, 0f, 16.5f, -8.5f)
                reflectiveQuadTo(695f, 414f)
                quadToRelative(-18f, -37f, -49f, -66.5f)
                reflectiveQuadTo(580f, 301f)
                quadToRelative(-7f, -3f, -14f, -0.5f)
                reflectiveQuadToRelative(-11f, 9.5f)
                lineToRelative(-58f, 100f)
                quadToRelative(-6f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(17.5f, 10f)
                close()
                moveToRelative(-87f, 10f)
                lineToRelative(82f, -142f)
                quadToRelative(5f, -8f, 0.5f, -17f)
                reflectiveQuadTo(496f, 280f)
                quadToRelative(-40f, -3f, -80f, 9f)
                reflectiveQuadToRelative(-75f, 35f)
                quadToRelative(-6f, 5f, -7.5f, 12f)
                reflectiveQuadToRelative(2.5f, 14f)
                lineToRelative(58f, 100f)
                quadToRelative(6f, 10f, 17f, 10f)
                reflectiveQuadToRelative(17f, -10f)
                close()
                moveToRelative(-52f, 110f)
                quadToRelative(11f, 0f, 17.5f, -10f)
                reflectiveQuadToRelative(0.5f, -20f)
                lineToRelative(-82f, -142f)
                quadToRelative(-5f, -9f, -15f, -9.5f)
                reflectiveQuadToRelative(-16f, 7.5f)
                quadToRelative(-23f, 33f, -33.5f, 74.5f)
                reflectiveQuadTo(242f, 542f)
                quadToRelative(1f, 8f, 6.5f, 13f)
                reflectiveQuadToRelative(13.5f, 5f)
                horizontalLineToRelative(114f)
                close()
                moveToRelative(87f, 70f)
                quadToRelative(6f, -10f, -0.5f, -20f)
                reflectiveQuadTo(445f, 600f)
                horizontalLineTo(282f)
                quadToRelative(-10f, 0f, -15.5f, 8.5f)
                reflectiveQuadTo(265f, 626f)
                quadToRelative(18f, 36f, 49f, 65.5f)
                reflectiveQuadToRelative(66f, 46.5f)
                quadToRelative(7f, 3f, 14f, 1f)
                reflectiveQuadToRelative(11f, -9f)
                lineToRelative(58f, -100f)
                close()
                moveToRelative(103f, -40f)
                quadToRelative(-6f, -10f, -17f, -10f)
                reflectiveQuadToRelative(-17f, 10f)
                lineToRelative(-81f, 140f)
                quadToRelative(-5f, 9f, -0.5f, 18.5f)
                reflectiveQuadTo(466f, 760f)
                quadToRelative(43f, 2f, 83f, -10f)
                reflectiveQuadToRelative(70f, -34f)
                quadToRelative(6f, -5f, 7.5f, -12f)
                reflectiveQuadToRelative(-2.5f, -14f)
                lineToRelative(-58f, -100f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(82f, 141f)
                quadToRelative(5f, 9f, 15.5f, 9.5f)
                reflectiveQuadTo(680f, 653f)
                quadToRelative(23f, -34f, 32.5f, -74.5f)
                reflectiveQuadTo(718f, 497f)
                quadToRelative(-1f, -8f, -6.5f, -12.5f)
                reflectiveQuadTo(698f, 480f)
                horizontalLineTo(584f)
                quadToRelative(-11f, 0f, -17.5f, 10f)
                reflectiveQuadToRelative(-0.5f, 20f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

