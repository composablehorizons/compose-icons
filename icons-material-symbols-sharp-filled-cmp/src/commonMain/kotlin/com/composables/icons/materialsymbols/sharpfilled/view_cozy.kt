package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_cozy: ImageVector
    get() {
        if (_View_cozy != null) return _View_cozy!!
        
        _View_cozy = ImageVector.Builder(
            name = "view_cozy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 420f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(300f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 420f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(300f)
                horizontalLineTo(120f)
                close()
                moveToRelative(420f, -420f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(300f)
                horizontalLineTo(540f)
                close()
                moveToRelative(0f, 420f)
                verticalLineToRelative(-300f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(300f)
                horizontalLineTo(540f)
                close()
            }
        }.build()
        
        return _View_cozy!!
    }

private var _View_cozy: ImageVector? = null

