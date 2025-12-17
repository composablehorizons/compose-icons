package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Electric_car: ImageVector
    get() {
        if (_Electric_car != null) return _Electric_car!!
        
        _Electric_car = ImageVector.Builder(
            name = "electric_car",
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
                        moveTo(18.92f, 2.01f)
                        curveTo(18.72f, 1.42f, 18.16f, 1f, 17.5f, 1f)
                        horizontalLineToRelative(-11f)
                        curveTo(5.84f, 1f, 5.29f, 1.42f, 5.08f, 2.01f)
                        lineTo(3f, 8f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(8f)
                        lineTo(18.92f, 2.01f)
                        close()
                        moveTo(6.85f, 3f)
                        horizontalLineToRelative(10.29f)
                        lineToRelative(1.08f, 3.11f)
                        horizontalLineTo(5.77f)
                        lineTo(6.85f, 3f)
                        close()
                        moveTo(19f, 13f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 10.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 6f, 10.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 10.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15f, 10.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18f, 10.5f)
                        close()
                    }
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 20f)
                    lineTo(11f, 20f)
                    lineTo(11f, 18f)
                    lineTo(17f, 21f)
                    lineTo(13f, 21f)
                    lineTo(13f, 23f)
                    close()
                }
            }
        }.build()
        
        return _Electric_car!!
    }

private var _Electric_car: ImageVector? = null

