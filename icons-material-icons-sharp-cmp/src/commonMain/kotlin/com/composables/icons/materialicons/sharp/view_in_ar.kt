package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.View_in_ar: ImageVector
    get() {
        if (_View_in_ar != null) return _View_in_ar!!
        
        _View_in_ar = ImageVector.Builder(
            name = "view_in_ar",
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
                        moveTo(18f, 1f)
                        lineTo(18f, 3f)
                        lineTo(21f, 3f)
                        lineTo(21f, 6f)
                        lineTo(23f, 6f)
                        lineTo(23f, 1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 21f)
                        lineTo(18f, 21f)
                        lineTo(18f, 23f)
                        lineTo(23f, 23f)
                        lineTo(23f, 18f)
                        lineTo(21f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 3f)
                        lineTo(6f, 3f)
                        lineTo(6f, 1f)
                        lineTo(1f, 1f)
                        lineTo(1f, 6f)
                        lineTo(3f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 18f)
                        lineTo(1f, 18f)
                        lineTo(1f, 23f)
                        lineTo(6f, 23f)
                        lineTo(6f, 21f)
                        lineTo(3f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 7.97f)
                        lineToRelative(-7f, -4.03f)
                        lineTo(5f, 7.97f)
                        verticalLineToRelative(8.06f)
                        lineToRelative(7f, 4.03f)
                        lineToRelative(7f, -4.03f)
                        verticalLineTo(7.97f)
                        close()
                        moveTo(11f, 17.17f)
                        lineToRelative(-4f, -2.3f)
                        verticalLineToRelative(-4.63f)
                        lineToRelative(4f, 2.33f)
                        verticalLineTo(17.17f)
                        close()
                        moveTo(12f, 10.84f)
                        lineTo(8.04f, 8.53f)
                        lineTo(12f, 6.25f)
                        lineToRelative(3.96f, 2.28f)
                        lineTo(12f, 10.84f)
                        close()
                        moveTo(17f, 14.87f)
                        lineToRelative(-4f, 2.3f)
                        verticalLineToRelative(-4.6f)
                        lineToRelative(4f, -2.33f)
                        verticalLineTo(14.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_in_ar!!
    }

private var _View_in_ar: ImageVector? = null

