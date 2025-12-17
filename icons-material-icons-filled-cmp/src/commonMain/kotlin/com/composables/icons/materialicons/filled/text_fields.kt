package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_fields: ImageVector
    get() {
        if (_Text_fields != null) return _Text_fields!!
        
        _Text_fields = ImageVector.Builder(
            name = "text_fields",
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
                            moveTo(2.5f, 4f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(12f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(5f)
                            verticalLineTo(4f)
                            horizontalLineTo(2.5f)
                            close()
                            moveTo(21.5f, 9f)
                            horizontalLineToRelative(-9f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(7f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-7f)
                            horizontalLineToRelative(3f)
                            verticalLineTo(9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Text_fields!!
    }

private var _Text_fields: ImageVector? = null

