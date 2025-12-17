package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rule_folder: ImageVector
    get() {
        if (_Rule_folder != null) return _Rule_folder!!
        
        _Rule_folder = ImageVector.Builder(
            name = "rule_folder",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 6f)
                    horizontalLineToRelative(-8f)
                    lineToRelative(-1.41f, -1.41f)
                    curveTo(10.21f, 4.21f, 9.7f, 4f, 9.17f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                    close()
                    moveTo(7.12f, 15.29f)
                    lineToRelative(-1.41f, -1.41f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(2.83f, -2.83f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-3.54f, 3.54f)
                    curveTo(8.14f, 15.68f, 7.51f, 15.68f, 7.12f, 15.29f)
                    close()
                    moveTo(17.41f, 13f)
                    lineToRelative(0.88f, 0.88f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(16f, 14.41f)
                    lineToRelative(-0.88f, 0.88f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(14.59f, 13f)
                    lineToRelative(-0.88f, -0.88f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(16f, 11.59f)
                    lineToRelative(0.88f, -0.88f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(17.41f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Rule_folder!!
    }

private var _Rule_folder: ImageVector? = null

