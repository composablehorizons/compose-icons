package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_compact_alt: ImageVector
    get() {
        if (_View_compact_alt != null) return _View_compact_alt!!
        
        _View_compact_alt = ImageVector.Builder(
            name = "view_compact_alt",
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
                        moveTo(22f, 4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(4f)
                        close()
                        moveTo(11.5f, 16.5f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(16.5f)
                        close()
                        moveTo(11.5f, 11.5f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(11.5f)
                        close()
                        moveTo(16.5f, 16.5f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(16.5f)
                        close()
                        moveTo(16.5f, 11.5f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_compact_alt!!
    }

private var _View_compact_alt: ImageVector? = null

