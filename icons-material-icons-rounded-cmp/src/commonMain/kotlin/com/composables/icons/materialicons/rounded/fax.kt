package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fax: ImageVector
    get() {
        if (_Fax != null) return _Fax!!
        
        _Fax = ImageVector.Builder(
            name = "fax",
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
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-6f)
                        curveTo(8.9f, 4f, 8f, 4.9f, 8f, 6f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-6f)
                        curveTo(22f, 10.34f, 20.66f, 9f, 19f, 9f)
                        close()
                        moveTo(10f, 6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-6f)
                        verticalLineTo(6f)
                        close()
                        moveTo(14f, 17f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(17f)
                        close()
                        moveTo(16f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(17f, 16.55f, 16.55f, 17f, 16f, 17f)
                        close()
                        moveTo(16f, 14f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(17f, 13.55f, 16.55f, 14f, 16f, 14f)
                        close()
                        moveTo(19f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(20f, 16.55f, 19.55f, 17f, 19f, 17f)
                        close()
                        moveTo(19f, 14f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(20f, 13.55f, 19.55f, 14f, 19f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.5f, 8f)
                        curveTo(3.12f, 8f, 2f, 9.12f, 2f, 10.5f)
                        verticalLineToRelative(8f)
                        curveTo(2f, 19.88f, 3.12f, 21f, 4.5f, 21f)
                        reflectiveCurveTo(7f, 19.88f, 7f, 18.5f)
                        verticalLineToRelative(-8f)
                        curveTo(7f, 9.12f, 5.88f, 8f, 4.5f, 8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fax!!
    }

private var _Fax: ImageVector? = null

