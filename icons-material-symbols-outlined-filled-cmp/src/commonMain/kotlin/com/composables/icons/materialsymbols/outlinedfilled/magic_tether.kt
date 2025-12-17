package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Magic_tether: ImageVector
    get() {
        if (_Magic_tether != null) return _Magic_tether!!
        
        _Magic_tether = ImageVector.Builder(
            name = "magic_tether",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(254f, 710f)
                lineToRelative(-84f, -85f)
                quadToRelative(59f, -59f, 138.5f, -94f)
                reflectiveQuadTo(480f, 496f)
                quadToRelative(92f, 0f, 171.5f, 34.5f)
                reflectiveQuadTo(790f, 625f)
                lineToRelative(-84f, 85f)
                quadToRelative(-44f, -44f, -102f, -69f)
                reflectiveQuadToRelative(-124f, -25f)
                quadToRelative(-66f, 0f, -124f, 25f)
                reflectiveQuadToRelative(-102f, 69f)
                close()
                moveTo(85f, 540f)
                lineTo(0f, 455f)
                quadToRelative(92f, -94f, 215f, -146.5f)
                reflectiveQuadTo(480f, 256f)
                quadToRelative(142f, 0f, 265f, 52.5f)
                reflectiveQuadTo(960f, 455f)
                lineToRelative(-85f, 85f)
                quadToRelative(-77f, -77f, -178f, -120.5f)
                reflectiveQuadTo(480f, 376f)
                quadToRelative(-116f, 0f, -217f, 43.5f)
                reflectiveQuadTo(85f, 540f)
                close()
                moveToRelative(395f, 436f)
                lineToRelative(-50f, -110f)
                lineToRelative(-110f, -50f)
                lineToRelative(110f, -50f)
                lineToRelative(50f, -110f)
                lineToRelative(50f, 110f)
                lineToRelative(110f, 50f)
                lineToRelative(-110f, 50f)
                lineToRelative(-50f, 110f)
                close()
            }
        }.build()
        
        return _Magic_tether!!
    }

private var _Magic_tether: ImageVector? = null

