package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(254f, 614f)
                lineToRelative(-84f, -86f)
                quadToRelative(62f, -62f, 142f, -95f)
                reflectiveQuadToRelative(168f, -33f)
                quadToRelative(88f, 0f, 168.5f, 33.5f)
                reflectiveQuadTo(790f, 530f)
                lineToRelative(-84f, 84f)
                quadToRelative(-45f, -45f, -103.5f, -69.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-64f, 0f, -122.5f, 24.5f)
                reflectiveQuadTo(254f, 614f)
                close()
                moveTo(84f, 444f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineToRelative(-84f, 84f)
                quadToRelative(-79f, -79f, -181.5f, -121.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-112f, 0f, -214.5f, 42.5f)
                reflectiveQuadTo(84f, 444f)
                close()
                moveToRelative(396f, 396f)
                lineTo(339f, 698f)
                quadToRelative(28f, -28f, 64.5f, -43f)
                reflectiveQuadToRelative(76.5f, -15f)
                quadToRelative(40f, 0f, 76.5f, 15f)
                reflectiveQuadToRelative(64.5f, 43f)
                lineTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

