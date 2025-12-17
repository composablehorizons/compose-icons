package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Parent_child_dining: ImageVector
    get() {
        if (_Parent_child_dining != null) return _Parent_child_dining!!
        
        _Parent_child_dining = ImageVector.Builder(
            name = "parent_child_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 320f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-295f)
                quadToRelative(0f, -35f, 28.5f, -65f)
                reflectiveQuadToRelative(82.5f, -50f)
                quadToRelative(32f, -13f, 73f, -21.5f)
                reflectiveQuadToRelative(76f, -8.5f)
                quadToRelative(34f, 0f, 76.5f, 9f)
                reflectiveQuadToRelative(77.5f, 23f)
                quadToRelative(51f, 20f, 78.5f, 49.5f)
                reflectiveQuadTo(640f, 505f)
                verticalLineToRelative(15f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                horizontalLineTo(478f)
                quadToRelative(-7f, -35f, -34.5f, -57.5f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                quadToRelative(17f, 0f, 33f, -5.5f)
                reflectiveQuadToRelative(29f, -16.5f)
                lineToRelative(18f, 71f)
                quadToRelative(-20f, -5f, -40.5f, -7f)
                reflectiveQuadToRelative(-39.5f, -2f)
                quadToRelative(-77f, 0f, -133.5f, 23f)
                reflectiveQuadTo(184f, 800f)
                horizontalLineToRelative(376f)
                lineToRelative(-28f, -110f)
                quadToRelative(-5f, -19f, 7f, -34.5f)
                reflectiveQuadToRelative(32f, -15.5f)
                horizontalLineToRelative(298f)
                quadToRelative(20f, 0f, 32f, 15.5f)
                reflectiveQuadToRelative(7f, 34.5f)
                lineToRelative(-25f, 99f)
                quadToRelative(-1f, 3f, -1.5f, 5.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Parent_child_dining!!
    }

private var _Parent_child_dining: ImageVector? = null

