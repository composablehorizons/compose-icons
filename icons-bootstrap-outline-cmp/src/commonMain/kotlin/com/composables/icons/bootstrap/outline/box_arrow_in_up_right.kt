package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowInUpRight: ImageVector
    get() {
        if (_BoxArrowInUpRight != null) return _BoxArrowInUpRight!!
        
        _BoxArrowInUpRight = ImageVector.Builder(
            name = "box-arrow-in-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.364f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-10f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 1f)
                horizontalLineToRelative(-10f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 2.5f)
                verticalLineToRelative(6.636f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(6.864f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(3.793f)
                lineToRelative(-8.147f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(10f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _BoxArrowInUpRight!!
    }

private var _BoxArrowInUpRight: ImageVector? = null

