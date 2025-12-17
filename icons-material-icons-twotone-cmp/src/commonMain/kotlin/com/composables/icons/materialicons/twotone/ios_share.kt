package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Ios_share: ImageVector
    get() {
        if (_Ios_share != null) return _Ios_share!!
        
        _Ios_share = ImageVector.Builder(
            name = "ios_share",
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
                        moveTo(18f, 8f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(11f)
                        horizontalLineTo(6f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(8f)
                        horizontalLineTo(6f)
                        curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(10f)
                        curveTo(20f, 8.89f, 19.1f, 8f, 18f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 16f)
                        lineTo(13f, 16f)
                        lineTo(13f, 5f)
                        lineTo(16f, 5f)
                        lineTo(12f, 1f)
                        lineTo(8f, 5f)
                        lineTo(11f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Ios_share!!
    }

private var _Ios_share: ImageVector? = null

