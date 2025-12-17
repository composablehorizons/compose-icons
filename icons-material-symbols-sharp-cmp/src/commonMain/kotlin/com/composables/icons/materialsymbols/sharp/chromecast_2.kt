package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chromecast_2: ImageVector
    get() {
        if (_Chromecast_2 != null) return _Chromecast_2!!
        
        _Chromecast_2 = ImageVector.Builder(
            name = "chromecast_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, -106f, 68.5f, -184.5f)
                reflectiveQuadTo(320f, 283f)
                verticalLineToRelative(-55f)
                quadToRelative(0f, -62f, 43f, -105f)
                reflectiveQuadToRelative(105f, -43f)
                quadToRelative(34f, 0f, 64.5f, 15f)
                reflectiveQuadToRelative(51.5f, 41f)
                lineToRelative(206f, 260f)
                lineToRelative(23f, -19f)
                lineToRelative(111f, 139f)
                lineToRelative(-110f, 87f)
                lineToRelative(-110f, -139f)
                lineToRelative(23f, -19f)
                lineToRelative(-206f, -260f)
                quadToRelative(-10f, -12f, -23.5f, -18.5f)
                reflectiveQuadTo(468f, 160f)
                quadToRelative(-29f, 0f, -48.5f, 19.5f)
                reflectiveQuadTo(400f, 228f)
                verticalLineToRelative(55f)
                quadToRelative(103f, 14f, 171.5f, 92.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(360f, 840f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 560f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(360f, 760f)
                close()
            }
        }.build()
        
        return _Chromecast_2!!
    }

private var _Chromecast_2: ImageVector? = null

