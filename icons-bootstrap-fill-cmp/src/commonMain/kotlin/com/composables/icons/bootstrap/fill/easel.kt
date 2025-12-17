package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Easel: ImageVector
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
                moveTo(8.473f, 0.337f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.946f, 0f)
                lineTo(6.954f, 2f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1.85f)
                lineToRelative(-1.323f, 3.837f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.946f, 0.326f)
                lineTo(4.908f, 11f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(11f)
                horizontalLineToRelative(2.592f)
                lineToRelative(1.435f, 4.163f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.946f, -0.326f)
                lineTo(12.15f, 11f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9.046f)
                close()
            }
        }.build()
        
        return _Easel!!
    }

private var _Easel: ImageVector? = null

