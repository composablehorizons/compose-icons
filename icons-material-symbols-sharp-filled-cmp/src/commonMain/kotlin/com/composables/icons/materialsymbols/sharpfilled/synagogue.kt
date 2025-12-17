package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Synagogue: ImageVector
    get() {
        if (_Synagogue != null) return _Synagogue!!
        
        _Synagogue = ImageVector.Builder(
            name = "synagogue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 280f)
                verticalLineToRelative(40f)
                horizontalLineTo(760f)
                close()
                moveToRelative(-720f, 0f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 280f)
                verticalLineToRelative(40f)
                horizontalLineTo(40f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(40f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-520f)
                lineToRelative(240f, -200f)
                lineToRelative(240f, 200f)
                verticalLineToRelative(520f)
                horizontalLineTo(560f)
                verticalLineToRelative(-280f)
                horizontalLineTo(400f)
                verticalLineToRelative(280f)
                horizontalLineTo(240f)
                close()
                moveToRelative(520f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(760f)
                close()
                moveTo(480f, 460f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 460f)
                close()
            }
        }.build()
        
        return _Synagogue!!
    }

private var _Synagogue: ImageVector? = null

