package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cell_wifi: ImageVector
    get() {
        if (_Cell_wifi != null) return _Cell_wifi!!
        
        _Cell_wifi = ImageVector.Builder(
            name = "cell_wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                lineToRelative(640f, -642f)
                verticalLineToRelative(642f)
                horizontalLineTo(240f)
                close()
                moveToRelative(480f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-368f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(288f)
                close()
                moveTo(442f, 524f)
                quadToRelative(-24f, 0f, -42f, -18f)
                reflectiveQuadToRelative(-18f, -42f)
                quadToRelative(0f, -24f, 18f, -42f)
                reflectiveQuadToRelative(42f, -18f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveTo(314f, 392f)
                lineToRelative(-52f, -52f)
                quadToRelative(38f, -38f, 84f, -56f)
                reflectiveQuadToRelative(96f, -18f)
                quadToRelative(50f, 0f, 96f, 18f)
                reflectiveQuadToRelative(84f, 56f)
                lineToRelative(-52f, 52f)
                quadToRelative(-27f, -27f, -60f, -40.5f)
                reflectiveQuadTo(442f, 338f)
                quadToRelative(-35f, 0f, -68f, 13.5f)
                reflectiveQuadTo(314f, 392f)
                close()
                moveTo(212f, 288f)
                lineToRelative(-52f, -50f)
                quadToRelative(59f, -59f, 132f, -88.5f)
                reflectiveQuadTo(442f, 120f)
                quadToRelative(77f, 0f, 151f, 29.5f)
                reflectiveQuadTo(726f, 238f)
                lineToRelative(-52f, 50f)
                quadToRelative(-48f, -48f, -108.5f, -71f)
                reflectiveQuadTo(442f, 194f)
                quadToRelative(-63f, 0f, -122.5f, 23f)
                reflectiveQuadTo(212f, 288f)
                close()
            }
        }.build()
        
        return _Cell_wifi!!
    }

private var _Cell_wifi: ImageVector? = null

