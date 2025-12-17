package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tablet_camera: ImageVector
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
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(720f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(680f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                close()
                moveTo(300f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(100f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(280f)
                horizontalLineTo(300f)
                close()
                moveToRelative(180f, -70f)
                quadToRelative(29f, 0f, 49.5f, -20.5f)
                reflectiveQuadTo(550f, 740f)
                quadToRelative(0f, -29f, -20.5f, -49.5f)
                reflectiveQuadTo(480f, 670f)
                quadToRelative(-29f, 0f, -49.5f, 20.5f)
                reflectiveQuadTo(410f, 740f)
                quadToRelative(0f, 29f, 20.5f, 49.5f)
                reflectiveQuadTo(480f, 810f)
                close()
                moveTo(120f, 240f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(680f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Tablet_camera!!
    }

private var _Tablet_camera: ImageVector? = null

