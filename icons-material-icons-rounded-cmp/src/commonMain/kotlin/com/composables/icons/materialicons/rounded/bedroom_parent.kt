package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bedroom_parent: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 12f)
                        horizontalLineToRelative(-9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(11f)
                        verticalLineToRelative(-1f)
                        curveTo(17.5f, 12.45f, 17.05f, 12f, 16.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.25f, 8.5f)
                        horizontalLineTo(11.25f)
                        verticalLineTo(10.5f)
                        horizontalLineTo(7.25f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.75f, 8.5f)
                        horizontalLineTo(16.75f)
                        verticalLineTo(10.5f)
                        horizontalLineTo(12.75f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
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
                        moveTo(18.25f, 17f)
                        lineTo(18.25f, 17f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(15.5f)
                        horizontalLineToRelative(-11f)
                        verticalLineToRelative(0.75f)
                        curveTo(6.5f, 16.66f, 6.16f, 17f, 5.75f, 17f)
                        horizontalLineToRelative(0f)
                        curveTo(5.34f, 17f, 5f, 16.66f, 5f, 16.25f)
                        verticalLineToRelative(-3.08f)
                        curveToRelative(0f, -0.66f, 0.25f, -1.26f, 0.65f, -1.72f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineTo(11f)
                        curveToRelative(0.37f, 0f, 0.72f, 0.12f, 1f, 0.32f)
                        curveTo(12.28f, 7.12f, 12.63f, 7f, 13f, 7f)
                        horizontalLineToRelative(3.35f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(2.45f)
                        curveToRelative(0.4f, 0.46f, 0.65f, 1.06f, 0.65f, 1.72f)
                        verticalLineToRelative(3.08f)
                        curveTo(19f, 16.66f, 18.66f, 17f, 18.25f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedroom_parent!!
    }

private var _Bedroom_parent: ImageVector? = null

