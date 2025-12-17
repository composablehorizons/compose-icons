package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Vignette: ImageVector
    get() {
        if (_Vignette != null) return _Vignette!!
        
        _Vignette = ImageVector.Builder(
            name = "vignette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(320f, -80f)
                quadToRelative(98f, 0f, 169f, -47.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -65f, -71f, -112.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-98f, 0f, -169f, 47.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 65f, 71f, 112.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-65f, 0f, -112.5f, -24f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -32f, 47.5f, -56f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(65f, 0f, 112.5f, 24f)
                reflectiveQuadToRelative(47.5f, 56f)
                quadToRelative(0f, 32f, -47.5f, 56f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Vignette!!
    }

private var _Vignette: ImageVector? = null

