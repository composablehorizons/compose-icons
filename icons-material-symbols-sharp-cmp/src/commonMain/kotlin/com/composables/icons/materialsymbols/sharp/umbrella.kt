package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) return _Umbrella!!
        
        _Umbrella = ImageVector.Builder(
            name = "umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-12f, 0f, -22.5f, -6.5f)
                reflectiveQuadTo(442f, 853f)
                lineTo(240f, 243f)
                lineToRelative(140f, 34f)
                lineToRelative(60f, -46f)
                verticalLineToRelative(-95f)
                quadToRelative(0f, -40f, 29f, -68f)
                reflectiveQuadToRelative(71f, -28f)
                quadToRelative(42f, 0f, 71f, 28f)
                reflectiveQuadToRelative(29f, 68f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-24f)
                quadToRelative(0f, -8f, -6f, -13.5f)
                reflectiveQuadToRelative(-14f, -5.5f)
                quadToRelative(-8f, 0f, -14f, 5.5f)
                reflectiveQuadToRelative(-6f, 13.5f)
                verticalLineToRelative(95f)
                lineToRelative(60f, 46f)
                lineToRelative(140f, -34f)
                lineToRelative(-202f, 609f)
                quadToRelative(-5f, 14f, -15.5f, 21f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(40f, -288f)
                lineToRelative(78f, -238f)
                lineToRelative(-36f, 9f)
                lineToRelative(-42f, -31f)
                verticalLineToRelative(260f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-260f)
                lineToRelative(-42f, 32f)
                lineToRelative(-37f, -10f)
                lineToRelative(79f, 238f)
                close()
            }
        }.build()
        
        return _Umbrella!!
    }

private var _Umbrella: ImageVector? = null

