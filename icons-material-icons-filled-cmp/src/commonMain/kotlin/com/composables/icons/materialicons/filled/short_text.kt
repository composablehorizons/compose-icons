package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Short_text: ImageVector
    get() {
        if (_Short_text != null) return _Short_text!!
        
        _Short_text = ImageVector.Builder(
            name = "short_text",
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
                            moveTo(4f, 9f)
                            horizontalLineToRelative(16f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(4f)
                            verticalLineTo(9f)
                            close()
                            moveTo(4f, 13f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(4f)
                            verticalLineTo(13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Short_text!!
    }

private var _Short_text: ImageVector? = null

