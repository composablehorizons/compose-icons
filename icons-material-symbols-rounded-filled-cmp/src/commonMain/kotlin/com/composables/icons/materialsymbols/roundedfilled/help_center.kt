package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Help_center: ImageVector
    get() {
        if (_Help_center != null) return _Help_center!!
        
        _Help_center = ImageVector.Builder(
            name = "help_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(530f, 670f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(430f, 670f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(144f, -362f)
                quadToRelative(0f, -54f, -36.5f, -86f)
                reflectiveQuadTo(491f, 240f)
                quadToRelative(-45f, 0f, -79.5f, 18.5f)
                reflectiveQuadTo(357f, 312f)
                quadToRelative(-7f, 11f, -0.5f, 24f)
                reflectiveQuadToRelative(20.5f, 19f)
                quadToRelative(12f, 5f, 25f, 0.5f)
                reflectiveQuadToRelative(22f, -16.5f)
                quadToRelative(11f, -15f, 27.5f, -23f)
                reflectiveQuadToRelative(35.5f, -8f)
                quadToRelative(28f, 0f, 45.5f, 15f)
                reflectiveQuadToRelative(17.5f, 38f)
                quadToRelative(0f, 18f, -12f, 38f)
                reflectiveQuadToRelative(-36f, 40f)
                quadToRelative(-26f, 23f, -39f, 43f)
                reflectiveQuadToRelative(-17f, 47f)
                quadToRelative(-2f, 14f, 8.5f, 25.5f)
                reflectiveQuadTo(481f, 566f)
                quadToRelative(14f, 0f, 25.5f, -9.5f)
                reflectiveQuadTo(521f, 531f)
                quadToRelative(3f, -16f, 11f, -28.5f)
                reflectiveQuadToRelative(28f, -32.5f)
                quadToRelative(38f, -38f, 51f, -61f)
                reflectiveQuadToRelative(13f, -51f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Help_center!!
    }

private var _Help_center: ImageVector? = null

