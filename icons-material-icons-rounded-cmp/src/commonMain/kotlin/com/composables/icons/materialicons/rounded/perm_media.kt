package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Perm_media: ImageVector
    get() {
        if (_Perm_media != null) return _Perm_media!!
        
        _Perm_media = ImageVector.Builder(
            name = "perm_media",
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
                        moveTo(19f, 19f)
                        horizontalLineTo(3f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(1f, 6.45f, 1f, 7f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(19.55f, 19f, 19f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 4f)
                        horizontalLineToRelative(-7f)
                        lineToRelative(-1.41f, -1.41f)
                        curveTo(12.21f, 2.21f, 11.7f, 2f, 11.17f, 2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 2f, 5.01f, 2.9f, 5.01f, 4f)
                        lineTo(5f, 15f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(23f, 4.9f, 22.1f, 4f, 21f, 4f)
                        close()
                        moveTo(18f, 13f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-0.41f, 0f, -0.65f, -0.47f, -0.4f, -0.8f)
                        lineToRelative(1.38f, -1.83f)
                        curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                        lineTo(13f, 12f)
                        lineToRelative(2.22f, -2.97f)
                        curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                        lineToRelative(2.38f, 3.17f)
                        curveTo(18.65f, 12.53f, 18.41f, 13f, 18f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Perm_media!!
    }

private var _Perm_media: ImageVector? = null

