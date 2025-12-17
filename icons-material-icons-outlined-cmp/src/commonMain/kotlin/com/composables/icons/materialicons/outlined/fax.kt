package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fax: ImageVector
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
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(4f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(7.22f)
                        curveTo(6.67f, 8.39f, 5.89f, 8f, 5f, 8f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(7f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        curveToRelative(0.89f, 0f, 1.67f, -0.39f, 2.22f, -1f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(-8f)
                        curveTo(22f, 10.34f, 20.66f, 9f, 19f, 9f)
                        close()
                        moveTo(6f, 18f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-7f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(18f)
                        close()
                        moveTo(10f, 6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-6f)
                        verticalLineTo(6f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(11f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 18f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 17f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 19f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 16f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 16f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 16f)
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 12f)
                            horizontalLineTo(13f)
                            verticalLineTo(17f)
                            horizontalLineTo(9f)
                            verticalLineTo(12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Fax!!
    }

private var _Fax: ImageVector? = null

