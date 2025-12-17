package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fax: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(4f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(14.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(9f)
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
                        moveTo(2f, 8f)
                        horizontalLineTo(7f)
                        verticalLineTo(21f)
                        horizontalLineTo(2f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fax!!
    }

private var _Fax: ImageVector? = null

