package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PhotoVideo: ImageVector
    get() {
        if (_PhotoVideo != null) return _PhotoVideo!!
        
        _PhotoVideo = ImageVector.Builder(
            name = "photo-video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 0f)
                horizontalLineTo(160f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(160f)
                verticalLineTo(64f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(128f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
                moveTo(232f, 103f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                horizontalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, -9f)
                verticalLineTo(73f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                horizontalLineToRelative(30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                close()
                moveToRelative(352f, 208f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                horizontalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, -9f)
                verticalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                horizontalLineToRelative(30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                close()
                moveToRelative(0f, -104f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                horizontalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, -9f)
                verticalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                horizontalLineToRelative(30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                close()
                moveToRelative(0f, -104f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                horizontalLineToRelative(-30f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, -9f)
                verticalLineTo(73f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                horizontalLineToRelative(30f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
                close()
                moveToRelative(-168f, 57f)
                horizontalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(288f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(384f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(192f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
                moveTo(96f, 224f)
                arcToRelative(32f, 32f, 0f, true, true, -32f, 32f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, -32f)
                close()
                moveToRelative(288f, 224f)
                horizontalLineTo(64f)
                verticalLineToRelative(-32f)
                lineToRelative(64f, -64f)
                lineToRelative(32f, 32f)
                lineToRelative(128f, -128f)
                lineToRelative(96f, 96f)
                close()
            }
        }.build()
        
        return _PhotoVideo!!
    }

private var _PhotoVideo: ImageVector? = null

