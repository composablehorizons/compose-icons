package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Privacy_screen: ImageVector
    get() {
        if (_Privacy_screen != null) return _Privacy_screen!!
        
        _Privacy_screen = ImageVector.Builder(
            name = "privacy_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 560f)
                lineToRelative(304f, -304f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(80f, 336f)
                verticalLineToRelative(224f)
                close()
                moveToRelative(0f, 280f)
                lineToRelative(583f, -584f)
                horizontalLineTo(496f)
                lineTo(80f, 673f)
                verticalLineToRelative(167f)
                close()
                moveToRelative(56f, 56f)
                horizontalLineToRelative(664f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(880f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 256f)
                horizontalLineToRelative(-24f)
                lineTo(136f, 896f)
                close()
            }
        }.build()
        
        return _Privacy_screen!!
    }

private var _Privacy_screen: ImageVector? = null

