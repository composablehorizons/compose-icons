package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Euro_symbol: ImageVector
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
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(122f)
                quadToRelative(-2f, -11f, -2f, -20f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -9f, 2f, -20f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                quadToRelative(38f, -106f, 130f, -173f)
                reflectiveQuadToRelative(210f, -67f)
                quadToRelative(69f, 0f, 130.5f, 24f)
                reflectiveQuadTo(840f, 212f)
                lineToRelative(-70f, 70f)
                quadToRelative(-35f, -29f, -78.5f, -45.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(-75f, 0f, -136.5f, 38.5f)
                reflectiveQuadTo(370f, 360f)
                horizontalLineToRelative(230f)
                verticalLineToRelative(80f)
                horizontalLineTo(344f)
                quadToRelative(-2f, 11f, -3f, 20f)
                reflectiveQuadToRelative(-1f, 20f)
                quadToRelative(0f, 11f, 1f, 20f)
                reflectiveQuadToRelative(3f, 20f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(80f)
                horizontalLineTo(370f)
                quadToRelative(32f, 63f, 93.5f, 101.5f)
                reflectiveQuadTo(600f, 740f)
                quadToRelative(48f, 0f, 92.5f, -16.5f)
                reflectiveQuadTo(770f, 678f)
                lineToRelative(70f, 70f)
                quadToRelative(-48f, 44f, -109.5f, 68f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Euro_symbol!!
    }

private var _Euro_symbol: ImageVector? = null

