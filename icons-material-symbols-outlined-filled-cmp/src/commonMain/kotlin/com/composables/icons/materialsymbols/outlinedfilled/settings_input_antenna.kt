package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_input_antenna: ImageVector
    get() {
        if (_Settings_input_antenna != null) return _Settings_input_antenna!!
        
        _Settings_input_antenna = ImageVector.Builder(
            name = "settings_input_antenna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 480f)
                quadToRelative(0f, -92f, 34.5f, -172f)
                reflectiveQuadTo(169f, 168.5f)
                quadToRelative(60f, -59.5f, 140f, -94f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(91f, 0f, 171f, 34.5f)
                reflectiveQuadToRelative(140f, 94f)
                quadTo(851f, 228f, 885.5f, 308f)
                reflectiveQuadTo(920f, 480f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -75f, -28.5f, -140.5f)
                reflectiveQuadTo(734f, 225f)
                quadToRelative(-49f, -49f, -114.5f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-74f, 0f, -139.5f, 28f)
                reflectiveQuadTo(226f, 225f)
                quadToRelative(-49f, 49f, -77.5f, 114.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -118f, 82f, -199f)
                reflectiveQuadToRelative(198f, -81f)
                quadToRelative(116f, 0f, 198f, 81f)
                reflectiveQuadToRelative(82f, 199f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(360f, 896f)
                lineToRelative(-56f, -56f)
                lineToRelative(136f, -136f)
                verticalLineToRelative(-132f)
                quadToRelative(-27f, -12f, -43.5f, -37f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 30f, -16.5f, 55f)
                reflectiveQuadTo(520f, 572f)
                verticalLineToRelative(132f)
                lineToRelative(136f, 136f)
                lineToRelative(-56f, 56f)
                lineToRelative(-120f, -120f)
                lineTo(360f, 896f)
                close()
            }
        }.build()
        
        return _Settings_input_antenna!!
    }

private var _Settings_input_antenna: ImageVector? = null

