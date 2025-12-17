package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pages: ImageVector
    get() {
        if (_Pages != null) return _Pages!!
        
        _Pages = ImageVector.Builder(
            name = "pages",
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
                moveTo(3f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                lineToRelative(-0.6f, -2.38f)
                curveToRelative(-0.18f, -0.74f, 0.48f, -1.4f, 1.22f, -1.22f)
                lineTo(11f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveToRelative(5f, 8f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                lineToRelative(-2.38f, 0.6f)
                curveToRelative(-0.73f, 0.18f, -1.4f, -0.48f, -1.21f, -1.21f)
                lineTo(8f, 13f)
                close()
                moveToRelative(7.38f, 3.6f)
                lineTo(13f, 16f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                lineToRelative(0.6f, 2.38f)
                curveToRelative(0.18f, 0.74f, -0.48f, 1.4f, -1.22f, 1.22f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                lineToRelative(2.38f, -0.6f)
                curveToRelative(0.73f, -0.18f, 1.4f, 0.48f, 1.21f, 1.21f)
                lineTo(16f, 11f)
                horizontalLineToRelative(5f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Pages!!
    }

private var _Pages: ImageVector? = null

