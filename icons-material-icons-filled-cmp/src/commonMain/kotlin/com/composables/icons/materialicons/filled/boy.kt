package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Boy: ImageVector
    get() {
        if (_Boy != null) return _Boy!!
        
        _Boy = ImageVector.Builder(
            name = "boy",
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
                        moveTo(12f, 7.5f)
                        curveToRelative(0.97f, 0f, 1.75f, -0.78f, 1.75f, -1.75f)
                        reflectiveCurveTo(12.97f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(-1.75f, 0.78f, -1.75f, 1.75f)
                        reflectiveCurveTo(11.03f, 7.5f, 12f, 7.5f)
                        close()
                        moveTo(14f, 20f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-4.5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineTo(15f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Boy!!
    }

private var _Boy: ImageVector? = null

