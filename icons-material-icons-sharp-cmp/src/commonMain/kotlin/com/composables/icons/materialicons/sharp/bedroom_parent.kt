package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bedroom_parent: ImageVector
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
                        moveTo(6.5f, 12f)
                        horizontalLineTo(17.5f)
                        verticalLineTo(14f)
                        horizontalLineTo(6.5f)
                        verticalLineTo(12f)
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
                        moveTo(22f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        close()
                        moveTo(19f, 17f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(-11f)
                        verticalLineTo(17f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-5f)
                        lineToRelative(0.65f, -0.55f)
                        verticalLineTo(7f)
                        horizontalLineTo(11f)
                        curveToRelative(0.37f, 0f, 0.72f, 0.12f, 1f, 0.32f)
                        curveTo(12.28f, 7.12f, 12.63f, 7f, 13f, 7f)
                        horizontalLineToRelative(5.35f)
                        verticalLineToRelative(4.45f)
                        lineTo(19f, 12f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedroom_parent!!
    }

private var _Bedroom_parent: ImageVector? = null

