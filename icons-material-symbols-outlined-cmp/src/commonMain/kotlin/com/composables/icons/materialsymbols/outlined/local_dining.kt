package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Local_dining: ImageVector
    get() {
        if (_Local_dining != null) return _Local_dining!!
        
        _Local_dining = ImageVector.Builder(
            name = "local_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(175f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(410f, -410f)
                quadToRelative(-18f, -42f, -5f, -95f)
                reflectiveQuadToRelative(57f, -95f)
                quadToRelative(53f, -53f, 118f, -62f)
                reflectiveQuadToRelative(106f, 32f)
                quadToRelative(41f, 41f, 32f, 106f)
                reflectiveQuadToRelative(-62f, 118f)
                quadToRelative(-42f, 44f, -95f, 57f)
                reflectiveQuadToRelative(-95f, -5f)
                lineToRelative(-50f, 50f)
                lineToRelative(304f, 304f)
                lineToRelative(-56f, 56f)
                lineToRelative(-304f, -302f)
                lineToRelative(-304f, 302f)
                close()
                moveToRelative(118f, -342f)
                lineTo(173f, 378f)
                quadToRelative(-54f, -54f, -54f, -129f)
                reflectiveQuadToRelative(54f, -129f)
                lineToRelative(248f, 250f)
                lineToRelative(-128f, 128f)
                close()
            }
        }.build()
        
        return _Local_dining!!
    }

private var _Local_dining: ImageVector? = null

