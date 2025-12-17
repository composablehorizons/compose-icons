package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Outgoing_mail: ImageVector
    get() {
        if (_Outgoing_mail != null) return _Outgoing_mail!!
        
        _Outgoing_mail = ImageVector.Builder(
            name = "outgoing_mail",
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
                        moveTo(18.5f, 11f)
                        curveToRelative(0.17f, 0f, 0.34f, 0.01f, 0.5f, 0.03f)
                        verticalLineTo(6.87f)
                        curveTo(19f, 5.84f, 18.16f, 5f, 17.13f, 5f)
                        horizontalLineTo(3.87f)
                        curveTo(2.84f, 5f, 2f, 5.84f, 2f, 6.87f)
                        verticalLineToRelative(10.26f)
                        curveTo(2f, 18.16f, 2.84f, 19f, 3.87f, 19f)
                        horizontalLineToRelative(9.73f)
                        curveTo(13.22f, 18.25f, 13f, 17.4f, 13f, 16.5f)
                        curveTo(13f, 13.46f, 15.46f, 11f, 18.5f, 11f)
                        close()
                        moveTo(10.4f, 13f)
                        lineTo(4f, 9.19f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(0.23f)
                        lineToRelative(6.18f, 3.68f)
                        lineTo(16.74f, 7f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(2.16f)
                        lineTo(10.4f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 13f)
                        lineTo(17.59f, 14.41f)
                        lineTo(19.17f, 16f)
                        lineTo(15f, 16f)
                        lineTo(15f, 18f)
                        lineTo(19.17f, 18f)
                        lineTo(17.59f, 19.59f)
                        lineTo(19f, 21f)
                        lineTo(23f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Outgoing_mail!!
    }

private var _Outgoing_mail: ImageVector? = null

