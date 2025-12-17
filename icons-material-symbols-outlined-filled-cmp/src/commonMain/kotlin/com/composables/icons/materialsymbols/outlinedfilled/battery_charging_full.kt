package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_charging_full: ImageVector
    get() {
        if (_Battery_charging_full != null) return _Battery_charging_full!!
        
        _Battery_charging_full = ImageVector.Builder(
            name = "battery_charging_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                lineToRelative(140f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                lineTo(660f, 880f)
                close()
                moveToRelative(-340f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(280f)
                quadToRelative(-100f, 1f, -170f, 70.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 46f, 16f, 87f)
                reflectiveQuadToRelative(45f, 73f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_charging_full!!
    }

private var _Battery_charging_full: ImageVector? = null

