package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Touchpad_mouse: ImageVector
    get() {
        if (_Touchpad_mouse != null) return _Touchpad_mouse!!
        
        _Touchpad_mouse = ImageVector.Builder(
            name = "touchpad_mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 880f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(440f, 660f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 91f, -64f, 155.5f)
                reflectiveQuadTo(660f, 880f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(176f)
                quadToRelative(-43f, -46f, -100f, -71f)
                reflectiveQuadToRelative(-120f, -25f)
                quadToRelative(-125f, 0f, -212.5f, 87.5f)
                reflectiveQuadTo(360f, 540f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 37f, 8.5f, 72.5f)
                reflectiveQuadTo(394f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, -280f)
                quadToRelative(3f, -75f, 54f, -129.5f)
                reflectiveQuadTo(620f, 323f)
                verticalLineToRelative(197f)
                horizontalLineTo(440f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-197f)
                quadToRelative(75f, 13f, 126f, 67.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(700f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse!!
    }

private var _Touchpad_mouse: ImageVector? = null

