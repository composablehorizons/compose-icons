package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flood: ImageVector
    get() {
        if (_Flood != null) return _Flood!!
        
        _Flood = ImageVector.Builder(
            name = "flood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(77.5f, -20f)
                quadToRelative(59f, 0f, 77f, 20f)
                reflectiveQuadToRelative(56f, 20f)
                quadToRelative(38f, 0f, 56f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(57f, 0f, 77.5f, 20f)
                reflectiveQuadToRelative(56.5f, 20f)
                quadToRelative(38f, 0f, 56f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(59f, 0f, 77f, 20f)
                reflectiveQuadToRelative(56f, 20f)
                verticalLineToRelative(80f)
                quadToRelative(-58f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-37f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-58f, 0f, -77.5f, -20f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-38f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-59f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-37f, 0f, -56f, 20f)
                reflectiveQuadTo(80f, 880f)
                close()
                moveToRelative(267f, -180f)
                quadToRelative(-57f, 0f, -77f, -20f)
                reflectiveQuadToRelative(-56f, -20f)
                quadToRelative(-35f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-78f, 20f)
                verticalLineToRelative(-80f)
                quadToRelative(38f, 0f, 56f, -20f)
                reflectiveQuadToRelative(77f, -20f)
                quadToRelative(6f, 0f, 12f, 0.5f)
                reflectiveQuadToRelative(11f, 1.5f)
                lineToRelative(-38f, -140f)
                lineToRelative(-55f, 72f)
                lineToRelative(-63f, -50f)
                lineToRelative(311f, -384f)
                lineToRelative(461f, 176f)
                lineToRelative(-29f, 75f)
                lineToRelative(-84f, -34f)
                lineToRelative(81f, 301f)
                quadToRelative(14f, 8f, 27.5f, 15f)
                reflectiveQuadToRelative(32.5f, 7f)
                verticalLineToRelative(80f)
                quadToRelative(-57f, -1f, -77f, -20.5f)
                reflectiveQuadTo(747f, 660f)
                quadToRelative(-38f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                quadToRelative(-57f, 0f, -77.5f, -20f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(-38f, 0f, -56f, 20f)
                reflectiveQuadToRelative(-77f, 20f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(30f, 0f, 46.5f, -14f)
                reflectiveQuadToRelative(50.5f, -22f)
                lineToRelative(-37f, -136f)
                lineToRelative(155f, -41f)
                lineToRelative(56f, 212f)
                quadToRelative(31f, -2f, 49f, -18.5f)
                reflectiveQuadToRelative(65f, -19.5f)
                lineToRelative(-86f, -321f)
                lineToRelative(-229f, -84f)
                lineToRelative(-157f, 188f)
                lineToRelative(69f, 254f)
                quadToRelative(4f, 1f, 8.5f, 1.5f)
                reflectiveQuadToRelative(9.5f, 0.5f)
                close()
                moveToRelative(149f, -222f)
                close()
            }
        }.build()
        
        return _Flood!!
    }

private var _Flood: ImageVector? = null

