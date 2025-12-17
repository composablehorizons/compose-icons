package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pages: ImageVector
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-6f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                lineToRelative(1f, -4f)
                lineToRelative(-4f, 1f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(7f, 7f)
                lineToRelative(1f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveToRelative(6f, 14f)
                horizontalLineTo(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                lineToRelative(-1f, 4f)
                lineToRelative(4f, -1f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(8f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                lineToRelative(4f, 1f)
                lineToRelative(-1f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(-4.37f, -4.37f)
                lineTo(12f, 13.72f)
                lineToRelative(-2.63f, 0.91f)
                lineToRelative(0.91f, -2.63f)
                lineToRelative(-0.91f, -2.63f)
                lineToRelative(2.63f, 0.91f)
                lineToRelative(2.63f, -0.91f)
                lineToRelative(-0.91f, 2.63f)
                lineToRelative(0.91f, 2.63f)
                close()
            }
        }.build()
        
        return _Pages!!
    }

private var _Pages: ImageVector? = null

