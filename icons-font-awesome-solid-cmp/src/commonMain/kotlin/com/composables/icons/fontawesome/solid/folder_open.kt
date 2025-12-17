package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FolderOpen: ImageVector
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
                moveTo(572.694f, 292.093f)
                lineTo(500.27f, 416.248f)
                arcTo(63.997f, 63.997f, 0f, false, true, 444.989f, 448f)
                horizontalLineTo(45.025f)
                curveToRelative(-18.523f, 0f, -30.064f, -20.093f, -20.731f, -36.093f)
                lineToRelative(72.424f, -124.155f)
                arcTo(64f, 64f, 0f, false, true, 152f, 256f)
                horizontalLineToRelative(399.964f)
                curveToRelative(18.523f, 0f, 30.064f, 20.093f, 20.73f, 36.093f)
                close()
                moveTo(152f, 224f)
                horizontalLineToRelative(328f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(272f)
                lineToRelative(-64f, -64f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(278.046f)
                lineToRelative(69.077f, -118.418f)
                curveTo(86.214f, 242.25f, 117.989f, 224f, 152f, 224f)
                close()
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null

