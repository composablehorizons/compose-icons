package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Inventory: ImageVector
    get() {
        if (_Inventory != null) return _Inventory!!
        
        _Inventory = ImageVector.Builder(
            name = "inventory",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4.18f)
                        curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                        reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                        moveTo(12f, 3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.75f, 12.25f)
                        curveToRelative(-0.41f, -0.41f, -1.09f, -0.41f, -1.5f, 0f)
                        lineTo(15.51f, 17f)
                        lineToRelative(-2.26f, -2.25f)
                        curveToRelative(-0.41f, -0.41f, -1.08f, -0.41f, -1.5f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0f, 1.5f)
                        lineToRelative(3.05f, 3.04f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(5.53f, -5.54f)
                        curveTo(22.16f, 13.34f, 22.16f, 12.66f, 21.75f, 12.25f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Inventory!!
    }

private var _Inventory: ImageVector? = null

