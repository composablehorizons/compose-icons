package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Leak_add: ImageVector
    get() {
        if (_Leak_add != null) return _Leak_add!!
        
        _Leak_add = ImageVector.Builder(
            name = "leak_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 560f)
                verticalLineToRelative(-80f)
                quadToRelative(74f, 0f, 139.5f, -28.5f)
                reflectiveQuadTo(374f, 374f)
                quadToRelative(49f, -49f, 77.5f, -114.5f)
                reflectiveQuadTo(480f, 120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 91f, -34.5f, 171f)
                reflectiveQuadTo(431f, 431f)
                quadToRelative(-60f, 60f, -140f, 94.5f)
                reflectiveQuadTo(120f, 560f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 116f, -82f, 198f)
                reflectiveQuadToRelative(-198f, 82f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(280f, 600f)
                quadToRelative(0f, -91f, 34.5f, -171f)
                reflectiveQuadTo(529f, 529f)
                quadToRelative(60f, -60f, 140f, -94.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(80f)
                quadToRelative(-74f, 0f, -139.5f, 28.5f)
                reflectiveQuadTo(586f, 586f)
                quadToRelative(-49f, 49f, -77.5f, 114.5f)
                reflectiveQuadTo(480f, 840f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                verticalLineToRelative(80f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                verticalLineToRelative(120f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Leak_add!!
    }

private var _Leak_add: ImageVector? = null

