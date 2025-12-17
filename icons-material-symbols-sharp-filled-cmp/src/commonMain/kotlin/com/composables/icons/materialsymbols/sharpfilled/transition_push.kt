package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Transition_push: ImageVector
    get() {
        if (_Transition_push != null) return _Transition_push!!
        
        _Transition_push = ImageVector.Builder(
            name = "transition_push",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-79f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-481f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                horizontalLineTo(320f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(640f)
                horizontalLineTo(560f)
                close()
                moveTo(200f, 640f)
                lineToRelative(-57f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(166f)
                lineToRelative(-63f, -63f)
                lineToRelative(57f, -57f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Transition_push!!
    }

private var _Transition_push: ImageVector? = null

