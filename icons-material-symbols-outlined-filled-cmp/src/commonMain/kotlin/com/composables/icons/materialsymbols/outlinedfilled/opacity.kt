package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Opacity: ImageVector
    get() {
        if (_Opacity != null) return _Opacity!!
        
        _Opacity = ImageVector.Builder(
            name = "opacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -92f)
                reflectiveQuadTo(160f, 524f)
                quadToRelative(0f, -65f, 25f, -121.5f)
                reflectiveQuadTo(254f, 302f)
                lineToRelative(226f, -222f)
                lineToRelative(226f, 222f)
                quadToRelative(44f, 44f, 69f, 100.5f)
                reflectiveQuadTo(800f, 524f)
                quadToRelative(0f, 132f, -93.5f, 224f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveTo(242f, 560f)
                horizontalLineToRelative(474f)
                quadToRelative(12f, -72f, -13.5f, -123f)
                reflectiveQuadTo(650f, 360f)
                lineTo(480f, 192f)
                lineTo(310f, 360f)
                quadToRelative(-27f, 26f, -53f, 77f)
                reflectiveQuadToRelative(-15f, 123f)
                close()
            }
        }.build()
        
        return _Opacity!!
    }

private var _Opacity: ImageVector? = null

