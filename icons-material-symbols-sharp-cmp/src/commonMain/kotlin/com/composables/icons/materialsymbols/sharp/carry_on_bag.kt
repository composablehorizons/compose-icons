package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Carry_on_bag: ImageVector
    get() {
        if (_Carry_on_bag != null) return _Carry_on_bag!!
        
        _Carry_on_bag = ImageVector.Builder(
            name = "carry_on_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 680f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-38f, 0f, -68.5f, -22f)
                reflectiveQuadTo(527f, 840f)
                horizontalLineTo(240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                close()
                moveToRelative(-280f, 80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(80f, -400f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(87f)
                quadToRelative(4f, -15f, 13f, -27.5f)
                reflectiveQuadToRelative(20f, -22.5f)
                verticalLineToRelative(-350f)
                horizontalLineTo(440f)
                close()
                moveToRelative(200f, 500f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(700f, 800f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(640f, 740f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(580f, 800f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(640f, 860f)
                close()
                moveToRelative(0f, -60f)
                close()
                moveTo(440f, 560f)
                close()
                moveToRelative(-80f, 200f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, -400f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Carry_on_bag!!
    }

private var _Carry_on_bag: ImageVector? = null

