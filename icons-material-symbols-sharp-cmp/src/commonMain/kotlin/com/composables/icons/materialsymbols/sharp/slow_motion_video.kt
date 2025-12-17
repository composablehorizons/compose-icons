package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Slow_motion_video: ImageVector
    get() {
        if (_Slow_motion_video != null) return _Slow_motion_video!!
        
        _Slow_motion_video = ImageVector.Builder(
            name = "slow_motion_video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(170f, 732f)
                quadToRelative(-38f, -44f, -61f, -98f)
                reflectiveQuadTo(80f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(6f, 44f, 22f, 83.5f)
                reflectiveQuadToRelative(42f, 72.5f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 440f)
                quadToRelative(8f, -60f, 30f, -114f)
                reflectiveQuadToRelative(60f, -98f)
                lineToRelative(56f, 56f)
                quadToRelative(-26f, 33f, -42f, 72.5f)
                reflectiveQuadTo(162f, 440f)
                horizontalLineTo(80f)
                close()
                moveTo(438f, 878f)
                quadToRelative(-60f, -6f, -113.5f, -29f)
                reflectiveQuadTo(226f, 790f)
                lineToRelative(56f, -58f)
                quadToRelative(35f, 26f, 73.5f, 43f)
                reflectiveQuadToRelative(82.5f, 23f)
                verticalLineToRelative(80f)
                close()
                moveTo(284f, 228f)
                lineToRelative(-58f, -58f)
                quadToRelative(45f, -36f, 98.5f, -59f)
                reflectiveQuadTo(440f, 82f)
                verticalLineToRelative(80f)
                quadToRelative(-45f, 6f, -84f, 23f)
                reflectiveQuadToRelative(-72f, 43f)
                close()
                moveToRelative(96f, 432f)
                verticalLineToRelative(-360f)
                lineToRelative(280f, 180f)
                lineToRelative(-280f, 180f)
                close()
                moveTo(520f, 878f)
                verticalLineToRelative(-80f)
                quadToRelative(121f, -17f, 200.5f, -107f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -121f, -79.5f, -211f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(-80f)
                quadToRelative(154f, 17f, 257f, 130f)
                reflectiveQuadToRelative(103f, 268f)
                quadToRelative(0f, 155f, -103f, 268f)
                reflectiveQuadTo(520f, 878f)
                close()
            }
        }.build()
        
        return _Slow_motion_video!!
    }

private var _Slow_motion_video: ImageVector? = null

