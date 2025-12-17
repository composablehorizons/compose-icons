package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Comic_bubble: ImageVector
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
                moveTo(440f, 157f)
                lineToRelative(-83f, 83f)
                horizontalLineTo(240f)
                verticalLineToRelative(117f)
                lineToRelative(-83f, 83f)
                lineToRelative(83f, 83f)
                verticalLineToRelative(117f)
                horizontalLineToRelative(117f)
                lineToRelative(83f, 83f)
                lineToRelative(100f, -100f)
                lineToRelative(168f, 85f)
                lineToRelative(-86f, -167f)
                lineToRelative(101f, -101f)
                lineToRelative(-83f, -83f)
                verticalLineToRelative(-117f)
                horizontalLineTo(523f)
                lineToRelative(-83f, -83f)
                close()
                moveToRelative(0f, -113f)
                lineToRelative(116f, 116f)
                horizontalLineToRelative(164f)
                verticalLineToRelative(164f)
                lineToRelative(116f, 116f)
                lineToRelative(-116f, 116f)
                lineToRelative(115f, 226f)
                lineToRelative(-53f, 53f)
                lineToRelative(-226f, -115f)
                lineToRelative(-116f, 116f)
                lineToRelative(-116f, -116f)
                horizontalLineTo(160f)
                verticalLineToRelative(-164f)
                lineTo(44f, 440f)
                lineToRelative(116f, -116f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(164f)
                lineToRelative(116f, -116f)
                close()
                moveToRelative(0f, 396f)
                close()
            }
        }.build()
        
        return _Comic_bubble!!
    }

private var _Comic_bubble: ImageVector? = null

