package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ClipboardHeart: ImageVector
    get() {
        if (_ClipboardHeart != null) return _ClipboardHeart!!
        
        _ClipboardHeart = ImageVector.Builder(
            name = "clipboard-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 0f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 4f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 2.5f)
                close()
                moveToRelative(5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6.982f)
                curveTo(9.664f, 5.309f, 13.825f, 8.236f, 8f, 12f)
                curveTo(2.175f, 8.236f, 6.336f, 5.31f, 8f, 6.982f)
            }
        }.build()
        
        return _ClipboardHeart!!
    }

private var _ClipboardHeart: ImageVector? = null

