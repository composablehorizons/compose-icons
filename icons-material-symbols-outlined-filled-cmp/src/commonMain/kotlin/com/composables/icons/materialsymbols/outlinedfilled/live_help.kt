package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Live_help: ImageVector
    get() {
        if (_Live_help != null) return _Live_help!!
        
        _Live_help = ImageVector.Builder(
            name = "live_help",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(360f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(600f)
                lineTo(480f, 920f)
                close()
                moveToRelative(-4f, -240f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(526f, 630f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(476f, 580f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(426f, 630f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(476f, 680f)
                close()
                moveToRelative(-36f, -154f)
                horizontalLineToRelative(74f)
                quadToRelative(0f, -17f, 1.5f, -29f)
                reflectiveQuadToRelative(6.5f, -23f)
                quadToRelative(5f, -11f, 12.5f, -20.5f)
                reflectiveQuadTo(556f, 430f)
                quadToRelative(35f, -35f, 49.5f, -58.5f)
                reflectiveQuadTo(620f, 318f)
                quadToRelative(0f, -53f, -36f, -85.5f)
                reflectiveQuadTo(487f, 200f)
                quadToRelative(-55f, 0f, -93.5f, 27f)
                reflectiveQuadTo(340f, 302f)
                lineToRelative(66f, 26f)
                quadToRelative(7f, -27f, 28f, -43.5f)
                reflectiveQuadToRelative(49f, -16.5f)
                quadToRelative(27f, 0f, 45f, 14.5f)
                reflectiveQuadToRelative(18f, 38.5f)
                quadToRelative(0f, 17f, -11f, 36f)
                reflectiveQuadToRelative(-37f, 42f)
                quadToRelative(-17f, 14f, -27.5f, 27.5f)
                reflectiveQuadTo(453f, 455f)
                quadToRelative(-7f, 15f, -10f, 31.5f)
                reflectiveQuadToRelative(-3f, 39.5f)
                close()
            }
        }.build()
        
        return _Live_help!!
    }

private var _Live_help: ImageVector? = null

