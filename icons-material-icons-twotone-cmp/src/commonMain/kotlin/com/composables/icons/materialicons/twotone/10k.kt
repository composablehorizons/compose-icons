package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`10k`: ImageVector
    get() {
        if (_10k != null) return _10k!!
        
        _10k = ImageVector.Builder(
            name = "10k",
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
                        moveTo(10f, 10.5f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(13.5f)
                        horizontalLineTo(10f)
                        verticalLineTo(10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 15f)
                        lineTo(19f, 9f)
                        lineTo(16.75f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 9f)
                        horizontalLineToRelative(2.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-4.5f)
                        horizontalLineTo(5f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-1.75f)
                        lineToRelative(-1.75f, -2.25f)
                        verticalLineTo(15f)
                        horizontalLineTo(14f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2.25f)
                        lineTo(17.25f, 9f)
                        horizontalLineTo(19f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(9f)
                        close()
                        moveTo(8.5f, 10f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(12f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(9.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 9f)
                        verticalLineToRelative(6f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-8.5f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(15f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(9f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 11.25f)
                        lineTo(15.5f, 9f)
                        lineTo(14f, 9f)
                        lineTo(14f, 15f)
                        lineTo(15.5f, 15f)
                        lineTo(15.5f, 12.75f)
                        lineTo(17.25f, 15f)
                        lineTo(19f, 15f)
                        lineTo(16.75f, 12f)
                        lineTo(19f, 9f)
                        lineTo(17.25f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.5f, 15f)
                        horizontalLineTo(12f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(9.5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveTo(8.5f, 14.55f, 8.95f, 15f, 9.5f, 15f)
                        close()
                        moveTo(10f, 10.5f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(10f)
                        verticalLineTo(10.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _10k!!
    }

private var _10k: ImageVector? = null

