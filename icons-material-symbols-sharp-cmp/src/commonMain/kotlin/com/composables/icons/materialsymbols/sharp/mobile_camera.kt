package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_camera: ImageVector
    get() {
        if (_Mobile_camera != null) return _Mobile_camera!!
        
        _Mobile_camera = ImageVector.Builder(
            name = "mobile_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(600f)
                close()
                moveToRelative(200f, -480f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(200f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(200f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(-160f, -80f)
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
            }
        }.build()
        
        return _Mobile_camera!!
    }

private var _Mobile_camera: ImageVector? = null

