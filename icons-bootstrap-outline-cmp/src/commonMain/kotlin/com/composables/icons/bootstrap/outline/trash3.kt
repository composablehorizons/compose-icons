package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Trash3: ImageVector
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
                moveTo(6.5f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(11f, 2.5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 0f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 1.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.538f)
                lineToRelative(0.853f, 10.66f)
                arcTo(2f, 2f, 0f, false, false, 4.885f, 16f)
                horizontalLineToRelative(6.23f)
                arcToRelative(2f, 2f, 0f, false, false, 1.994f, -1.84f)
                lineToRelative(0.853f, -10.66f)
                horizontalLineToRelative(0.538f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(1.958f, 1f)
                lineToRelative(-0.846f, 10.58f)
                arcToRelative(1f, 1f, 0f, false, true, -0.997f, 0.92f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(1f, 1f, 0f, false, true, -0.997f, -0.92f)
                lineTo(3.042f, 3.5f)
                close()
                moveToRelative(-7.487f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.528f, 0.47f)
                lineToRelative(0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.998f, 0.06f)
                lineTo(5f, 5.03f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.47f, -0.53f)
                close()
                moveToRelative(5.058f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.47f, 0.53f)
                lineToRelative(-0.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.998f, -0.06f)
                lineToRelative(0.5f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.528f, -0.47f)
                moveTo(8f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Trash3!!
    }

private var _Trash3: ImageVector? = null

