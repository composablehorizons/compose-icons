package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Calculate: ImageVector
    get() {
        if (_Calculate != null) return _Calculate!!
        
        _Calculate = ImageVector.Builder(
            name = "calculate",
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
                        moveTo(5f, 19f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(19f)
                        close()
                        moveTo(13.03f, 7.06f)
                        lineTo(14.09f, 6f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(16.91f, 6f)
                        lineToRelative(1.06f, 1.06f)
                        lineToRelative(-1.41f, 1.41f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(-1.06f, 1.06f)
                        lineTo(15.5f, 9.54f)
                        lineToRelative(-1.41f, 1.41f)
                        lineToRelative(-1.06f, -1.06f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(13.03f, 7.06f)
                        close()
                        moveTo(13f, 13.25f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(13.25f)
                        close()
                        moveTo(13f, 15.75f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(15.75f)
                        close()
                        moveTo(6.25f, 7.72f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(7.72f)
                        close()
                        moveTo(6f, 14.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(6f)
                        verticalLineTo(14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.25f, 7.72f)
                        horizontalLineTo(11.25f)
                        verticalLineTo(9.22f)
                        horizontalLineTo(6.25f)
                        verticalLineTo(7.72f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 15.75f)
                        horizontalLineTo(18f)
                        verticalLineTo(17.25f)
                        horizontalLineTo(13f)
                        verticalLineTo(15.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13.25f)
                        horizontalLineTo(18f)
                        verticalLineTo(14.75f)
                        horizontalLineTo(13f)
                        verticalLineTo(13.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 18f)
                        lineTo(9.5f, 18f)
                        lineTo(9.5f, 16f)
                        lineTo(11.5f, 16f)
                        lineTo(11.5f, 14.5f)
                        lineTo(9.5f, 14.5f)
                        lineTo(9.5f, 12.5f)
                        lineTo(8f, 12.5f)
                        lineTo(8f, 14.5f)
                        lineTo(6f, 14.5f)
                        lineTo(6f, 16f)
                        lineTo(8f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.09f, 10.95f)
                        lineTo(15.5f, 9.54f)
                        lineTo(16.91f, 10.95f)
                        lineTo(17.97f, 9.89f)
                        lineTo(16.56f, 8.47f)
                        lineTo(17.97f, 7.06f)
                        lineTo(16.91f, 6f)
                        lineTo(15.5f, 7.41f)
                        lineTo(14.09f, 6f)
                        lineTo(13.03f, 7.06f)
                        lineTo(14.44f, 8.47f)
                        lineTo(13.03f, 9.89f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

