package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Backup_table: ImageVector
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
                        moveTo(20f, 6f)
                        verticalLineToRelative(14f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        horizontalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(18f, 2.9f, 17.1f, 2f, 16f, 2f)
                        close()
                        moveTo(9f, 16f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(16f)
                        close()
                        moveTo(16f, 16f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(16f)
                        close()
                        moveTo(16f, 9f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Backup_table!!
    }

private var _Backup_table: ImageVector? = null

