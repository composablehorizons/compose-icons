package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hdmi: ImageVector
    get() {
        if (_Hdmi != null) return _Hdmi!!
        
        _Hdmi = ImageVector.Builder(
            name = "hdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.293f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(10.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                lineToRelative(0.707f, -0.707f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-0.293f)
                arcToRelative(1f, 1f, 0f, false, false, -0.707f, 0.293f)
                lineToRelative(-0.707f, 0.707f)
                horizontalLineTo(2.707f)
                lineTo(2f, 9.293f)
                arcTo(1f, 1f, 0f, false, false, 1.293f, 9f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _Hdmi!!
    }

private var _Hdmi: ImageVector? = null

