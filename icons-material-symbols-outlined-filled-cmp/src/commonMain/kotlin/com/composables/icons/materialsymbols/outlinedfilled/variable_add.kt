package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Variable_add: ImageVector
    get() {
        if (_Variable_add != null) return _Variable_add!!
        
        _Variable_add = ImageVector.Builder(
            name = "variable_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(123f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 11f, 0.5f, 20.5f)
                reflectiveQuadTo(563f, 680f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, 120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(840f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Variable_add!!
    }

private var _Variable_add: ImageVector? = null

