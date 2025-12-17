package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Print_connect: ImageVector
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
                moveTo(240f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -51f, 35f, -85.5f)
                reflectiveQuadToRelative(85f, -34.5f)
                horizontalLineToRelative(560f)
                quadToRelative(51f, 0f, 85.5f, 34.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(30f)
                quadToRelative(-27f, -14f, -56.5f, -22f)
                reflectiveQuadToRelative(-60.5f, -8f)
                quadToRelative(-78f, 0f, -141.5f, 44f)
                reflectiveQuadTo(530f, 600f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(204f)
                quadToRelative(7f, 22f, 17f, 42f)
                reflectiveQuadToRelative(24f, 38f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(160f)
                horizontalLineTo(240f)
                close()
                moveToRelative(478f, 527f)
                lineTo(604f, 694f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
            }
        }.build()
        
        return _Print_connect!!
    }

private var _Print_connect: ImageVector? = null

