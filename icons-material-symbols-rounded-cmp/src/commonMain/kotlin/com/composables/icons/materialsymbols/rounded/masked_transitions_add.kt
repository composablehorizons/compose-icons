package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Masked_transitions_add: ImageVector
    get() {
        if (_Masked_transitions_add != null) return _Masked_transitions_add!!
        
        _Masked_transitions_add = ImageVector.Builder(
            name = "masked_transitions_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                quadToRelative(0f, 116f, -82f, 198f)
                reflectiveQuadTo(360f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(360f, 800f)
                close()
                moveToRelative(318f, -172f)
                quadToRelative(2f, -6f, 2f, -13f)
                verticalLineToRelative(-15f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineToRelative(-15f)
                quadToRelative(-7f, 0f, -13f, 2f)
                quadToRelative(26f, -88f, 98.5f, -145f)
                reflectiveQuadTo(600f, 80f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                quadToRelative(0f, 97f, -57f, 169.5f)
                reflectiveQuadTo(678f, 628f)
                close()
            }
        }.build()
        
        return _Masked_transitions_add!!
    }

private var _Masked_transitions_add: ImageVector? = null

