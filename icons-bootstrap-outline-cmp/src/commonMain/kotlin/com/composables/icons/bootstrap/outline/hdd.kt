package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hdd: ImageVector
    get() {
        if (_Hdd != null) return _Hdd!!
        
        _Hdd = ImageVector.Builder(
            name = "hdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveTo(3f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9.51f)
                curveToRelative(0f, -0.418f, 0.105f, -0.83f, 0.305f, -1.197f)
                lineToRelative(2.472f, -4.531f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.094f, 3f)
                horizontalLineToRelative(7.812f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.317f, 0.782f)
                lineToRelative(2.472f, 4.53f)
                curveToRelative(0.2f, 0.368f, 0.305f, 0.78f, 0.305f, 1.198f)
                close()
                moveTo(3.655f, 4.26f)
                lineTo(1.592f, 8.043f)
                quadTo(1.79f, 8f, 2f, 8f)
                horizontalLineToRelative(12f)
                quadToRelative(0.21f, 0f, 0.408f, 0.042f)
                lineTo(12.345f, 4.26f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.439f, -0.26f)
                horizontalLineTo(4.094f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.44f, 0.26f)
                close()
                moveTo(1f, 10f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _Hdd!!
    }

private var _Hdd: ImageVector? = null

