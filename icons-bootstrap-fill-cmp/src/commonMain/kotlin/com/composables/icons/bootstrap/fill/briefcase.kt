package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 4.5f)
                verticalLineToRelative(1.384f)
                lineToRelative(7.614f, 2.03f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.772f, 0f)
                lineTo(16f, 5.884f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 3f)
                horizontalLineTo(11f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6.85f)
                lineTo(8.129f, 8.947f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.258f, 0f)
                lineTo(0f, 6.85f)
                close()
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

