package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sunglasses: ImageVector
    get() {
        if (_Sunglasses != null) return _Sunglasses!!
        
        _Sunglasses = ImageVector.Builder(
            name = "sunglasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -1.888f, 1.338f)
                arcTo(2f, 2f, 0f, false, false, 8f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -1.112f, 0.338f)
                arcTo(2f, 2f, 0f, false, false, 5f, 5f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(0.941f)
                curveToRelative(0.264f, 0f, 0.348f, 0.356f, 0.112f, 0.474f)
                lineToRelative(-0.457f, 0.228f)
                arcToRelative(2f, 2f, 0f, false, false, -0.894f, 0.894f)
                lineToRelative(-0.228f, 0.457f)
                curveTo(2.356f, 8.289f, 2f, 8.205f, 2f, 7.94f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Sunglasses!!
    }

private var _Sunglasses: ImageVector? = null

