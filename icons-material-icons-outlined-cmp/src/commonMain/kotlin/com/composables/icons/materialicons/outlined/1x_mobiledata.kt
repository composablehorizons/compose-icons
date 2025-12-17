package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`1x_mobiledata`: ImageVector
    get() {
        if (_1x_mobiledata != null) return _1x_mobiledata!!
        
        _1x_mobiledata = ImageVector.Builder(
            name = "1x_mobiledata",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(4f, 7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(10f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        horizontalLineTo(4f)
                        verticalLineTo(7f)
                        close()
                        moveTo(15.83f, 11.72f)
                        lineTo(18.66f, 7f)
                        horizontalLineToRelative(-2.33f)
                        lineToRelative(-1.66f, 2.77f)
                        lineTo(13f, 7f)
                        horizontalLineToRelative(-2.33f)
                        lineToRelative(2.83f, 4.72f)
                        lineTo(10.33f, 17f)
                        horizontalLineToRelative(2.33f)
                        lineToRelative(2f, -3.34f)
                        lineToRelative(2f, 3.34f)
                        horizontalLineTo(19f)
                        lineTo(15.83f, 11.72f)
                        close()
                    }
                }
            }
        }.build()
        
        return _1x_mobiledata!!
    }

private var _1x_mobiledata: ImageVector? = null

