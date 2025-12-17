package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Input: ImageVector
    get() {
        if (_Input != null) return _Input!!
        
        _Input = ImageVector.Builder(
            name = "input",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3.01f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.03f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineToRelative(4.01f)
                curveToRelative(0f, 1.1f, 0.9f, 1.98f, 2f, 1.98f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.88f, 2f, -1.98f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(11f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 3.01f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.03f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineToRelative(4.01f)
                curveToRelative(0f, 1.1f, 0.9f, 1.98f, 2f, 1.98f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.88f, 2f, -1.98f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(11f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Input!!
    }

private var _Input: ImageVector? = null

