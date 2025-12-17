package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Policy: ImageVector
    get() {
        if (_Policy != null) return _Policy!!
        
        _Policy = ImageVector.Builder(
            name = "policy",
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
                        moveTo(21f, 5f)
                        lineToRelative(-9f, -4f)
                        lineTo(3f, 5f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                        curveToRelative(2.3f, -0.56f, 4.33f, -1.9f, 5.88f, -3.71f)
                        lineToRelative(-3.12f, -3.12f)
                        curveToRelative(-1.94f, 1.29f, -4.58f, 1.07f, -6.29f, -0.64f)
                        curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                        curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0f)
                        curveToRelative(1.71f, 1.71f, 1.92f, 4.35f, 0.64f, 6.29f)
                        lineToRelative(2.9f, 2.9f)
                        curveTo(20.29f, 15.69f, 21f, 13.38f, 21f, 11f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 12f)
                        arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                        arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                        arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Policy!!
    }

private var _Policy: ImageVector? = null

