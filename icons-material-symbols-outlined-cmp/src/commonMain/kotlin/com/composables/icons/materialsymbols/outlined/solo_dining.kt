package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Solo_dining: ImageVector
    get() {
        if (_Solo_dining != null) return _Solo_dining!!
        
        _Solo_dining = ImageVector.Builder(
            name = "solo_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                verticalLineToRelative(294f)
                horizontalLineToRelative(360f)
                quadToRelative(-1f, -3f, -1.5f, -5.5f)
                reflectiveQuadTo(557f, 789f)
                lineToRelative(-37f, -149f)
                horizontalLineToRelative(400f)
                lineToRelative(-37f, 149f)
                quadToRelative(-1f, 3f, -1.5f, 5.5f)
                reflectiveQuadTo(880f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(634f, -80f)
                horizontalLineToRelative(92f)
                quadToRelative(14f, 0f, 25f, -8f)
                reflectiveQuadToRelative(14f, -22f)
                lineToRelative(13f, -50f)
                horizontalLineTo(622f)
                lineToRelative(13f, 50f)
                quadToRelative(3f, 14f, 14f, 22f)
                reflectiveQuadToRelative(25f, 8f)
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
                moveToRelative(0f, 560f)
                close()
                moveToRelative(340f, 0f)
                close()
                moveTo(380f, 200f)
                close()
            }
        }.build()
        
        return _Solo_dining!!
    }

private var _Solo_dining: ImageVector? = null

