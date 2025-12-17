package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Piano: ImageVector
    get() {
        if (_Piano != null) return _Piano!!
        
        _Piano = ImageVector.Builder(
            name = "piano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-380f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(430f, 0f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(380f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-380f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(380f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Piano!!
    }

private var _Piano: ImageVector? = null

