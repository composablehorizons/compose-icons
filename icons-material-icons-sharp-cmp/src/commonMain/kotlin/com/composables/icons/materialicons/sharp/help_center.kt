package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Help_center: ImageVector
    get() {
        if (_Help_center != null) return _Help_center!!
        
        _Help_center = ImageVector.Builder(
            name = "help_center",
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
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(12.01f, 18f)
                    curveToRelative(-0.7f, 0f, -1.26f, -0.56f, -1.26f, -1.26f)
                    curveToRelative(0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f)
                    curveToRelative(0.71f, 0f, 1.25f, 0.54f, 1.25f, 1.25f)
                    curveTo(13.25f, 17.43f, 12.72f, 18f, 12.01f, 18f)
                    close()
                    moveTo(15.02f, 10.6f)
                    curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f)
                    curveToRelative(-0.16f, 0.29f, -0.22f, 0.48f, -0.22f, 1.41f)
                    horizontalLineToRelative(-1.82f)
                    curveToRelative(0f, -0.49f, -0.08f, -1.29f, 0.31f, -1.98f)
                    curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f)
                    curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f)
                    curveToRelative(-1.06f, 0f, -1.58f, 0.8f, -1.8f, 1.48f)
                    lineTo(8.56f, 8.49f)
                    curveTo(9.01f, 7.15f, 10.22f, 6f, 11.99f, 6f)
                    curveToRelative(1.48f, 0f, 2.49f, 0.67f, 3.01f, 1.52f)
                    curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f)
                    close()
                }
            }
        }.build()
        
        return _Help_center!!
    }

private var _Help_center: ImageVector? = null

