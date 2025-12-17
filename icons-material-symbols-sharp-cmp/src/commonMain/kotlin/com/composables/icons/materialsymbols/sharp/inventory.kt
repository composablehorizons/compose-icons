package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Inventory: ImageVector
    get() {
        if (_Inventory != null) return _Inventory!!
        
        _Inventory = ImageVector.Builder(
            name = "inventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 797f)
                lineTo(450f, 627f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 56f)
                lineToRelative(-282f, 282f)
                close()
                moveToRelative(220f, -397f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(247f)
                quadToRelative(11f, -35f, 43f, -57.5f)
                reflectiveQuadToRelative(70f, -22.5f)
                quadToRelative(40f, 0f, 71.5f, 22.5f)
                reflectiveQuadTo(594f, 120f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(280f)
                close()
                moveTo(480f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Inventory!!
    }

private var _Inventory: ImageVector? = null

