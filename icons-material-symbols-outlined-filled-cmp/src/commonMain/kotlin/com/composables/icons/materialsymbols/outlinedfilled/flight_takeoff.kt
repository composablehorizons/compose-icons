package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flight_takeoff: ImageVector
    get() {
        if (_Flight_takeoff != null) return _Flight_takeoff!!
        
        _Flight_takeoff = ImageVector.Builder(
            name = "flight_takeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(74f, -200f)
                lineTo(80f, 446f)
                lineToRelative(62f, -12f)
                lineToRelative(70f, 62f)
                lineToRelative(192f, -52f)
                lineToRelative(-162f, -274f)
                lineToRelative(78f, -24f)
                lineToRelative(274f, 246f)
                lineToRelative(200f, -54f)
                quadToRelative(32f, -9f, 58f, 12f)
                reflectiveQuadToRelative(26f, 56f)
                quadToRelative(0f, 22f, -13.5f, 39f)
                reflectiveQuadTo(830f, 468f)
                lineTo(194f, 640f)
                close()
            }
        }.build()
        
        return _Flight_takeoff!!
    }

private var _Flight_takeoff: ImageVector? = null

