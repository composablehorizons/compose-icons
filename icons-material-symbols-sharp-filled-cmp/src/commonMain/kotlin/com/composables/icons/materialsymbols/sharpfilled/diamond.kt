package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 330f)
                lineToRelative(106f, -210f)
                horizontalLineToRelative(12f)
                lineToRelative(106f, 210f)
                horizontalLineTo(368f)
                close()
                moveToRelative(82f, 474f)
                lineTo(105f, 390f)
                horizontalLineToRelative(345f)
                verticalLineToRelative(414f)
                close()
                moveToRelative(60f, 0f)
                verticalLineToRelative(-414f)
                horizontalLineToRelative(345f)
                lineTo(510f, 804f)
                close()
                moveToRelative(148f, -474f)
                lineTo(554f, 120f)
                horizontalLineToRelative(206f)
                lineToRelative(105f, 210f)
                horizontalLineTo(658f)
                close()
                moveToRelative(-563f, 0f)
                lineToRelative(105f, -210f)
                horizontalLineToRelative(206f)
                lineTo(302f, 330f)
                horizontalLineTo(95f)
                close()
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

