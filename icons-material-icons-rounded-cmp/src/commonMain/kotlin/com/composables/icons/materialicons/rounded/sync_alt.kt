package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sync_alt: ImageVector
    get() {
        if (_Sync_alt != null) return _Sync_alt!!
        
        _Sync_alt = ImageVector.Builder(
            name = "sync_alt",
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
                        moveTo(21.65f, 7.65f)
                        lineToRelative(-2.79f, -2.79f)
                        curveTo(18.54f, 4.54f, 18f, 4.76f, 18f, 5.21f)
                        verticalLineTo(7f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 7f, 3f, 7.45f, 3f, 8f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(1.79f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                        lineToRelative(2.79f, -2.79f)
                        curveTo(21.84f, 8.16f, 21.84f, 7.84f, 21.65f, 7.65f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 15f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-1.79f)
                        curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                        lineToRelative(-2.79f, 2.79f)
                        curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.7f)
                        lineToRelative(2.79f, 2.79f)
                        curveTo(5.46f, 19.46f, 6f, 19.24f, 6f, 18.79f)
                        verticalLineTo(17f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(20.55f, 15f, 20f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sync_alt!!
    }

private var _Sync_alt: ImageVector? = null

