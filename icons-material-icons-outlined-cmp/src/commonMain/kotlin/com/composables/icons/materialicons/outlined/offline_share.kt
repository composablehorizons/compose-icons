package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Offline_share: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 5f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(6f)
                        verticalLineTo(5f)
                        close()
                    }
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
                        moveTo(18f, 17f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(17f)
                        close()
                        moveTo(18f, 14f)
                        horizontalLineToRelative(-8f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(14f)
                        close()
                        moveTo(18f, 4f)
                        horizontalLineToRelative(-8f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.5f, 10.25f)
                        horizontalLineToRelative(1.63f)
                        lineToRelative(-0.69f, 0.69f)
                        lineTo(14.5f, 12f)
                        lineTo(17f, 9.5f)
                        lineTo(14.5f, 7f)
                        lineToRelative(-1.06f, 1.06f)
                        lineToRelative(0.69f, 0.69f)
                        horizontalLineTo(12f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(12f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(10.25f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

