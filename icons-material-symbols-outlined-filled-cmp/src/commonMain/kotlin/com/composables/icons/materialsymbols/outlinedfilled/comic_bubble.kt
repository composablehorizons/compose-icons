package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Comic_bubble: ImageVector
    get() {
        if (_Comic_bubble != null) return _Comic_bubble!!
        
        _Comic_bubble = ImageVector.Builder(
            name = "comic_bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 836f)
                lineTo(324f, 720f)
                horizontalLineTo(160f)
                verticalLineToRelative(-164f)
                lineTo(44f, 440f)
                lineToRelative(116f, -116f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(164f)
                lineToRelative(116f, -116f)
                lineToRelative(116f, 116f)
                horizontalLineToRelative(164f)
                verticalLineToRelative(164f)
                lineToRelative(116f, 116f)
                lineToRelative(-116f, 116f)
                lineToRelative(115f, 226f)
                quadToRelative(7f, 13f, 4f, 25.5f)
                reflectiveQuadTo(828f, 828f)
                quadToRelative(-8f, 8f, -20.5f, 11f)
                reflectiveQuadToRelative(-25.5f, -4f)
                lineTo(556f, 720f)
                lineTo(440f, 836f)
                close()
            }
        }.build()
        
        return _Comic_bubble!!
    }

private var _Comic_bubble: ImageVector? = null

