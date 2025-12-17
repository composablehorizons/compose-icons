package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.WindowRestore: ImageVector
    get() {
        if (_WindowRestore != null) return _WindowRestore!!
        
        _WindowRestore = ImageVector.Builder(
            name = "window-restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 0f)
                horizontalLineTo(144f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(320f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(48f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-96f, 464f)
                horizontalLineTo(48f)
                verticalLineTo(256f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(208f)
                close()
                moveToRelative(96f, -96f)
                horizontalLineToRelative(-48f)
                verticalLineTo(144f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(144f)
                verticalLineTo(48f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _WindowRestore!!
    }

private var _WindowRestore: ImageVector? = null

