package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tools_pliers_wire_stripper: ImageVector
    get() {
        if (_Tools_pliers_wire_stripper != null) return _Tools_pliers_wire_stripper!!
        
        _Tools_pliers_wire_stripper = ImageVector.Builder(
            name = "tools_pliers_wire_stripper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-20f, -40f, -30f, -98f)
                reflectiveQuadToRelative(-10f, -118f)
                quadToRelative(0f, -99f, 22f, -163.5f)
                reflectiveQuadTo(320f, 440f)
                verticalLineToRelative(-200f)
                lineToRelative(120f, -200f)
                horizontalLineToRelative(80f)
                lineToRelative(120f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(37f, 36f, 58.5f, 100.5f)
                reflectiveQuadTo(720f, 704f)
                quadToRelative(0f, 60f, -10f, 118f)
                reflectiveQuadToRelative(-30f, 98f)
                quadToRelative(-42f, -13f, -67f, -47.5f)
                reflectiveQuadTo(589f, 794f)
                quadToRelative(0f, -25f, 5.5f, -54f)
                reflectiveQuadToRelative(5.5f, -58f)
                quadToRelative(0f, -58f, -31.5f, -122f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-56f, 56f, -88f, 120f)
                reflectiveQuadToRelative(-32f, 122f)
                quadToRelative(0f, 29f, 6f, 58f)
                reflectiveQuadToRelative(7f, 54f)
                quadToRelative(0f, 44f, -25.5f, 79f)
                reflectiveQuadTo(280f, 920f)
                close()
                moveToRelative(200f, -600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(0f, -11f, 5f, -20f)
                reflectiveQuadToRelative(15f, -14f)
                verticalLineToRelative(-85f)
                lineToRelative(-60f, 101f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-98f)
                lineToRelative(-60f, -101f)
                verticalLineToRelative(85f)
                quadToRelative(10f, 5f, 15f, 14f)
                reflectiveQuadToRelative(5f, 20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveToRelative(20f, -159f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-40f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Tools_pliers_wire_stripper!!
    }

private var _Tools_pliers_wire_stripper: ImageVector? = null

