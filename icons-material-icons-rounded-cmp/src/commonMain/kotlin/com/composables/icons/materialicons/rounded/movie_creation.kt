package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Movie_creation: ImageVector
    get() {
        if (_Movie_creation != null) return _Movie_creation!!
        
        _Movie_creation = ImageVector.Builder(
            name = "movie_creation",
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
                moveTo(18f, 4f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.38f, 0f, -0.73f, -0.21f, -0.89f, -0.55f)
                lineTo(15f, 4f)
                horizontalLineToRelative(-2f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.38f, 0f, -0.73f, -0.21f, -0.89f, -0.55f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineTo(7.62f)
                curveToRelative(-0.38f, 0f, -0.73f, -0.21f, -0.9f, -0.55f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Movie_creation!!
    }

private var _Movie_creation: ImageVector? = null

