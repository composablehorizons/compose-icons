package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Leaderboard: ImageVector
    get() {
        if (_Leaderboard != null) return _Leaderboard!!
        
        _Leaderboard = ImageVector.Builder(
            name = "leaderboard",
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
                    moveTo(16f, 11f)
                    verticalLineTo(3f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(11f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(10f, 5f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(5f)
                    close()
                    moveTo(4f, 11f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(4f)
                    verticalLineTo(11f)
                    close()
                    moveTo(20f, 19f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Leaderboard!!
    }

private var _Leaderboard: ImageVector? = null

