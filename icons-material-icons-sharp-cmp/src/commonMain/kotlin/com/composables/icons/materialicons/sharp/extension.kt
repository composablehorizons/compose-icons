package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Extension: ImageVector
    get() {
        if (_Extension != null) return _Extension!!
        
        _Extension = ImageVector.Builder(
            name = "extension",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.36f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineToRelative(-6f)
                verticalLineTo(3.64f)
                curveToRelative(0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveTo(9.26f, 0.86f, 8f, 2.03f, 8f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(2.01f)
                verticalLineToRelative(5.8f)
                horizontalLineTo(3.4f)
                curveToRelative(1.31f, 0f, 2.5f, 0.88f, 2.75f, 2.16f)
                curveToRelative(0.33f, 1.72f, -0.98f, 3.24f, -2.65f, 3.24f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineToRelative(5.8f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -1.31f, 0.88f, -2.5f, 2.16f, -2.75f)
                curveToRelative(1.72f, -0.33f, 3.24f, 0.98f, 3.24f, 2.65f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.47f, 0f, 2.64f, -1.26f, 2.49f, -2.76f)
                curveToRelative(-0.13f, -1.3f, -1.33f, -2.24f, -2.63f, -2.24f)
                close()
            }
        }.build()
        
        return _Extension!!
    }

private var _Extension: ImageVector? = null

