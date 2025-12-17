package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Parking_valet: ImageVector
    get() {
        if (_Parking_valet != null) return _Parking_valet!!
        
        _Parking_valet = ImageVector.Builder(
            name = "parking_valet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 840f)
                lineToRelative(-20f, -240f)
                lineToRelative(-60f, -40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(620f, 320f)
                horizontalLineToRelative(20f)
                lineToRelative(40f, 80f)
                lineToRelative(40f, -80f)
                horizontalLineToRelative(20f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(820f, 400f)
                verticalLineToRelative(160f)
                lineToRelative(-60f, 40f)
                lineToRelative(-20f, 240f)
                horizontalLineTo(620f)
                close()
                moveToRelative(60f, -560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 200f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 280f)
                close()
                moveToRelative(-80f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(208f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(222f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-60f, -200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
            }
        }.build()
        
        return _Parking_valet!!
    }

private var _Parking_valet: ImageVector? = null

