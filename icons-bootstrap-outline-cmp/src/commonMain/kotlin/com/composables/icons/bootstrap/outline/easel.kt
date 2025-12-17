package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Easel: ImageVector
    get() {
        if (_Easel != null) return _Easel!!
        
        _Easel = ImageVector.Builder(
            name = "easel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.473f, 0.337f)
                lineTo(9.046f, 2f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1.85f)
                lineToRelative(1.323f, 3.837f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.946f, 0.326f)
                lineTo(11.092f, 11f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(4.908f)
                lineToRelative(-1.435f, 4.163f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.946f, -0.326f)
                lineTo(3.85f, 11f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4.954f)
                lineTo(7.527f, 0.337f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveTo(2f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Easel!!
    }

private var _Easel: ImageVector? = null

