package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_multi_room: ImageVector
    get() {
        if (_Nest_multi_room != null) return _Nest_multi_room!!
        
        _Nest_multi_room = ImageVector.Builder(
            name = "nest_multi_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(360f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                close()
                moveTo(240f, 560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-119f)
                horizontalLineTo(240f)
                verticalLineToRelative(119f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-119f)
                horizontalLineTo(440f)
                verticalLineToRelative(119f)
                close()
                moveTo(292f, 361f)
                horizontalLineToRelative(376f)
                lineTo(480f, 220f)
                lineTo(292f, 361f)
                close()
                moveToRelative(-52f, 479f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(11f, -8f, 23f, -12f)
                reflectiveQuadToRelative(25f, -4f)
                quadToRelative(13f, 0f, 25f, 4f)
                reflectiveQuadToRelative(23f, 12f)
                lineToRelative(240f, 180f)
                quadToRelative(15f, 11f, 23.5f, 28f)
                reflectiveQuadToRelative(8.5f, 36f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Nest_multi_room!!
    }

private var _Nest_multi_room: ImageVector? = null

