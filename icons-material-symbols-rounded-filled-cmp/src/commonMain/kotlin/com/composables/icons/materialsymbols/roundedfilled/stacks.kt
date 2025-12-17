package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stacks: ImageVector
    get() {
        if (_Stacks != null) return _Stacks!!
        
        _Stacks = ImageVector.Builder(
            name = "stacks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 549f)
                quadToRelative(-10f, 0f, -19.5f, -2.5f)
                reflectiveQuadTo(442f, 539f)
                lineTo(104f, 355f)
                quadToRelative(-11f, -6f, -15.5f, -15f)
                reflectiveQuadTo(84f, 320f)
                quadToRelative(0f, -11f, 4.5f, -20f)
                reflectiveQuadToRelative(15.5f, -15f)
                lineToRelative(338f, -184f)
                quadToRelative(9f, -5f, 18.5f, -7.5f)
                reflectiveQuadTo(480f, 91f)
                quadToRelative(10f, 0f, 19.5f, 2.5f)
                reflectiveQuadTo(518f, 101f)
                lineToRelative(338f, 184f)
                quadToRelative(11f, 6f, 15.5f, 15f)
                reflectiveQuadToRelative(4.5f, 20f)
                quadToRelative(0f, 11f, -4.5f, 20f)
                reflectiveQuadTo(856f, 355f)
                lineTo(518f, 539f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(480f, 549f)
                close()
                moveToRelative(0f, 80f)
                lineToRelative(314f, -171f)
                quadToRelative(2f, -1f, 19f, -5f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(853f, 493f)
                quadToRelative(0f, 11f, -5f, 20f)
                reflectiveQuadToRelative(-16f, 15f)
                lineTo(518f, 699f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(480f, 709f)
                quadToRelative(-10f, 0f, -19.5f, -2.5f)
                reflectiveQuadTo(442f, 699f)
                lineTo(128f, 528f)
                quadToRelative(-11f, -6f, -16f, -15f)
                reflectiveQuadToRelative(-5f, -20f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(147f, 453f)
                quadToRelative(5f, 0f, 9.5f, 1.5f)
                reflectiveQuadToRelative(9.5f, 3.5f)
                lineToRelative(314f, 171f)
                close()
                moveToRelative(0f, 160f)
                lineToRelative(314f, -171f)
                quadToRelative(2f, -1f, 19f, -5f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(853f, 653f)
                quadToRelative(0f, 11f, -5f, 20f)
                reflectiveQuadToRelative(-16f, 15f)
                lineTo(518f, 859f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(480f, 869f)
                quadToRelative(-10f, 0f, -19.5f, -2.5f)
                reflectiveQuadTo(442f, 859f)
                lineTo(128f, 688f)
                quadToRelative(-11f, -6f, -16f, -15f)
                reflectiveQuadToRelative(-5f, -20f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(147f, 613f)
                quadToRelative(5f, 0f, 9.5f, 1.5f)
                reflectiveQuadToRelative(9.5f, 3.5f)
                lineToRelative(314f, 171f)
                close()
            }
        }.build()
        
        return _Stacks!!
    }

private var _Stacks: ImageVector? = null

