package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_charging_50: ImageVector
    get() {
        if (_Battery_charging_50 != null) return _Battery_charging_50!!
        
        _Battery_charging_50 = ImageVector.Builder(
            name = "battery_charging_50",
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
                moveToRelative(-380f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(-21f, 0f, -41f, 3.5f)
                reflectiveQuadTo(600f, 494f)
                verticalLineToRelative(-254f)
                horizontalLineTo(360f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(142f)
                quadToRelative(-29f, 32f, -45.5f, 72.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 46f, 16f, 87f)
                reflectiveQuadToRelative(45f, 73f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_charging_50!!
    }

private var _Battery_charging_50: ImageVector? = null

