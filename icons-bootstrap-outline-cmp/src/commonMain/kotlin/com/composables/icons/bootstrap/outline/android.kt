package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Android: ImageVector
    get() {
        if (_Android != null) return _Android!!
        
        _Android = ImageVector.Builder(
            name = "android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.76f, 3.061f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.679f, 0.2f)
                lineToRelative(1.283f, 2.352f)
                arcTo(8.9f, 8.9f, 0f, false, true, 8f, 5f)
                arcToRelative(8.9f, 8.9f, 0f, false, true, 3.278f, 0.613f)
                lineToRelative(1.283f, -2.352f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.878f, 0.478f)
                lineToRelative(-1.252f, 2.295f)
                curveTo(14.475f, 7.266f, 16f, 9.477f, 16f, 12f)
                horizontalLineTo(0f)
                curveToRelative(0f, -2.523f, 1.525f, -4.734f, 3.813f, -5.966f)
                lineTo(2.56f, 3.74f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.2f, -0.678f)
                close()
                moveTo(5f, 10f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                moveToRelative(6f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _Android!!
    }

private var _Android: ImageVector? = null

