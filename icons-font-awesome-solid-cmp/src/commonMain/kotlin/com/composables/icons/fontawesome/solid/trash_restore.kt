package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TrashRestore: ImageVector
    get() {
        if (_TrashRestore != null) return _TrashRestore!!
        
        _TrashRestore = ImageVector.Builder(
            name = "trash-restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(53.2f, 467f)
                arcToRelative(48f, 48f, 0f, false, false, 47.9f, 45f)
                horizontalLineToRelative(245.8f)
                arcToRelative(48f, 48f, 0f, false, false, 47.9f, -45f)
                lineTo(416f, 128f)
                horizontalLineTo(32f)
                close()
                moveToRelative(70.11f, -175.8f)
                lineToRelative(89.38f, -94.26f)
                arcToRelative(15.41f, 15.41f, 0f, false, true, 22.62f, 0f)
                lineToRelative(89.38f, 94.26f)
                curveToRelative(10.08f, 10.62f, 2.94f, 28.8f, -11.32f, 28.8f)
                horizontalLineTo(256f)
                verticalLineToRelative(112f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(320f)
                horizontalLineToRelative(-57.37f)
                curveToRelative(-14.26f, 0f, -21.4f, -18.18f, -11.32f, -28.8f)
                close()
                moveTo(432f, 32f)
                horizontalLineTo(312f)
                lineToRelative(-9.4f, -18.7f)
                arcTo(24f, 24f, 0f, false, false, 281.1f, 0f)
                horizontalLineTo(166.8f)
                arcToRelative(23.72f, 23.72f, 0f, false, false, -21.4f, 13.3f)
                lineTo(136f, 32f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 48f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _TrashRestore!!
    }

private var _TrashRestore: ImageVector? = null

