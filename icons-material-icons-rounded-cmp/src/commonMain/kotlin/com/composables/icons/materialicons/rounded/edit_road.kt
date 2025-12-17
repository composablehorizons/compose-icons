package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_road: ImageVector
    get() {
        if (_Edit_road != null) return _Edit_road!!
        
        _Edit_road = ImageVector.Builder(
            name = "edit_road",
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
                        moveTo(17f, 4f)
                        lineTo(17f, 4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(6.9f)
                        lineToRelative(2f, -2f)
                        verticalLineTo(5f)
                        curveTo(18f, 4.45f, 17.55f, 4f, 17f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 20f)
                        lineTo(5f, 20f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                        verticalLineToRelative(14f)
                        curveTo(4f, 19.55f, 4.45f, 20f, 5f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        lineTo(11f, 8f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        curveTo(10f, 7.55f, 10.45f, 8f, 11f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 14f)
                        lineTo(11f, 14f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        curveTo(10f, 13.55f, 10.45f, 14f, 11f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 20f)
                        lineTo(11f, 20f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        curveTo(10f, 19.55f, 10.45f, 20f, 11f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.56f, 12.59f)
                        lineToRelative(-1.15f, -1.15f)
                        curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                        lineTo(14f, 16.73f)
                        verticalLineToRelative(2.77f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(2.77f)
                        lineToRelative(5.29f, -5.29f)
                        curveTo(23.15f, 14.12f, 23.15f, 13.17f, 22.56f, 12.59f)
                        close()
                        moveTo(16.58f, 18.45f)
                        horizontalLineToRelative(-1.03f)
                        verticalLineToRelative(-1.03f)
                        lineTo(19f, 13.97f)
                        lineTo(20.03f, 15f)
                        lineTo(16.58f, 18.45f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_road!!
    }

private var _Edit_road: ImageVector? = null

