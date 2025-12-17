package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Panorama_horizontal: ImageVector
    get() {
        if (_Panorama_horizontal != null) return _Panorama_horizontal!!
        
        _Panorama_horizontal = ImageVector.Builder(
            name = "panorama_horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(81f, 820f)
                verticalLineToRelative(-681f)
                quadToRelative(75f, 35f, 180f, 58f)
                reflectiveQuadToRelative(220f, 23f)
                quadToRelative(115f, 0f, 220f, -23f)
                reflectiveQuadToRelative(180f, -58f)
                verticalLineToRelative(681f)
                quadToRelative(-75f, -35f, -180f, -57.5f)
                reflectiveQuadTo(481f, 740f)
                quadToRelative(-115f, 0f, -220f, 22.5f)
                reflectiveQuadTo(81f, 820f)
                close()
            }
        }.build()
        
        return _Panorama_horizontal!!
    }

private var _Panorama_horizontal: ImageVector? = null

