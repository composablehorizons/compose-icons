package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Carry_on_bag: ImageVector
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
                moveTo(640f, 860f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(580f, 800f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(640f, 740f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(700f, 800f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(640f, 860f)
                close()
                moveToRelative(-320f, -20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(100f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(480f, 80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 11f, 1.5f, 20.5f)
                reflectiveQuadTo(527f, 840f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Carry_on_bag!!
    }

private var _Carry_on_bag: ImageVector? = null

