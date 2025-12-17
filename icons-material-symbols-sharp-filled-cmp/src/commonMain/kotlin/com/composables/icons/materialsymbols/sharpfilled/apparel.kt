package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Apparel: ImageVector
    get() {
        if (_Apparel != null) return _Apparel!!
        
        _Apparel = ImageVector.Builder(
            name = "apparel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 438f)
                lineToRelative(-75f, 41f)
                lineTo(46f, 271f)
                lineToRelative(264f, -151f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(90f)
                lineToRelative(264f, 151f)
                lineToRelative(-118f, 206f)
                lineToRelative(-76f, -38f)
                verticalLineToRelative(401f)
                horizontalLineTo(240f)
                verticalLineToRelative(-402f)
                close()
            }
        }.build()
        
        return _Apparel!!
    }

private var _Apparel: ImageVector? = null

