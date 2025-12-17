package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowInUpLeft: ImageVector
    get() {
        if (_BoxArrowInUpLeft != null) return _BoxArrowInUpLeft!!
        
        _BoxArrowInUpLeft = ImageVector.Builder(
            name = "box-arrow-in-up-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.636f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 12.5f)
                verticalLineToRelative(-10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 2.5f)
                verticalLineToRelative(6.636f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.636f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(6.707f)
                lineToRelative(8.147f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(6f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
            }
        }.build()
        
        return _BoxArrowInUpLeft!!
    }

private var _BoxArrowInUpLeft: ImageVector? = null

