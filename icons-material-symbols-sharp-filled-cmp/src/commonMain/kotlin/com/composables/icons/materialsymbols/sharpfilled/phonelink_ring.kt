package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phonelink_ring: ImageVector
    get() {
        if (_Phonelink_ring != null) return _Phonelink_ring!!
        
        _Phonelink_ring = ImageVector.Builder(
            name = "phonelink_ring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(734f, 594f)
                lineToRelative(-58f, -58f)
                quadToRelative(12f, -11f, 18.5f, -25.5f)
                reflectiveQuadTo(701f, 480f)
                quadToRelative(0f, -16f, -6.5f, -30.5f)
                reflectiveQuadTo(676f, 424f)
                lineToRelative(58f, -58f)
                quadToRelative(23f, 23f, 35f, 52.5f)
                reflectiveQuadToRelative(12f, 61.5f)
                quadToRelative(0f, 32f, -12f, 61.5f)
                reflectiveQuadTo(734f, 594f)
                close()
                moveToRelative(98f, 98f)
                lineToRelative(-56f, -56f)
                quadToRelative(31f, -31f, 48f, -71f)
                reflectiveQuadToRelative(17f, -85f)
                quadToRelative(0f, -45f, -17f, -85f)
                reflectiveQuadToRelative(-48f, -71f)
                lineToRelative(56f, -56f)
                quadToRelative(43f, 42f, 66f, 97f)
                reflectiveQuadToRelative(23f, 115f)
                quadToRelative(0f, 60f, -23f, 115f)
                reflectiveQuadToRelative(-66f, 97f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Phonelink_ring!!
    }

private var _Phonelink_ring: ImageVector? = null

