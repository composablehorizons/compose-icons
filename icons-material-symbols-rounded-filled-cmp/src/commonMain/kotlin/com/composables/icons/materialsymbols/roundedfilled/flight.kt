package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flight: ImageVector
    get() {
        if (_Flight != null) return _Flight!!
        
        _Flight = ImageVector.Builder(
            name = "flight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(377f, 869f)
                quadToRelative(-14f, 4f, -25.5f, -4.5f)
                reflectiveQuadTo(340f, 842f)
                quadToRelative(0f, -12f, 3f, -19.5f)
                reflectiveQuadToRelative(8f, -11.5f)
                lineToRelative(69f, -51f)
                verticalLineToRelative(-220f)
                lineToRelative(-291f, 86f)
                quadToRelative(-19f, 5f, -34f, -6f)
                reflectiveQuadToRelative(-15f, -31f)
                quadToRelative(0f, -15f, 5f, -25f)
                reflectiveQuadToRelative(14f, -15f)
                lineToRelative(321f, -189f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(220f)
                lineToRelative(321f, 189f)
                quadToRelative(9f, 5f, 14f, 15f)
                reflectiveQuadToRelative(5f, 25f)
                quadToRelative(0f, 20f, -15f, 31f)
                reflectiveQuadToRelative(-34f, 6f)
                lineToRelative(-291f, -86f)
                verticalLineToRelative(220f)
                lineToRelative(69f, 51f)
                quadToRelative(5f, 4f, 8f, 11.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                quadToRelative(0f, 14f, -11.5f, 22.5f)
                reflectiveQuadTo(583f, 869f)
                lineToRelative(-103f, -29f)
                close()
            }
        }.build()
        
        return _Flight!!
    }

private var _Flight: ImageVector? = null

