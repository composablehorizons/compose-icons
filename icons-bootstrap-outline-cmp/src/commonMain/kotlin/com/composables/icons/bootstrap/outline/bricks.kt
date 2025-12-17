package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bricks: ImageVector
    get() {
        if (_Bricks != null) return _Bricks!!
        
        _Bricks = ImageVector.Builder(
            name = "bricks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(3f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(4f)
                close()
                moveToRelative(5.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                close()
                moveTo(3f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(5.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(13f)
                verticalLineToRelative(-2f)
                close()
                moveTo(1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(1f)
                close()
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineTo(1f)
                close()
                moveToRelative(6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(7f)
                close()
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineTo(7f)
                close()
                moveToRelative(6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                close()
                moveTo(1f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Bricks!!
    }

private var _Bricks: ImageVector? = null

