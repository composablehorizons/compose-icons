package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WindowRestore: ImageVector
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
                moveTo(512f, 48f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineToRelative(-48f)
                verticalLineTo(176f)
                curveToRelative(0f, -44.1f, -35.9f, -80f, -80f, -80f)
                horizontalLineTo(128f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(384f, 176f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-68f, 28f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(252f)
                verticalLineToRelative(-52f)
                close()
            }
        }.build()
        
        return _WindowRestore!!
    }

private var _WindowRestore: ImageVector? = null

