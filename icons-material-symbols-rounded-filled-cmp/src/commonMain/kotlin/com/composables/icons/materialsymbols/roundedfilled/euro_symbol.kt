package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Euro_symbol: ImageVector
    get() {
        if (_Euro_symbol != null) return _Euro_symbol!!
        
        _Euro_symbol = ImageVector.Builder(
            name = "euro_symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                quadToRelative(-118f, 0f, -210f, -67f)
                reflectiveQuadTo(260f, 600f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(-2f, -11f, -2f, -20f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -9f, 2f, -20f)
                horizontalLineToRelative(-82f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(100f)
                quadToRelative(38f, -106f, 130f, -173f)
                reflectiveQuadToRelative(210f, -67f)
                quadToRelative(57f, 0f, 107f, 16.5f)
                reflectiveQuadToRelative(94f, 45.5f)
                quadToRelative(17f, 11f, 17.5f, 31f)
                reflectiveQuadTo(805f, 247f)
                quadToRelative(-14f, 14f, -35f, 16.5f)
                reflectiveQuadToRelative(-39f, -8.5f)
                quadToRelative(-29f, -17f, -62.5f, -26f)
                reflectiveQuadToRelative(-68.5f, -9f)
                quadToRelative(-75f, 0f, -136.5f, 38.5f)
                reflectiveQuadTo(370f, 360f)
                horizontalLineToRelative(190f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineTo(344f)
                quadToRelative(-2f, 11f, -3f, 20f)
                reflectiveQuadToRelative(-1f, 20f)
                quadToRelative(0f, 11f, 1f, 20f)
                reflectiveQuadToRelative(3f, 20f)
                horizontalLineToRelative(216f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 600f)
                horizontalLineTo(370f)
                quadToRelative(32f, 63f, 93.5f, 101.5f)
                reflectiveQuadTo(600f, 740f)
                quadToRelative(35f, 0f, 68.5f, -8.5f)
                reflectiveQuadTo(731f, 706f)
                quadToRelative(18f, -11f, 39f, -9f)
                reflectiveQuadToRelative(35f, 16f)
                quadToRelative(14f, 14f, 13.5f, 34f)
                reflectiveQuadTo(801f, 778f)
                quadToRelative(-44f, 29f, -94f, 45.5f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Euro_symbol!!
    }

private var _Euro_symbol: ImageVector? = null

