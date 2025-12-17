package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Offline_share: ImageVector
    get() {
        if (_Offline_share != null) return _Offline_share!!
        
        _Offline_share = ImageVector.Builder(
            name = "offline_share",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(5f, 5f)
                            lineTo(5f, 5f)
                            curveTo(4.45f, 5f, 4f, 5.45f, 4f, 6f)
                            verticalLineToRelative(15f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(9f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(6f)
                            verticalLineTo(6f)
                            curveTo(6f, 5.45f, 5.55f, 5f, 5f, 5f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18f, 1f)
                            horizontalLineToRelative(-8f)
                            curveTo(8.9f, 1f, 8f, 1.9f, 8f, 3f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(8f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(3f)
                            curveTo(20f, 1.9f, 19.1f, 1f, 18f, 1f)
                            close()
                            moveTo(18f, 15f)
                            horizontalLineToRelative(-8f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(8f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.5f, 10.25f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(0.54f)
                            curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                            lineToRelative(1.29f, -1.29f)
                            curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                            lineToRelative(-1.29f, -1.29f)
                            curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                            verticalLineToRelative(0.54f)
                            horizontalLineTo(12f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(1.5f)
                            curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                            verticalLineTo(10.25f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

