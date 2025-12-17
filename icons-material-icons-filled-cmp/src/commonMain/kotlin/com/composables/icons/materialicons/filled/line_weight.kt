package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Line_weight: ImageVector
    get() {
        if (_Line_weight != null) return _Line_weight!!
        
        _Line_weight = ImageVector.Builder(
            name = "line_weight",
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
                            moveTo(3f, 17f)
                            horizontalLineToRelative(18f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(17f)
                            close()
                            moveTo(3f, 20f)
                            horizontalLineToRelative(18f)
                            verticalLineToRelative(-1f)
                            horizontalLineTo(3f)
                            verticalLineTo(20f)
                            close()
                            moveTo(3f, 13f)
                            horizontalLineToRelative(18f)
                            verticalLineToRelative(-3f)
                            horizontalLineTo(3f)
                            verticalLineTo(13f)
                            close()
                            moveTo(3f, 4f)
                            verticalLineToRelative(4f)
                            horizontalLineToRelative(18f)
                            verticalLineTo(4f)
                            horizontalLineTo(3f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Line_weight!!
    }

private var _Line_weight: ImageVector? = null

