package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Contextual_token_add: ImageVector
    get() {
        if (_Contextual_token_add != null) return _Contextual_token_add!!
        
        _Contextual_token_add = ImageVector.Builder(
            name = "contextual_token_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 360f)
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
                moveTo(240f, 640f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(497f)
                quadToRelative(-8f, 18f, -12.5f, 38.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(0f, 34f, 10.5f, 64.5f)
                reflectiveQuadTo(600f, 360f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-204f)
                quadToRelative(10f, 2f, 19.5f, 3f)
                reflectiveQuadToRelative(20.5f, 1f)
                quadToRelative(34f, 0f, 64.5f, -10.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Contextual_token_add!!
    }

private var _Contextual_token_add: ImageVector? = null

