package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HeartArrow: ImageVector
    get() {
        if (_HeartArrow != null) return _HeartArrow!!
        
        _HeartArrow = ImageVector.Builder(
            name = "heart-arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.707f, 9f)
                horizontalLineToRelative(4.364f)
                curveToRelative(-0.536f, 1.573f, 2.028f, 3.806f, 4.929f, -0.5f)
                curveToRelative(-2.9f, -4.306f, -5.465f, -2.073f, -4.929f, -0.5f)
                horizontalLineTo(6.707f)
                lineTo(4.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(5.293f, 8f)
                horizontalLineToRelative(-0.586f)
                lineTo(2.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(3.293f, 8f)
                horizontalLineToRelative(-0.586f)
                lineTo(0.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(1.793f, 8.5f)
                lineTo(0.146f, 10.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(2.707f, 9f)
                horizontalLineToRelative(0.586f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(4.707f, 9f)
                horizontalLineToRelative(0.586f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _HeartArrow!!
    }

private var _HeartArrow: ImageVector? = null

