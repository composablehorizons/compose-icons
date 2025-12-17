package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffIgnored: ImageVector
    get() {
        if (_DiffIgnored != null) return _DiffIgnored!!
        
        _DiffIgnored = ImageVector.Builder(
            name = "diff-ignored",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 2f, 14f, 3.119f, 14f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.881f, 12.881f, 14f, 11.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 14f, 2f, 12.881f, 2f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 3.119f, 3.119f, 2f, 4.5f, 2f)
                close()
                moveTo(3f, 11.5f)
                curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 13f, 13f, 12.328f, 13f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
                verticalLineTo(11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.146f, 5.14601f)
                curveTo(10.341f, 4.95101f, 10.658f, 4.95101f, 10.853f, 5.14601f)
                curveTo(11.048f, 5.34101f, 11.048f, 5.65801f, 10.853f, 5.85301f)
                lineTo(5.85302f, 10.853f)
                curveTo(5.75502f, 10.951f, 5.62702f, 10.999f, 5.49902f, 10.999f)
                curveTo(5.37102f, 10.999f, 5.24302f, 10.95f, 5.14502f, 10.853f)
                curveTo(4.95002f, 10.658f, 4.95002f, 10.341f, 5.14502f, 10.146f)
                lineTo(10.146f, 5.14601f)
                close()
            }
        }.build()
        
        return _DiffIgnored!!
    }

private var _DiffIgnored: ImageVector? = null

