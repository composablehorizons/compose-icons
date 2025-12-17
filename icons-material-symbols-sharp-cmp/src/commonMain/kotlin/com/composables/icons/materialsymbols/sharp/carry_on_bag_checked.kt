package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Carry_on_bag_checked: ImageVector
    get() {
        if (_Carry_on_bag_checked != null) return _Carry_on_bag_checked!!
        
        _Carry_on_bag_checked = ImageVector.Builder(
            name = "carry_on_bag_checked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(692f, 810f)
                lineToRelative(142f, -142f)
                lineToRelative(-30f, -30f)
                lineToRelative(-112f, 112f)
                lineToRelative(-56f, -56f)
                lineToRelative(-30f, 30f)
                lineToRelative(86f, 86f)
                close()
                moveToRelative(-332f, -50f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(108f, 80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(372f)
                quadToRelative(-24f, 8f, -41.5f, 16f)
                reflectiveQuadTo(560f, 490f)
                verticalLineToRelative(-130f)
                horizontalLineTo(440f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(4f)
                quadToRelative(3f, 24f, 9f, 42f)
                reflectiveQuadToRelative(15f, 38f)
                close()
                moveToRelative(252f, -320f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveToRelative(-320f, 40f)
                close()
                moveToRelative(-40f, 200f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Carry_on_bag_checked!!
    }

private var _Carry_on_bag_checked: ImageVector? = null

