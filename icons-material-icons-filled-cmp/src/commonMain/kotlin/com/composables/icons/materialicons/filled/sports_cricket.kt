package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sports_cricket: ImageVector
    get() {
        if (_Sports_cricket != null) return _Sports_cricket!!
        
        _Sports_cricket = ImageVector.Builder(
            name = "sports_cricket",
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
                            moveTo(15.05f, 12.81f)
                            lineTo(6.56f, 4.32f)
                            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                            lineTo(2.32f, 7.15f)
                            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                            lineToRelative(8.49f, 8.49f)
                            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                            lineToRelative(2.83f, -2.83f)
                            curveTo(15.44f, 13.83f, 15.44f, 13.2f, 15.05f, 12.81f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14.341213f, 17.7562f)
                            lineTo(15.755413f, 16.342001f)
                            lineTo(19.998014f, 20.584602f)
                            lineTo(18.583815f, 21.998802f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 5.5f)
                        arcTo(3.5f, 3.5f, 0f, false, true, 18.5f, 9f)
                        arcTo(3.5f, 3.5f, 0f, false, true, 15f, 5.5f)
                        arcTo(3.5f, 3.5f, 0f, false, true, 22f, 5.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_cricket!!
    }

private var _Sports_cricket: ImageVector? = null

