package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Add_to_drive: ImageVector
    get() {
        if (_Add_to_drive != null) return _Add_to_drive!!
        
        _Add_to_drive = ImageVector.Builder(
            name = "add_to_drive",
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
                        moveTo(19f, 11f)
                        curveToRelative(0.17f, 0f, 0.33f, 0.01f, 0.49f, 0.02f)
                        lineTo(15f, 3f)
                        horizontalLineTo(9f)
                        lineToRelative(5.68f, 9.84f)
                        curveTo(15.77f, 11.71f, 17.3f, 11f, 19f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.15f, 4.52f)
                        lineTo(2f, 15.5f)
                        lineTo(5f, 21f)
                        lineTo(11.33f, 10.03f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.2f, 15.5f)
                        horizontalLineTo(9.9f)
                        lineTo(6.73f, 21f)
                        horizontalLineToRelative(7.81f)
                        curveTo(13.58f, 19.94f, 13f, 18.54f, 13f, 17f)
                        curveTo(13f, 16.48f, 13.07f, 15.98f, 13.2f, 15.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 16f)
                        lineTo(20f, 13f)
                        lineTo(18f, 13f)
                        lineTo(18f, 16f)
                        lineTo(15f, 16f)
                        lineTo(15f, 18f)
                        lineTo(18f, 18f)
                        lineTo(18f, 21f)
                        lineTo(19f, 21f)
                        lineTo(20f, 21f)
                        lineTo(20f, 18f)
                        lineTo(23f, 18f)
                        lineTo(23f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_to_drive!!
    }

private var _Add_to_drive: ImageVector? = null

