package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CSquare: ImageVector
    get() {
        if (_CSquare != null) return _CSquare!!
        
        _CSquare = ImageVector.Builder(
            name = "c-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.146f, 4.992f)
                curveToRelative(-1.212f, 0f, -1.927f, 0.92f, -1.927f, 2.502f)
                verticalLineToRelative(1.06f)
                curveToRelative(0f, 1.571f, 0.703f, 2.462f, 1.927f, 2.462f)
                curveToRelative(0.979f, 0f, 1.641f, -0.586f, 1.729f, -1.418f)
                horizontalLineToRelative(1.295f)
                verticalLineToRelative(0.093f)
                curveToRelative(-0.1f, 1.448f, -1.354f, 2.467f, -3.03f, 2.467f)
                curveToRelative(-2.091f, 0f, -3.269f, -1.336f, -3.269f, -3.603f)
                verticalLineTo(7.482f)
                curveToRelative(0f, -2.261f, 1.201f, -3.638f, 3.27f, -3.638f)
                curveToRelative(1.681f, 0f, 2.935f, 1.054f, 3.029f, 2.572f)
                verticalLineToRelative(0.088f)
                horizontalLineTo(9.875f)
                curveToRelative(-0.088f, -0.879f, -0.768f, -1.512f, -1.729f, -1.512f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
        }.build()
        
        return _CSquare!!
    }

private var _CSquare: ImageVector? = null

