package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Percent: ImageVector
    get() {
        if (_Percent != null) return _Percent!!
        
        _Percent = ImageVector.Builder(
            name = "percent",
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
                    group {
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(7.5f, 11f)
                                curveTo(9.43f, 11f, 11f, 9.43f, 11f, 7.5f)
                                reflectiveCurveTo(9.43f, 4f, 7.5f, 4f)
                                reflectiveCurveTo(4f, 5.57f, 4f, 7.5f)
                                reflectiveCurveTo(5.57f, 11f, 7.5f, 11f)
                                close()
                                moveTo(7.5f, 6f)
                                curveTo(8.33f, 6f, 9f, 6.67f, 9f, 7.5f)
                                reflectiveCurveTo(8.33f, 9f, 7.5f, 9f)
                                reflectiveCurveTo(6f, 8.33f, 6f, 7.5f)
                                reflectiveCurveTo(6.67f, 6f, 7.5f, 6f)
                                close()
                            }
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4.0024986f, 18.5831f)
                            lineTo(18.589972f, 3.9956284f)
                            lineTo(20.004171f, 5.409828f)
                            lineTo(5.4166985f, 19.997301f)
                            close()
                        }
                    }
                    group {
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(16.5f, 13f)
                                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                                reflectiveCurveTo(18.43f, 13f, 16.5f, 13f)
                                close()
                                moveTo(16.5f, 18f)
                                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                                reflectiveCurveTo(17.33f, 18f, 16.5f, 18f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Percent!!
    }

private var _Percent: ImageVector? = null

