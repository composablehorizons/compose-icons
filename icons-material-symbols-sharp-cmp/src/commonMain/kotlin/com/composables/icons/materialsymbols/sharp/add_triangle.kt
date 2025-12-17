package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_triangle: ImageVector
    get() {
        if (_Add_triangle != null) return _Add_triangle!!
        
        _Add_triangle = ImageVector.Builder(
            name = "add_triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                lineToRelative(440f, -760f)
                lineToRelative(440f, 760f)
                horizontalLineTo(40f)
                close()
                moveToRelative(139f, -80f)
                horizontalLineToRelative(602f)
                lineTo(480f, 240f)
                lineTo(179f, 760f)
                close()
                moveToRelative(261f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, -120f)
                close()
            }
        }.build()
        
        return _Add_triangle!!
    }

private var _Add_triangle: ImageVector? = null

