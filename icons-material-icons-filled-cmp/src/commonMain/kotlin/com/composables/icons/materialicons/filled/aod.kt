package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Aod: ImageVector
    get() {
        if (_Aod != null) return _Aod!!
        
        _Aod = ImageVector.Builder(
            name = "aod",
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
                        moveTo(17f, 1.01f)
                        lineTo(7f, 1f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1.01f, 17f, 1.01f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(18f)
                        close()
                        moveTo(8f, 10f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(1.5f)
                        horizontalLineTo(8f)
                        verticalLineTo(10f)
                        close()
                        moveTo(9f, 13f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(1.5f)
                        horizontalLineTo(9f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Aod!!
    }

private var _Aod: ImageVector? = null

