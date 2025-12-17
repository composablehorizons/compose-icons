package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
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
                        moveTo(12f, 2f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(5.5f)
                        curveTo(4.67f, 4f, 4f, 4.67f, 4f, 5.5f)
                        verticalLineToRelative(3f)
                        curveTo(4f, 9.33f, 4.67f, 10f, 5.5f, 10f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6.62f)
                        curveToRelative(-0.4f, 0f, -0.78f, 0.16f, -1.06f, 0.44f)
                        lineToRelative(-1.5f, 1.5f)
                        curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                        lineToRelative(1.5f, 1.5f)
                        curveTo(5.84f, 17.84f, 6.22f, 18f, 6.62f, 18f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(5.5f)
                        curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(4.38f)
                        curveToRelative(0.4f, 0f, 0.78f, -0.16f, 1.06f, -0.44f)
                        lineToRelative(1.5f, -1.5f)
                        curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                        lineToRelative(-1.5f, -1.5f)
                        curveTo(18.16f, 4.16f, 17.78f, 4f, 17.38f, 4f)
                        horizontalLineTo(13f)
                        verticalLineTo(3f)
                        curveTo(13f, 2.45f, 12.55f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

