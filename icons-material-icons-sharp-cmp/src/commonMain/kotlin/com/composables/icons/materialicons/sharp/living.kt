package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Living: ImageVector
    get() {
        if (_Living != null) return _Living!!
        
        _Living = ImageVector.Builder(
            name = "living",
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
                        moveTo(15.5f, 12f)
                        lineTo(15.5f, 14.5f)
                        lineTo(8.5f, 14.5f)
                        lineTo(8.5f, 12f)
                        lineTo(7.52f, 12f)
                        lineTo(6.5f, 12f)
                        lineTo(6.5f, 16.5f)
                        lineTo(17.5f, 16.5f)
                        lineTo(17.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 10f)
                        lineTo(10f, 13f)
                        lineTo(14f, 13f)
                        lineTo(14f, 10f)
                        lineTo(16.25f, 9.99f)
                        lineTo(16.25f, 7.5f)
                        lineTo(7.75f, 7.5f)
                        lineTo(7.75f, 9.99f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        close()
                        moveTo(19f, 9.99f)
                        verticalLineTo(18f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-8f)
                        lineToRelative(1.25f, -0.01f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(11.5f)
                        verticalLineToRelative(3.99f)
                        horizontalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Living!!
    }

private var _Living: ImageVector? = null

