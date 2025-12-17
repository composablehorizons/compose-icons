package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FolderMinus: ImageVector
    get() {
        if (_FolderMinus != null) return _FolderMinus!!
        
        _FolderMinus = ImageVector.Builder(
            name = "folder-minus",
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
                lineToRelative(-64f, -64f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-96f, 168f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineTo(160f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(192f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _FolderMinus!!
    }

private var _FolderMinus: ImageVector? = null

