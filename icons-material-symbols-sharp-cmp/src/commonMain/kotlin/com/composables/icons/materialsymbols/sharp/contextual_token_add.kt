package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Contextual_token_add: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
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
                moveToRelative(360f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineTo(600f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-440f, 80f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(560f, -360f)
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
        
        return _Contextual_token_add!!
    }

private var _Contextual_token_add: ImageVector? = null

