package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Electric_bolt: ImageVector
    get() {
        if (_Electric_bolt != null) return _Electric_bolt!!
        
        _Electric_bolt = ImageVector.Builder(
            name = "electric_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 580f)
                lineToRelative(-237f, -30f)
                quadToRelative(-25f, -3f, -32.5f, -27f)
                reflectiveQuadToRelative(10.5f, -41f)
                lineToRelative(409f, -392f)
                quadToRelative(5f, -5f, 12f, -7.5f)
                reflectiveQuadToRelative(19f, -2.5f)
                quadToRelative(20f, 0f, 30.5f, 17f)
                reflectiveQuadToRelative(0.5f, 35f)
                lineTo(520f, 380f)
                lineToRelative(237f, 30f)
                quadToRelative(25f, 3f, 32.5f, 27f)
                reflectiveQuadTo(779f, 478f)
                lineTo(370f, 870f)
                quadToRelative(-5f, 5f, -12f, 7.5f)
                reflectiveQuadTo(339f, 880f)
                quadToRelative(-20f, 0f, -30.5f, -17f)
                reflectiveQuadToRelative(-0.5f, -35f)
                lineToRelative(132f, -248f)
                close()
                moveToRelative(62f, 53f)
                lineToRelative(161f, -154f)
                lineToRelative(-269f, -34f)
                lineToRelative(63f, -117f)
                lineToRelative(-160f, 154f)
                lineToRelative(268f, 33f)
                lineToRelative(-63f, 118f)
                close()
                moveToRelative(-22f, -153f)
                close()
            }
        }.build()
        
        return _Electric_bolt!!
    }

private var _Electric_bolt: ImageVector? = null

