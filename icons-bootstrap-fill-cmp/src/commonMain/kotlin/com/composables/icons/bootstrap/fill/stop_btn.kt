package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.StopBtn: ImageVector
    get() {
        if (_StopBtn != null) return _StopBtn!!
        
        _StopBtn = ImageVector.Builder(
            name = "stop-btn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 12f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                moveToRelative(6.5f, -7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 6.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 11f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 9.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 5f)
                close()
            }
        }.build()
        
        return _StopBtn!!
    }

private var _StopBtn: ImageVector? = null

