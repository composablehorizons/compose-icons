package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Print_connect: ImageVector
    get() {
        if (_Print_connect != null) return _Print_connect!!
        
        _Print_connect = ImageVector.Builder(
            name = "print_connect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 400f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
                moveToRelative(80f, 440f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(150f)
                quadToRelative(-18f, -10f, -38f, -17f)
                reflectiveQuadToRelative(-42f, -10f)
                verticalLineToRelative(-43f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(340f)
                quadToRelative(-16f, 17f, -29f, 37f)
                reflectiveQuadToRelative(-21f, 43f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(204f)
                quadToRelative(7f, 22f, 17f, 42f)
                reflectiveQuadToRelative(24f, 38f)
                horizontalLineTo(240f)
                close()
                moveToRelative(478f, -33f)
                lineTo(604f, 694f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
                moveToRelative(-78f, -487f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Print_connect!!
    }

private var _Print_connect: ImageVector? = null

