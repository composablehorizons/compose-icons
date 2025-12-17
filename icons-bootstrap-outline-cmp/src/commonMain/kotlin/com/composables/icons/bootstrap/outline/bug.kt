package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bug: ImageVector
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
                moveTo(4.355f, 0.522f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.623f, 0.333f)
                lineToRelative(0.291f, 0.956f)
                arcTo(5f, 5f, 0f, false, true, 8f, 1f)
                curveToRelative(1.007f, 0f, 1.946f, 0.298f, 2.731f, 0.811f)
                lineToRelative(0.29f, -0.956f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.957f, 0.29f)
                lineToRelative(-0.41f, 1.352f)
                arcTo(5f, 5f, 0f, false, true, 13f, 6f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 7f)
                horizontalLineTo(13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(13f)
                arcToRelative(5f, 5f, 0f, false, true, -10f, 0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 5.5f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(3f)
                curveToRelative(0f, -1.364f, 0.547f, -2.601f, 1.432f, -3.503f)
                lineToRelative(-0.41f, -1.352f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.333f, -0.623f)
                moveTo(4f, 7f)
                verticalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, false, false, 3.5f, 3.97f)
                verticalLineTo(7f)
                close()
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(7.97f)
                arcTo(4f, 4f, 0f, false, false, 12f, 11f)
                verticalLineTo(7f)
                close()
                moveTo(12f, 6f)
                arcToRelative(4f, 4f, 0f, false, false, -1.334f, -2.982f)
                arcTo(3.98f, 3.98f, 0f, false, false, 8f, 2f)
                arcToRelative(3.98f, 3.98f, 0f, false, false, -2.667f, 1.018f)
                arcTo(4f, 4f, 0f, false, false, 4f, 6f)
                close()
            }
        }.build()
        
        return _Bug!!
    }

private var _Bug: ImageVector? = null

