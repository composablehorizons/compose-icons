package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(567.938f, 243.908f)
                lineTo(462.25f, 85.374f)
                arcTo(48.003f, 48.003f, 0f, false, false, 422.311f, 64f)
                horizontalLineTo(153.689f)
                arcToRelative(48f, 48f, 0f, false, false, -39.938f, 21.374f)
                lineTo(8.062f, 243.908f)
                arcTo(47.994f, 47.994f, 0f, false, false, 0f, 270.533f)
                verticalLineTo(400f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(270.533f)
                arcToRelative(47.994f, 47.994f, 0f, false, false, -8.062f, -26.625f)
                close()
                moveTo(162.252f, 128f)
                horizontalLineToRelative(251.497f)
                lineToRelative(85.333f, 128f)
                horizontalLineTo(376f)
                lineToRelative(-32f, 64f)
                horizontalLineTo(232f)
                lineToRelative(-32f, -64f)
                horizontalLineTo(76.918f)
                lineToRelative(85.334f, -128f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

