package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Developer_board_off: ImageVector
    get() {
        if (_Developer_board_off != null) return _Developer_board_off!!
        
        _Developer_board_off = ImageVector.Builder(
            name = "developer_board_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7.83f, 5f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(10.17f)
                    lineTo(19.83f, 17f)
                    horizontalLineTo(21f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(5.83f)
                    lineTo(7.83f, 5f)
                    close()
                    moveTo(15f, 10f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.06f, 0f, -0.13f, -0.01f, -0.19f, -0.02f)
                    lineToRelative(-0.79f, -0.79f)
                    curveTo(12.01f, 9.13f, 12f, 9.06f, 12f, 9f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveTo(16f, 9.55f, 15.55f, 10f, 15f, 10f)
                    close()
                    moveTo(11f, 8f)
                    verticalLineToRelative(0.17f)
                    lineTo(9.83f, 7f)
                    horizontalLineTo(10f)
                    curveTo(10.55f, 7f, 11f, 7.45f, 11f, 8f)
                    close()
                    moveTo(16f, 12f)
                    verticalLineToRelative(1.17f)
                    lineTo(13.83f, 11f)
                    horizontalLineTo(15f)
                    curveTo(15.55f, 11f, 16f, 11.45f, 16f, 12f)
                    close()
                    moveTo(1.39f, 2.81f)
                    lineTo(1.39f, 2.81f)
                    curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                    lineToRelative(0.61f, 0.61f)
                    curveTo(2f, 4.89f, 2f, 4.94f, 2f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.06f, 0f, 0.11f, 0f, 0.16f, -0.01f)
                    lineToRelative(1.61f, 1.61f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    curveTo(2.42f, 2.42f, 1.78f, 2.42f, 1.39f, 2.81f)
                    close()
                    moveTo(4f, 19f)
                    verticalLineTo(6.83f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(11f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.17f)
                    lineToRelative(1.02f, 1.02f)
                    curveTo(10.13f, 13.01f, 10.06f, 13f, 10f, 13f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.06f, -0.01f, -0.13f, -0.02f, -0.19f)
                    lineTo(12f, 14.83f)
                    verticalLineToRelative(0.46f)
                    verticalLineTo(16f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0.38f)
                    horizontalLineToRelative(0.8f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(4f)
                    close()
                }
            }
        }.build()
        
        return _Developer_board_off!!
    }

private var _Developer_board_off: ImageVector? = null

