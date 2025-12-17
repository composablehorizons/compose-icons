package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Remember_me: ImageVector
    get() {
        if (_Remember_me != null) return _Remember_me!!
        
        _Remember_me = ImageVector.Builder(
            name = "remember_me",
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
                        moveTo(19f, 1f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(22f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(1f)
                        close()
                        moveTo(17f, 15.21f)
                        curveTo(15.5f, 14.44f, 13.8f, 14f, 12f, 14f)
                        reflectiveCurveToRelative(-3.5f, 0.44f, -5f, 1.21f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(15.21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 10f)
                        arcTo(3f, 3f, 0f, false, true, 12f, 13f)
                        arcTo(3f, 3f, 0f, false, true, 9f, 10f)
                        arcTo(3f, 3f, 0f, false, true, 15f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Remember_me!!
    }

private var _Remember_me: ImageVector? = null

