package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Scoreboard: ImageVector
    get() {
        if (_Scoreboard != null) return _Scoreboard!!
        
        _Scoreboard = ImageVector.Builder(
            name = "scoreboard",
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
                    moveTo(17.5f, 13.5f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(22f, 4f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(9.5f, 12.5f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-3.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(4.5f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(12.75f, 18f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(18f)
                    close()
                    moveTo(12.75f, 14.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(14.5f)
                    close()
                    moveTo(12.75f, 11f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(9.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(11f)
                    close()
                    moveTo(12.75f, 7.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(7.5f)
                    close()
                    moveTo(19f, 9f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(-4.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Scoreboard!!
    }

private var _Scoreboard: ImageVector? = null

