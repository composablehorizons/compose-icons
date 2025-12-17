package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fork_spoon: ImageVector
    get() {
        if (_Fork_spoon != null) return _Fork_spoon!!
        
        _Fork_spoon = ImageVector.Builder(
            name = "fork_spoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-366f)
                quadToRelative(-54f, -14f, -87f, -57f)
                reflectiveQuadToRelative(-33f, -97f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 54f, -33f, 97f)
                reflectiveQuadToRelative(-87f, 57f)
                verticalLineToRelative(366f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-381f)
                quadToRelative(-54f, -18f, -87f, -75.5f)
                reflectiveQuadTo(520f, 293f)
                quadToRelative(0f, -89f, 47f, -151f)
                reflectiveQuadToRelative(113f, -62f)
                quadToRelative(66f, 0f, 113f, 62.5f)
                reflectiveQuadTo(840f, 294f)
                quadToRelative(0f, 73f, -33f, 130f)
                reflectiveQuadToRelative(-87f, 75f)
                verticalLineToRelative(381f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Fork_spoon!!
    }

private var _Fork_spoon: ImageVector? = null

