package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wb_shade: ImageVector
    get() {
        if (_Wb_shade != null) return _Wb_shade!!
        
        _Wb_shade = ImageVector.Builder(
            name = "wb_shade",
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
                        moveTo(14f, 14.13f)
                        lineTo(14f, 14.13f)
                        curveToRelative(0f, 0.23f, 0.09f, 0.46f, 0.26f, 0.63f)
                        lineToRelative(4.98f, 4.98f)
                        curveToRelative(0.17f, 0.17f, 0.39f, 0.26f, 0.62f, 0.26f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.79f, 0f, 1.18f, -0.95f, 0.62f, -1.51f)
                        lineToRelative(-4.98f, -4.98f)
                        curveTo(14.95f, 12.95f, 14f, 13.35f, 14f, 14.13f)
                        close()
                        moveTo(15f, 20f)
                        horizontalLineToRelative(2f)
                        lineToRelative(-3f, -3f)
                        verticalLineToRelative(2f)
                        curveTo(14f, 19.55f, 14.45f, 20f, 15f, 20f)
                        close()
                        moveTo(7.65f, 4.35f)
                        lineTo(2.85f, 9.15f)
                        curveTo(2.54f, 9.46f, 2.76f, 10f, 3.21f, 10f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(0.79f)
                        curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                        lineTo(8.35f, 4.35f)
                        curveTo(8.16f, 4.16f, 7.84f, 4.16f, 7.65f, 4.35f)
                        close()
                        moveTo(9f, 14f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wb_shade!!
    }

private var _Wb_shade: ImageVector? = null

