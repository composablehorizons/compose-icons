package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Location_searching: ImageVector
    get() {
        if (_Location_searching != null) return _Location_searching!!
        
        _Location_searching = ImageVector.Builder(
            name = "location_searching",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-40f)
                quadToRelative(-125f, -14f, -214.5f, -103.5f)
                reflectiveQuadTo(122f, 522f)
                horizontalLineTo(82f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(42f, 482f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(82f, 442f)
                horizontalLineToRelative(40f)
                quadToRelative(14f, -125f, 103.5f, -214.5f)
                reflectiveQuadTo(440f, 124f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 44f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 84f)
                verticalLineToRelative(40f)
                quadToRelative(125f, 14f, 214.5f, 103.5f)
                reflectiveQuadTo(838f, 442f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(918f, 482f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(878f, 522f)
                horizontalLineToRelative(-40f)
                quadToRelative(-14f, 125f, -103.5f, 214.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                close()
                moveToRelative(40f, -118f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
            }
        }.build()
        
        return _Location_searching!!
    }

private var _Location_searching: ImageVector? = null

