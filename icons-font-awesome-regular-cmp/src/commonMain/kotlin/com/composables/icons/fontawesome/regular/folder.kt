package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Folder: ImageVector
    get() {
        if (_Folder != null) return _Folder!!
        
        _Folder = ImageVector.Builder(
            name = "folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 128f)
                horizontalLineTo(272f)
                lineToRelative(-54.63f, -54.63f)
                curveToRelative(-6f, -6f, -14.14f, -9.37f, -22.63f, -9.37f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 272f)
                horizontalLineTo(48f)
                verticalLineTo(112f)
                horizontalLineToRelative(140.12f)
                lineToRelative(54.63f, 54.63f)
                curveToRelative(6f, 6f, 14.14f, 9.37f, 22.63f, 9.37f)
                horizontalLineTo(464f)
                verticalLineToRelative(224f)
                close()
            }
        }.build()
        
        return _Folder!!
    }

private var _Folder: ImageVector? = null

