package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Splitscreen_add: ImageVector
    get() {
        if (_Splitscreen_add != null) return _Splitscreen_add!!
        
        _Splitscreen_add = ImageVector.Builder(
            name = "splitscreen_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 440f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(84f)
                quadToRelative(-11f, -2f, -20.5f, -3f)
                reflectiveQuadToRelative(-19.5f, -1f)
                quadToRelative(-85f, 0f, -142.5f, 59f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, 11f, 1f, 21f)
                reflectiveQuadToRelative(3f, 19f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, 80f)
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
            }
        }.build()
        
        return _Splitscreen_add!!
    }

private var _Splitscreen_add: ImageVector? = null

