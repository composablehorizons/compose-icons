package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Report_gmailerrorred: ImageVector
    get() {
        if (_Report_gmailerrorred != null) return _Report_gmailerrorred!!
        
        _Report_gmailerrorred = ImageVector.Builder(
            name = "report_gmailerrorred",
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
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.73f, 3f)
                            horizontalLineTo(8.27f)
                            lineTo(3f, 8.27f)
                            verticalLineToRelative(7.46f)
                            lineTo(8.27f, 21f)
                            horizontalLineToRelative(7.46f)
                            lineTo(21f, 15.73f)
                            verticalLineTo(8.27f)
                            lineTo(15.73f, 3f)
                            close()
                            moveTo(19f, 14.9f)
                            lineTo(14.9f, 19f)
                            horizontalLineTo(9.1f)
                            lineTo(5f, 14.9f)
                            verticalLineTo(9.1f)
                            lineTo(9.1f, 5f)
                            horizontalLineToRelative(5.8f)
                            lineTo(19f, 9.1f)
                            verticalLineTo(14.9f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11f, 7f)
                            horizontalLineTo(13f)
                            verticalLineTo(13f)
                            horizontalLineTo(11f)
                            verticalLineTo(7f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11f, 15f)
                            horizontalLineTo(13f)
                            verticalLineTo(17f)
                            horizontalLineTo(11f)
                            verticalLineTo(15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Report_gmailerrorred!!
    }

private var _Report_gmailerrorred: ImageVector? = null

