package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Moped_package: ImageVector
    get() {
        if (_Moped_package != null) return _Moped_package!!
        
        _Moped_package = ImageVector.Builder(
            name = "moped_package",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-40f, 520f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(140f)
                lineToRelative(140f, -174f)
                verticalLineToRelative(-106f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(214f)
                lineTo(580f, 640f)
                horizontalLineTo(400f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(40f, -200f)
                close()
                moveToRelative(-40f, 120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(480f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 680f)
                close()
                moveTo(160f, 560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Moped_package!!
    }

private var _Moped_package: ImageVector? = null

