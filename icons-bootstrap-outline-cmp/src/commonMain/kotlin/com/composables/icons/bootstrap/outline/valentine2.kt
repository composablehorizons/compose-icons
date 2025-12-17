package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Valentine2: ImageVector
    get() {
        if (_Valentine2 != null) return _Valentine2!!
        
        _Valentine2 = ImageVector.Builder(
            name = "valentine2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6.493f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
                moveTo(4.25f, 3f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.5f, 0f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, -0.5f)
                close()
                moveToRelative(6f, 0f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0f, 0.5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(4.5f, 12.25f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, -0.5f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, -0.5f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(7.5f, 0f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, -0.5f, 0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0f, 0.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1.994f)
                verticalLineToRelative(-0.042f)
                arcToRelative(1f, 1f, 0f, false, true, 0.9f, -0.995f)
                lineToRelative(9f, -0.9f)
                arcTo(1f, 1f, 0f, false, true, 13f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveTo(3f, 2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(10f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Valentine2!!
    }

private var _Valentine2: ImageVector? = null

