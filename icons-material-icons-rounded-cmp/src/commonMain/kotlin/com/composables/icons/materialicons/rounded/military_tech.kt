package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Military_tech: ImageVector
    get() {
        if (_Military_tech != null) return _Military_tech!!
        
        _Military_tech = ImageVector.Builder(
            name = "military_tech",
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 10.43f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(8f)
                    curveTo(7.45f, 2f, 7f, 2.45f, 7f, 3f)
                    verticalLineToRelative(7.43f)
                    curveToRelative(0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                    lineToRelative(4.18f, 2.51f)
                    lineToRelative(-0.99f, 2.34f)
                    lineToRelative(-2.22f, 0.19f)
                    curveTo(8f, 16.37f, 7.82f, 16.92f, 8.16f, 17.21f)
                    lineToRelative(1.69f, 1.46f)
                    lineToRelative(-0.51f, 2.18f)
                    curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f)
                    lineTo(12f, 20.23f)
                    lineToRelative(1.91f, 1.15f)
                    curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f)
                    lineToRelative(-0.51f, -2.18f)
                    lineToRelative(1.69f, -1.46f)
                    curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f)
                    lineToRelative(-2.22f, -0.19f)
                    lineToRelative(-0.99f, -2.34f)
                    lineToRelative(4.18f, -2.51f)
                    curveTo(16.82f, 11.11f, 17f, 10.79f, 17f, 10.43f)
                    close()
                    moveTo(13f, 12.23f)
                    lineToRelative(-1f, 0.6f)
                    lineToRelative(-1f, -0.6f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12.23f)
                    close()
                }
            }
        }.build()
        
        return _Military_tech!!
    }

private var _Military_tech: ImageVector? = null

