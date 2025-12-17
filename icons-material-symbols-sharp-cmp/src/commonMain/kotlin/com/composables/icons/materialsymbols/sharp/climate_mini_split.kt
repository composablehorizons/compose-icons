package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Climate_mini_split: ImageVector
    get() {
        if (_Climate_mini_split != null) return _Climate_mini_split!!
        
        _Climate_mini_split = ImageVector.Builder(
            name = "climate_mini_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 480f)
                horizontalLineTo(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(400f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(640f, 0f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(600f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-360f, 40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, -400f)
                horizontalLineTo(160f)
                horizontalLineToRelative(640f)
                close()
                moveToRelative(-560f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Climate_mini_split!!
    }

private var _Climate_mini_split: ImageVector? = null

