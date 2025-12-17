package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Steps: ImageVector
    get() {
        if (_Steps != null) return _Steps!!
        
        _Steps = ImageVector.Builder(
            name = "steps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 880f)
                lineTo(296f, 380f)
                horizontalLineTo(76f)
                lineToRelative(232f, -311f)
                lineToRelative(132f, 66f)
                verticalLineToRelative(131f)
                lineToRelative(147f, -35f)
                lineToRelative(88f, 267f)
                lineToRelative(205f, 205f)
                lineToRelative(-30f, 177f)
                horizontalLineToRelative(-30f)
                close()
                moveToRelative(-315f, 0f)
                lineTo(43f, 460f)
                horizontalLineToRelative(222f)
                lineTo(703f, 880f)
                horizontalLineTo(505f)
                close()
            }
        }.build()
        
        return _Steps!!
    }

private var _Steps: ImageVector? = null

