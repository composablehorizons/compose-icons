package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Upcoming: ImageVector
    get() {
        if (_Upcoming != null) return _Upcoming!!
        
        _Upcoming = ImageVector.Builder(
            name = "upcoming",
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
                        moveTo(20.45f, 6.55f)
                        lineTo(20.45f, 6.55f)
                        curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0f)
                        lineTo(16.89f, 8.7f)
                        curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0f, 1.39f)
                        lineToRelative(0.01f, 0.01f)
                        curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                        curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f)
                        curveTo(20.83f, 7.55f, 20.83f, 6.93f, 20.45f, 6.55f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.02f, 3f)
                        horizontalLineToRelative(-0.03f)
                        curveTo(11.44f, 3f, 11f, 3.44f, 11f, 3.98f)
                        verticalLineToRelative(3.03f)
                        curveTo(11f, 7.56f, 11.44f, 8f, 11.98f, 8f)
                        horizontalLineToRelative(0.03f)
                        curveTo(12.56f, 8f, 13f, 7.56f, 13f, 7.02f)
                        verticalLineTo(3.98f)
                        curveTo(13f, 3.44f, 12.56f, 3f, 12.02f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.1f, 10.11f)
                        lineToRelative(0.01f, -0.01f)
                        curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0f, -1.39f)
                        lineTo(4.96f, 6.54f)
                        curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0f)
                        lineTo(3.55f, 6.55f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0f, 1.39f)
                        curveToRelative(0.63f, 0.62f, 1.53f, 1.54f, 2.15f, 2.17f)
                        curveTo(6.09f, 10.49f, 6.72f, 10.49f, 7.1f, 10.11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 15f)
                        curveToRelative(-1.24f, 0f, -2.31f, -0.75f, -2.76f, -1.83f)
                        curveTo(8.92f, 12.43f, 8.14f, 12f, 7.34f, 12f)
                        lineTo(4f, 12f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        lineToRelative(0f, 5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        lineToRelative(-3.34f, 0f)
                        curveToRelative(-0.8f, 0f, -1.58f, 0.43f, -1.9f, 1.17f)
                        curveTo(14.31f, 14.25f, 13.24f, 15f, 12f, 15f)
                    }
                }
            }
        }.build()
        
        return _Upcoming!!
    }

private var _Upcoming: ImageVector? = null

