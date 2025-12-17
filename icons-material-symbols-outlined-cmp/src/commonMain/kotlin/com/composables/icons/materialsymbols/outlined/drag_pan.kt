package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Drag_pan: ImageVector
    get() {
        if (_Drag_pan != null) return _Drag_pan!!
        
        _Drag_pan = ImageVector.Builder(
            name = "drag_pan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(310f, 710f)
                lineToRelative(57f, -57f)
                lineToRelative(73f, 73f)
                verticalLineToRelative(-206f)
                horizontalLineTo(235f)
                lineToRelative(73f, 72f)
                lineToRelative(-58f, 58f)
                lineTo(80f, 480f)
                lineToRelative(169f, -169f)
                lineToRelative(57f, 57f)
                lineToRelative(-72f, 72f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-206f)
                lineToRelative(-73f, 73f)
                lineToRelative(-57f, -57f)
                lineToRelative(170f, -170f)
                lineToRelative(170f, 170f)
                lineToRelative(-57f, 57f)
                lineToRelative(-73f, -73f)
                verticalLineToRelative(206f)
                horizontalLineToRelative(205f)
                lineToRelative(-73f, -72f)
                lineToRelative(58f, -58f)
                lineToRelative(170f, 170f)
                lineToRelative(-170f, 170f)
                lineToRelative(-57f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(520f)
                verticalLineToRelative(205f)
                lineToRelative(72f, -73f)
                lineToRelative(58f, 58f)
                lineTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Drag_pan!!
    }

private var _Drag_pan: ImageVector? = null

