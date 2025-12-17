package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowInDownRight: ImageVector
    get() {
        if (_BoxArrowInDownRight != null) return _BoxArrowInDownRight!!
        
        _BoxArrowInDownRight = ImageVector.Builder(
            name = "box-arrow-in-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.364f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 3.5f)
                verticalLineToRelative(10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(6.864f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(6.864f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.793f)
                lineTo(1.146f, 1.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(10f, 9.293f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                close()
            }
        }.build()
        
        return _BoxArrowInDownRight!!
    }

private var _BoxArrowInDownRight: ImageVector? = null

