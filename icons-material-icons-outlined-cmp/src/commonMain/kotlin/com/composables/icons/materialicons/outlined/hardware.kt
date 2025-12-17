package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hardware: ImageVector
    get() {
        if (_Hardware != null) return _Hardware!!
        
        _Hardware = ImageVector.Builder(
            name = "hardware",
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
                        moveTo(18f, 3f)
                        lineToRelative(-3f, 3f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        curveTo(6.24f, 3f, 4f, 5.24f, 4f, 8f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(8f)
                        lineToRelative(3f, 3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(3f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(13f, 19f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(19f)
                        close()
                        moveTo(11f, 11f)
                        verticalLineTo(6f)
                        horizontalLineTo(6.77f)
                        curveTo(7.32f, 5.39f, 8.11f, 5f, 9f, 5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

