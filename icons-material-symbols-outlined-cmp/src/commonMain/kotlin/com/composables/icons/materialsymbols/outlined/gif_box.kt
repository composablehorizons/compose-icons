package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Gif_box: ImageVector
    get() {
        if (_Gif_box != null) return _Gif_box!!
        
        _Gif_box = ImageVector.Builder(
            name = "gif_box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 560f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 520f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 400f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(340f, 560f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(540f)
                verticalLineToRelative(160f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Gif_box!!
    }

private var _Gif_box: ImageVector? = null

