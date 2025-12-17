package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Smartphone_camera: ImageVector
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
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(120f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(300f, -280f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 580f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 360f)
                horizontalLineToRelative(40f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
                horizontalLineToRelative(40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 420f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 640f)
                horizontalLineTo(580f)
                close()
                moveToRelative(120f, -70f)
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
        
        return _Smartphone_camera!!
    }

private var _Smartphone_camera: ImageVector? = null

