package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BookHalf: ImageVector
    get() {
        if (_BookHalf != null) return _BookHalf!!
        
        _BookHalf = ImageVector.Builder(
            name = "book-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 2.687f)
                curveToRelative(0.654f, -0.689f, 1.782f, -0.886f, 3.112f, -0.752f)
                curveToRelative(1.234f, 0.124f, 2.503f, 0.523f, 3.388f, 0.893f)
                verticalLineToRelative(9.923f)
                curveToRelative(-0.918f, -0.35f, -2.107f, -0.692f, -3.287f, -0.81f)
                curveToRelative(-1.094f, -0.111f, -2.278f, -0.039f, -3.213f, 0.492f)
                close()
                moveTo(8f, 1.783f)
                curveTo(7.015f, 0.936f, 5.587f, 0.81f, 4.287f, 0.94f)
                curveToRelative(-1.514f, 0.153f, -3.042f, 0.672f, -3.994f, 1.105f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 2.5f)
                verticalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.455f)
                curveToRelative(0.882f, -0.4f, 2.303f, -0.881f, 3.68f, -1.02f)
                curveToRelative(1.409f, -0.142f, 2.59f, 0.087f, 3.223f, 0.877f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.78f, 0f)
                curveToRelative(0.633f, -0.79f, 1.814f, -1.019f, 3.222f, -0.877f)
                curveToRelative(1.378f, 0.139f, 2.8f, 0.62f, 3.681f, 1.02f)
                arcTo(0.5f, 0.5f, 0f, false, false, 16f, 13.5f)
                verticalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.293f, -0.455f)
                curveToRelative(-0.952f, -0.433f, -2.48f, -0.952f, -3.994f, -1.105f)
                curveTo(10.413f, 0.809f, 8.985f, 0.936f, 8f, 1.783f)
            }
        }.build()
        
        return _BookHalf!!
    }

private var _BookHalf: ImageVector? = null

