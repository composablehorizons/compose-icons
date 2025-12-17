package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nightlife: ImageVector
    get() {
        if (_Nightlife != null) return _Nightlife!!
        
        _Nightlife = ImageVector.Builder(
            name = "nightlife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                lineTo(40f, 200f)
                horizontalLineToRelative(560f)
                lineTo(360f, 560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(36f, -440f)
                horizontalLineToRelative(168f)
                lineToRelative(56f, -80f)
                horizontalLineTo(180f)
                lineToRelative(56f, 80f)
                close()
                moveToRelative(404f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(11f, 0f, 21f, 1.5f)
                reflectiveQuadToRelative(19f, 6.5f)
                verticalLineToRelative(-368f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(760f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Nightlife!!
    }

private var _Nightlife: ImageVector? = null

