package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 517f)
                lineTo(176f, 777f)
                quadToRelative(-20f, 8f, -38f, -3.5f)
                reflectiveQuadTo(120f, 740f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -22f, 18f, -33.5f)
                reflectiveQuadToRelative(38f, -3.5f)
                lineToRelative(616f, 260f)
                quadToRelative(25f, 11f, 25f, 37f)
                reflectiveQuadToRelative(-25f, 37f)
                close()
                moveTo(200f, 680f)
                lineToRelative(474f, -200f)
                lineToRelative(-474f, -200f)
                verticalLineToRelative(140f)
                lineToRelative(240f, 60f)
                lineToRelative(-240f, 60f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

