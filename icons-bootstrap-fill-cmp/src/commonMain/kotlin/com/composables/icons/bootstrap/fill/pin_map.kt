package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PinMap: ImageVector
    get() {
        if (_PinMap != null) return _PinMap!!
        
        _PinMap = ImageVector.Builder(
            name = "pin-map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.1f, 11.2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.4f, -0.2f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(3.75f)
                lineTo(1.5f, 15f)
                horizontalLineToRelative(13f)
                lineToRelative(-2.25f, -3f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.4f, 0.2f)
                lineToRelative(3f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.4f, 0.8f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.4f, -0.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                arcToRelative(4f, 4f, 0f, true, true, 4.5f, 3.969f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(7.97f)
                arcTo(4f, 4f, 0f, false, true, 4f, 3.999f)
                close()
            }
        }.build()
        
        return _PinMap!!
    }

private var _PinMap: ImageVector? = null

