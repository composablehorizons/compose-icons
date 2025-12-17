package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flourescent: ImageVector
    get() {
        if (_Flourescent != null) return _Flourescent!!
        
        _Flourescent = ImageVector.Builder(
            name = "flourescent",
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
                        moveTo(7f, 15f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(2f)
                        curveTo(5f, 14.1f, 5.9f, 15f, 7f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        lineTo(12f, 2f)
                        curveToRelative(-0.56f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineTo(12f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(3f)
                        curveTo(13f, 2.45f, 12.55f, 2f, 12f, 2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.79f, 5.3f)
                        lineTo(19.79f, 5.3f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-0.38f, 0.38f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0.38f, -0.38f)
                        curveTo(20.18f, 6.33f, 20.18f, 5.69f, 19.79f, 5.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 22f)
                        lineTo(12f, 22f)
                        curveToRelative(0.56f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(20f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(12f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(21f)
                        curveTo(11f, 21.55f, 11.45f, 22f, 12f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.99f, 18.41f)
                        lineToRelative(0.38f, 0.39f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0.01f, -0.01f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(19.4f, 17f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveTo(17.6f, 17.4f, 17.6f, 18.03f, 17.99f, 18.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 5.69f)
                        lineTo(5.61f, 5.31f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(4.59f, 7.1f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveTo(6.38f, 6.71f, 6.38f, 6.07f, 6f, 5.69f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.2f, 18.79f)
                        lineTo(4.2f, 18.79f)
                        curveToRelative(0.39f, 0.4f, 1.03f, 0.4f, 1.42f, 0f)
                        lineTo(6f, 18.4f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineTo(4.2f, 17.38f)
                        curveTo(3.81f, 17.77f, 3.81f, 18.4f, 4.2f, 18.79f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flourescent!!
    }

private var _Flourescent: ImageVector? = null

