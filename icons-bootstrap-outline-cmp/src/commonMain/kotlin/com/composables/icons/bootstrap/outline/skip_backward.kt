package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SkipBackward: ImageVector
    get() {
        if (_SkipBackward != null) return _SkipBackward!!
        
        _SkipBackward = ImageVector.Builder(
            name = "skip-backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 4f)
                verticalLineToRelative(3.248f)
                lineToRelative(6.267f, -3.636f)
                curveToRelative(0.52f, -0.302f, 1.233f, 0.043f, 1.233f, 0.696f)
                verticalLineToRelative(2.94f)
                lineToRelative(6.267f, -3.636f)
                curveToRelative(0.52f, -0.302f, 1.233f, 0.043f, 1.233f, 0.696f)
                verticalLineToRelative(7.384f)
                curveToRelative(0f, 0.653f, -0.713f, 0.998f, -1.233f, 0.696f)
                lineTo(8.5f, 8.752f)
                verticalLineToRelative(2.94f)
                curveToRelative(0f, 0.653f, -0.713f, 0.998f, -1.233f, 0.696f)
                lineTo(1f, 8.752f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(7f, 1.133f)
                lineTo(1.696f, 8f)
                lineTo(7.5f, 11.367f)
                close()
                moveToRelative(7.5f, 0f)
                lineTo(9.196f, 8f)
                lineTo(15f, 11.367f)
                close()
            }
        }.build()
        
        return _SkipBackward!!
    }

private var _SkipBackward: ImageVector? = null

