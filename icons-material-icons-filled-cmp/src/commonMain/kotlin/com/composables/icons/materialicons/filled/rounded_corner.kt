package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Rounded_corner: ImageVector
    get() {
        if (_Rounded_corner != null) return _Rounded_corner!!
        
        _Rounded_corner = ImageVector.Builder(
            name = "rounded_corner",
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
                            moveTo(19f, 19f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(19f)
                            close()
                            moveTo(19f, 17f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(17f)
                            close()
                            moveTo(3f, 13f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(13f)
                            close()
                            moveTo(3f, 17f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(17f)
                            close()
                            moveTo(3f, 9f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(7f)
                            horizontalLineTo(3f)
                            verticalLineTo(9f)
                            close()
                            moveTo(3f, 5f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(3f)
                            horizontalLineTo(3f)
                            verticalLineTo(5f)
                            close()
                            moveTo(7f, 5f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(3f)
                            horizontalLineTo(7f)
                            verticalLineTo(5f)
                            close()
                            moveTo(15f, 21f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(21f)
                            close()
                            moveTo(11f, 21f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(21f)
                            close()
                            moveTo(15f, 21f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(21f)
                            close()
                            moveTo(7f, 21f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(7f)
                            verticalLineTo(21f)
                            close()
                            moveTo(3f, 21f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(21f)
                            close()
                            moveTo(21f, 8f)
                            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                            horizontalLineToRelative(-5f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(5f)
                            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Rounded_corner!!
    }

private var _Rounded_corner: ImageVector? = null

