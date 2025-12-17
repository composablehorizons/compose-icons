package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Css: ImageVector
    get() {
        if (_Css != null) return _Css!!
        
        _Css = ImageVector.Builder(
            name = "css",
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
                    moveTo(8f, 10.25f)
                    curveTo(8f, 10.66f, 7.66f, 11f, 7.25f, 11f)
                    curveToRelative(-0.33f, 0f, -0.6f, -0.21f, -0.71f, -0.5f)
                    lineToRelative(-2.04f, 0f)
                    verticalLineToRelative(3f)
                    lineToRelative(2.04f, 0f)
                    curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f)
                    curveTo(7.66f, 13f, 8f, 13.34f, 8f, 13.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(10.25f)
                    close()
                    moveTo(13.04f, 10.5f)
                    curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(13f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2.04f)
                    verticalLineToRelative(0f)
                    curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f)
                    curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(-1f)
                    lineTo(13.04f, 10.5f)
                    close()
                    moveTo(19.54f, 10.5f)
                    curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2.04f)
                    verticalLineToRelative(0f)
                    curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f)
                    curveTo(16.34f, 13f, 16f, 13.34f, 16f, 13.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineToRelative(-1f)
                    lineTo(19.54f, 10.5f)
                    close()
                }
            }
        }.build()
        
        return _Css!!
    }

private var _Css: ImageVector? = null

