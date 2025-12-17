package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Autofps_select: ImageVector
    get() {
        if (_Autofps_select != null) return _Autofps_select!!
        
        _Autofps_select = ImageVector.Builder(
            name = "autofps_select",
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
                        moveTo(12.03f, 6.3f)
                        lineTo(11.97f, 6.3f)
                        lineTo(10.95f, 9.19f)
                        lineTo(13.05f, 9.19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 17f)
                        horizontalLineTo(5f)
                        verticalLineTo(22f)
                        horizontalLineTo(3f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 15f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                        reflectiveCurveTo(6f, 5.69f, 6f, 9f)
                        reflectiveCurveTo(8.69f, 15f, 12f, 15f)
                        close()
                        moveTo(11.37f, 5f)
                        horizontalLineToRelative(1.25f)
                        lineToRelative(2.63f, 7f)
                        horizontalLineToRelative(-1.21f)
                        lineToRelative(-0.63f, -1.79f)
                        horizontalLineToRelative(-2.83f)
                        lineTo(9.96f, 12f)
                        horizontalLineTo(8.74f)
                        lineTo(11.37f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 17f)
                        horizontalLineTo(9f)
                        verticalLineTo(22f)
                        horizontalLineTo(7f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 17f)
                        horizontalLineTo(13f)
                        verticalLineTo(22f)
                        horizontalLineTo(11f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 17f)
                        horizontalLineTo(21f)
                        verticalLineTo(22f)
                        horizontalLineTo(15f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Autofps_select!!
    }

private var _Autofps_select: ImageVector? = null

