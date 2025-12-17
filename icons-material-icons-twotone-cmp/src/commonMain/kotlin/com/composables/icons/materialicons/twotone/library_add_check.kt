package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Library_add_check: ImageVector
    get() {
        if (_Library_add_check != null) return _Library_add_check!!
        
        _Library_add_check = ImageVector.Builder(
            name = "library_add_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 16f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(4f)
                        horizontalLineTo(8f)
                        verticalLineTo(16f)
                        close()
                        moveTo(10.4f, 9.09f)
                        lineToRelative(2.07f, 2.08f)
                        lineTo(17.6f, 6f)
                        lineTo(19f, 7.41f)
                        lineTo(12.47f, 14f)
                        lineTo(9f, 10.5f)
                        lineTo(10.4f, 9.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(20f, 16f)
                        horizontalLineTo(8f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(16f)
                        close()
                        moveTo(12.47f, 14f)
                        lineTo(9f, 10.5f)
                        lineToRelative(1.4f, -1.41f)
                        lineToRelative(2.07f, 2.08f)
                        lineTo(17.6f, 6f)
                        lineTo(19f, 7.41f)
                        lineTo(12.47f, 14f)
                        close()
                        moveTo(4f, 20f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(20f)
                        close()
                    }
                }
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
        }.build()
        
        return _Library_add_check!!
    }

private var _Library_add_check: ImageVector? = null

