package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stylus_pencil: ImageVector
    get() {
        if (_Stylus_pencil != null) return _Stylus_pencil!!
        
        _Stylus_pencil = ImageVector.Builder(
            name = "stylus_pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                lineToRelative(22f, -65f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(22f, 65f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -200f)
                lineToRelative(200f, -520f)
                horizontalLineToRelative(80f)
                lineToRelative(200f, 520f)
                horizontalLineTo(240f)
                close()
                moveToRelative(116f, -80f)
                horizontalLineToRelative(248f)
                lineTo(480f, 239f)
                lineTo(356f, 560f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(248f)
                horizontalLineToRelative(-248f)
                close()
            }
        }.build()
        
        return _Stylus_pencil!!
    }

private var _Stylus_pencil: ImageVector? = null

