package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Smartphone_camera: ImageVector
    get() {
        if (_Smartphone_camera != null) return _Smartphone_camera!!
        
        _Smartphone_camera = ImageVector.Builder(
            name = "smartphone_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -680f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(240f, 480f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(100f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                close()
                moveToRelative(180f, -70f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(770f, 500f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(700f, 430f)
                quadToRelative(-29f, 0f, -49.5f, 20.5f)
                reflectiveQuadTo(630f, 500f)
                quadToRelative(0f, 29f, 20.5f, 49.5f)
                reflectiveQuadTo(700f, 570f)
                close()
                moveTo(280f, 840f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -680f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Smartphone_camera!!
    }

private var _Smartphone_camera: ImageVector? = null

