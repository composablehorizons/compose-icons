package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Backup_table: ImageVector
    get() {
        if (_Backup_table != null) return _Backup_table!!
        
        _Backup_table = ImageVector.Builder(
            name = "backup_table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4f, 7f)
                            verticalLineToRelative(13f)
                            horizontalLineToRelative(13f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineTo(4f)
                            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                            verticalLineTo(7f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            lineToRelative(0f, 0f)
                            curveTo(3.55f, 6f, 4f, 6.45f, 4f, 7f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 4f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(4f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(8f)
                            curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                            close()
                            moveTo(15f, 11f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(-5f)
                            verticalLineTo(11f)
                            close()
                            moveTo(8f, 11f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(5f)
                            horizontalLineTo(8f)
                            verticalLineTo(11f)
                            close()
                            moveTo(8f, 4f)
                            horizontalLineToRelative(12f)
                            verticalLineToRelative(5f)
                            horizontalLineTo(8f)
                            verticalLineTo(4f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Backup_table!!
    }

private var _Backup_table: ImageVector? = null

