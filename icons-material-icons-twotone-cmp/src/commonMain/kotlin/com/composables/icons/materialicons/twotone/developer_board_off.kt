package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Developer_board_off: ImageVector
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 19f)
                verticalLineTo(6.83f)
                lineToRelative(2f, 2f)
                verticalLineTo(12f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1f, 1f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.17f)
                lineToRelative(1f, 1f)
                verticalLineTo(17f)
                horizontalLineToRelative(2.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(4f)
                close()
                moveTo(16f, 13.17f)
                verticalLineTo(11f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.17f)
                lineToRelative(-1f, -1f)
                verticalLineTo(7f)
                horizontalLineTo(9.83f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(18f)
                verticalLineToRelative(10.17f)
                lineTo(16f, 13.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.83f, 5f)
                horizontalLineTo(18f)
                verticalLineToRelative(10.17f)
                lineTo(19.83f, 17f)
                horizontalLineTo(22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5f)
                close()
                moveTo(12f, 9.17f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.17f)
                lineTo(12f, 9.17f)
                close()
                moveTo(9.83f, 7f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.17f)
                lineTo(9.83f, 7f)
                close()
                moveTo(13.83f, 11f)
                horizontalLineTo(16f)
                verticalLineToRelative(2.17f)
                lineTo(13.83f, 11f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0.06f, 0f, 0.11f, 0f, 0.16f, -0.01f)
                lineToRelative(2.32f, 2.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(1.32f, 1.32f)
                curveTo(2f, 4.89f, 2f, 4.94f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineTo(18f)
                close()
                moveTo(4f, 19f)
                verticalLineTo(6.83f)
                lineToRelative(2f, 2f)
                verticalLineTo(12f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1f, 1f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.17f)
                lineToRelative(1f, 1f)
                verticalLineTo(17f)
                horizontalLineToRelative(2.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Developer_board_off!!
    }

private var _Developer_board_off: ImageVector? = null

