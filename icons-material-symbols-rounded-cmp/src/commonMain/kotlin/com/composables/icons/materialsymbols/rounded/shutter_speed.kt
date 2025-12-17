package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shutter_speed: ImageVector
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
                moveToRelative(0f, -360f)
                close()
                moveToRelative(35f, -80f)
                horizontalLineToRelative(204f)
                quadToRelative(11f, 0f, 17f, -8.5f)
                reflectiveQuadToRelative(2f, -18.5f)
                quadToRelative(-17f, -46f, -55f, -85.5f)
                reflectiveQuadTo(601f, 268f)
                quadToRelative(-7f, -3f, -14.5f, -1f)
                reflectiveQuadToRelative(-11.5f, 9f)
                lineToRelative(-78f, 134f)
                quadToRelative(-6f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(17.5f, 10f)
                close()
                moveToRelative(-88f, 10f)
                lineToRelative(103f, -178f)
                quadToRelative(5f, -9f, 1f, -18f)
                reflectiveQuadToRelative(-15f, -11f)
                quadToRelative(-51f, -6f, -102f, 5.5f)
                reflectiveQuadTo(321f, 289f)
                quadToRelative(-6f, 5f, -8f, 12.5f)
                reflectiveQuadToRelative(2f, 14.5f)
                lineToRelative(78f, 134f)
                quadToRelative(6f, 10f, 17f, 10f)
                reflectiveQuadToRelative(17f, -10f)
                close()
                moveToRelative(-52f, 110f)
                quadToRelative(11f, 0f, 17.5f, -10f)
                reflectiveQuadToRelative(0.5f, -20f)
                lineTo(291f, 353f)
                quadToRelative(-5f, -9f, -15.5f, -9.5f)
                reflectiveQuadTo(258f, 351f)
                quadToRelative(-29f, 41f, -45f, 90.5f)
                reflectiveQuadTo(202f, 542f)
                quadToRelative(1f, 8f, 6.5f, 13f)
                reflectiveQuadToRelative(13.5f, 5f)
                horizontalLineToRelative(153f)
                close()
                moveToRelative(88f, 70f)
                quadToRelative(6f, -10f, -0.5f, -20f)
                reflectiveQuadTo(445f, 600f)
                horizontalLineTo(241f)
                quadToRelative(-11f, 0f, -17f, 8.5f)
                reflectiveQuadToRelative(-2f, 18.5f)
                quadToRelative(17f, 46f, 55f, 85.5f)
                reflectiveQuadToRelative(82f, 59.5f)
                quadToRelative(7f, 3f, 14.5f, 1f)
                reflectiveQuadToRelative(11.5f, -9f)
                lineToRelative(78f, -134f)
                close()
                moveToRelative(104f, -40f)
                quadToRelative(-6f, -10f, -17f, -10f)
                reflectiveQuadToRelative(-17f, 10f)
                lineTo(430f, 767f)
                quadToRelative(-5f, 9f, -1f, 18.5f)
                reflectiveQuadToRelative(15f, 11.5f)
                quadToRelative(49f, 9f, 102f, -4f)
                reflectiveQuadToRelative(93f, -42f)
                quadToRelative(6f, -5f, 8f, -12.5f)
                reflectiveQuadToRelative(-2f, -14.5f)
                lineToRelative(-78f, -134f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(102f, 177f)
                quadToRelative(5f, 9f, 15.5f, 9.5f)
                reflectiveQuadTo(702f, 689f)
                quadToRelative(31f, -38f, 46.5f, -90f)
                reflectiveQuadToRelative(9.5f, -101f)
                quadToRelative(-1f, -8f, -6.5f, -13f)
                reflectiveQuadToRelative(-13.5f, -5f)
                horizontalLineTo(585f)
                quadToRelative(-11f, 0f, -17.5f, 10f)
                reflectiveQuadToRelative(-0.5f, 20f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

