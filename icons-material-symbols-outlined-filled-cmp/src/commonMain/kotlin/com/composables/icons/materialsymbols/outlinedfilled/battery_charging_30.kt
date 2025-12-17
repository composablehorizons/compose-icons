package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_charging_30: ImageVector
    get() {
        if (_Battery_charging_30 != null) return _Battery_charging_30!!
        
        _Battery_charging_30 = ImageVector.Builder(
            name = "battery_charging_30",
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
                quadToRelative(-21f, 0f, -41f, 3.5f)
                reflectiveQuadTo(600f, 494f)
                verticalLineToRelative(-254f)
                horizontalLineTo(360f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(94f)
                quadToRelative(-7f, 19f, -10.5f, 39f)
                reflectiveQuadToRelative(-3.5f, 41f)
                quadToRelative(0f, 46f, 16f, 87f)
                reflectiveQuadToRelative(45f, 73f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_charging_30!!
    }

private var _Battery_charging_30: ImageVector? = null

