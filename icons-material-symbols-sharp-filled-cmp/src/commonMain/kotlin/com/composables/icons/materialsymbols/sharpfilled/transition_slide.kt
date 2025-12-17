package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Transition_slide: ImageVector
    get() {
        if (_Transition_slide != null) return _Transition_slide!!
        
        _Transition_slide = ImageVector.Builder(
            name = "transition_slide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(640f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Transition_slide!!
    }

private var _Transition_slide: ImageVector? = null

