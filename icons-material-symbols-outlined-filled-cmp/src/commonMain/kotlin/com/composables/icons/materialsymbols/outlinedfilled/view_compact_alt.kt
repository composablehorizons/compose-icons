package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_compact_alt: ImageVector
    get() {
        if (_View_compact_alt != null) return _View_compact_alt!!
        
        _View_compact_alt = ImageVector.Builder(
            name = "view_compact_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 660f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(200f, 200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(500f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(500f)
                verticalLineToRelative(160f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _View_compact_alt!!
    }

private var _View_compact_alt: ImageVector? = null

