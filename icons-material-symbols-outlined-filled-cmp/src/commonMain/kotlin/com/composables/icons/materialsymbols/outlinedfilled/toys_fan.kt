package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Toys_fan: ImageVector
    get() {
        if (_Toys_fan != null) return _Toys_fan!!
        
        _Toys_fan = ImageVector.Builder(
            name = "toys_fan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(0f, -91f, 64.5f, -155.5f)
                reflectiveQuadTo(700f, 260f)
                quadToRelative(91f, 0f, 155.5f, 64.5f)
                reflectiveQuadTo(920f, 480f)
                horizontalLineTo(480f)
                close()
                moveTo(260f, 700f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(40f, 480f)
                horizontalLineToRelative(440f)
                quadToRelative(0f, 91f, -64.5f, 155.5f)
                reflectiveQuadTo(260f, 700f)
                close()
                moveToRelative(220f, -220f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(260f, 260f)
                quadToRelative(0f, -91f, 64.5f, -155.5f)
                reflectiveQuadTo(480f, 40f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 440f)
                verticalLineToRelative(-440f)
                quadToRelative(91f, 0f, 155.5f, 64.5f)
                reflectiveQuadTo(700f, 700f)
                quadToRelative(0f, 91f, -64.5f, 155.5f)
                reflectiveQuadTo(480f, 920f)
                close()
            }
        }.build()
        
        return _Toys_fan!!
    }

private var _Toys_fan: ImageVector? = null

