package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Check_in_out: ImageVector
    get() {
        if (_Check_in_out != null) return _Check_in_out!!
        
        _Check_in_out = ImageVector.Builder(
            name = "check_in_out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(261f, 760f)
                quadToRelative(-51f, 0f, -85f, -34f)
                reflectiveQuadToRelative(-34f, -85f)
                quadToRelative(0f, -51f, 34f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                quadToRelative(51f, 0f, 85f, 34f)
                reflectiveQuadToRelative(34f, 85f)
                quadToRelative(0f, 51f, -34f, 85.5f)
                reflectiveQuadTo(261f, 760f)
                close()
                moveTo(153f, 439f)
                verticalLineToRelative(-239f)
                horizontalLineToRelative(51f)
                verticalLineToRelative(239f)
                horizontalLineToRelative(-51f)
                close()
                moveToRelative(108f, 275f)
                quadToRelative(31f, 0f, 51f, -21f)
                reflectiveQuadToRelative(20f, -53f)
                quadToRelative(0f, -32f, -19.5f, -52.5f)
                reflectiveQuadTo(261f, 567f)
                quadToRelative(-31f, 0f, -51f, 20.5f)
                reflectiveQuadTo(190f, 640f)
                quadToRelative(0f, 32f, 20f, 53f)
                reflectiveQuadToRelative(51f, 21f)
                close()
                moveToRelative(-11f, -275f)
                verticalLineToRelative(-239f)
                horizontalLineToRelative(56f)
                lineToRelative(90f, 152f)
                lineToRelative(-2f, -38f)
                verticalLineToRelative(-114f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(239f)
                horizontalLineToRelative(-51f)
                lineToRelative(-96f, -161f)
                lineToRelative(3f, 38f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-50f)
                close()
                moveToRelative(262f, 321f)
                quadToRelative(-42f, 0f, -67f, -27f)
                reflectiveQuadToRelative(-25f, -72f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(49f)
                verticalLineToRelative(143f)
                quadToRelative(0f, 21f, 12.5f, 35f)
                reflectiveQuadToRelative(30.5f, 14f)
                quadToRelative(18f, 0f, 30f, -14f)
                reflectiveQuadToRelative(12f, -35f)
                verticalLineToRelative(-143f)
                horizontalLineToRelative(49f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 45f, -25f, 72f)
                reflectiveQuadToRelative(-66f, 27f)
                close()
                moveToRelative(194f, 0f)
                verticalLineToRelative(-192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(176f)
                verticalLineToRelative(47f)
                horizontalLineToRelative(-63f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-49f)
                close()
            }
        }.build()
        
        return _Check_in_out!!
    }

private var _Check_in_out: ImageVector? = null

