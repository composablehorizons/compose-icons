package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Postage: ImageVector
    get() {
        if (_Postage != null) return _Postage!!
        
        _Postage = ImageVector.Builder(
            name = "postage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                horizontalLineTo(15f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                verticalLineTo(0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                moveTo(3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _Postage!!
    }

private var _Postage: ImageVector? = null

