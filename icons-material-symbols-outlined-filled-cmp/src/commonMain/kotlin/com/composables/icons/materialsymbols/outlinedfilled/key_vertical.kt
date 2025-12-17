package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Key_vertical: ImageVector
    get() {
        if (_Key_vertical != null) return _Key_vertical!!
        
        _Key_vertical = ImageVector.Builder(
            name = "key_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(2f, 520f)
                lineTo(320f, 760f)
                lineToRelative(80f, -80f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-14f)
                quadToRelative(-72f, -25f, -116f, -87f)
                reflectiveQuadToRelative(-44f, -139f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 81f, -46f, 141.5f)
                reflectiveQuadTo(560f, 506f)
                verticalLineToRelative(334f)
                lineToRelative(-78f, 80f)
                close()
            }
        }.build()
        
        return _Key_vertical!!
    }

private var _Key_vertical: ImageVector? = null

