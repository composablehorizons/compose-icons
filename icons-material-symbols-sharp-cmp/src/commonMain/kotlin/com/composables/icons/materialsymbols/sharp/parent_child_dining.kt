package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Parent_child_dining: ImageVector
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
                moveTo(818f, 720f)
                horizontalLineTo(622f)
                lineToRelative(20f, 80f)
                horizontalLineToRelative(156f)
                lineToRelative(20f, -80f)
                close()
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
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 240f)
                close()
                moveTo(200f, 506f)
                verticalLineToRelative(263f)
                quadToRelative(20f, -20f, 74f, -34.5f)
                reflectiveQuadTo(380f, 720f)
                quadToRelative(47f, 0f, 96f, 12f)
                reflectiveQuadToRelative(74f, 29f)
                lineToRelative(-30f, -121f)
                horizontalLineToRelative(400f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
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
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-55f)
                quadToRelative(-2f, -8f, -17.5f, -18.5f)
                reflectiveQuadTo(505f, 466f)
                quadToRelative(-29f, -12f, -61f, -19f)
                reflectiveQuadToRelative(-64f, -7f)
                quadToRelative(-32f, 0f, -64f, 7f)
                reflectiveQuadToRelative(-61f, 19f)
                quadToRelative(-22f, 10f, -37.5f, 21f)
                reflectiveQuadTo(200f, 506f)
                close()
                moveToRelative(180f, 100f)
                close()
                moveToRelative(0f, 74f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, -480f)
                close()
                moveToRelative(340f, 600f)
                close()
            }
        }.build()
        
        return _Parent_child_dining!!
    }

private var _Parent_child_dining: ImageVector? = null

