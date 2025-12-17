package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineToRelative(0.006f)
                curveToRelative(0f, 0.07f, 0f, 0.27f, -0.038f, 0.494f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2.038f)
                arcTo(3f, 3f, 0f, false, true, 3f, 2.506f)
                close()
                moveToRelative(1.068f, 0.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                curveToRelative(0f, 0.085f, 0.002f, 0.274f, 0.045f, 0.43f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(2.932f)
                lineToRelative(0.023f, -0.07f)
                curveToRelative(0.043f, -0.156f, 0.045f, -0.345f, 0.045f, -0.43f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -3f, 0f)
                close()
                moveToRelative(6f, 4f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                close()
                moveTo(2.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 14.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

