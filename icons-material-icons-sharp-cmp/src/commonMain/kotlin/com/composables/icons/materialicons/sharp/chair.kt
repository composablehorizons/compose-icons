package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
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
                        moveTo(7f, 13f)
                        lineTo(17f, 13f)
                        lineTo(17f, 7f)
                        lineTo(20f, 7f)
                        lineTo(20f, 3f)
                        lineTo(4f, 3f)
                        lineTo(4f, 7f)
                        lineTo(7f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(5f)
                        verticalLineTo(9f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

