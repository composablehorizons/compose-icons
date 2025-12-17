package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Synagogue: ImageVector
    get() {
        if (_Synagogue != null) return _Synagogue!!
        
        _Synagogue = ImageVector.Builder(
            name = "synagogue",
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
                        moveTo(20f, 4f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(0.29f)
                        lineTo(12f, 3f)
                        lineTo(7f, 7.29f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        reflectiveCurveTo(1f, 5.34f, 1f, 7f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(7f)
                        curveTo(23f, 5.34f, 21.66f, 4f, 20f, 4f)
                        close()
                        moveTo(20f, 6f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        curveTo(19f, 6.45f, 19.45f, 6f, 20f, 6f)
                        close()
                        moveTo(4f, 6f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(3f)
                        verticalLineTo(7f)
                        curveTo(3f, 6.45f, 3.45f, 6f, 4f, 6f)
                        close()
                        moveTo(3f, 19f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(9f)
                        horizontalLineTo(3f)
                        close()
                        moveTo(17f, 19f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                        curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(7f)
                        verticalLineTo(9.92f)
                        lineToRelative(5f, -4.29f)
                        lineToRelative(5f, 4.29f)
                        verticalLineTo(19f)
                        close()
                        moveTo(19f, 19f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(9f)
                        horizontalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 10f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 11.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 10f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Synagogue!!
    }

private var _Synagogue: ImageVector? = null

