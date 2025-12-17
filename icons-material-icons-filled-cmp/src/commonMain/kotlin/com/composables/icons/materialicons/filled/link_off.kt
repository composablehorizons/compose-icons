package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Link_off: ImageVector
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
                moveTo(17f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(4f)
                curveToRelative(1.71f, 0f, 3.1f, 1.39f, 3.1f, 3.1f)
                curveToRelative(0f, 1.43f, -0.98f, 2.63f, -2.31f, 2.98f)
                lineToRelative(1.46f, 1.46f)
                curveTo(20.88f, 15.61f, 22f, 13.95f, 22f, 12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveToRelative(-1f, 4f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(2f, 2f)
                horizontalLineTo(16f)
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
                lineToRelative(4.01f, 4f)
                lineTo(20f, 19.74f)
                lineTo(3.27f, 3f)
                lineTo(2f, 4.27f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 24f)
                verticalLineTo(0f)
            }
        }.build()
        
        return _Link_off!!
    }

private var _Link_off: ImageVector? = null

