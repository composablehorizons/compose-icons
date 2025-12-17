package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Code_blocks: ImageVector
    get() {
        if (_Code_blocks != null) return _Code_blocks!!
        
        _Code_blocks = ImageVector.Builder(
            name = "code_blocks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(353f, 480f)
                lineToRelative(59f, -59f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(355f, 365f)
                lineToRelative(-87f, 87f)
                quadToRelative(-6f, 6f, -8.5f, 13f)
                reflectiveQuadToRelative(-2.5f, 15f)
                quadToRelative(0f, 8f, 2.5f, 15f)
                reflectiveQuadToRelative(8.5f, 13f)
                lineToRelative(87f, 87f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-59f, -59f)
                close()
                moveToRelative(254f, 0f)
                lineToRelative(-59f, 59f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(87f, -87f)
                quadToRelative(6f, -6f, 8.5f, -13f)
                reflectiveQuadToRelative(2.5f, -15f)
                quadToRelative(0f, -8f, -2.5f, -15f)
                reflectiveQuadToRelative(-8.5f, -13f)
                lineToRelative(-87f, -87f)
                quadToRelative(-6f, -6f, -13.5f, -9f)
                reflectiveQuadToRelative(-15f, -3f)
                quadToRelative(-7.5f, 0f, -15f, 3f)
                reflectiveQuadToRelative(-13.5f, 9f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(59f, 59f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Code_blocks!!
    }

private var _Code_blocks: ImageVector? = null

