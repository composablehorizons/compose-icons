package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) return _PencilSquare!!
        
        _PencilSquare = ImageVector.Builder(
            name = "pencil-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.502f, 1.94f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.706f)
                lineTo(14.459f, 3.69f)
                lineToRelative(-2f, -2f)
                lineTo(13.502f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                lineToRelative(1.293f, 1.293f)
                close()
                moveToRelative(-1.75f, 2.456f)
                lineToRelative(-2f, -2f)
                lineTo(4.939f, 9.21f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.121f, 0.196f)
                lineToRelative(-0.805f, 2.414f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.316f, 0.316f)
                lineToRelative(2.414f, -0.805f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.196f, -0.12f)
                lineToRelative(6.813f, -6.814f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 15f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 2.5f)
                close()
            }
        }.build()
        
        return _PencilSquare!!
    }

private var _PencilSquare: ImageVector? = null

