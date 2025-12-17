package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mop: ImageVector
    get() {
        if (_Mop != null) return _Mop!!
        
        _Mop = ImageVector.Builder(
            name = "mop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(142f, 840f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(98f)
                lineToRelative(-40f, -160f)
                horizontalLineTo(182f)
                lineToRelative(-40f, 160f)
                close()
                moveTo(40f, 920f)
                lineToRelative(80f, -320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                lineToRelative(80f, 320f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Mop!!
    }

private var _Mop: ImageVector? = null

