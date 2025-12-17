package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Parent_child_dining: ImageVector
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
                moveTo(40f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-295f)
                quadToRelative(0f, -35f, 28.5f, -65f)
                reflectiveQuadToRelative(82.5f, -50f)
                quadToRelative(32f, -13f, 73f, -21.5f)
                reflectiveQuadToRelative(76f, -8.5f)
                quadToRelative(34f, 0f, 76.5f, 9f)
                reflectiveQuadToRelative(77.5f, 23f)
                quadToRelative(51f, 20f, 78.5f, 49.5f)
                reflectiveQuadTo(640f, 505f)
                verticalLineToRelative(55f)
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
                lineToRelative(-40f, -160f)
                horizontalLineToRelative(400f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Parent_child_dining!!
    }

private var _Parent_child_dining: ImageVector? = null

