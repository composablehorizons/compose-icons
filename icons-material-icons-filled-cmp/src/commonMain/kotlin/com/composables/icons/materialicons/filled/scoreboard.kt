package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Scoreboard: ImageVector
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
                    moveTo(20f, 4f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                    close()
                    moveTo(9.5f, 11.5f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2.5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3.5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(11.5f)
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
                    moveTo(19f, 14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-2.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(18f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Scoreboard!!
    }

private var _Scoreboard: ImageVector? = null

