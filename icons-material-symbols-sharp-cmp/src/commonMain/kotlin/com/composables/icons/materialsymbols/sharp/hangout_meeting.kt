package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hangout_meeting: ImageVector
    get() {
        if (_Hangout_meeting != null) return _Hangout_meeting!!
        
        _Hangout_meeting = ImageVector.Builder(
            name = "hangout_meeting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 656f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 616f)
                verticalLineToRelative(-30f)
                lineToRelative(80f, 50f)
                verticalLineTo(436f)
                lineToRelative(-80f, 50f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 416f)
                horizontalLineTo(380f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 456f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 656f)
                close()
                moveToRelative(100f, 360f)
                verticalLineTo(876f)
                quadToRelative(-73f, 0f, -138.5f, -27.5f)
                reflectiveQuadToRelative(-114.5f, -74f)
                quadToRelative(-49f, -46.5f, -78f, -108f)
                reflectiveQuadTo(120f, 536f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114.5f)
                quadToRelative(48.5f, -49f, 114f, -77f)
                reflectiveQuadTo(480f, 176f)
                quadToRelative(75f, 0f, 140.5f, 28f)
                reflectiveQuadTo(735f, 281f)
                quadToRelative(49f, 49f, 77f, 114.5f)
                reflectiveQuadTo(840f, 536f)
                quadToRelative(0f, 141f, -94f, 266.5f)
                reflectiveQuadTo(480f, 1016f)
                close()
                moveToRelative(80f, -144f)
                quadToRelative(96f, -72f, 148f, -159.5f)
                reflectiveQuadTo(760f, 536f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 104f, 84f, 182f)
                reflectiveQuadToRelative(196f, 78f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(76f)
                close()
                moveToRelative(-80f, -308f)
                close()
            }
        }.build()
        
        return _Hangout_meeting!!
    }

private var _Hangout_meeting: ImageVector? = null

