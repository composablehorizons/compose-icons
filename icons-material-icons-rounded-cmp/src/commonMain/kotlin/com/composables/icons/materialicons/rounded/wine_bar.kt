package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wine_bar: ImageVector
    get() {
        if (_Wine_bar != null) return _Wine_bar!!
        
        _Wine_bar = ImageVector.Builder(
            name = "wine_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3f)
                curveTo(6.45f, 3f, 6f, 3.45f, 6f, 4f)
                lineToRelative(0f, 5f)
                curveToRelative(0f, 2.97f, 2.16f, 5.43f, 5f, 5.91f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.09f)
                curveToRelative(2.84f, -0.48f, 5f, -2.94f, 5f, -5.91f)
                lineToRelative(0f, -5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                close()
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                lineToRelative(0f, -3f)
                horizontalLineToRelative(8f)
                curveTo(16f, 5f, 16f, 8f, 16f, 8f)
                close()
            }
        }.build()
        
        return _Wine_bar!!
    }

private var _Wine_bar: ImageVector? = null

