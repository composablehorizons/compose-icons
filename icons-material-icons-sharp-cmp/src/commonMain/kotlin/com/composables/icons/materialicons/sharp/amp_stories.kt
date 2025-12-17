package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Amp_stories: ImageVector
    get() {
        if (_Amp_stories != null) return _Amp_stories!!
        
        _Amp_stories = ImageVector.Builder(
            name = "amp_stories",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 4f)
                        horizontalLineTo(17f)
                        verticalLineTo(19f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 6f)
                        horizontalLineTo(5f)
                        verticalLineTo(17f)
                        horizontalLineTo(3f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 6f)
                        horizontalLineTo(21f)
                        verticalLineTo(17f)
                        horizontalLineTo(19f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Amp_stories!!
    }

private var _Amp_stories: ImageVector? = null

