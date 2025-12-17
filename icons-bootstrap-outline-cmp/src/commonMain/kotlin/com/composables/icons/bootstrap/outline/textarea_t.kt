package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TextareaT: ImageVector
    get() {
        if (_TextareaT != null) return _TextareaT!!
        
        _TextareaT = ImageVector.Builder(
            name = "textarea-t",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.563f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.874f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 15f)
                horizontalLineTo(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineTo(9.937f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.874f)
                close()
                moveToRelative(1f, 3.563f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.874f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(9.937f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.874f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 2f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(2f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(12f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.434f, 4f)
                horizontalLineTo(4.566f)
                lineTo(4.5f, 5.994f)
                horizontalLineToRelative(0.386f)
                curveToRelative(0.21f, -1.252f, 0.612f, -1.446f, 2.173f, -1.495f)
                lineToRelative(0.343f, -0.011f)
                verticalLineToRelative(6.343f)
                curveToRelative(0f, 0.537f, -0.116f, 0.665f, -1.049f, 0.748f)
                verticalLineTo(12f)
                horizontalLineToRelative(3.294f)
                verticalLineToRelative(-0.421f)
                curveToRelative(-0.938f, -0.083f, -1.054f, -0.21f, -1.054f, -0.748f)
                verticalLineTo(4.488f)
                lineToRelative(0.348f, 0.01f)
                curveToRelative(1.56f, 0.05f, 1.963f, 0.244f, 2.173f, 1.496f)
                horizontalLineToRelative(0.386f)
                close()
            }
        }.build()
        
        return _TextareaT!!
    }

private var _TextareaT: ImageVector? = null

