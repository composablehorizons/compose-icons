package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Woman: ImageVector
    get() {
        if (_Woman != null) return _Woman!!
        
        _Woman = ImageVector.Builder(
            name = "woman",
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
                        moveTo(13.94f, 8.31f)
                        curveTo(13.62f, 7.52f, 12.85f, 7f, 12f, 7f)
                        reflectiveCurveToRelative(-1.62f, 0.52f, -1.94f, 1.31f)
                        lineTo(7f, 16f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(3f)
                        lineTo(13.94f, 8.31f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Woman!!
    }

private var _Woman: ImageVector? = null

