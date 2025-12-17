package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bug: ImageVector
    get() {
        if (_Bug != null) return _Bug!!
        
        _Bug = ImageVector.Builder(
            name = "bug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.978f, 0.855f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.956f, 0.29f)
                lineToRelative(0.41f, 1.352f)
                arcTo(5f, 5f, 0f, false, false, 3f, 6f)
                horizontalLineToRelative(10f)
                arcToRelative(5f, 5f, 0f, false, false, -1.432f, -3.503f)
                lineToRelative(0.41f, -1.352f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.956f, -0.29f)
                lineToRelative(-0.291f, 0.956f)
                arcTo(5f, 5f, 0f, false, false, 8f, 1f)
                arcToRelative(5f, 5f, 0f, false, false, -2.731f, 0.811f)
                lineToRelative(-0.29f, -0.956f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6f)
                verticalLineToRelative(1f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(8.975f)
                arcTo(5f, 5f, 0f, false, false, 13f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 15f, 5.5f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                close()
                moveToRelative(-5.5f, 9.975f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 7f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 11.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(3f)
                arcToRelative(5f, 5f, 0f, false, false, 4.5f, 4.975f)
            }
        }.build()
        
        return _Bug!!
    }

private var _Bug: ImageVector? = null

