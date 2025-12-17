package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Trash3: ImageVector
    get() {
        if (_Trash3 != null) return _Trash3!!
        
        _Trash3 = ImageVector.Builder(
            name = "trash3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.538f)
                lineToRelative(-0.853f, 10.66f)
                arcTo(2f, 2f, 0f, false, true, 11.115f, 16f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(2f, 2f, 0f, false, true, -1.994f, -1.84f)
                lineTo(2.038f, 3.5f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 0f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 1.5f)
                moveToRelative(-5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(4.5f, 5.029f)
                lineToRelative(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.998f, -0.06f)
                lineToRelative(-0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.998f, 0.06f)
                moveToRelative(6.53f, -0.528f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.528f, 0.47f)
                lineToRelative(-0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.998f, 0.058f)
                lineToRelative(0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.47f, -0.528f)
                moveTo(8f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
        }.build()
        
        return _Trash3!!
    }

private var _Trash3: ImageVector? = null

