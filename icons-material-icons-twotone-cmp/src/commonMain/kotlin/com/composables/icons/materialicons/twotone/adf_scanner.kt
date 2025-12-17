package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Adf_scanner: ImageVector
    get() {
        if (_Adf_scanner != null) return _Adf_scanner!!
        
        _Adf_scanner = ImageVector.Builder(
            name = "adf_scanner",
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
                        moveTo(8f, 6f)
                        horizontalLineTo(16f)
                        verticalLineTo(12f)
                        horizontalLineTo(8f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 14f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-3f)
                        curveTo(20f, 14.45f, 19.55f, 14f, 19f, 14f)
                        close()
                        moveTo(18f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(19f, 16.55f, 18.55f, 17f, 18f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 12f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(4f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(8f)
                        horizontalLineTo(5f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(20f)
                        verticalLineToRelative(-5f)
                        curveTo(22f, 13.34f, 20.66f, 12f, 19f, 12f)
                        close()
                        moveTo(8f, 6f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(8f)
                        verticalLineTo(6f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 16f)
                        arcTo(1f, 1f, 0f, false, true, 18f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 17f, 16f)
                        arcTo(1f, 1f, 0f, false, true, 19f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Adf_scanner!!
    }

private var _Adf_scanner: ImageVector? = null

