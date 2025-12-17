package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) return _BorderAll!!
        
        _BorderAll = ImageVector.Builder(
            name = "border-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 32f)
                horizontalLineTo(32f)
                arcTo(32f, 32f, 0f, false, false, 0f, 64f)
                verticalLineToRelative(384f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(384f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(64f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
                moveToRelative(-32f, 64f)
                verticalLineToRelative(128f)
                horizontalLineTo(256f)
                verticalLineTo(96f)
                close()
                moveToRelative(-192f, 0f)
                verticalLineToRelative(128f)
                horizontalLineTo(64f)
                verticalLineTo(96f)
                close()
                moveTo(64f, 416f)
                verticalLineTo(288f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(192f, 0f)
                verticalLineTo(288f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(128f)
                close()
            }
        }.build()
        
        return _BorderAll!!
    }

private var _BorderAll: ImageVector? = null

