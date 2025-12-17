package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Valentine: ImageVector
    get() {
        if (_Valentine != null) return _Valentine!!
        
        _Valentine = ImageVector.Builder(
            name = "valentine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0f, -5.132f)
                moveTo(2.25f, 4f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.5f, 0f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, -0.5f)
                close()
                moveToRelative(10f, 0f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0f, 0.5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(2.5f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, -0.5f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, true, false, 0f, -0.5f)
                horizontalLineTo(2.5f)
                close()
                moveToRelative(11.5f, 0f)
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
                moveTo(0f, 2.994f)
                verticalLineToRelative(-0.06f)
                arcToRelative(1f, 1f, 0f, false, true, 0.859f, -0.99f)
                lineToRelative(13f, -1.857f)
                arcToRelative(1f, 1f, 0f, false, true, 1.141f, 0.99f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveTo(1f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Valentine!!
    }

private var _Valentine: ImageVector? = null

