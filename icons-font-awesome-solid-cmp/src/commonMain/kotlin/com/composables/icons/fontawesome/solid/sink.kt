package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sink: ImageVector
    get() {
        if (_Sink != null) return _Sink!!
        
        _Sink = ImageVector.Builder(
            name = "sink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 416f)
                arcToRelative(96f, 96f, 0f, false, false, 96f, 96f)
                horizontalLineTo(384f)
                arcToRelative(96f, 96f, 0f, false, false, 96f, -96f)
                verticalLineTo(384f)
                horizontalLineTo(32f)
                close()
                moveTo(496f, 288f)
                horizontalLineTo(400f)
                verticalLineTo(256f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(224f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(384f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(48f)
                horizontalLineTo(288f)
                verticalLineTo(96f)
                arcToRelative(32f, 32f, 0f, false, true, 64f, 0f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(96f)
                arcTo(96.16f, 96.16f, 0f, false, false, 300.87f, 1.86f)
                curveTo(255.29f, 10.71f, 224f, 53.36f, 224f, 99.79f)
                verticalLineTo(288f)
                horizontalLineTo(160f)
                verticalLineTo(240f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(32f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 304f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(304f)
                arcTo(16f, 16f, 0f, false, false, 496f, 288f)
                close()
            }
        }.build()
        
        return _Sink!!
    }

private var _Sink: ImageVector? = null

