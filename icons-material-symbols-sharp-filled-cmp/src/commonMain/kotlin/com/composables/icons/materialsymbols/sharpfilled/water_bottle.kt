package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Water_bottle: ImageVector
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
                moveTo(320f, 880f)
                lineToRelative(-40f, -440f)
                lineToRelative(19f, -10f)
                quadToRelative(8f, -5f, 14f, -12f)
                reflectiveQuadToRelative(6f, -17f)
                quadToRelative(0f, -9f, -4f, -17f)
                reflectiveQuadToRelative(-12f, -12f)
                lineToRelative(-23f, -12f)
                lineToRelative(40f, -160f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(140f)
                lineToRelative(39f, 158f)
                lineToRelative(-23f, 12f)
                quadToRelative(-8f, 4f, -12f, 12f)
                reflectiveQuadToRelative(-4f, 17f)
                quadToRelative(0f, 10f, 6f, 17.5f)
                reflectiveQuadToRelative(14f, 12.5f)
                lineToRelative(19f, 9f)
                lineToRelative(-39f, 442f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Water_bottle!!
    }

private var _Water_bottle: ImageVector? = null

