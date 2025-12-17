package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tablet_camera: ImageVector
    get() {
        if (_Tablet_camera != null) return _Tablet_camera!!
        
        _Tablet_camera = ImageVector.Builder(
            name = "tablet_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(720f)
                close()
                moveTo(160f, 240f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-640f, 0f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
                moveTo(360f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(300f, 820f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineToRelative(40f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 660f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -70f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(550f, 740f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(480f, 670f)
                quadToRelative(-29f, 0f, -49.5f, 20.5f)
                reflectiveQuadTo(410f, 740f)
                quadToRelative(0f, 29f, 20.5f, 49.5f)
                reflectiveQuadTo(480f, 810f)
                close()
            }
        }.build()
        
        return _Tablet_camera!!
    }

private var _Tablet_camera: ImageVector? = null

