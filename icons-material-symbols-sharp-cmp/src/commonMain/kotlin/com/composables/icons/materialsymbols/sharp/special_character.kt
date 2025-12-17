package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Special_character: ImageVector
    get() {
        if (_Special_character != null) return _Special_character!!
        
        _Special_character = ImageVector.Builder(
            name = "special_character",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                quadToRelative(-84f, -45f, -132f, -125f)
                reflectiveQuadToRelative(-48f, -175f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(142f, 0f, 241f, 99f)
                reflectiveQuadToRelative(99f, 241f)
                quadToRelative(0f, 95f, -48f, 175f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-204f)
                quadToRelative(78f, -14f, 129f, -75f)
                reflectiveQuadToRelative(51f, -141f)
                quadToRelative(0f, -92f, -64f, -156f)
                reflectiveQuadToRelative(-156f, -64f)
                quadToRelative(-92f, 0f, -156f, 64f)
                reflectiveQuadToRelative(-64f, 156f)
                quadToRelative(0f, 80f, 51f, 141f)
                reflectiveQuadToRelative(129f, 75f)
                verticalLineToRelative(204f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Special_character!!
    }

private var _Special_character: ImageVector? = null

