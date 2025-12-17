package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_business: ImageVector
    get() {
        if (_Add_business != null) return _Add_business!!
        
        _Add_business = ImageVector.Builder(
            name = "add_business",
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
                        moveTo(15f, 17f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-2f)
                        lineToRelative(-1f, -5f)
                        horizontalLineTo(2f)
                        lineToRelative(-1f, 5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(17f)
                        close()
                        moveTo(9f, 18f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 4f)
                        horizontalLineTo(17f)
                        verticalLineTo(6f)
                        horizontalLineTo(2f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 18f)
                        lineTo(20f, 15f)
                        lineTo(18f, 15f)
                        lineTo(18f, 18f)
                        lineTo(15f, 18f)
                        lineTo(15f, 20f)
                        lineTo(18f, 20f)
                        lineTo(18f, 23f)
                        lineTo(20f, 23f)
                        lineTo(20f, 20f)
                        lineTo(23f, 20f)
                        lineTo(23f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_business!!
    }

private var _Add_business: ImageVector? = null

