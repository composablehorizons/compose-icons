package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Panorama_vertical: ImageVector
    get() {
        if (_Panorama_vertical != null) return _Panorama_vertical!!
        
        _Panorama_vertical = ImageVector.Builder(
            name = "panorama_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(255f, 801f)
                horizontalLineToRelative(451f)
                quadToRelative(-23f, -78f, -34.5f, -158.5f)
                reflectiveQuadTo(660f, 481f)
                quadToRelative(0f, -81f, 11.5f, -161.5f)
                reflectiveQuadTo(706f, 161f)
                horizontalLineTo(255f)
                quadToRelative(23f, 78f, 34f, 158.5f)
                reflectiveQuadTo(300f, 481f)
                quadToRelative(0f, 81f, -11f, 161.5f)
                reflectiveQuadTo(255f, 801f)
                close()
                moveTo(139f, 880f)
                quadToRelative(35f, -75f, 58f, -180f)
                reflectiveQuadToRelative(23f, -220f)
                quadToRelative(0f, -115f, -23f, -220f)
                reflectiveQuadToRelative(-58f, -180f)
                horizontalLineToRelative(681f)
                quadToRelative(-35f, 75f, -57.5f, 180f)
                reflectiveQuadTo(740f, 480f)
                quadToRelative(0f, 115f, 22.5f, 220f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(139f)
                close()
                moveToRelative(342f, -399f)
                close()
            }
        }.build()
        
        return _Panorama_vertical!!
    }

private var _Panorama_vertical: ImageVector? = null

