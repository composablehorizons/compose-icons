package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_charging_full: ImageVector
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
                moveToRelative(-300f, -80f)
                close()
                moveToRelative(-80f, 80f)
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
                verticalLineToRelative(560f)
                horizontalLineToRelative(94f)
                quadToRelative(8f, 23f, 19.5f, 43f)
                reflectiveQuadTo(501f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_charging_full!!
    }

private var _Battery_charging_full: ImageVector? = null

