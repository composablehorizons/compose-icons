package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Location_searching: ImageVector
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
                moveTo(440f, 920f)
                verticalLineToRelative(-80f)
                quadToRelative(-125f, -14f, -214.5f, -103.5f)
                reflectiveQuadTo(122f, 522f)
                horizontalLineTo(42f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(14f, -125f, 103.5f, -214.5f)
                reflectiveQuadTo(440f, 124f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(125f, 14f, 214.5f, 103.5f)
                reflectiveQuadTo(838f, 442f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-14f, 125f, -103.5f, 214.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -158f)
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

