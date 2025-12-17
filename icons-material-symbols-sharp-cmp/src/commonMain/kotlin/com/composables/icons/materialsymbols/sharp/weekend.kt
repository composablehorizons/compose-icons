package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Weekend: ImageVector
    get() {
        if (_Weekend != null) return _Weekend!!
        
        _Weekend = ImageVector.Builder(
            name = "weekend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                close()
                moveTo(120f, 720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(360f, -80f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 80f)
                close()
            }
        }.build()
        
        return _Weekend!!
    }

private var _Weekend: ImageVector? = null

