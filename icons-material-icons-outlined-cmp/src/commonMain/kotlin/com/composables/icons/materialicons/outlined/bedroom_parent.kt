package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bedroom_parent: ImageVector
    get() {
        if (_Bedroom_parent != null) return _Bedroom_parent!!
        
        _Bedroom_parent = ImageVector.Builder(
            name = "bedroom_parent",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.35f, 11.45f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(13f)
                    curveToRelative(-0.37f, 0f, -0.72f, 0.12f, -1f, 0.32f)
                    curveTo(11.72f, 7.12f, 11.37f, 7f, 11f, 7f)
                    horizontalLineTo(7.65f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(2.45f)
                    curveTo(5.25f, 11.91f, 5f, 12.51f, 5f, 13.17f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(17f)
                    horizontalLineTo(19f)
                    verticalLineToRelative(-3.83f)
                    curveTo(19f, 12.51f, 18.75f, 11.91f, 18.35f, 11.45f)
                    close()
                    moveTo(16.75f, 10.5f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(7.25f, 8.5f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(8.5f)
                    close()
                    moveTo(17.5f, 14f)
                    horizontalLineToRelative(-11f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(9f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                    moveTo(20f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineTo(20f)
                    moveTo(20f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Bedroom_parent!!
    }

private var _Bedroom_parent: ImageVector? = null

