package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Assured_workload: ImageVector
    get() {
        if (_Assured_workload != null) return _Assured_workload!!
        
        _Assured_workload = ImageVector.Builder(
            name = "assured_workload",
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
                        moveTo(5f, 10f)
                        horizontalLineTo(7f)
                        verticalLineTo(17f)
                        horizontalLineTo(5f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 10f)
                        horizontalLineTo(13f)
                        verticalLineTo(17f)
                        horizontalLineTo(11f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 6f)
                        lineTo(12f, 1f)
                        lineTo(2f, 6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(6f)
                        close()
                        moveTo(6.47f, 6f)
                        lineTo(12f, 3.24f)
                        lineTo(17.53f, 6f)
                        horizontalLineTo(6.47f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 19f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(12.4f)
                        curveToRelative(-0.21f, -0.64f, -0.32f, -1.31f, -0.36f, -2f)
                        horizontalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 12.26f)
                        lineTo(19f, 10f)
                        lineTo(17f, 10f)
                        lineTo(17f, 13.26f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 14f)
                        lineToRelative(-4f, 2f)
                        verticalLineToRelative(2.55f)
                        curveToRelative(0f, 2.52f, 1.71f, 4.88f, 4f, 5.45f)
                        curveToRelative(2.29f, -0.57f, 4f, -2.93f, 4f, -5.45f)
                        verticalLineTo(16f)
                        lineTo(20f, 14f)
                        close()
                        moveTo(19.28f, 21f)
                        lineToRelative(-2.03f, -2.03f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(0.97f, 0.97f)
                        lineToRelative(2.41f, -2.38f)
                        lineToRelative(1.06f, 1.06f)
                        lineTo(19.28f, 21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Assured_workload!!
    }

private var _Assured_workload: ImageVector? = null

