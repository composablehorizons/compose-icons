package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Comic_bubble: ImageVector
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
                moveTo(708f, 708f)
                lineToRelative(-86f, -167f)
                lineToRelative(101f, -101f)
                lineToRelative(-83f, -83f)
                verticalLineToRelative(-117f)
                horizontalLineTo(523f)
                lineToRelative(-83f, -83f)
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
                close()
                moveToRelative(120f, 120f)
                quadToRelative(-8f, 8f, -20.5f, 11f)
                reflectiveQuadToRelative(-25.5f, -4f)
                lineTo(556f, 720f)
                lineToRelative(-88f, 88f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-88f, -88f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 680f)
                verticalLineToRelative(-124f)
                lineToRelative(-88f, -88f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(88f, -88f)
                verticalLineToRelative(-124f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(124f)
                lineToRelative(88f, -88f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(88f, 88f)
                horizontalLineToRelative(124f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 200f)
                verticalLineToRelative(124f)
                lineToRelative(88f, 88f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-88f, 88f)
                lineToRelative(115f, 226f)
                quadToRelative(7f, 13f, 4f, 25.5f)
                reflectiveQuadTo(828f, 828f)
                close()
                moveTo(440f, 440f)
                close()
            }
        }.build()
        
        return _Comic_bubble!!
    }

private var _Comic_bubble: ImageVector? = null

