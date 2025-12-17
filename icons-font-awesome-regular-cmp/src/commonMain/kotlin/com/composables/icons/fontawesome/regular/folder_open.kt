package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) return _FolderOpen!!
        
        _FolderOpen = ImageVector.Builder(
            name = "folder-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(527.9f, 224f)
                horizontalLineTo(480f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(272f)
                lineToRelative(-64f, -64f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(400f)
                curveToRelative(16.5f, 0f, 31.9f, -8.5f, 40.7f, -22.6f)
                lineToRelative(79.9f, -128f)
                curveToRelative(20f, -31.9f, -3f, -73.4f, -40.7f, -73.4f)
                close()
                moveTo(48f, 118f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(134.1f)
                lineToRelative(64f, 64f)
                horizontalLineTo(426f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(42f)
                horizontalLineTo(152f)
                curveToRelative(-16.8f, 0f, -32.4f, 8.8f, -41.1f, 23.2f)
                lineTo(48f, 351.4f)
                close()
                moveToRelative(400f, 282f)
                horizontalLineTo(72f)
                lineToRelative(77.2f, -128f)
                horizontalLineTo(528f)
                close()
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null

