package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Directions_railway: ImageVector
    get() {
        if (_Directions_railway != null) return _Directions_railway!!
        
        _Directions_railway = ImageVector.Builder(
            name = "directions_railway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -120f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(-20f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -129f, 92.5f, -204.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(135f, 0f, 227.5f, 75.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-20f)
                lineToRelative(40f, 40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -160f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveTo(240f, 360f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -23f, -4.5f, -42.5f)
                reflectiveQuadTo(703f, 240f)
                horizontalLineTo(257f)
                quadToRelative(-8f, 18f, -12.5f, 37.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Directions_railway!!
    }

private var _Directions_railway: ImageVector? = null

