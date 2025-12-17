package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.All_match: ImageVector
    get() {
        if (_All_match != null) return _All_match!!
        
        _All_match = ImageVector.Builder(
            name = "all_match",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(691f, 810f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(29f, 110f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(120f, 760f)
                lineToRelative(180f, -280f)
                lineToRelative(-180f, -280f)
                horizontalLineToRelative(522f)
                lineToRelative(185f, 261f)
                quadToRelative(-24f, -10f, -55.5f, -16f)
                reflectiveQuadToRelative(-57.5f, -5f)
                quadToRelative(-118f, 2f, -196f, 85.5f)
                reflectiveQuadTo(440f, 721f)
                quadToRelative(0f, 10f, 0.5f, 19.5f)
                reflectiveQuadTo(443f, 760f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _All_match!!
    }

private var _All_match: ImageVector? = null

