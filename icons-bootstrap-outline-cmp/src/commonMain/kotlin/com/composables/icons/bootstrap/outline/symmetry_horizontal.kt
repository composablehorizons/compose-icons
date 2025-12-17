package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SymmetryHorizontal: ImageVector
    get() {
        if (_SymmetryHorizontal != null) return _SymmetryHorizontal!!
        
        _SymmetryHorizontal = ImageVector.Builder(
            name = "symmetry-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.24f, -0.939f)
                lineToRelative(-11f, -6f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 0.5f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                close()
                moveToRelative(0.485f, 2.376f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.246f, 0.563f)
                lineToRelative(-11f, 6f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                verticalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.485f, 0.376f)
                moveTo(11.539f, 10f)
                horizontalLineTo(3f)
                verticalLineToRelative(4.658f)
                close()
            }
        }.build()
        
        return _SymmetryHorizontal!!
    }

private var _SymmetryHorizontal: ImageVector? = null

