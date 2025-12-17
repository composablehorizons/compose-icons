package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Images: ImageVector
    get() {
        if (_Images != null) return _Images!!
        
        _Images = ImageVector.Builder(
            name = "images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.502f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.002f, 13f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 2f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -1.998f, 2f)
                moveTo(14f, 2f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                horizontalLineToRelative(9.002f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
                arcTo(1f, 1f, 0f, false, false, 15f, 11f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveTo(2.002f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                lineToRelative(2.646f, -2.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.63f, -0.062f)
                lineToRelative(2.66f, 1.773f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.577f, -0.094f)
                lineToRelative(1.777f, 1.947f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Images!!
    }

private var _Images: ImageVector? = null

