package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wb_twilight: ImageVector
    get() {
        if (_Wb_twilight != null) return _Wb_twilight!!
        
        _Wb_twilight = ImageVector.Builder(
            name = "wb_twilight",
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
                        moveTo(16.95521f, 8.66201f)
                        lineTo(19.07591f, 6.539811f)
                        lineTo(20.49071f, 7.9536104f)
                        lineTo(18.37001f, 10.07581f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 18f)
                        horizontalLineTo(22f)
                        verticalLineTo(20f)
                        horizontalLineTo(2f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 4f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        horizontalLineTo(11f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.5425386f, 7.924837f)
                        lineTo(4.9567385f, 6.5106373f)
                        lineTo(7.078039f, 8.631937f)
                        lineTo(5.6638393f, 10.046137f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 16f)
                        horizontalLineToRelative(14f)
                        curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                        reflectiveCurveTo(5f, 12.13f, 5f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wb_twilight!!
    }

private var _Wb_twilight: ImageVector? = null

