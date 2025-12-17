package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vignette: ImageVector
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
                moveTo(480f, 640f)
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Vignette!!
    }

private var _Vignette: ImageVector? = null

