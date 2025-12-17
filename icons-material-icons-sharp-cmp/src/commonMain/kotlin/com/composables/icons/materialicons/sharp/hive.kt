package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hive: ImageVector
    get() {
        if (_Hive != null) return _Hive!!
        
        _Hive = ImageVector.Builder(
            name = "hive",
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
                        moveTo(13.79f, 8f)
                        lineTo(15.59f, 5f)
                        lineTo(13.79f, 2f)
                        lineTo(10.21f, 2f)
                        lineTo(8.41f, 5f)
                        lineTo(10.21f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.21f, 9f)
                        lineTo(8.41f, 12f)
                        lineTo(10.21f, 15f)
                        lineTo(13.79f, 15f)
                        lineTo(15.59f, 12f)
                        lineTo(13.79f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.45f, 11.51f)
                        lineTo(20.04f, 11.51f)
                        lineTo(21.83f, 8.51f)
                        lineTo(20.04f, 5.51f)
                        lineTo(16.45f, 5.51f)
                        lineTo(14.65f, 8.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.04f, 12.51f)
                        lineTo(16.45f, 12.51f)
                        lineTo(14.65f, 15.51f)
                        lineTo(16.45f, 18.51f)
                        lineTo(20.04f, 18.51f)
                        lineTo(21.83f, 15.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.55f, 11.51f)
                        lineTo(9.35f, 8.51f)
                        lineTo(7.55f, 5.51f)
                        lineTo(3.96f, 5.51f)
                        lineTo(2.17f, 8.51f)
                        lineTo(3.96f, 11.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.55f, 12.51f)
                        lineTo(3.96f, 12.51f)
                        lineTo(2.17f, 15.51f)
                        lineTo(3.96f, 18.51f)
                        lineTo(7.55f, 18.51f)
                        lineTo(9.35f, 15.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.21f, 16f)
                        lineTo(8.41f, 19f)
                        lineTo(10.21f, 22f)
                        lineTo(13.79f, 22f)
                        lineTo(15.59f, 19f)
                        lineTo(13.79f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

