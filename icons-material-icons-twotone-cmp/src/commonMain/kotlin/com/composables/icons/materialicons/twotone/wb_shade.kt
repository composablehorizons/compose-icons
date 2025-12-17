package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wb_shade: ImageVector
    get() {
        if (_Wb_shade != null) return _Wb_shade!!
        
        _Wb_shade = ImageVector.Builder(
            name = "wb_shade",
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
                        moveTo(14f, 12f)
                        verticalLineToRelative(2.5f)
                        lineToRelative(5.5f, 5.5f)
                        horizontalLineTo(22f)
                        lineTo(14f, 12f)
                        close()
                        moveTo(14f, 20f)
                        horizontalLineToRelative(3f)
                        lineToRelative(-3f, -3f)
                        verticalLineTo(20f)
                        close()
                        moveTo(8f, 4f)
                        lineToRelative(-6f, 6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(2f)
                        lineTo(8f, 4f)
                        close()
                        moveTo(9f, 14f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wb_shade!!
    }

private var _Wb_shade: ImageVector? = null

