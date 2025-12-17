package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cloud_off: ImageVector
    get() {
        if (_Cloud_off != null) return _Cloud_off!!
        
        _Cloud_off = ImageVector.Builder(
            name = "cloud_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(686f, 800f)
                horizontalLineTo(260f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadTo(40f, 580f)
                quadToRelative(0f, -77f, 47.5f, -137f)
                reflectiveQuadTo(210f, 366f)
                quadToRelative(3f, -8f, 6f, -15.5f)
                reflectiveQuadToRelative(6f, -16.5f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(72f, -154f)
                lineTo(322f, 209f)
                quadToRelative(35f, -24f, 74.5f, -36.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(69f, 8f, 114.5f, 59.5f)
                reflectiveQuadTo(920f, 620f)
                quadToRelative(0f, 39f, -15f, 72.5f)
                reflectiveQuadTo(864f, 750f)
                close()
            }
        }.build()
        
        return _Cloud_off!!
    }

private var _Cloud_off: ImageVector? = null

