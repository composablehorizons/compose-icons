package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SymmetryVertical: ImageVector
    get() {
        if (_SymmetryVertical != null) return _SymmetryVertical!!
        
        _SymmetryVertical = ImageVector.Builder(
            name = "symmetry-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.939f, -0.24f)
                lineToRelative(-6f, 11f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0.5f, 14f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveToRelative(2.376f, -0.484f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.563f, 0.245f)
                lineToRelative(6f, 11f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 14f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.376f, -0.484f)
                moveTo(10f, 4.46f)
                verticalLineTo(13f)
                horizontalLineToRelative(4.658f)
                close()
            }
        }.build()
        
        return _SymmetryVertical!!
    }

private var _SymmetryVertical: ImageVector? = null

