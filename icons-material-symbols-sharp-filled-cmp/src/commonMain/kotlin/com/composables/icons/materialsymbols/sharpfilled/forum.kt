package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Forum: ImageVector
    get() {
        if (_Forum != null) return _Forum!!
        
        _Forum = ImageVector.Builder(
            name = "forum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                lineTo(720f, 720f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(440f)
                horizontalLineTo(240f)
                lineTo(80f, 680f)
                close()
            }
        }.build()
        
        return _Forum!!
    }

private var _Forum: ImageVector? = null

