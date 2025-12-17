package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dual_screen: ImageVector
    get() {
        if (_Dual_screen != null) return _Dual_screen!!
        
        _Dual_screen = ImageVector.Builder(
            name = "dual_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(210f, 778f)
                quadToRelative(-23f, -9f, -36.5f, -29f)
                reflectiveQuadTo(160f, 704f)
                verticalLineToRelative(-544f)
                quadToRelative(0f, -42f, 35f, -65.5f)
                reflectiveQuadToRelative(75f, -8.5f)
                lineToRelative(238f, 95f)
                quadToRelative(23f, 9f, 37.5f, 29.5f)
                reflectiveQuadTo(560f, 256f)
                verticalLineToRelative(544f)
                quadToRelative(0f, 42f, -35f, 66f)
                reflectiveQuadToRelative(-75f, 8f)
                lineToRelative(-240f, -96f)
                close()
                moveToRelative(430f, -18f)
                verticalLineToRelative(-504f)
                quadToRelative(0f, -67f, -54f, -108.5f)
                reflectiveQuadTo(467f, 80f)
                horizontalLineToRelative(253f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Dual_screen!!
    }

private var _Dual_screen: ImageVector? = null

