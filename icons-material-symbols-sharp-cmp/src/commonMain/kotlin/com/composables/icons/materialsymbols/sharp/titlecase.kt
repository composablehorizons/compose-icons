package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Titlecase: ImageVector
    get() {
        if (_Titlecase != null) return _Titlecase!!
        
        _Titlecase = ImageVector.Builder(
            name = "titlecase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 710f)
                verticalLineToRelative(-366f)
                horizontalLineTo(224f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(308f)
                verticalLineToRelative(64f)
                horizontalLineTo(412f)
                verticalLineToRelative(366f)
                horizontalLineToRelative(-68f)
                close()
                moveToRelative(344f, 10f)
                quadToRelative(-44f, 0f, -69f, -25.5f)
                reflectiveQuadTo(594f, 624f)
                verticalLineToRelative(-162f)
                horizontalLineToRelative(-54f)
                verticalLineToRelative(-58f)
                horizontalLineToRelative(54f)
                verticalLineToRelative(-87f)
                horizontalLineToRelative(66f)
                verticalLineToRelative(87f)
                horizontalLineToRelative(74f)
                verticalLineToRelative(58f)
                horizontalLineToRelative(-74f)
                verticalLineToRelative(148f)
                quadToRelative(0f, 23f, 10.5f, 36f)
                reflectiveQuadToRelative(28.5f, 13f)
                quadToRelative(9f, 0f, 18.5f, -3.5f)
                reflectiveQuadTo(736f, 646f)
                verticalLineToRelative(65f)
                quadToRelative(-10f, 5f, -22f, 7f)
                reflectiveQuadToRelative(-26f, 2f)
                close()
            }
        }.build()
        
        return _Titlecase!!
    }

private var _Titlecase: ImageVector? = null

