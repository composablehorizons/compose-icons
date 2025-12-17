package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_bottle: ImageVector
    get() {
        if (_Water_bottle != null) return _Water_bottle!!
        
        _Water_bottle = ImageVector.Builder(
            name = "water_bottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(393f, 880f)
                quadToRelative(-31f, 0f, -54f, -20.5f)
                reflectiveQuadTo(313f, 808f)
                lineToRelative(-31f, -346f)
                quadToRelative(-1f, -10f, 3.5f, -18.5f)
                reflectiveQuadTo(299f, 430f)
                quadToRelative(8f, -5f, 14f, -12f)
                reflectiveQuadToRelative(6f, -17f)
                quadToRelative(0f, -9f, -4f, -16.5f)
                reflectiveQuadTo(303f, 372f)
                quadToRelative(-10f, -5f, -15f, -15.5f)
                reflectiveQuadToRelative(-2f, -21.5f)
                lineToRelative(26f, -105f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(109f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(109f)
                quadToRelative(14f, 0f, 24.5f, 8f)
                reflectiveQuadToRelative(13.5f, 22f)
                lineToRelative(27f, 105f)
                quadToRelative(3f, 11f, -2f, 21.5f)
                reflectiveQuadTo(697f, 372f)
                quadToRelative(-8f, 4f, -12.5f, 11f)
                reflectiveQuadToRelative(-4.5f, 16f)
                quadToRelative(0f, 11f, 5.5f, 18.5f)
                reflectiveQuadTo(700f, 430f)
                quadToRelative(9f, 5f, 14f, 13.5f)
                reflectiveQuadToRelative(4f, 18.5f)
                lineToRelative(-31f, 345f)
                quadToRelative(-3f, 31f, -26f, 52f)
                reflectiveQuadToRelative(-54f, 21f)
                horizontalLineTo(393f)
                close()
            }
        }.build()
        
        return _Water_bottle!!
    }

private var _Water_bottle: ImageVector? = null

