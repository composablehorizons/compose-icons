package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Link_off: ImageVector
    get() {
        if (_Link_off != null) return _Link_off!!
        
        _Link_off = ImageVector.Builder(
            name = "link_off",
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
                moveTo(14.39f, 11f)
                lineTo(16f, 12.61f)
                verticalLineTo(11f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(4f)
                curveToRelative(1.71f, 0f, 3.1f, 1.39f, 3.1f, 3.1f)
                curveToRelative(0f, 1.27f, -0.77f, 2.37f, -1.87f, 2.84f)
                lineToRelative(1.4f, 1.4f)
                curveTo(21.05f, 15.36f, 22f, 13.79f, 22f, 12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2f, 4.27f)
                lineToRelative(3.11f, 3.11f)
                curveTo(3.29f, 8.12f, 2f, 9.91f, 2f, 12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.9f)
                horizontalLineTo(7f)
                curveToRelative(-1.71f, 0f, -3.1f, -1.39f, -3.1f, -3.1f)
                curveToRelative(0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f)
                lineTo(8.73f, 11f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.73f)
                lineTo(13f, 15.27f)
                verticalLineTo(17f)
                horizontalLineToRelative(1.73f)
                lineToRelative(4.01f, 4.01f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 2.86f)
                lineTo(2f, 4.27f)
                close()
            }
        }.build()
        
        return _Link_off!!
    }

private var _Link_off: ImageVector? = null

