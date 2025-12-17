package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hls: ImageVector
    get() {
        if (_Hls != null) return _Hls!!
        
        _Hls = ImageVector.Builder(
            name = "hls",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6.5f, 9f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(6.5f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(15f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(16.5f, 15f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(17f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(19f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(1f)
                    curveTo(15.5f, 14.55f, 15.95f, 15f, 16.5f, 15f)
                    close()
                    moveTo(14f, 15f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Hls!!
    }

private var _Hls: ImageVector? = null

