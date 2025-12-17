package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Transition_slide: ImageVector
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
                moveToRelative(80f, -79f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-482f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(240f, 79f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(640f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -79f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-482f)
                horizontalLineTo(440f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-482f)
                verticalLineToRelative(482f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-482f)
                verticalLineToRelative(482f)
                close()
            }
        }.build()
        
        return _Transition_slide!!
    }

private var _Transition_slide: ImageVector? = null

