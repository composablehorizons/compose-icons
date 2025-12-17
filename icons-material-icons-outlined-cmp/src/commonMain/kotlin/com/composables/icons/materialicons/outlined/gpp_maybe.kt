package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Gpp_maybe: ImageVector
    get() {
        if (_Gpp_maybe != null) return _Gpp_maybe!!
        
        _Gpp_maybe = ImageVector.Builder(
            name = "gpp_maybe",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(12f, 2f)
                        lineTo(4f, 5f)
                        verticalLineToRelative(6.09f)
                        curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                        curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                        verticalLineTo(5f)
                        lineTo(12f, 2f)
                        close()
                        moveTo(18f, 11.09f)
                        curveToRelative(0f, 4f, -2.55f, 7.7f, -6f, 8.83f)
                        curveToRelative(-3.45f, -1.13f, -6f, -4.82f, -6f, -8.83f)
                        verticalLineToRelative(-4.7f)
                        lineToRelative(6f, -2.25f)
                        lineToRelative(6f, 2.25f)
                        verticalLineTo(11.09f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 14f)
                        horizontalLineTo(13f)
                        verticalLineTo(16f)
                        horizontalLineTo(11f)
                        verticalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 7f)
                        horizontalLineTo(13f)
                        verticalLineTo(12f)
                        horizontalLineTo(11f)
                        verticalLineTo(7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Gpp_maybe!!
    }

private var _Gpp_maybe: ImageVector? = null

