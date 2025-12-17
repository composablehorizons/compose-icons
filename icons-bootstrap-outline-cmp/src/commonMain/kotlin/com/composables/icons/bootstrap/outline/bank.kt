package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bank: ImageVector
    get() {
        if (_Bank != null) return _Bank!!
        
        _Bank = ImageVector.Builder(
            name = "bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                lineToRelative(6.61f, 3f)
                horizontalLineToRelative(0.89f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.485f, 0.38f)
                lineToRelative(0.5f, 2f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, -0.485f, 0.62f)
                horizontalLineTo(0.5f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, -0.485f, -0.62f)
                lineToRelative(0.5f, -2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 13f)
                verticalLineTo(6f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineToRelative(0.89f)
                close()
                moveTo(3.777f, 3f)
                horizontalLineToRelative(8.447f)
                lineTo(8f, 1f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(6f)
                close()
                moveToRelative(3.5f, 0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(7f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                close()
                moveTo(13f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                close()
                moveToRelative(2f, -1f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-0.39f, 9f)
                horizontalLineTo(1.39f)
                lineToRelative(-0.25f, 1f)
                horizontalLineToRelative(13.72f)
                close()
            }
        }.build()
        
        return _Bank!!
    }

private var _Bank: ImageVector? = null

