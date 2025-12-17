package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Inboxes: ImageVector
    get() {
        if (_Inboxes != null) return _Inboxes!!
        
        _Inboxes = ImageVector.Builder(
            name = "inboxes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.98f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.39f, 0.188f)
                lineTo(1.54f, 5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 5f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-3.05f, -3.812f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11.02f, 1f)
                close()
                moveTo(3.81f, 0.563f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.98f, 0f)
                horizontalLineToRelative(6.04f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.17f, 0.563f)
                lineToRelative(3.7f, 4.625f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.106f, 0.374f)
                lineToRelative(-0.39f, 3.124f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.117f, 10f)
                horizontalLineTo(1.883f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0.394f, 8.686f)
                lineToRelative(-0.39f, -3.124f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.106f, -0.374f)
                close()
                moveTo(0.125f, 11.17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 11f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.496f, 0.562f)
                lineToRelative(-0.39f, 3.124f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.117f, 16f)
                horizontalLineTo(1.883f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.489f, -1.314f)
                lineToRelative(-0.39f, -3.124f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.121f, -0.393f)
                close()
            }
        }.build()
        
        return _Inboxes!!
    }

private var _Inboxes: ImageVector? = null

