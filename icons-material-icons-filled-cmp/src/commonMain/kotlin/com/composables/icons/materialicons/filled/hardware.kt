package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hardware: ImageVector
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
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(6f)
                            verticalLineTo(8f)
                            lineToRelative(3f, 3f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(3f)
                            horizontalLineTo(18f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 13f)
                            verticalLineToRelative(7f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(4f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-7f)
                            horizontalLineTo(9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

